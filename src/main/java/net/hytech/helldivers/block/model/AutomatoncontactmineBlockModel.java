package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.entity.AutomatoncontactmineTileEntity;

public class AutomatoncontactmineBlockModel extends GeoModel<AutomatoncontactmineTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AutomatoncontactmineTileEntity animatable) {
		return new ResourceLocation("helldivers", "animations/automaton_contact_mine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AutomatoncontactmineTileEntity animatable) {
		return new ResourceLocation("helldivers", "geo/automaton_contact_mine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AutomatoncontactmineTileEntity animatable) {
		return new ResourceLocation("helldivers", "textures/block/helldivers_automaton_contact_mine.png");
	}
}
