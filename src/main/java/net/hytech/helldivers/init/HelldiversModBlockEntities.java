
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.hytech.helldivers.block.entity.TerminiddustsporeTileEntity;
import net.hytech.helldivers.block.entity.StratagemMakerTileEntity;
import net.hytech.helldivers.block.entity.AutomatoncontactmineTileEntity;
import net.hytech.helldivers.block.entity.AmmoBoxTileEntity;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<BlockEntityType<TerminiddustsporeTileEntity>> TERMINIDDUSTSPORE = REGISTRY.register("terminiddustspore",
			() -> BlockEntityType.Builder.of(TerminiddustsporeTileEntity::new, HelldiversModBlocks.TERMINIDDUSTSPORE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AutomatoncontactmineTileEntity>> AUTOMATONCONTACTMINE = REGISTRY.register("automatoncontactmine",
			() -> BlockEntityType.Builder.of(AutomatoncontactmineTileEntity::new, HelldiversModBlocks.AUTOMATONCONTACTMINE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AmmoBoxTileEntity>> AMMO_BOX = REGISTRY.register("ammo_box", () -> BlockEntityType.Builder.of(AmmoBoxTileEntity::new, HelldiversModBlocks.AMMO_BOX.get()).build(null));
	public static final RegistryObject<BlockEntityType<StratagemMakerTileEntity>> STRATAGEM_MAKER = REGISTRY.register("stratagem_maker",
			() -> BlockEntityType.Builder.of(StratagemMakerTileEntity::new, HelldiversModBlocks.STRATAGEM_MAKER.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
