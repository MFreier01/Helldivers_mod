package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.SmallautomatonturretEntity;

public class SmallautomatonturretModel extends GeoModel<SmallautomatonturretEntity> {
	@Override
	public ResourceLocation getAnimationResource(SmallautomatonturretEntity entity) {
		return new ResourceLocation("helldivers", "animations/small_automaton_turret.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SmallautomatonturretEntity entity) {
		return new ResourceLocation("helldivers", "geo/small_automaton_turret.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SmallautomatonturretEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
