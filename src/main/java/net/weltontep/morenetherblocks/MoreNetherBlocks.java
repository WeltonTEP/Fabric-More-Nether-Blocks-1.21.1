package net.weltontep.morenetherblocks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.weltontep.morenetherblocks.block.*;
import net.weltontep.morenetherblocks.item.ModItemGroups;
import net.weltontep.morenetherblocks.item.ModItems;
import net.weltontep.morenetherblocks.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreNetherBlocks implements ModInitializer {
	public static final String MOD_ID = "morenetherblocks";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		BasaltBlocks.registerModBlocks();
		BlackstoneBlocks.registerModBlocks();
		BloodstoneBlocks.registerModBlocks();
		CrimsonBlocks.registerModBlocks();
		CrimsonstoneBlocks.registerModBlocks();
		GlowstoneBlocks.registerModBlocks();
		MiscBlocks.registerModBlocks();
		NetherstoneBlocks.registerModBlocks();
		ObsidianBlocks.registerModBlocks();
		PlatinumBlocks.registerModBlocks();
		SoulSandstoneBlocks.registerModBlocks();
		WarpedBlocks.registerModBlocks();
		WarpedstoneBlocks.registerModBlocks();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(MiscBlocks.CHARCOAL_LOG, MiscBlocks.CHARCOAL_LOG_STRIPPED);
		StrippableBlockRegistry.register(MiscBlocks.CHARCOAL_WOOD, MiscBlocks.CHARCOAL_WOOD_STRIPPED);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_LOG_STRIPPED, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_WOOD_STRIPPED, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(MiscBlocks.CHARCOAL_FENCE, 5, 20);
		LOGGER.info("Hello Fabric world!");
	}
}