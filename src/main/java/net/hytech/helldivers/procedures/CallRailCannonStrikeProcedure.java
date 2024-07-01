package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.HelldiversMod;

public class CallRailCannonStrikeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("RailCannonStrike")) {
			HelldiversMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = HelldiversModEntities.RAILBEAM.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			});
		}
		entity.getPersistentData().putString("ActiveStratagem", "None");
	}
}
