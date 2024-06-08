package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.TerminiddustsporeBlockModel;
import net.hytech.helldivers.block.entity.TerminiddustsporeTileEntity;

public class TerminiddustsporeTileRenderer extends GeoBlockRenderer<TerminiddustsporeTileEntity> {
	public TerminiddustsporeTileRenderer() {
		super(new TerminiddustsporeBlockModel());
	}

	@Override
	public RenderType getRenderType(TerminiddustsporeTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
