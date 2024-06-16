package net.particleeffects.procedures;

import net.particleeffects.init.ParticlepresetsModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class RotatingTrailsProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "preset")).equals("flame_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("angled_flame_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ANGLED_FLAME_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("angled_ice_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ANGLED_ICE_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("angled_dark_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ANGLED_DARK_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("angled_light_circle")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ANGLED_LIGHT_CIRCLE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		}
	}
}
