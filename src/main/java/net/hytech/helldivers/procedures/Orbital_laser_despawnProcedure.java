package net.hytech.helldivers.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.HelldiversMod;

public class Orbital_laser_despawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("helldivers:orbital_laser_sound")), SoundSource.HOSTILE, (float) 0.5, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("helldivers:orbital_laser_sound")), SoundSource.HOSTILE, (float) 0.5, 1, false);
			}
		}
		HelldiversMod.queueServerWork(300, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("helldivers:orbital_laser_sound")), SoundSource.HOSTILE, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("helldivers:orbital_laser_sound")), SoundSource.HOSTILE, (float) 0.5, 1, false);
				}
			}
		});
		HelldiversMod.queueServerWork(600, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}
