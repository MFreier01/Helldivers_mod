
package net.hytech.helldivers.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BugBreachSpawnerBlock extends Block {
	public BugBreachSpawnerBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(6f, 2f).lightLevel(s -> 10).requiresCorrectToolForDrops().friction(1.1f).randomTicks().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
