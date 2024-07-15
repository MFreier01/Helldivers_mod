
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
import net.hytech.helldivers.world.inventory.ProgramGUIMenu;
import net.hytech.helldivers.world.inventory.CallStratagemsMenu;
import net.hytech.helldivers.world.inventory.AmmoboxguiMenu;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<MenuType<CallStratagemsMenu>> CALL_STRATAGEMS = REGISTRY.register("call_stratagems", () -> IForgeMenuType.create(CallStratagemsMenu::new));
	public static final RegistryObject<MenuType<AmmoboxguiMenu>> AMMOBOXGUI = REGISTRY.register("ammoboxgui", () -> IForgeMenuType.create(AmmoboxguiMenu::new));
	public static final RegistryObject<MenuType<StratagemmakerGUIMenu>> STRATAGEMMAKER_GUI = REGISTRY.register("stratagemmaker_gui", () -> IForgeMenuType.create(StratagemmakerGUIMenu::new));
	public static final RegistryObject<MenuType<ProgramGUIMenu>> PROGRAM_GUI = REGISTRY.register("program_gui", () -> IForgeMenuType.create(ProgramGUIMenu::new));
}
