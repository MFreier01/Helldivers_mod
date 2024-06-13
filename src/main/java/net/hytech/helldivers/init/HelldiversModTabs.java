
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.hytech.helldivers.HelldiversMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HelldiversModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HelldiversMod.MODID);
	public static final RegistryObject<CreativeModeTab> HELLDIVERS = REGISTRY.register("helldivers",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.helldivers.helldivers")).icon(() -> new ItemStack(HelldiversModItems.BASICARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HelldiversModItems.BASICARMOR_HELMET.get());
				tabData.accept(HelldiversModItems.BASICARMOR_CHESTPLATE.get());
				tabData.accept(HelldiversModItems.BASICARMOR_LEGGINGS.get());
				tabData.accept(HelldiversModItems.BASICARMOR_BOOTS.get());
				tabData.accept(HelldiversModItems.HEAVY_FS_23_HELMET.get());
				tabData.accept(HelldiversModItems.HEAVY_FS_23_CHESTPLATE.get());
				tabData.accept(HelldiversModItems.HEAVY_FS_23_LEGGINGS.get());
				tabData.accept(HelldiversModItems.HEAVY_FS_23_BOOTS.get());
				tabData.accept(HelldiversModItems.AR_23_LIBERATOR.get());
				tabData.accept(HelldiversModItems.SG_225_BREAKER.get());
				tabData.accept(HelldiversModItems.M_105_STALWART.get());
				tabData.accept(HelldiversModItems.APW_1_ANTI_MATERIAL_RIFLE.get());
				tabData.accept(HelldiversModItems.FRAG_GRENADE.get());
				tabData.accept(HelldiversModBlocks.TERMINIDHIVE.get().asItem());
				tabData.accept(HelldiversModBlocks.TERMINIDWALL.get().asItem());
				tabData.accept(HelldiversModBlocks.TERMINIDSTONE.get().asItem());
				tabData.accept(HelldiversModBlocks.TERMINIDREINFORCEDWALL.get().asItem());
				tabData.accept(HelldiversModBlocks.TERMINIDDUSTSPORE.get().asItem());
				tabData.accept(HelldiversModBlocks.AUTOMATONCONTACTMINE.get().asItem());
				tabData.accept(HelldiversModItems.TERMINID_SCAVENGER_SPAWN_EGG.get());
				tabData.accept(HelldiversModItems.STRATAGEM_REMOTE.get());
				tabData.accept(HelldiversModItems.E_710.get());
				tabData.accept(HelldiversModItems.EMPTY_STRATAGEM_ORB.get());
				tabData.accept(HelldiversModItems.ARMED_ATTACK_STRATAGEM_ORB.get());
				tabData.accept(HelldiversModItems.ARMED_SUPPORT_STRATAGEM_ORB.get());
				tabData.accept(HelldiversModItems.STIM.get());
				tabData.accept(HelldiversModBlocks.AUTOMATON_FACTORYBASE.get().asItem());
				tabData.accept(HelldiversModItems.TERMINID_SHRIEKER_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HelldiversModItems.BULLET_ITEM.get());
			tabData.accept(HelldiversModItems.TERMINIDBILETITAN_SPAWN_EGG.get());
		}
	}
}
