package net.hytech.helldivers.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.block.display.AutomatoncontactmineDisplayItem;

public class AutomatoncontactmineDisplayModel extends GeoModel<AutomatoncontactmineDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AutomatoncontactmineDisplayItem animatable) {
		return new ResourceLocation("helldivers", "animations/automaton_contact_mine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AutomatoncontactmineDisplayItem animatable) {
		return new ResourceLocation("helldivers", "geo/automaton_contact_mine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AutomatoncontactmineDisplayItem entity) {
		return new ResourceLocation("helldivers", "textures/block/helldivers_automaton_contact_mine.png");
	}
}
