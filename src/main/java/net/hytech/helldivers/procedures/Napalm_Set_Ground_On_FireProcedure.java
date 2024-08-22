package net.hytech.helldivers.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.HelldiversMod;

public class Napalm_Set_Ground_On_FireProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		HelldiversMod.queueServerWork(20, () -> {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
		});
	}
}
