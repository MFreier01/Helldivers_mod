package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.HellpodEntity;

public class HellpodModel extends GeoModel<HellpodEntity> {
	@Override
	public ResourceLocation getAnimationResource(HellpodEntity entity) {
		return new ResourceLocation("helldivers", "animations/hellpod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HellpodEntity entity) {
		return new ResourceLocation("helldivers", "geo/hellpod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HellpodEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
