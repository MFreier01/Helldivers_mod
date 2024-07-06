package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.entity.HellpodEntity;
import net.hytech.helldivers.HelldiversMod;

public class HellpodOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof HellpodEntity) {
			((HellpodEntity) entity).setAnimation("animation.hellpod.hits floor");
		}
		HelldiversMod.queueServerWork(600, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
