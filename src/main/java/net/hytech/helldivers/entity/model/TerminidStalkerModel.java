package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.TerminidStalkerEntity;

public class TerminidStalkerModel extends GeoModel<TerminidStalkerEntity> {
	@Override
	public ResourceLocation getAnimationResource(TerminidStalkerEntity entity) {
		return new ResourceLocation("helldivers", "animations/stalker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerminidStalkerEntity entity) {
		return new ResourceLocation("helldivers", "geo/stalker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerminidStalkerEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TerminidStalkerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("StalkerHead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
