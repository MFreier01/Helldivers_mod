package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.EagleStrikeBombEntityEntity;

public class EagleStrikeBombEntityModel extends GeoModel<EagleStrikeBombEntityEntity> {
	@Override
	public ResourceLocation getAnimationResource(EagleStrikeBombEntityEntity entity) {
		return new ResourceLocation("helldivers", "animations/500kg_bomb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EagleStrikeBombEntityEntity entity) {
		return new ResourceLocation("helldivers", "geo/500kg_bomb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EagleStrikeBombEntityEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
