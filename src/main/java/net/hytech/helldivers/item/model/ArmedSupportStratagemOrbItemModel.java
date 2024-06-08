package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.ArmedSupportStratagemOrbItem;

public class ArmedSupportStratagemOrbItemModel extends GeoModel<ArmedSupportStratagemOrbItem> {
	@Override
	public ResourceLocation getAnimationResource(ArmedSupportStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "animations/empty_stratagem_orb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArmedSupportStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "geo/empty_stratagem_orb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArmedSupportStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/armed_support_stratagem_orb.png");
	}
}
