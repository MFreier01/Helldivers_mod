package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.display.AmmoBoxDisplayItem;

public class AmmoBoxDisplayModel extends GeoModel<AmmoBoxDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AmmoBoxDisplayItem animatable) {
		return new ResourceLocation("helldivers", "animations/ammo_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AmmoBoxDisplayItem animatable) {
		return new ResourceLocation("helldivers", "geo/ammo_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AmmoBoxDisplayItem entity) {
		return new ResourceLocation("helldivers", "textures/block/ammo_box.png");
	}
}
