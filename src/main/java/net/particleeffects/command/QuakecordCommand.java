
package net.particleeffects.command;

import org.checkerframework.checker.units.qual.s;

import net.particleeffects.procedures.ShockCordFixProcedure;

import net.neoforged.neoforge.event.RegisterCommandsEvent;
import net.neoforged.neoforge.common.util.FakePlayerFactory;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.Commands;

@Mod.EventBusSubscriber
public class QuakecordCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("quakecord").requires(s -> s.hasPermission(4)).then(Commands.argument("position", BlockPosArgument.blockPos()).executes(arguments -> {
			Level world = arguments.getSource().getUnsidedLevel();
			double x = arguments.getSource().getPosition().x();
			double y = arguments.getSource().getPosition().y();
			double z = arguments.getSource().getPosition().z();
			Entity entity = arguments.getSource().getEntity();
			if (entity == null && world instanceof ServerLevel _servLevel)
				entity = FakePlayerFactory.getMinecraft(_servLevel);
			Direction direction = Direction.DOWN;
			if (entity != null)
				direction = entity.getDirection();

			ShockCordFixProcedure.execute(world, x, y, z, arguments);
			return 0;
		})));
	}
}
