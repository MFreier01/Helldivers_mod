package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.FragGrenadeItem;

public class FragGrenadeItemModel extends GeoModel<FragGrenadeItem> {
	@Override
	public ResourceLocation getAnimationResource(FragGrenadeItem animatable) {
		return new ResourceLocation("helldivers", "animations/frag_grenade_item.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FragGrenadeItem animatable) {
		return new ResourceLocation("helldivers", "geo/frag_grenade_item.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FragGrenadeItem animatable) {
		return new ResourceLocation("helldivers", "textures/item/frag_grenade_item_3d.png");
	}
}
