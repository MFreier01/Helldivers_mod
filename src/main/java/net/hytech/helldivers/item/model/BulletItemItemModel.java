package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.BulletItemItem;

public class BulletItemItemModel extends GeoModel<BulletItemItem> {
	@Override
	public ResourceLocation getAnimationResource(BulletItemItem animatable) {
		return new ResourceLocation("helldivers", "animations/bullet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BulletItemItem animatable) {
		return new ResourceLocation("helldivers", "geo/bullet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BulletItemItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/bullet.png");
	}
}
