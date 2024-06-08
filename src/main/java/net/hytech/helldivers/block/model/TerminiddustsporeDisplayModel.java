package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.display.TerminiddustsporeDisplayItem;

public class TerminiddustsporeDisplayModel extends GeoModel<TerminiddustsporeDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(TerminiddustsporeDisplayItem animatable) {
		return new ResourceLocation("helldivers", "animations/terminid_dust_spore.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerminiddustsporeDisplayItem animatable) {
		return new ResourceLocation("helldivers", "geo/terminid_dust_spore.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerminiddustsporeDisplayItem entity) {
		return new ResourceLocation("helldivers", "textures/block/helldivers_dust_spores.png");
	}
}
