package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.EmptyStratagemOrbItem;

public class EmptyStratagemOrbItemModel extends GeoModel<EmptyStratagemOrbItem> {
	@Override
	public ResourceLocation getAnimationResource(EmptyStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "animations/empty_stratagem_orb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EmptyStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "geo/empty_stratagem_orb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EmptyStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/empty_stratagem_orb.png");
	}
}
