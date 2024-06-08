package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.HeavyFS23Item;

public class HeavyFS23Model extends GeoModel<HeavyFS23Item> {
	@Override
	public ResourceLocation getAnimationResource(HeavyFS23Item object) {
		return new ResourceLocation("helldivers", "animations/heavy_fs-23.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyFS23Item object) {
		return new ResourceLocation("helldivers", "geo/heavy_fs-23.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyFS23Item object) {
		return new ResourceLocation("helldivers", "textures/item/texture3.png");
	}
}
