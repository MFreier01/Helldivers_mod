package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.AirStrikeBombItemItem;

public class AirStrikeBombItemItemModel extends GeoModel<AirStrikeBombItemItem> {
	@Override
	public ResourceLocation getAnimationResource(AirStrikeBombItemItem animatable) {
		return new ResourceLocation("helldivers", "animations/air_strike_bomb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AirStrikeBombItemItem animatable) {
		return new ResourceLocation("helldivers", "geo/air_strike_bomb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AirStrikeBombItemItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/air_strke_bomb.png");
	}
}
