package net.particleeffects.procedures;

import net.particleeffects.network.ParticlepresetsModVariables;
import net.particleeffects.init.ParticlepresetsModMobEffects;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class LowHealthEffectProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ParticlepresetsModMobEffects.LOW_HEALTH.get()) && ParticlepresetsModVariables.WorldVariables.get(world).timer % 100 >= 0
				&& ParticlepresetsModVariables.WorldVariables.get(world).timer % 100 <= 70) {
			return true;
		}
		return false;
	}
}
