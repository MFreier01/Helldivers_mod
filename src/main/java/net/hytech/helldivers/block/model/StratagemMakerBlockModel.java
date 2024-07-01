package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.entity.StratagemMakerTileEntity;

public class StratagemMakerBlockModel extends GeoModel<StratagemMakerTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StratagemMakerTileEntity animatable) {
		return new ResourceLocation("helldivers", "animations/stratagem_maker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StratagemMakerTileEntity animatable) {
		return new ResourceLocation("helldivers", "geo/stratagem_maker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StratagemMakerTileEntity animatable) {
		return new ResourceLocation("helldivers", "textures/block/stratagem_maker.png");
	}
}
