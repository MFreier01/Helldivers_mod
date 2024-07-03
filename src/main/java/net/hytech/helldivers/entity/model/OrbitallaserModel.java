package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.OrbitallaserEntity;

public class OrbitallaserModel extends GeoModel<OrbitallaserEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrbitallaserEntity entity) {
		return new ResourceLocation("helldivers", "animations/orbital_laser.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrbitallaserEntity entity) {
		return new ResourceLocation("helldivers", "geo/orbital_laser.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrbitallaserEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

}
