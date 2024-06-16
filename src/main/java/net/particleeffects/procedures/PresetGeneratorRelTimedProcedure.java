package net.particleeffects.procedures;

import net.particleeffects.init.ParticlepresetsModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class PresetGeneratorRelTimedProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "preset")).equals("flame_ring")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_RING.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_spiral")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_SPIRAL.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_cylinder")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_CYLINDER.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_sphere")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_SPHERE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_expansion")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_EXPANSION.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_ring")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_RING.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_spiral")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_SPIRAL.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_cylinder")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_CYLINDER.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_sphere")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_SPHERE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_expansion")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_EXPANSION.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_ring")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_RING.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_spiral")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_SPIRAL.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_cylinder")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_CYLINDER.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_sphere")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_SPHERE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_expansion")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_EXPANSION.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_ring")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_RING.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_spiral")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_SPIRAL.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_cylinder")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_CYLINDER.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_sphere")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_SPHERE.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_expansion")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_EXPANSION.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_beam")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.FLAME_BEAM.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_beam")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.ICE_BEAM.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_beam")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.LIGHT_BEAM.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_beam")) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.DARK_BEAM.get(), (int) (DoubleArgumentType.getDouble(arguments, "seconds") * 20), 1, false, false));
		}
	}
}
