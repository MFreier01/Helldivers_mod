package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.Projectile500KGEntity;
import net.hytech.helldivers.HelldiversMod;

public class Call500KGProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 3000, 0.1, 200, 0.1, 0);
		HelldiversMod.queueServerWork(70, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new Projectile500KGEntity(HelldiversModEntities.PROJECTILE_500_KG.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + 70), (y + 100), (z + -70));
				_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
	}
}
