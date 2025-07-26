package net.weltontep.morenetherblocks.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.weltontep.morenetherblocks.world.ModPlacedFeatures;

public class ModDiskGeneration {
    public static void generateDisks() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SOUL_SAND_VALLEY),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.SOUL_SAND_LOOSE_DISK_PLACED_KEY);
    }
}
