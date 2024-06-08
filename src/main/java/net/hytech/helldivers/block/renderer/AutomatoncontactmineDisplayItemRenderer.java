package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.AutomatoncontactmineDisplayModel;
import net.hytech.helldivers.block.display.AutomatoncontactmineDisplayItem;

public class AutomatoncontactmineDisplayItemRenderer extends GeoItemRenderer<AutomatoncontactmineDisplayItem> {
	public AutomatoncontactmineDisplayItemRenderer() {
		super(new AutomatoncontactmineDisplayModel());
	}

	@Override
	public RenderType getRenderType(AutomatoncontactmineDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
