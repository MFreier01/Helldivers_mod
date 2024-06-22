package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.entity.AmmoBoxTileEntity;

public class AmmoBoxBlockModel extends GeoModel<AmmoBoxTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AmmoBoxTileEntity animatable) {
		return new ResourceLocation("helldivers", "animations/ammo_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AmmoBoxTileEntity animatable) {
		return new ResourceLocation("helldivers", "geo/ammo_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AmmoBoxTileEntity animatable) {
		return new ResourceLocation("helldivers", "textures/block/ammo_box.png");
	}
}
