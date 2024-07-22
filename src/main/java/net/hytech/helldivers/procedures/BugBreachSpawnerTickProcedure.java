package net.hytech.helldivers.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.network.HelldiversModVariables;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.init.HelldiversModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BugBreachSpawnerTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double modtospawn = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double fx = 0;
		double fy = 0;
		double fz = 0;
		double spawn_chance = 0;
		sx = -7;
		found = false;
		for (int index0 = 0; index0 < 14; index0++) {
			sy = -7;
			for (int index1 = 0; index1 < 14; index1++) {
				sz = -7;
				for (int index2 = 0; index2 < 14; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == HelldiversModBlocks.BUG_BREACH_SPAWNER.get()) {
						found = true;
						fx = x + sx;
						fy = y + sy;
						fz = z + sz;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			HelldiversModVariables.WorldVariables.get(world).terminid_spawn_timer = Mth.nextDouble(RandomSource.create(), 0, 1);
			HelldiversModVariables.WorldVariables.get(world).syncData(world);
		}
		if (0.99 < HelldiversModVariables.WorldVariables.get(world).terminid_spawn_timer) {
			modtospawn = Mth.nextDouble(RandomSource.create(), 0, 1);
			if (0.95 > spawn_chance) {
				if (0.9 > spawn_chance) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else if (0.5 > spawn_chance) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				} else if (0.3 > spawn_chance) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = HelldiversModEntities.TERMINID_SCAVENGER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
			if (0.95 < spawn_chance) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = HelldiversModEntities.TERMINID_STALKER.get().spawn(_level, BlockPos.containing(fx, fy + 1, fz), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
			}
			HelldiversModVariables.WorldVariables.get(world).terminid_spawn_timer = 0;
			HelldiversModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
