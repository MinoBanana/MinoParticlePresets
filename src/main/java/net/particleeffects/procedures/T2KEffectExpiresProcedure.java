package net.particleeffects.procedures;

import net.minecraft.world.entity.Entity;

public class T2KEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
