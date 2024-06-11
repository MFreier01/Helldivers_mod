package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.HellpodItemItem;

public class HellpodItemItemModel extends GeoModel<HellpodItemItem> {
	@Override
	public ResourceLocation getAnimationResource(HellpodItemItem animatable) {
		return new ResourceLocation("helldivers", "animations/hellpod.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HellpodItemItem animatable) {
		return new ResourceLocation("helldivers", "geo/hellpod.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HellpodItemItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/hellpod.png");
	}
}
