package net.hytech.helldivers.procedures;

import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.entity.HellpodEntity;

public class HellpodOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof HellpodEntity) {
			((HellpodEntity) entity).setAnimation("animation.hellpod.hits floor");
		}
	}
}
