package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.AutomatoncannonEntity;

public class AutomatoncannonModel extends GeoModel<AutomatoncannonEntity> {
	@Override
	public ResourceLocation getAnimationResource(AutomatoncannonEntity entity) {
		return new ResourceLocation("helldivers", "animations/automaton_cannon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AutomatoncannonEntity entity) {
		return new ResourceLocation("helldivers", "geo/automaton_cannon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AutomatoncannonEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(AutomatoncannonEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
