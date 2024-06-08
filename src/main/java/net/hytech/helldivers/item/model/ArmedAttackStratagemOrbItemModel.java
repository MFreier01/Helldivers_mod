package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.ArmedAttackStratagemOrbItem;

public class ArmedAttackStratagemOrbItemModel extends GeoModel<ArmedAttackStratagemOrbItem> {
	@Override
	public ResourceLocation getAnimationResource(ArmedAttackStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "animations/empty_stratagem_orb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ArmedAttackStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "geo/empty_stratagem_orb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ArmedAttackStratagemOrbItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/armed_attack_stratagem_orb.png");
	}
}
