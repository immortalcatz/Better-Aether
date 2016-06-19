package com.gildedgames.aether.common.entities;

import com.gildedgames.aether.common.entities.item.EntityPhoenixItem;
import com.gildedgames.aether.common.items.properties.IPhoenixChillable;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EntityItemWatcher
{
	@SubscribeEvent
	public void onEntityJoinedWorld(EntityJoinWorldEvent event)
	{
		if (!event.world.isRemote && event.entity.getClass() == EntityItem.class)
		{
			EntityItem entity = (EntityItem) event.entity;

			ItemStack stack = entity.getEntityItem();

			if (stack.getItem() instanceof IPhoenixChillable)
			{
				IPhoenixChillable chillable = (IPhoenixChillable) stack.getItem();

				if (chillable.canChillItemstack(stack))
				{
					EntityPhoenixItem phoenixItem = new EntityPhoenixItem(entity);
					event.world.spawnEntityInWorld(phoenixItem);

					// We replace the entity in the world
					event.setCanceled(true);
				}
			}
		}
	}
}