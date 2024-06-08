package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.M105StalwartItem;

public class M105StalwartItemModel extends GeoModel<M105StalwartItem> {
	@Override
	public ResourceLocation getAnimationResource(M105StalwartItem animatable) {
		return new ResourceLocation("helldivers", "animations/m105.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(M105StalwartItem animatable) {
		return new ResourceLocation("helldivers", "geo/m105.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(M105StalwartItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/m105_stalwart_texture.png");
	}
}
