package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.AR23LiberatorItem;

public class AR23LiberatorItemModel extends GeoModel<AR23LiberatorItem> {
	@Override
	public ResourceLocation getAnimationResource(AR23LiberatorItem animatable) {
		return new ResourceLocation("helldivers", "animations/ar23_liberator.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AR23LiberatorItem animatable) {
		return new ResourceLocation("helldivers", "geo/ar23_liberator.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AR23LiberatorItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/ar23_liberator_texture.png");
	}
}
