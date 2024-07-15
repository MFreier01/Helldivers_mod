
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
import net.hytech.helldivers.client.gui.EagleSmokeGUIScreen;
import net.hytech.helldivers.client.gui.EagleNapalmGUIScreen;
import net.hytech.helldivers.client.gui.EagleClusterBombGUIScreen;
import net.hytech.helldivers.client.gui.EagleAirStrikeGUIScreen;
import net.hytech.helldivers.client.gui.Eagle500KGGUIScreen;
import net.hytech.helldivers.client.gui.Eagle110MMRocketPodGUIScreen;
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
			MenuScreens.register(HelldiversModMenus.EAGLE_AIR_STRIKE_GUI.get(), EagleAirStrikeGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.EAGLE_110_MM_ROCKET_POD_GUI.get(), Eagle110MMRocketPodGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.EAGLE_NAPALM_GUI.get(), EagleNapalmGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.EAGLE_CLUSTER_BOMB_GUI.get(), EagleClusterBombGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.EAGLE_500_KGGUI.get(), Eagle500KGGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.EAGLE_SMOKE_GUI.get(), EagleSmokeGUIScreen::new);
		});
	}
}
