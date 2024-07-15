
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.hytech.helldivers.world.inventory.StratagemmakerGUIMenu;
import net.hytech.helldivers.world.inventory.EagleSmokeGUIMenu;
import net.hytech.helldivers.world.inventory.EagleNapalmGUIMenu;
import net.hytech.helldivers.world.inventory.EagleClusterBombGUIMenu;
import net.hytech.helldivers.world.inventory.EagleAirStrikeGUIMenu;
import net.hytech.helldivers.world.inventory.Eagle500KGGUIMenu;
import net.hytech.helldivers.world.inventory.Eagle110MMRocketPodGUIMenu;
import net.hytech.helldivers.world.inventory.CallStratagemsMenu;
import net.hytech.helldivers.world.inventory.AmmoboxguiMenu;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<MenuType<CallStratagemsMenu>> CALL_STRATAGEMS = REGISTRY.register("call_stratagems", () -> IForgeMenuType.create(CallStratagemsMenu::new));
	public static final RegistryObject<MenuType<AmmoboxguiMenu>> AMMOBOXGUI = REGISTRY.register("ammoboxgui", () -> IForgeMenuType.create(AmmoboxguiMenu::new));
	public static final RegistryObject<MenuType<StratagemmakerGUIMenu>> STRATAGEMMAKER_GUI = REGISTRY.register("stratagemmaker_gui", () -> IForgeMenuType.create(StratagemmakerGUIMenu::new));
	public static final RegistryObject<MenuType<EagleAirStrikeGUIMenu>> EAGLE_AIR_STRIKE_GUI = REGISTRY.register("eagle_air_strike_gui", () -> IForgeMenuType.create(EagleAirStrikeGUIMenu::new));
	public static final RegistryObject<MenuType<Eagle110MMRocketPodGUIMenu>> EAGLE_110_MM_ROCKET_POD_GUI = REGISTRY.register("eagle_110_mm_rocket_pod_gui", () -> IForgeMenuType.create(Eagle110MMRocketPodGUIMenu::new));
	public static final RegistryObject<MenuType<EagleNapalmGUIMenu>> EAGLE_NAPALM_GUI = REGISTRY.register("eagle_napalm_gui", () -> IForgeMenuType.create(EagleNapalmGUIMenu::new));
	public static final RegistryObject<MenuType<EagleClusterBombGUIMenu>> EAGLE_CLUSTER_BOMB_GUI = REGISTRY.register("eagle_cluster_bomb_gui", () -> IForgeMenuType.create(EagleClusterBombGUIMenu::new));
	public static final RegistryObject<MenuType<Eagle500KGGUIMenu>> EAGLE_500_KGGUI = REGISTRY.register("eagle_500_kggui", () -> IForgeMenuType.create(Eagle500KGGUIMenu::new));
	public static final RegistryObject<MenuType<EagleSmokeGUIMenu>> EAGLE_SMOKE_GUI = REGISTRY.register("eagle_smoke_gui", () -> IForgeMenuType.create(EagleSmokeGUIMenu::new));
}
