
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
import net.hytech.helldivers.client.gui.OrbitalWalkingBarrageGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalSmokeGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalRailCannonGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalPrecisionStrikeGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalLaserGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalGattlingBarrageGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalGasGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalEMSGUIScreen;
import net.hytech.helldivers.client.gui.OrbitalAirburstGUIScreen;
import net.hytech.helldivers.client.gui.Orbital380MMGUIScreen;
import net.hytech.helldivers.client.gui.Orbital120MMGUIScreen;
import net.hytech.helldivers.client.gui.EagleStrafingGUIScreen;
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
			MenuScreens.register(HelldiversModMenus.EAGLE_STRAFING_GUI.get(), EagleStrafingGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_RAIL_CANNON_GUI.get(), OrbitalRailCannonGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_LASER_GUI.get(), OrbitalLaserGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_AIRBURST_GUI.get(), OrbitalAirburstGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_120_MMGUI.get(), Orbital120MMGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_380_MMGUI.get(), Orbital380MMGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_SMOKE_GUI.get(), OrbitalSmokeGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_EMSGUI.get(), OrbitalEMSGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_PRECISION_STRIKE_GUI.get(), OrbitalPrecisionStrikeGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_WALKING_BARRAGE_GUI.get(), OrbitalWalkingBarrageGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_GATTLING_BARRAGE_GUI.get(), OrbitalGattlingBarrageGUIScreen::new);
			MenuScreens.register(HelldiversModMenus.ORBITAL_GAS_GUI.get(), OrbitalGasGUIScreen::new);
		});
	}
}
