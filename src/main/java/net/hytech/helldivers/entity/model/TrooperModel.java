package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.TrooperEntity;

public class TrooperModel extends GeoModel<TrooperEntity> {
	@Override
	public ResourceLocation getAnimationResource(TrooperEntity entity) {
		return new ResourceLocation("helldivers", "animations/trooper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TrooperEntity entity) {
		return new ResourceLocation("helldivers", "geo/trooper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TrooperEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
