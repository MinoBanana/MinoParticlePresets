package net.particleeffects.procedures;

import net.particleeffects.init.ParticlepresetsModMobEffects;
import net.particleeffects.init.ParticlepresetsModEntities;
import net.particleeffects.entity.SummoningcircleEntity;
import net.particleeffects.entity.RitualcirclesmallEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;

import java.util.List;
import java.util.Comparator;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class CircleParticleGeneratorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, CommandContext<CommandSourceStack> arguments) {
		if ((StringArgumentType.getString(arguments, "preset")).equals("large_ritual_circle")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ParticlepresetsModEntities.SUMMONINGCIRCLE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(ParticlepresetsModMobEffects.T_2_K.get())) && entityiterator instanceof SummoningcircleEntity) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.T_2_K.get(), (int) (DoubleArgumentType.getDouble(arguments, "time") * 20), 1, false, false));
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("small_ritual_circle")) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = ParticlepresetsModEntities.RITUALCIRCLESMALL.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(ParticlepresetsModMobEffects.T_2_K.get())) && entityiterator instanceof RitualcirclesmallEntity) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(ParticlepresetsModMobEffects.T_2_K.get(), (int) (DoubleArgumentType.getDouble(arguments, "time") * 20), 1, false, false));
					}
				}
			}
		}
	}
}
