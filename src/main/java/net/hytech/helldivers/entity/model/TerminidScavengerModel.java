package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.TerminidScavengerEntity;

public class TerminidScavengerModel extends GeoModel<TerminidScavengerEntity> {
	@Override
	public ResourceLocation getAnimationResource(TerminidScavengerEntity entity) {
		return new ResourceLocation("helldivers", "animations/scavenger.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerminidScavengerEntity entity) {
		return new ResourceLocation("helldivers", "geo/scavenger.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerminidScavengerEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
