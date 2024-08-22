
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.hytech.helldivers.fluid.NapalmFluid;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, HelldiversMod.MODID);
	public static final RegistryObject<FlowingFluid> NAPALM = REGISTRY.register("napalm", () -> new NapalmFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_NAPALM = REGISTRY.register("flowing_napalm", () -> new NapalmFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NAPALM.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NAPALM.get(), RenderType.translucent());
		}
	}
}
