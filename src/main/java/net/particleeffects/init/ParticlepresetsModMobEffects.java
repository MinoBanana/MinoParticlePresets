
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.particleeffects.init;

import net.particleeffects.procedures.T2KEffectExpiresProcedure;
import net.particleeffects.potion.T2KMobEffect;
import net.particleeffects.potion.SmallRitualCircleMobEffect;
import net.particleeffects.potion.ShakeEffectMobEffect;
import net.particleeffects.potion.RedVignetteMobEffect;
import net.particleeffects.potion.LowHealthMobEffect;
import net.particleeffects.potion.LightSpiralMobEffect;
import net.particleeffects.potion.LightSphereMobEffect;
import net.particleeffects.potion.LightRingMobEffect;
import net.particleeffects.potion.LightExpansionMobEffect;
import net.particleeffects.potion.LightCylinderMobEffect;
import net.particleeffects.potion.LightCircleMobEffect;
import net.particleeffects.potion.LightBeamMobEffect;
import net.particleeffects.potion.LargeRitualCircleMobEffect;
import net.particleeffects.potion.IceSpiralMobEffect;
import net.particleeffects.potion.IceSphereMobEffect;
import net.particleeffects.potion.IceRingMobEffect;
import net.particleeffects.potion.IceExpansionMobEffect;
import net.particleeffects.potion.IceCylinderMobEffect;
import net.particleeffects.potion.IceCircleMobEffect;
import net.particleeffects.potion.IceBeamMobEffect;
import net.particleeffects.potion.FlameSpiralMobEffect;
import net.particleeffects.potion.FlameSphereMobEffect;
import net.particleeffects.potion.FlameRingMobEffect;
import net.particleeffects.potion.FlameExpansionMobEffect;
import net.particleeffects.potion.FlameCylinderMobEffect;
import net.particleeffects.potion.FlameCircleMobEffect;
import net.particleeffects.potion.FlameBeamMobEffect;
import net.particleeffects.potion.DarkVignetteMobEffect;
import net.particleeffects.potion.DarkSpiralMobEffect;
import net.particleeffects.potion.DarkSphereMobEffect;
import net.particleeffects.potion.DarkRingMobEffect;
import net.particleeffects.potion.DarkExpansionMobEffect;
import net.particleeffects.potion.DarkCylinderMobEffect;
import net.particleeffects.potion.DarkCircleMobEffect;
import net.particleeffects.potion.DarkBeamMobEffect;
import net.particleeffects.potion.AngledLightCircleMobEffect;
import net.particleeffects.potion.AngledIceCircleMobEffect;
import net.particleeffects.potion.AngledFlameCircleMobEffect;
import net.particleeffects.potion.AngledDarkCircleMobEffect;
import net.particleeffects.ParticlepresetsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber
public class ParticlepresetsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ParticlepresetsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_RING = REGISTRY.register("flame_ring", () -> new FlameRingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_SPIRAL = REGISTRY.register("flame_spiral", () -> new FlameSpiralMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_CYLINDER = REGISTRY.register("flame_cylinder", () -> new FlameCylinderMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_SPHERE = REGISTRY.register("flame_sphere", () -> new FlameSphereMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_EXPANSION = REGISTRY.register("flame_expansion", () -> new FlameExpansionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_RING = REGISTRY.register("dark_ring", () -> new DarkRingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_SPIRAL = REGISTRY.register("dark_spiral", () -> new DarkSpiralMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_CYLINDER = REGISTRY.register("dark_cylinder", () -> new DarkCylinderMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_SPHERE = REGISTRY.register("dark_sphere", () -> new DarkSphereMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_EXPANSION = REGISTRY.register("dark_expansion", () -> new DarkExpansionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_RING = REGISTRY.register("ice_ring", () -> new IceRingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_SPIRAL = REGISTRY.register("ice_spiral", () -> new IceSpiralMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_CYLINDER = REGISTRY.register("ice_cylinder", () -> new IceCylinderMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_SPHERE = REGISTRY.register("ice_sphere", () -> new IceSphereMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_EXPANSION = REGISTRY.register("ice_expansion", () -> new IceExpansionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_RING = REGISTRY.register("light_ring", () -> new LightRingMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_SPIRAL = REGISTRY.register("light_spiral", () -> new LightSpiralMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_CYLINDER = REGISTRY.register("light_cylinder", () -> new LightCylinderMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_SPHERE = REGISTRY.register("light_sphere", () -> new LightSphereMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_EXPANSION = REGISTRY.register("light_expansion", () -> new LightExpansionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> T_2_K = REGISTRY.register("t_2_k", () -> new T2KMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LARGE_RITUAL_CIRCLE = REGISTRY.register("large_ritual_circle", () -> new LargeRitualCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SMALL_RITUAL_CIRCLE = REGISTRY.register("small_ritual_circle", () -> new SmallRitualCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_BEAM = REGISTRY.register("flame_beam", () -> new FlameBeamMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_BEAM = REGISTRY.register("ice_beam", () -> new IceBeamMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_BEAM = REGISTRY.register("light_beam", () -> new LightBeamMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_BEAM = REGISTRY.register("dark_beam", () -> new DarkBeamMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> SHAKE_EFFECT = REGISTRY.register("shake_effect", () -> new ShakeEffectMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FLAME_CIRCLE = REGISTRY.register("flame_circle", () -> new FlameCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ICE_CIRCLE = REGISTRY.register("ice_circle", () -> new IceCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_CIRCLE = REGISTRY.register("dark_circle", () -> new DarkCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LIGHT_CIRCLE = REGISTRY.register("light_circle", () -> new LightCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ANGLED_FLAME_CIRCLE = REGISTRY.register("angled_flame_circle", () -> new AngledFlameCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ANGLED_ICE_CIRCLE = REGISTRY.register("angled_ice_circle", () -> new AngledIceCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ANGLED_DARK_CIRCLE = REGISTRY.register("angled_dark_circle", () -> new AngledDarkCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ANGLED_LIGHT_CIRCLE = REGISTRY.register("angled_light_circle", () -> new AngledLightCircleMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> DARK_VIGNETTE = REGISTRY.register("dark_vignette", () -> new DarkVignetteMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> LOW_HEALTH = REGISTRY.register("low_health", () -> new LowHealthMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> RED_VIGNETTE = REGISTRY.register("red_vignette", () -> new RedVignetteMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		MobEffect effect = effectInstance.getEffect();
		if (effect == T_2_K.get()) {
			T2KEffectExpiresProcedure.execute(entity);
		}
	}
}
