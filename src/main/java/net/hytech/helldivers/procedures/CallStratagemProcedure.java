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
	}
}
