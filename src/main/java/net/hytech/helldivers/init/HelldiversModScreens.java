
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.hytech.helldivers.client.gui.StratagemmakerGUIScreen;
import net.hytech.helldivers.client.gui.ProgramGUIScreen;
import net.hytech.helldivers.client.gui.CallStratagemsScreen;
import net.hytech.helldivers.client.gui.AmmoboxguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HelldiversModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HelldiversModMenus.CALL_STRATAGEMS.get(), CallStratagemsScreen::new);
			MenuScreens.register(HelldiversModMenus.AMMOBOXGUI.get(), AmmoboxguiScreen::new);
			MenuScreens.register(HelldiversModMenus.STRATAGEMMAKER_GUI.get(), StratagemmakerGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.PROGRAM_GUI.get(), ProgramGUIScreen::new);
		});
	}
}
