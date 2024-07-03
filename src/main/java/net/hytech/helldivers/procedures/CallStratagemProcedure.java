package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class CallStratagemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("EagleAirStrike")) {
			CallEagleAirStrikeProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("Eagle500KG")) {
			Call500KGProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("Reinforcements")) {
			CallReinforcementsProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("RailCannonStrike")) {
			CallRailCannonStrikeProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("PrecisionStrike")) {
			CallPrecisionStrikeProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("EagleStrafingRun")) {
			CallStrafingRunProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("OrbitalLaser")) {
			CallOrbitalLaserProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("OrbitalAirburst")) {
			CallOrbitalAirburstProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("OrbitalEMS")) {
			CallOrbitalEMSStrikeProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("EagleClusterBomb")) {
			CallEagleClusterBombProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("OrbitalSmokeStrike")) {
			CallOrbitalSmokeStrikeProcedure.execute(world, x, y, z, entity);
		}
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("EagleSmokeStrike")) {
			CallEagleSmokeStrikeProcedure.execute(world, x, y, z, entity);
		}
	}
}
