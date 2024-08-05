package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.init.HelldiversModBlocks;

public class PoweredAutomatonSpawnerOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), HelldiversModBlocks.AUTOMATONSPAWNER.get().defaultBlockState(), 3);
	}
}
