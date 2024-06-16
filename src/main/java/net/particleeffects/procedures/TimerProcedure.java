package net.particleeffects.procedures;

import net.particleeffects.network.ParticlepresetsModVariables;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TimerProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (ParticlepresetsModVariables.WorldVariables.get(world).timer <= 360) {
			ParticlepresetsModVariables.WorldVariables.get(world).timer = ParticlepresetsModVariables.WorldVariables.get(world).timer + 4;
			ParticlepresetsModVariables.WorldVariables.get(world).syncData(world);
		} else {
			ParticlepresetsModVariables.WorldVariables.get(world).timer = 0;
			ParticlepresetsModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
