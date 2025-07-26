package net.weltontep.morenetherblocks.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.weltontep.morenetherblocks.MoreNetherBlocks;
import net.weltontep.morenetherblocks.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CHARCOAL = new SaplingGenerator(MoreNetherBlocks.MOD_ID + ":charcoal",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHARCOAL_KEY), Optional.empty());
}
