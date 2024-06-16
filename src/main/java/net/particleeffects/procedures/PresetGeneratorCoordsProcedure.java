package net.particleeffects.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class PresetGeneratorCoordsProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		if ((StringArgumentType.getString(arguments, "preset")).equals("flame_ring")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:flame_ring");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_spiral")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:flame_spiral");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_cylinder")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:flame_cylinder");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_sphere")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:flame_sphere");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_expansion")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle flame ~ ~1 ~ 0 0 0 1 400");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_ring")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:dark_ring");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_spiral")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:dark_spiral");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_cylinder")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:dark_cylinder");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_sphere")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:dark_sphere");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_expansion")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle smoke ~ ~1 ~ 0 0 0 1 400");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_ring")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:ice_ring");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_spiral")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:ice_spiral");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_cylinder")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:ice_cylinder");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_sphere")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:ice_sphere");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_expansion")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle snowflake ~ ~1 ~ 0 0 0 1 400");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_ring")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:light_ring");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_spiral")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:light_spiral");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_cylinder")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:light_cylinder");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_sphere")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:light_sphere");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_expansion")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle end_rod ~ ~1 ~ 0 0 0 1 400");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("flame_beam")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:flame_beam");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("ice_beam")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:ice_beam");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("light_beam")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:light_beam");
		} else if ((StringArgumentType.getString(arguments, "preset")).equals("dark_beam")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((new Object() {
					public double getX() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getX();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getX()), (new Object() {
					public double getY() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getY();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getY()), (new Object() {
					public double getZ() {
						try {
							return BlockPosArgument.getLoadedBlockPos(arguments, "position").getZ();
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return 0;
						}
					}
				}.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "function img:dark_beam");
		}
	}
}
