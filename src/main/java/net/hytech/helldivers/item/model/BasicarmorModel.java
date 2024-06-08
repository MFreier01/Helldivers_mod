package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.BasicarmorItem;

public class BasicarmorModel extends GeoModel<BasicarmorItem> {
	@Override
	public ResourceLocation getAnimationResource(BasicarmorItem object) {
		return new ResourceLocation("helldivers", "animations/helldiversarmor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BasicarmorItem object) {
		return new ResourceLocation("helldivers", "geo/helldiversarmor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BasicarmorItem object) {
		return new ResourceLocation("helldivers", "textures/item/basic_armor_texture.png");
	}
}
