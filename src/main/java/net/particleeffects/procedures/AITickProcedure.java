package net.particleeffects.procedures;

import net.particleeffects.network.ParticlepresetsModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class AITickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SNOWFLAKE, (x + Math.sin((ParticlepresetsModVariables.WorldVariables.get(world).timer * Math.PI) / 180)),
					(y + 1 + Math.cos((ParticlepresetsModVariables.WorldVariables.get(world).timer * Math.PI) / 180)), (z + Math.cos((ParticlepresetsModVariables.WorldVariables.get(world).timer * Math.PI) / 180)), 1, 0, 0, 0, 0);
	}
}
