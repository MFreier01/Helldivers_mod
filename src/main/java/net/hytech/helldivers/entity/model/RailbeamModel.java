package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.RailbeamEntity;

public class RailbeamModel extends GeoModel<RailbeamEntity> {
	@Override
	public ResourceLocation getAnimationResource(RailbeamEntity entity) {
		return new ResourceLocation("helldivers", "animations/rail_cannon_strike.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RailbeamEntity entity) {
		return new ResourceLocation("helldivers", "geo/rail_cannon_strike.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RailbeamEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
