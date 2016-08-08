package com.gildedgames.aether.client.models.entities.living;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import static net.minecraft.realms.Tezzelator.t;

public class ModelRam extends ModelBase
{
	//fields
	ModelRenderer BodyMain;
	ModelRenderer BodyBack;
	ModelRenderer BodyBottom;
	ModelRenderer LegFrontLeft1;
	ModelRenderer LegFrontLeft2;
	ModelRenderer LegFrontLeft3;
	ModelRenderer LegFrontRight1;
	ModelRenderer LegFrontRight2;
	ModelRenderer LegFrontRight3;
	ModelRenderer LegBackLeft1;
	ModelRenderer LegBackLeft2;
	ModelRenderer LegBackLeft3;
	ModelRenderer LegBackRight1;
	ModelRenderer LegBackRight2;
	ModelRenderer LegBackRight3;
	ModelRenderer Tail;
	ModelRenderer HeadNeck;
	ModelRenderer HeadMain;
	ModelRenderer HeadSnout;
	ModelRenderer HeadCheekLeft;
	ModelRenderer HeadCheekRight;
	ModelRenderer HeadJaw;
	ModelRenderer HeadEyeRight;
	ModelRenderer HeadBrowRight;
	ModelRenderer HeadEyeLeft;
	ModelRenderer HeadBrowLeft;
	ModelRenderer HeadPlate;
	ModelRenderer HeadTop;
	ModelRenderer HeadEarLeft;
	ModelRenderer HeadEarRight;

	protected float childYOffset = 8.0F;
	protected float childZOffset = 4.0F;

	public ModelRam()
	{
		textureWidth = 128;
		textureHeight = 256;

		BodyMain = new ModelRenderer(this, 36, 74);
		BodyMain.addBox(-5F, 0F, -8F, 10, 13, 16);
		BodyMain.setRotationPoint(0F, 0F, 0F);
		BodyMain.setTextureSize(128, 256);
		BodyMain.mirror = true;
		setRotation(BodyMain, 0F, 0F, 0F);
		BodyBack = new ModelRenderer(this, 41, 103);
		BodyBack.addBox(-4F, -2F, 7F, 8, 9, 13);
		BodyBack.setRotationPoint(0F, 0F, 0F);
		BodyBack.setTextureSize(128, 256);
		BodyBack.mirror = true;
		setRotation(BodyBack, -0.3490659F, 0F, 0F);
		BodyBottom = new ModelRenderer(this, 36, 125);
		BodyBottom.addBox(-3F, 10F, -4F, 6, 5, 20);
		BodyBottom.setRotationPoint(0F, 0F, 0F);
		BodyBottom.setTextureSize(128, 256);
		BodyBottom.mirror = true;
		setRotation(BodyBottom, 0F, 0F, 0F);
		LegFrontLeft1 = new ModelRenderer(this, 88, 63);
		LegFrontLeft1.addBox(-3F, -4F, -2F, 5, 6, 5);
		LegFrontLeft1.setRotationPoint(4F, 13F, -5F);
		LegFrontLeft1.setTextureSize(128, 256);
		LegFrontLeft1.mirror = true;
		setRotation(LegFrontLeft1, 0F, 0F, 0F);
		LegFrontLeft2 = new ModelRenderer(this, 91, 74);
		LegFrontLeft2.addBox(-2.5F, 0F, -1F, 4, 7, 3);
		LegFrontLeft2.setRotationPoint(4F, 13F, -5F);
		LegFrontLeft2.setTextureSize(128, 256);
		LegFrontLeft2.mirror = true;
		setRotation(LegFrontLeft2, 0.0872665F, 0F, 0F);
		LegFrontLeft3 = new ModelRenderer(this, 93, 84);
		LegFrontLeft3.addBox(-2F, 6F, 0F, 3, 5, 2);
		LegFrontLeft3.setRotationPoint(4F, 13F, -5F);
		LegFrontLeft3.setTextureSize(128, 256);
		LegFrontLeft3.mirror = true;
		setRotation(LegFrontLeft3, 0F, 0F, 0F);
		LegFrontRight1 = new ModelRenderer(this, 16, 63);
		LegFrontRight1.addBox(-2F, -4F, -2F, 5, 6, 5);
		LegFrontRight1.setRotationPoint(-4F, 13F, -5F);
		LegFrontRight1.setTextureSize(128, 256);
		LegFrontRight1.mirror = true;
		setRotation(LegFrontRight1, 0F, 0F, 0F);
		LegFrontRight2 = new ModelRenderer(this, 19, 74);
		LegFrontRight2.addBox(-1.5F, 0F, -1F, 4, 7, 3);
		LegFrontRight2.setRotationPoint(-4F, 13F, -5F);
		LegFrontRight2.setTextureSize(128, 256);
		LegFrontRight2.mirror = true;
		setRotation(LegFrontRight2, 0.0872665F, 0F, 0F);
		LegFrontRight3 = new ModelRenderer(this, 21, 84);
		LegFrontRight3.addBox(-1F, 6F, 0F, 3, 5, 2);
		LegFrontRight3.setRotationPoint(-4F, 13F, -5F);
		LegFrontRight3.setTextureSize(128, 256);
		LegFrontRight3.mirror = true;
		setRotation(LegFrontRight3, 0F, 0F, 0F);
		LegBackLeft1 = new ModelRenderer(this, 88, 112);
		LegBackLeft1.addBox(-2F, -1F, -1F, 4, 7, 6);
		LegBackLeft1.setRotationPoint(3.5F, 12F, 7F);
		LegBackLeft1.setTextureSize(128, 256);
		LegBackLeft1.mirror = true;
		setRotation(LegBackLeft1, 0.6108652F, 0F, 0F);
		LegBackLeft2 = new ModelRenderer(this, 91, 125);
		LegBackLeft2.addBox(-2F, 6F, -1F, 4, 2, 3);
		LegBackLeft2.setRotationPoint(3.5F, 12F, 7F);
		LegBackLeft2.setTextureSize(128, 256);
		LegBackLeft2.mirror = true;
		setRotation(LegBackLeft2, 0.6108652F, 0F, 0F);
		LegBackLeft3 = new ModelRenderer(this, 93, 130);
		LegBackLeft3.addBox(-1.5F, 5F, 3.5F, 3, 7, 2);
		LegBackLeft3.setRotationPoint(3.5F, 12F, 7F);
		LegBackLeft3.setTextureSize(128, 256);
		LegBackLeft3.mirror = true;
		setRotation(LegBackLeft3, 0F, 0F, 0F);
		LegBackRight1 = new ModelRenderer(this, 16, 112);
		LegBackRight1.addBox(-2F, -1F, -1F, 4, 7, 6);
		LegBackRight1.setRotationPoint(-3.5F, 12F, 7F);
		LegBackRight1.setTextureSize(128, 256);
		LegBackRight1.mirror = true;
		setRotation(LegBackRight1, 0.6108652F, 0F, 0F);
		LegBackRight2 = new ModelRenderer(this, 19, 125);
		LegBackRight2.addBox(-2F, 6F, -1F, 4, 2, 3);
		LegBackRight2.setRotationPoint(-3.5F, 12F, 7F);
		LegBackRight2.setTextureSize(128, 256);
		LegBackRight2.mirror = true;
		setRotation(LegBackRight2, 0.6108652F, 0F, 0F);
		LegBackRight3 = new ModelRenderer(this, 21, 130);
		LegBackRight3.addBox(-1.5F, 5F, 3.5F, 3, 7, 2);
		LegBackRight3.setRotationPoint(-3.5F, 12F, 7F);
		LegBackRight3.setTextureSize(128, 256);
		LegBackRight3.mirror = true;
		setRotation(LegBackRight3, 0F, 0F, 0F);
		Tail = new ModelRenderer(this, 58, 150);
		Tail.addBox(-1.5F, 0F, 0F, 3, 8, 1);
		Tail.setRotationPoint(0F, 5F, 18F);
		Tail.setTextureSize(128, 256);
		Tail.mirror = true;
		setRotation(Tail, 0.1745329F, 0F, 0F);
		HeadNeck = new ModelRenderer(this, 49, 61);
		HeadNeck.addBox(-3F, -3F, -2.5F, 6, 6, 7);
		HeadNeck.setRotationPoint(0F, 6F, -9F);
		HeadNeck.setTextureSize(128, 256);
		HeadNeck.mirror = true;
		setRotation(HeadNeck, 0F, 0F, 0F);
		HeadMain = new ModelRenderer(this, 49, 31);
		HeadMain.addBox(-4F, -5.133333F, -6F, 8, 10, 5);
		HeadMain.setRotationPoint(0F, 6F, -9F);
		HeadMain.setTextureSize(128, 256);
		HeadMain.mirror = true;
		setRotation(HeadMain, 0F, 0F, 0F);
		HeadSnout = new ModelRenderer(this, 48, 17);
		HeadSnout.addBox(-2.5F, -7.5F, -11F, 5, 5, 9);
		HeadSnout.setRotationPoint(0F, 6F, -9F);
		HeadSnout.setTextureSize(128, 256);
		HeadSnout.mirror = true;
		setRotation(HeadSnout, 0.6108652F, 0F, 0F);
		HeadCheekLeft = new ModelRenderer(this, 75, 36);
		HeadCheekLeft.addBox(2.3F, 0.5F, -10.5F, 3, 4, 6);
		HeadCheekLeft.setRotationPoint(0F, 6F, -9F);
		HeadCheekLeft.setTextureSize(128, 256);
		HeadCheekLeft.mirror = true;
		setRotation(HeadCheekLeft, 0F, 0.2617994F, 0F);
		HeadCheekRight = new ModelRenderer(this, 31, 36);
		HeadCheekRight.addBox(-5.3F, 0.5F, -10.5F, 3, 4, 6);
		HeadCheekRight.setRotationPoint(0F, 6F, -9F);
		HeadCheekRight.setTextureSize(128, 256);
		HeadCheekRight.mirror = true;
		setRotation(HeadCheekRight, 0F, -0.2617994F, 0F);
		HeadJaw = new ModelRenderer(this, 47, 46);
		HeadJaw.addBox(-2F, 3F, -11F, 4, 4, 11);
		HeadJaw.setRotationPoint(0F, 6F, -9F);
		HeadJaw.setTextureSize(128, 256);
		HeadJaw.mirror = true;
		setRotation(HeadJaw, -0.1745329F, 0F, 0F);
		HeadEyeRight = new ModelRenderer(this, 36, 30);
		HeadEyeRight.addBox(-4.6F, -2F, -7.5F, 1, 3, 3);
		HeadEyeRight.setRotationPoint(0F, 6F, -9F);
		HeadEyeRight.setTextureSize(128, 256);
		HeadEyeRight.mirror = true;
		setRotation(HeadEyeRight, 0F, -0.2617994F, 0F);
		HeadBrowRight = new ModelRenderer(this, 35, 26);
		HeadBrowRight.addBox(-5F, -3F, -7.7F, 2, 1, 3);
		HeadBrowRight.setRotationPoint(0F, 6F, -9F);
		HeadBrowRight.setTextureSize(128, 256);
		HeadBrowRight.mirror = true;
		setRotation(HeadBrowRight, 0F, -0.2617994F, 0F);
		HeadEyeLeft = new ModelRenderer(this, 80, 30);
		HeadEyeLeft.addBox(3.6F, -2F, -7.5F, 1, 3, 3);
		HeadEyeLeft.setRotationPoint(0F, 6F, -9F);
		HeadEyeLeft.setTextureSize(128, 256);
		HeadEyeLeft.mirror = true;
		setRotation(HeadEyeLeft, 0F, 0.2617994F, 0F);
		HeadBrowLeft = new ModelRenderer(this, 79, 26);
		HeadBrowLeft.addBox(3F, -3F, -7.7F, 2, 1, 3);
		HeadBrowLeft.setRotationPoint(0F, 6F, -9F);
		HeadBrowLeft.setTextureSize(128, 256);
		HeadBrowLeft.mirror = true;
		setRotation(HeadBrowLeft, 0F, 0.2617994F, 0F);
		HeadPlate = new ModelRenderer(this, 45, 2);
		HeadPlate.addBox(-4.5F, -8.5F, -4F, 9, 2, 8);
		HeadPlate.setRotationPoint(0F, 6F, -9F);
		HeadPlate.setTextureSize(128, 256);
		HeadPlate.mirror = true;
		setRotation(HeadPlate, 0.6108652F, 0F, 0F);
		HeadTop = new ModelRenderer(this, 52, 12);
		HeadTop.addBox(-3F, -6F, -4.533333F, 6, 1, 4);
		HeadTop.setRotationPoint(0F, 6F, -9F);
		HeadTop.setTextureSize(128, 256);
		HeadTop.mirror = true;
		setRotation(HeadTop, 0.1745329F, 0F, 0F);
		HeadEarLeft = new ModelRenderer(this, 93, 39);
		HeadEarLeft.addBox(4F, -1F, -5F, 1, 4, 3);
		HeadEarLeft.setRotationPoint(0F, 6F, -9F);
		HeadEarLeft.setTextureSize(128, 256);
		HeadEarLeft.mirror = true;
		setRotation(HeadEarLeft, 0F, 0F, -0.4363323F);
		HeadEarRight = new ModelRenderer(this, 23, 39);
		HeadEarRight.addBox(-5F, -1F, -5F, 1, 4, 3);
		HeadEarRight.setRotationPoint(0F, 6F, -9F);
		HeadEarRight.setTextureSize(128, 256);
		HeadEarRight.mirror = true;
		setRotation(HeadEarRight, 0F, 0F, 0.4363323F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f, f1, f2, f3, f4, scale);
		setRotationAngles(f, f1, f2, f3, f4, scale, entity);

		if (this.isChild)
		{
			GlStateManager.pushMatrix();
			GlStateManager.translate(0.0F, 8.75F * scale, this.childZOffset * scale);
			HeadNeck.render(scale);
			HeadMain.render(scale);
			HeadSnout.render(scale);
			HeadCheekLeft.render(scale);
			HeadCheekRight.render(scale);
			HeadJaw.render(scale);
			HeadEyeRight.render(scale);
			HeadBrowRight.render(scale);
			HeadEyeLeft.render(scale);
			HeadBrowLeft.render(scale);
			HeadPlate.render(scale);
			HeadTop.render(scale);
			HeadEarLeft.render(scale);
			HeadEarRight.render(scale);
			GlStateManager.popMatrix();
			GlStateManager.pushMatrix();
			GlStateManager.scale(0.5F, 0.5F, 0.5F);
			GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
			BodyMain.render(scale);
			BodyBack.render(scale);
			BodyBottom.render(scale);
			LegFrontLeft1.render(scale);
			LegFrontLeft2.render(scale);
			LegFrontLeft3.render(scale);
			LegFrontRight1.render(scale);
			LegFrontRight2.render(scale);
			LegFrontRight3.render(scale);
			LegBackLeft1.render(scale);
			LegBackLeft2.render(scale);
			LegBackLeft3.render(scale);
			LegBackRight1.render(scale);
			LegBackRight2.render(scale);
			LegBackRight3.render(scale);
			Tail.render(scale);
			GlStateManager.popMatrix();
		}
		else
		{
			BodyMain.render(scale);
			BodyBack.render(scale);
			BodyBottom.render(scale);
			LegFrontLeft1.render(scale);
			LegFrontLeft2.render(scale);
			LegFrontLeft3.render(scale);
			LegFrontRight1.render(scale);
			LegFrontRight2.render(scale);
			LegFrontRight3.render(scale);
			LegBackLeft1.render(scale);
			LegBackLeft2.render(scale);
			LegBackLeft3.render(scale);
			LegBackRight1.render(scale);
			LegBackRight2.render(scale);
			LegBackRight3.render(scale);
			Tail.render(scale);
			HeadNeck.render(scale);
			HeadMain.render(scale);
			HeadSnout.render(scale);
			HeadCheekLeft.render(scale);
			HeadCheekRight.render(scale);
			HeadJaw.render(scale);
			HeadEyeRight.render(scale);
			HeadBrowRight.render(scale);
			HeadEyeLeft.render(scale);
			HeadBrowLeft.render(scale);
			HeadPlate.render(scale);
			HeadTop.render(scale);
			HeadEarLeft.render(scale);
			HeadEarRight.render(scale);
		}
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
	{
		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

		this.Tail.rotateAngleZ = (MathHelper.cos(ageInTicks * 0.1662F) * 0.2F);

		this.HeadNeck.rotateAngleX = headPitch * 0.017453292F;
		this.HeadNeck.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadMain.rotateAngleX = headPitch * 0.017453292F;
		this.HeadMain.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadSnout.rotateAngleX = 0.6108652F + (headPitch * 0.017453292F);
		this.HeadSnout.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadCheekLeft.rotateAngleX = headPitch * 0.017453292F;
		this.HeadCheekLeft.rotateAngleY = 0.2617994F + (netHeadYaw * 0.017453292F);
		this.HeadCheekRight.rotateAngleX = headPitch * 0.017453292F;
		this.HeadCheekRight.rotateAngleY = -0.2617994F + (netHeadYaw * 0.017453292F);
		this.HeadJaw.rotateAngleX = -0.1745329F + (headPitch * 0.017453292F);
		this.HeadJaw.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadEyeLeft.rotateAngleX = headPitch * 0.017453292F;
		this.HeadEyeLeft.rotateAngleY = 0.2617994F + (netHeadYaw * 0.017453292F);
		this.HeadEyeRight.rotateAngleX = headPitch * 0.017453292F;
		this.HeadEyeRight.rotateAngleY = -0.2617994F + (netHeadYaw * 0.017453292F);
		this.HeadBrowLeft.rotateAngleX = headPitch * 0.017453292F;
		this.HeadBrowLeft.rotateAngleY = 0.2617994F + (netHeadYaw * 0.017453292F);
		this.HeadBrowRight.rotateAngleX = headPitch * 0.017453292F;
		this.HeadBrowRight.rotateAngleY = -0.2617994F + (netHeadYaw * 0.017453292F);
		this.HeadPlate.rotateAngleX = 0.6108652F + (headPitch * 0.017453292F);
		this.HeadPlate.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadTop.rotateAngleX = 0.1745329F + (headPitch * 0.017453292F);
		this.HeadTop.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadEarLeft.rotateAngleX = headPitch * 0.017453292F;
		this.HeadEarLeft.rotateAngleY = netHeadYaw * 0.017453292F;
		this.HeadEarRight.rotateAngleX = headPitch * 0.017453292F;
		this.HeadEarRight.rotateAngleY = netHeadYaw * 0.017453292F;

		this.LegFrontLeft1.rotateAngleX = 0.0872665F + (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		this.LegFrontLeft2.rotateAngleX = 0.0872665F + (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		this.LegFrontLeft3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;

		this.LegFrontRight1.rotateAngleX = 0.0872665F + (MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount);
		this.LegFrontRight2.rotateAngleX = 0.0872665F + (MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount);
		this.LegFrontRight3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

		this.LegBackLeft1.rotateAngleX = 0.6108652F + (MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount);
		this.LegBackLeft2.rotateAngleX = 0.6108652F + (MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount);
		this.LegBackLeft3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

		this.LegBackRight1.rotateAngleX = 0.6108652F + (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		this.LegBackRight2.rotateAngleX = 0.6108652F + (MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		this.LegBackRight3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	}

}