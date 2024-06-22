package net.hytech.helldivers.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.hytech.helldivers.init.HelldiversModBlockEntities;
import net.hytech.helldivers.block.renderer.TerminiddustsporeTileRenderer;
import net.hytech.helldivers.block.renderer.AutomatoncontactmineTileRenderer;
import net.hytech.helldivers.block.renderer.AmmoBoxTileRenderer;
import net.hytech.helldivers.HelldiversMod;

@Mod.EventBusSubscriber(modid = HelldiversMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(HelldiversModBlockEntities.TERMINIDDUSTSPORE.get(), context -> new TerminiddustsporeTileRenderer());
		event.registerBlockEntityRenderer(HelldiversModBlockEntities.AUTOMATONCONTACTMINE.get(), context -> new AutomatoncontactmineTileRenderer());
		event.registerBlockEntityRenderer(HelldiversModBlockEntities.AMMO_BOX.get(), context -> new AmmoBoxTileRenderer());
	}
}
