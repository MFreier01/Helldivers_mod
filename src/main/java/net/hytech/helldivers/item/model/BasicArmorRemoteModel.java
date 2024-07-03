package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.BasicArmorRemoteItem;

public class BasicArmorRemoteModel extends GeoModel<BasicArmorRemoteItem> {
	@Override
	public ResourceLocation getAnimationResource(BasicArmorRemoteItem object) {
		return new ResourceLocation("helldivers", "animations/helldiversarmor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BasicArmorRemoteItem object) {
		return new ResourceLocation("helldivers", "geo/helldiversarmor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BasicArmorRemoteItem object) {
		return new ResourceLocation("helldivers", "textures/item/basic_armor_texture.png");
	}
}
