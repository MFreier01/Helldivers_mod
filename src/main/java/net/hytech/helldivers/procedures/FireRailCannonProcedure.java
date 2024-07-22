package net.hytech.helldivers.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.RailcannonstrikeprojectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class FireRailCannonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		HelldiversMod.queueServerWork(70, () -> {
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
				}.getArrow(projectileLevel, 1, 0);
				_entityToSpawn.setPos((entity.getX()), (entity.getY() + 100), (entity.getZ()));
				_entityToSpawn.shoot(0, (-1), 0, 50, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 5, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 5, 1, false);
				}
			}
		});
		HelldiversMod.queueServerWork(80, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
