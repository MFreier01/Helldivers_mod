package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.HelldiversMod;

public class StaticFragGrenadeOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HelldiversMod.queueServerWork(40, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
