package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.LightSC30Item;

public class LightSC30Model extends GeoModel<LightSC30Item> {
	@Override
	public ResourceLocation getAnimationResource(LightSC30Item object) {
		return new ResourceLocation("helldivers", "animations/sc-30.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightSC30Item object) {
		return new ResourceLocation("helldivers", "geo/sc-30.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightSC30Item object) {
		return new ResourceLocation("helldivers", "textures/item/sc-30_texture.png");
	}
}
