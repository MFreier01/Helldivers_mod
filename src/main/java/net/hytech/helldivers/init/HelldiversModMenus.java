
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
import net.hytech.helldivers.world.inventory.OrbitalWalkingBarrageGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalSmokeGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalRailCannonGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalPrecisionStrikeGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalLaserGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalGattlingBarrageGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalGasGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalEMSGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalAirburstGUIMenu;
import net.hytech.helldivers.world.inventory.Orbital380MMGUIMenu;
import net.hytech.helldivers.world.inventory.Orbital120MMGUIMenu;
import net.hytech.helldivers.world.inventory.EagleStrafingGUIMenu;
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
	public static final RegistryObject<MenuType<EagleStrafingGUIMenu>> EAGLE_STRAFING_GUI = REGISTRY.register("eagle_strafing_gui", () -> IForgeMenuType.create(EagleStrafingGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalRailCannonGUIMenu>> ORBITAL_RAIL_CANNON_GUI = REGISTRY.register("orbital_rail_cannon_gui", () -> IForgeMenuType.create(OrbitalRailCannonGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalLaserGUIMenu>> ORBITAL_LASER_GUI = REGISTRY.register("orbital_laser_gui", () -> IForgeMenuType.create(OrbitalLaserGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalAirburstGUIMenu>> ORBITAL_AIRBURST_GUI = REGISTRY.register("orbital_airburst_gui", () -> IForgeMenuType.create(OrbitalAirburstGUIMenu::new));
	public static final RegistryObject<MenuType<Orbital120MMGUIMenu>> ORBITAL_120_MMGUI = REGISTRY.register("orbital_120_mmgui", () -> IForgeMenuType.create(Orbital120MMGUIMenu::new));
	public static final RegistryObject<MenuType<Orbital380MMGUIMenu>> ORBITAL_380_MMGUI = REGISTRY.register("orbital_380_mmgui", () -> IForgeMenuType.create(Orbital380MMGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalSmokeGUIMenu>> ORBITAL_SMOKE_GUI = REGISTRY.register("orbital_smoke_gui", () -> IForgeMenuType.create(OrbitalSmokeGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalEMSGUIMenu>> ORBITAL_EMSGUI = REGISTRY.register("orbital_emsgui", () -> IForgeMenuType.create(OrbitalEMSGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalPrecisionStrikeGUIMenu>> ORBITAL_PRECISION_STRIKE_GUI = REGISTRY.register("orbital_precision_strike_gui", () -> IForgeMenuType.create(OrbitalPrecisionStrikeGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalWalkingBarrageGUIMenu>> ORBITAL_WALKING_BARRAGE_GUI = REGISTRY.register("orbital_walking_barrage_gui", () -> IForgeMenuType.create(OrbitalWalkingBarrageGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalGattlingBarrageGUIMenu>> ORBITAL_GATTLING_BARRAGE_GUI = REGISTRY.register("orbital_gattling_barrage_gui", () -> IForgeMenuType.create(OrbitalGattlingBarrageGUIMenu::new));
	public static final RegistryObject<MenuType<OrbitalGasGUIMenu>> ORBITAL_GAS_GUI = REGISTRY.register("orbital_gas_gui", () -> IForgeMenuType.create(OrbitalGasGUIMenu::new));
}
