package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.HulkEntity;

public class HulkModel extends GeoModel<HulkEntity> {
	@Override
	public ResourceLocation getAnimationResource(HulkEntity entity) {
		return new ResourceLocation("helldivers", "animations/hulk.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HulkEntity entity) {
		return new ResourceLocation("helldivers", "geo/hulk.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HulkEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
