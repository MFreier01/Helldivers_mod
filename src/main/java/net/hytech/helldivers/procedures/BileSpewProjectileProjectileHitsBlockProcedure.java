package net.hytech.helldivers.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.hytech.helldivers.init.HelldiversModParticleTypes;

public class BileSpewProjectileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.BILE_SPEW.get()), x, (y + 1), z, 500, 1, 0.3, 1, 0);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y + 1), z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"summon area_effect_cloud ~ ~ ~ {Radius:2f,Duration:200,Potion:\"minecraft:poison\"}");
	}
}
