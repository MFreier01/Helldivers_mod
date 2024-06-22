package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.AutomatonbulletItem;

public class AutomatonbulletItemModel extends GeoModel<AutomatonbulletItem> {
	@Override
	public ResourceLocation getAnimationResource(AutomatonbulletItem animatable) {
		return new ResourceLocation("helldivers", "animations/automaton_bullet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AutomatonbulletItem animatable) {
		return new ResourceLocation("helldivers", "geo/automaton_bullet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AutomatonbulletItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/automaton_bullet.png");
	}
}
