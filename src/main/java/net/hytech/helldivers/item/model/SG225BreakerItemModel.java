package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.SG225BreakerItem;

public class SG225BreakerItemModel extends GeoModel<SG225BreakerItem> {
	@Override
	public ResourceLocation getAnimationResource(SG225BreakerItem animatable) {
		return new ResourceLocation("helldivers", "animations/sg225.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SG225BreakerItem animatable) {
		return new ResourceLocation("helldivers", "geo/sg225.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SG225BreakerItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/sg225.png");
	}
}
