package net.weltontep.morenetherblocks.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.weltontep.morenetherblocks.MoreNetherBlocks;

public class PlatinumBlocks {

    public static final Block NETHERITE_ORE = registerBlock("platinum/netherite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),AbstractBlock.Settings.create().strength(10f,50f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block NETHERITE_SCRAP_BLOCK = registerBlock("platinum/netherite_scrap_block",
            new Block(AbstractBlock.Settings.create().strength(10f,50f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block NETHERITE_SCRAP_STAIRS = registerBlock("platinum/netherite_scrap_stairs",
            new StairsBlock(PlatinumBlocks.NETHERITE_SCRAP_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(10f,50f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block NETHERITE_SCRAP_SLAB = registerBlock("platinum/netherite_scrap_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(10f,50f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block NETHERITE_SCRAP_WALL = registerBlock("platinum/netherite_scrap_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(10f,50f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block PLATINUM_BLOCK = registerBlock("platinum/platinum_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CUT_BLOCK = registerBlock("platinum/platinum_cut_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CUT_STAIRS = registerBlock("platinum/platinum_cut_stairs",
            new StairsBlock(PlatinumBlocks.PLATINUM_CUT_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CUT_SLAB = registerBlock("platinum/platinum_cut_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CUT_WALL = registerBlock("platinum/platinum_cut_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_BLOCK = registerBlock("platinum/platinum_chiseled_block",
            new Block(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_STAIRS = registerBlock("platinum/platinum_chiseled_stairs",
            new StairsBlock(PlatinumBlocks.PLATINUM_CHISELED_BLOCK.getDefaultState(), AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_SLAB = registerBlock("platinum/platinum_chiseled_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_WALL = registerBlock("platinum/platinum_chiseled_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_PILLAR = registerBlock("platinum/platinum_chiseled_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_PILLAR_STAIRS = registerBlock("platinum/platinum_chiseled_pillar_stairs",
            new StairsBlock(PlatinumBlocks.PLATINUM_CHISELED_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_PILLAR_SLAB = registerBlock("platinum/platinum_chiseled_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_CHISELED_PILLAR_WALL = registerBlock("platinum/platinum_chiseled_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(5.0F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreNetherBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreNetherBlocks.LOGGER.info("Registering Platinum Blocks for " + MoreNetherBlocks.MOD_ID);
    }
}