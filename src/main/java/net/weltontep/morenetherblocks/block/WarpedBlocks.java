package net.weltontep.morenetherblocks.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.weltontep.morenetherblocks.MoreNetherBlocks;
import net.weltontep.morenetherblocks.block.custom.BlackstoneNyliumBrickBlock;
import net.weltontep.morenetherblocks.block.custom.TallHangingPlantBlock;

public class WarpedBlocks {

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS = registerBlock("warped/warped_blackstone_polished_large_bricks",
            new Block(
                    AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_STAIRS = registerBlock("warped/warped_blackstone_polished_large_brick_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_SLAB = registerBlock("warped/warped_blackstone_polished_large_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_WALL = registerBlock("warped/warped_blackstone_polished_large_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED = registerBlock("warped/warped_blackstone_polished_large_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_STAIRS = registerBlock("warped/warped_blackstone_polished_large_brick_cracked_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_SLAB = registerBlock("warped/warped_blackstone_polished_large_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_WALL = registerBlock("warped/warped_blackstone_polished_large_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS = registerBlock("warped/warped_blackstone_polished_large_nylium_bricks",
            new BlackstoneNyliumBrickBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS_CRACKED = registerBlock("warped/warped_blackstone_polished_large_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block WARPED_BLUE_NETHER_BRICKS = registerBlock("warped/warped_blue_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICK_STAIRS = registerBlock("warped/warped_blue_nether_brick_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICK_SLAB = registerBlock("warped/warped_blue_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICK_WALL = registerBlock("warped/warped_blue_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICKS_CRACKED = registerBlock("warped/warped_blue_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICK_CRACKED_STAIRS = registerBlock("warped/warped_blue_nether_brick_cracked_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICK_CRACKED_SLAB = registerBlock("warped/warped_blue_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NETHER_BRICK_CRACKED_WALL = registerBlock("warped/warped_blue_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NYLIUM_BRICKS = registerBlock("warped/warped_blue_nylium_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_BLUE_NYLIUM_BRICKS_CRACKED = registerBlock("warped/warped_blue_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICKS = registerBlock("warped/warped_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICK_STAIRS = registerBlock("warped/warped_nether_brick_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICK_SLAB = registerBlock("warped/warped_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICK_WALL = registerBlock("warped/warped_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICKS_CRACKED = registerBlock("warped/warped_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICK_CRACKED_STAIRS = registerBlock("warped/warped_nether_brick_cracked_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICK_CRACKED_SLAB = registerBlock("warped/warped_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHER_BRICK_CRACKED_WALL = registerBlock("warped/warped_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NYLIUM_BRICKS = registerBlock("warped/warped_nylium_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NYLIUM_BRICKS_CRACKED = registerBlock("warped/warped_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICKS = registerBlock("warped/warped_red_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICK_STAIRS = registerBlock("warped/warped_red_nether_brick_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICK_SLAB = registerBlock("warped/warped_red_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICK_WALL = registerBlock("warped/warped_red_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICKS_CRACKED = registerBlock("warped/warped_red_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICK_CRACKED_STAIRS = registerBlock("warped/warped_red_nether_brick_cracked_stairs",
            new StairsBlock(WarpedBlocks.WARPED_BLACKSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICK_CRACKED_SLAB = registerBlock("warped/warped_red_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NETHER_BRICK_CRACKED_WALL = registerBlock("warped/warped_red_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NYLIUM_BRICKS = registerBlock("warped/warped_red_nylium_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_RED_NYLIUM_BRICKS_CRACKED = registerBlock("warped/warped_red_nylium_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPED_NETHERRACK = registerBlock("warped/warped_netherrack",
            new NetherrackBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_STAIRS = registerBlock("warped/warped_netherrack_stairs",
            new StairsBlock(WarpedBlocks.WARPED_NETHERRACK.getDefaultState(), AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_SLAB = registerBlock("warped/warped_netherrack_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_WALL = registerBlock("warped/warped_netherrack_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_CRACKED = registerBlock("warped/warped_netherrack_cracked",
            new NetherrackBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_CRACKED_STAIRS = registerBlock("warped/warped_netherrack_cracked_stairs",
            new StairsBlock(WarpedBlocks.WARPED_NETHERRACK.getDefaultState(), AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_CRACKED_SLAB = registerBlock("warped/warped_netherrack_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_CRACKED_WALL = registerBlock("warped/warped_netherrack_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_NYLIUM = registerBlock("warped/warped_netherrack_nylium",
            new NyliumBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_NETHERRACK_NYLIUM_CRACKED = registerBlock("warped/warped_netherrack_nylium_cracked",
            new NyliumBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NYLIUM)));

    public static final Block WARPED_MYCELIAL_THREADS = registerBlock("warped/warped_mycelial_threads",
            new GlowLichenBlock(AbstractBlock.Settings.create().strength(0)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.ROOTS)));

    public static final Block WARPED_TENDRILS = registerBlock("warped/warped_tendrils",
            new TallHangingPlantBlock(AbstractBlock.Settings.create().strength(0)
                    .replaceable()
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.ROOTS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreNetherBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreNetherBlocks.LOGGER.info("Registering Warped Blocks for " + MoreNetherBlocks.MOD_ID);
    }
}
