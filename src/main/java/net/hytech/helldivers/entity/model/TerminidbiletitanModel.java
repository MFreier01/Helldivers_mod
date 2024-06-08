package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.TerminidbiletitanEntity;

public class TerminidbiletitanModel extends GeoModel<TerminidbiletitanEntity> {
	@Override
	public ResourceLocation getAnimationResource(TerminidbiletitanEntity entity) {
		return new ResourceLocation("helldivers", "animations/bile_titan.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerminidbiletitanEntity entity) {
		return new ResourceLocation("helldivers", "geo/bile_titan.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerminidbiletitanEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
