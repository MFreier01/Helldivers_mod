package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.entity.TerminiddustsporeTileEntity;

public class TerminiddustsporeBlockModel extends GeoModel<TerminiddustsporeTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(TerminiddustsporeTileEntity animatable) {
		return new ResourceLocation("helldivers", "animations/terminid_dust_spore.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerminiddustsporeTileEntity animatable) {
		return new ResourceLocation("helldivers", "geo/terminid_dust_spore.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerminiddustsporeTileEntity animatable) {
		return new ResourceLocation("helldivers", "textures/block/helldivers_dust_spores.png");
	}
}
