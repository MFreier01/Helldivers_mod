package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.RocketpodItem;

public class RocketpodItemModel extends GeoModel<RocketpodItem> {
	@Override
	public ResourceLocation getAnimationResource(RocketpodItem animatable) {
		return new ResourceLocation("helldivers", "animations/rocket_pod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RocketpodItem animatable) {
		return new ResourceLocation("helldivers", "geo/rocket_pod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RocketpodItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/rocket_pod.png");
	}
}
