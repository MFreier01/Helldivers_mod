package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.display.StratagemMakerDisplayItem;

public class StratagemMakerDisplayModel extends GeoModel<StratagemMakerDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StratagemMakerDisplayItem animatable) {
		return new ResourceLocation("helldivers", "animations/stratagem_maker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StratagemMakerDisplayItem animatable) {
		return new ResourceLocation("helldivers", "geo/stratagem_maker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StratagemMakerDisplayItem entity) {
		return new ResourceLocation("helldivers", "textures/block/stratagem_maker.png");
	}
}
