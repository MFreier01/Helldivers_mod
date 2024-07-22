
package net.hytech.helldivers.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.procedures.BugBreachSpawnerTickProcedure;

public class BugBreachSpawnerBlock extends Block {
	public BugBreachSpawnerBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(6f, 2f).lightLevel(s -> 10).requiresCorrectToolForDrops().friction(1.1f).randomTicks().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		BugBreachSpawnerTickProcedure.execute(world, x, y, z);
	}
}
