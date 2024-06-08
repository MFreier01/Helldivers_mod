package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.TerminiddustsporeDisplayModel;
import net.hytech.helldivers.block.display.TerminiddustsporeDisplayItem;

public class TerminiddustsporeDisplayItemRenderer extends GeoItemRenderer<TerminiddustsporeDisplayItem> {
	public TerminiddustsporeDisplayItemRenderer() {
		super(new TerminiddustsporeDisplayModel());
	}

	@Override
	public RenderType getRenderType(TerminiddustsporeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
