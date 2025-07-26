package net.weltontep.morenetherblocks.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.weltontep.morenetherblocks.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.SMOOTH_BASALT_DELTA_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHERITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DOWN_NETHERITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DOWN_DEEPSLATE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.DOWN_SMOOTH_BASALT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.UP_SMOOTH_BASALT_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.UP_DEEPSLATE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.OBSIDIAN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRYING_OBSIDIAN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHERRACK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.GILDED_BLACKSTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.MAGMA_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.LAVA_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.COBBLESTONE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ANDESITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BASALT_COBBLED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BASALT_DELTAS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BASALT_SMOOTH_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLACKSTONE_COBBLED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLACKSTONE_NETHERITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLOODSTONE_COBBLED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_NETHERRACK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_NETHERRACK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRACKED_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHERSTONE_COBBLED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHERSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.NETHERSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_NETHER_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.RED_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.RED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_RED_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSON_RED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSONSTONE_COBBLED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSONSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.CRIMSONSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_NETHERRACK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_NETHERRACK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLUE_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.BLUE_NETHER_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_BLUE_NETHER_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPED_BLUE_NETHER_BRICK_CRACKED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPEDSTONE_COBBLED_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPEDSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARPED_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY);

    }

}
