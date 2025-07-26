package net.weltontep.morenetherblocks.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.weltontep.morenetherblocks.world.ModPlacedFeatures;

public class ModVegetationGeneration {
    public static void generateVegetation() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARCOAL_SAPLING_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CRIMSON_MYCELIAL_THREADS_MULTIFACE_GROWTH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CRIMSON_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CRIMSON_TENDRILS_PLACED_KEY);
    }
}
