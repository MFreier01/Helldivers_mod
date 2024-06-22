package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.CommisarEntity;

public class CommisarModel extends GeoModel<CommisarEntity> {
	@Override
	public ResourceLocation getAnimationResource(CommisarEntity entity) {
		return new ResourceLocation("helldivers", "animations/commisar.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CommisarEntity entity) {
		return new ResourceLocation("helldivers", "geo/commisar.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CommisarEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
