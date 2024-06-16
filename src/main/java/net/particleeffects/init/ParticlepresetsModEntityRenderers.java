
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.particleeffects.init;

import net.particleeffects.client.renderer.SummoningcircleRenderer;
import net.particleeffects.client.renderer.RitualcirclesmallRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ParticlepresetsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ParticlepresetsModEntities.SUMMONINGCIRCLE.get(), SummoningcircleRenderer::new);
		event.registerEntityRenderer(ParticlepresetsModEntities.RITUALCIRCLESMALL.get(), RitualcirclesmallRenderer::new);
	}
}
