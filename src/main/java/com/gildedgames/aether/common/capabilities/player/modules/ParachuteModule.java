package com.gildedgames.aether.common.capabilities.player.modules;

import com.gildedgames.aether.common.capabilities.player.PlayerAetherImpl;
import com.gildedgames.aether.common.capabilities.player.PlayerAetherModule;
import com.gildedgames.aether.common.entities.blocks.EntityParachute;
import com.gildedgames.aether.common.items.ItemsAether;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.living.LivingEvent;

public class ParachuteModule extends PlayerAetherModule
{

	private boolean isParachuting;

	private EntityParachute.Type type = EntityParachute.Type.COLD;

	private int hitAmnt;

	private boolean prevAllowFlying;

	public ParachuteModule(PlayerAetherImpl playerAether)
	{
		super(playerAether);
	}

	@Override
	public void onUpdate(LivingEvent.LivingUpdateEvent event)
	{
		if (this.isParachuting)
		{
			int x = MathHelper.floor_double(this.getPlayer().posX);
			int y = MathHelper.floor_double(this.getPlayer().posY);
			int z = MathHelper.floor_double(this.getPlayer().posZ);

			Vec3d vec3 = this.getPlayer().getLookVec();

			if (this.getParachuteType() == EntityParachute.Type.BLUE)
			{
				if (this.getPlayer().posY >= this.getPlayer().worldObj.getActualHeight() || this.isUnderABlock(y))
				{
					this.setParachuting(false, this.type);
				}
			}

			this.getPlayer().fallDistance = 0F;

			if (!this.isParachuting)
			{
				this.hitAmnt = 0;
			}
			else if (this.getPlayer().swingProgressInt >= 4 && this.isParachuting && vec3.yCoord >= 1 && !this.getPlayer().onGround)
			{
				this.hitAmnt++;
			}

			if (this.getParachuteType() != EntityParachute.Type.BLUE && (!this.getPlayer().worldObj.isAirBlock(new BlockPos(x, y - 1, z)) || !this.isParachuting) || (this.isParachuting && this.hitAmnt >= 4))
			{
				this.setParachuting(false, this.type);
			}
		}
	}

	public void setParachuting(boolean isParachuting, EntityParachute.Type type)
	{
		this.isParachuting = isParachuting;
		this.type = type;

		if (isParachuting)
		{
			this.prevAllowFlying = this.getPlayer().capabilities.allowFlying;
			this.getPlayer().capabilities.allowFlying = true;
		}

		if (!isParachuting)
		{
			if (!this.getPlayer().getEntityWorld().isRemote)
			{
				EntityItem block = new EntityItem(this.getPlayer().getEntityWorld(), this.getPlayer().posX, this.getPlayer().posY, this.getPlayer().posZ, new ItemStack(ItemsAether.cloud_parachute, 1, type.ordinal()));

				this.getPlayer().getEntityWorld().spawnEntityInWorld(block);
			}

			this.getPlayer().capabilities.allowFlying = this.prevAllowFlying;
		}
	}

	private boolean isUnderABlock(int y)
	{
		AxisAlignedBB boundingBox = this.getPlayer().getEntityBoundingBox();

		BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();

		for (int x1 = (int) Math.floor(boundingBox.minX); x1 <= (int) Math.ceil(boundingBox.maxX); x1++)
		{
			for (int z1 = (int) Math.floor(boundingBox.minZ); z1 <= (int) Math.ceil(boundingBox.maxZ); z1++)
			{
				if (!this.getPlayer().worldObj.isAirBlock(pos.setPos(x1, y + 1, z1)) || !this.getPlayer().worldObj.isAirBlock(pos.setPos(x1, y + 2, z1)))
				{
					return true;
				}
			}
		}

		return false;
	}

	public EntityParachute.Type getParachuteType()
	{
		return this.type;
	}

	public boolean isParachuting()
	{
		return this.isParachuting;
	}

	@Override
	public void write(NBTTagCompound output)
	{
		output.setBoolean("parachuting", this.isParachuting);
		output.setInteger("type", this.type.ordinal());
		output.setBoolean("prevAllowFlying", this.prevAllowFlying);
	}

	@Override
	public void read(NBTTagCompound input)
	{
		this.isParachuting = input.getBoolean("parachuting");
		this.type = EntityParachute.Type.fromOrdinal(input.getInteger("type"));
		this.prevAllowFlying = input.getBoolean("prevAllowFlying");
	}

}
