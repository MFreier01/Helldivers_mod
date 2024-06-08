package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.StaticFragGrenadeEntity;

public class StaticFragGrenadeModel extends GeoModel<StaticFragGrenadeEntity> {
	@Override
	public ResourceLocation getAnimationResource(StaticFragGrenadeEntity entity) {
		return new ResourceLocation("helldivers", "animations/frag_grenade.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StaticFragGrenadeEntity entity) {
		return new ResourceLocation("helldivers", "geo/frag_grenade.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StaticFragGrenadeEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
