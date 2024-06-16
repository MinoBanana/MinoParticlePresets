package net.particleeffects.procedures;

import net.particleeffects.init.ParticlepresetsModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class RedVignetteEffectProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(ParticlepresetsModMobEffects.RED_VIGNETTE.get())) {
			return true;
		}
		return false;
	}
}
