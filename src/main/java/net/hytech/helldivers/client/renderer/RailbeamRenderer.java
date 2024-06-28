
package net.hytech.helldivers.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.entity.model.RailbeamModel;
import net.hytech.helldivers.entity.layer.RailbeamLayer;
import net.hytech.helldivers.entity.RailbeamEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class RailbeamRenderer extends GeoEntityRenderer<RailbeamEntity> {
	public RailbeamRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new RailbeamModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new RailbeamLayer(this));
	}

	@Override
	public RenderType getRenderType(RailbeamEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, RailbeamEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(RailbeamEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
