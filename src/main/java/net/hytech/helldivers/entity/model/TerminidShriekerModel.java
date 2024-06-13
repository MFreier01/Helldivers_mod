package net.hytech.helldivers.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.entity.TerminidShriekerEntity;

public class TerminidShriekerModel extends GeoModel<TerminidShriekerEntity> {
	@Override
	public ResourceLocation getAnimationResource(TerminidShriekerEntity entity) {
		return new ResourceLocation("helldivers", "animations/shrieker.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TerminidShriekerEntity entity) {
		return new ResourceLocation("helldivers", "geo/shrieker.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TerminidShriekerEntity entity) {
		return new ResourceLocation("helldivers", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TerminidShriekerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
