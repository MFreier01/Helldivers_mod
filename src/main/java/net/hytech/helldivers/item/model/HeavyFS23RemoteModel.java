package net.hytech.helldivers.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.item.HeavyFS23RemoteItem;

public class HeavyFS23RemoteModel extends GeoModel<HeavyFS23RemoteItem> {
	@Override
	public ResourceLocation getAnimationResource(HeavyFS23RemoteItem object) {
		return new ResourceLocation("helldivers", "animations/heavy_fs-23.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HeavyFS23RemoteItem object) {
		return new ResourceLocation("helldivers", "geo/heavy_fs-23.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HeavyFS23RemoteItem object) {
		return new ResourceLocation("helldivers", "textures/item/fs_23_heavy.png");
	}
}
