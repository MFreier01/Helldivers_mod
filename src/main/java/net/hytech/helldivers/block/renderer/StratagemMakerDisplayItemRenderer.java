package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.StratagemMakerDisplayModel;
import net.hytech.helldivers.block.display.StratagemMakerDisplayItem;

public class StratagemMakerDisplayItemRenderer extends GeoItemRenderer<StratagemMakerDisplayItem> {
	public StratagemMakerDisplayItemRenderer() {
		super(new StratagemMakerDisplayModel());
	}

	@Override
	public RenderType getRenderType(StratagemMakerDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
