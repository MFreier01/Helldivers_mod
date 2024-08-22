
package net.hytech.helldivers.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModItems;
import net.hytech.helldivers.init.HelldiversModFluids;
import net.hytech.helldivers.init.HelldiversModFluidTypes;
import net.hytech.helldivers.init.HelldiversModBlocks;

public abstract class NapalmFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> HelldiversModFluidTypes.NAPALM_TYPE.get(), () -> HelldiversModFluids.NAPALM.get(), () -> HelldiversModFluids.FLOWING_NAPALM.get())
			.explosionResistance(98f).tickRate(7).bucket(() -> HelldiversModItems.NAPALM_BUCKET.get()).block(() -> (LiquidBlock) HelldiversModBlocks.NAPALM.get());

	private NapalmFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get());
	}

	public static class Source extends NapalmFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NapalmFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
