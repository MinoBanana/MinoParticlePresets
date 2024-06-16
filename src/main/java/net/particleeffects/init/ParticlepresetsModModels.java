
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.particleeffects.init;

import net.particleeffects.client.model.Modelnuke_top;
import net.particleeffects.client.model.Modelnuke;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ParticlepresetsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelnuke_top.LAYER_LOCATION, Modelnuke_top::createBodyLayer);
		event.registerLayerDefinition(Modelnuke.LAYER_LOCATION, Modelnuke::createBodyLayer);
	}
}
