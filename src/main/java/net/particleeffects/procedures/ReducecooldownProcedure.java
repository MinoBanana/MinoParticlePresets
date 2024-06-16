package net.particleeffects.procedures;

import net.particleeffects.network.ParticlepresetsModVariables;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ReducecooldownProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			ParticlepresetsModVariables.PlayerVariables _vars = entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES);
			_vars.spell_cooldown = entity.getData(ParticlepresetsModVariables.PLAYER_VARIABLES).spell_cooldown - 1;
			_vars.syncPlayerVariables(entity);
		}
	}
}
