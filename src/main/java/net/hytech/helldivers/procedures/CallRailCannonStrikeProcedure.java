package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.RailcannonstrikeprojectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class CallRailCannonStrikeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("RailCannonStrike")) {
			HelldiversMod.queueServerWork(20, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = HelldiversModEntities.RAILBEAM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			});
			HelldiversMod.queueServerWork(30, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new RailcannonstrikeprojectileEntity(HelldiversModEntities.RAILCANNONSTRIKEPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos(x, (y + 100), z);
					_entityToSpawn.shoot(0, (-1), 0, 10, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
		}
		entity.getPersistentData().putString("ActiveStratagem", "None");
	}
}
