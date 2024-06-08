package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.APW1AntiMaterialRifleItem;

public class APW1AntiMaterialRifleItemModel extends GeoModel<APW1AntiMaterialRifleItem> {
	@Override
	public ResourceLocation getAnimationResource(APW1AntiMaterialRifleItem animatable) {
		return new ResourceLocation("helldivers", "animations/apw1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(APW1AntiMaterialRifleItem animatable) {
		return new ResourceLocation("helldivers", "geo/apw1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(APW1AntiMaterialRifleItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/apw1_texture.png");
	}
}
