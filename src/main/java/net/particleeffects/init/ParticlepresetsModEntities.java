
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.particleeffects.init;

import net.particleeffects.entity.SummoningcircleEntity;
import net.particleeffects.entity.RitualcirclesmallEntity;
import net.particleeffects.ParticlepresetsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ParticlepresetsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, ParticlepresetsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<SummoningcircleEntity>> SUMMONINGCIRCLE = register("summoningcircle",
			EntityType.Builder.<SummoningcircleEntity>of(SummoningcircleEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.1f, 0.1f));
	public static final DeferredHolder<EntityType<?>, EntityType<RitualcirclesmallEntity>> RITUALCIRCLESMALL = register("ritualcirclesmall",
			EntityType.Builder.<RitualcirclesmallEntity>of(RitualcirclesmallEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.4f, 0.7f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SummoningcircleEntity.init();
			RitualcirclesmallEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SUMMONINGCIRCLE.get(), SummoningcircleEntity.createAttributes().build());
		event.put(RITUALCIRCLESMALL.get(), RitualcirclesmallEntity.createAttributes().build());
	}
}
