package net.hytech.helldivers.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.HelldiversMod;

import java.util.List;
import java.util.Comparator;

public class NapalmFireProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				entityiterator.setSecondsOnFire(15);
			}
		}
		world.setBlock(BlockPos.containing(x + 0, y + 1, z + 0), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y + 1, z + 0), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0, y + 1, z + 0), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0, y + 1, z + 1), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y + 1, z + 1), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + -1, y + 1, z + 0), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0, y + 1, z + -1), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + -1, y + 1, z + -1), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 2, y + 1, z + 2), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0, y + 1, z + 2), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 2, y + 1, z + 0), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + -2, y + 1, z + -2), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + -2, y + 1, z + 0), Blocks.FIRE.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0, y + 1, z + -2), Blocks.FIRE.defaultBlockState(), 3);
		HelldiversMod.queueServerWork(300, () -> {
			world.setBlock(BlockPos.containing(x + 0, y + 1, z + 0), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}
