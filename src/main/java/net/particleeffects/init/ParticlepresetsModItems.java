
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.particleeffects.init;

import net.particleeffects.item.ElectricSwordItem;
import net.particleeffects.ParticlepresetsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

public class ParticlepresetsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ParticlepresetsMod.MODID);
	public static final DeferredHolder<Item, Item> SUMMONINGCIRCLE_SPAWN_EGG = REGISTRY.register("summoningcircle_spawn_egg", () -> new DeferredSpawnEggItem(ParticlepresetsModEntities.SUMMONINGCIRCLE, -1, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> RITUALCIRCLESMALL_SPAWN_EGG = REGISTRY.register("ritualcirclesmall_spawn_egg", () -> new DeferredSpawnEggItem(ParticlepresetsModEntities.RITUALCIRCLESMALL, -1, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> ELECTRIC_SWORD = REGISTRY.register("electric_sword", () -> new ElectricSwordItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
