package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.HelldiversMod;

public class Projectile500KGProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = HelldiversModEntities.EAGLE_STRIKE_BOMB_ENTITY.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(5);
				entityToSpawn.setYBodyRot(5);
				entityToSpawn.setYHeadRot(5);
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
		HelldiversMod.queueServerWork(40, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 100, Level.ExplosionInteraction.TNT);
		});
	}
}
