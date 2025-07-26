package net.weltontep.morenetherblocks.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.weltontep.morenetherblocks.MoreNetherBlocks;

public class WarpedstoneBlocks {

    public static final Block WARPEDSTONE_COBBLED = registerBlock("warpedstone/warpedstone_cobbled",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_COBBLED_STAIRS = registerBlock("warpedstone/warpedstone_cobbled_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_COBBLED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_COBBLED_SLAB = registerBlock("warpedstone/warpedstone_cobbled_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_COBBLED_WALL = registerBlock("warpedstone/warpedstone_cobbled_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE = registerBlock("warpedstone/warpedstone",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_STAIRS = registerBlock("warpedstone/warpedstone_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_SLAB = registerBlock("warpedstone/warpedstone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_WALL = registerBlock("warpedstone/warpedstone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block WARPEDSTONE_POLISHED = registerBlock("warpedstone/warpedstone_polished",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_STAIRS = registerBlock("warpedstone/warpedstone_polished_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_SLAB = registerBlock("warpedstone/warpedstone_polished_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_WALL = registerBlock("warpedstone/warpedstone_polished_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH = registerBlock("warpedstone/warpedstone_smooth",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_STAIRS = registerBlock("warpedstone/warpedstone_smooth_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_SMOOTH.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_SLAB = registerBlock("warpedstone/warpedstone_smooth_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_WALL = registerBlock("warpedstone/warpedstone_smooth_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_CRACKED = registerBlock("warpedstone/warpedstone_smooth_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_smooth_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_SMOOTH_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_smooth_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_SMOOTH_CRACKED_WALL = registerBlock("warpedstone/warpedstone_smooth_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICKS = registerBlock("warpedstone/warpedstone_polished_large_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICK_STAIRS = registerBlock("warpedstone/warpedstone_polished_large_brick_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_LARGE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICK_SLAB = registerBlock("warpedstone/warpedstone_polished_large_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICK_WALL = registerBlock("warpedstone/warpedstone_polished_large_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICKS_CRACKED = registerBlock("warpedstone/warpedstone_polished_large_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICK_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_polished_large_brick_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_LARGE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICK_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_polished_large_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_LARGE_BRICK_CRACKED_WALL = registerBlock("warpedstone/warpedstone_polished_large_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICKS = registerBlock("warpedstone/warpedstone_polished_square_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICK_STAIRS = registerBlock("warpedstone/warpedstone_polished_square_brick_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_SQUARE_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICK_SLAB = registerBlock("warpedstone/warpedstone_polished_square_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICK_WALL = registerBlock("warpedstone/warpedstone_polished_square_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICKS_CRACKED = registerBlock("warpedstone/warpedstone_polished_square_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICK_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_polished_square_brick_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_SQUARE_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICK_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_polished_square_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SQUARE_BRICK_CRACKED_WALL = registerBlock("warpedstone/warpedstone_polished_square_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILES = registerBlock("warpedstone/warpedstone_polished_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILE_STAIRS = registerBlock("warpedstone/warpedstone_polished_tile_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_TILES.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILE_SLAB = registerBlock("warpedstone/warpedstone_polished_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILE_WALL = registerBlock("warpedstone/warpedstone_polished_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILES_CRACKED = registerBlock("warpedstone/warpedstone_polished_tiles_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILE_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_polished_tile_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_TILES_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILE_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_polished_tile_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_TILE_CRACKED_WALL = registerBlock("warpedstone/warpedstone_polished_tile_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SHINGLES = registerBlock("warpedstone/warpedstone_polished_shingles",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SHINGLE_STAIRS = registerBlock("warpedstone/warpedstone_polished_shingle_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_SHINGLES.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SHINGLE_SLAB = registerBlock("warpedstone/warpedstone_polished_shingle_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_SHINGLE_WALL = registerBlock("warpedstone/warpedstone_polished_shingle_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR = registerBlock("warpedstone/warpedstone_polished_carved_circular",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_carved_circular_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CARVED_CIRCULAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_SLAB = registerBlock("warpedstone/warpedstone_polished_carved_circular_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_WALL = registerBlock("warpedstone/warpedstone_polished_carved_circular_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_PILLAR = registerBlock("warpedstone/warpedstone_polished_carved_circular_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_carved_circular_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CARVED_CIRCULAR_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_carved_circular_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_CIRCULAR_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_carved_circular_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT = registerBlock("warpedstone/warpedstone_polished_carved_dent",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_STAIRS = registerBlock("warpedstone/warpedstone_polished_carved_dent_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CARVED_DENT.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_SLAB = registerBlock("warpedstone/warpedstone_polished_carved_dent_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_WALL = registerBlock("warpedstone/warpedstone_polished_carved_dent_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_PILLAR = registerBlock("warpedstone/warpedstone_polished_carved_dent_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_carved_dent_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CARVED_DENT_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_carved_dent_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_DENT_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_carved_dent_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC = registerBlock("warpedstone/warpedstone_polished_carved_mosaic",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_STAIRS = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CARVED_MOSAIC.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_SLAB = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_WALL = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_PILLAR = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CARVED_MOSAIC_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CARVED_MOSAIC_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_carved_mosaic_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CUT = registerBlock("warpedstone/warpedstone_polished_cut",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_WALL = registerBlock("warpedstone/warpedstone_polished_cut_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_CRACKED = registerBlock("warpedstone/warpedstone_polished_cut_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_CRACKED_WALL = registerBlock("warpedstone/warpedstone_polished_cut_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_SANDSTONE = registerBlock("warpedstone/warpedstone_polished_cut_sandstone",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_SANDSTONE_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_sandstone_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_SANDSTONE_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_sandstone_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_SANDSTONE_WALL = registerBlock("warpedstone/warpedstone_polished_cut_sandstone_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS = registerBlock("warpedstone/warpedstone_polished_cut_bricks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_CRACKED = registerBlock("warpedstone/warpedstone_polished_cut_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_BRAIDED = registerBlock("warpedstone/warpedstone_polished_cut_bricks_braided",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_BRAIDED_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_braided_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_BRAIDED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_BRAIDED_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_braided_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_BRAIDED_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_braided_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_BRAIDED2 = registerBlock("warpedstone/warpedstone_polished_cut_bricks_braided2",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_BRAIDED2_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_braided2_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_BRAIDED2.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_BRAIDED2_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_braided2_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_BRAIDED2_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_braided2_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_PINWHEEL = registerBlock("warpedstone/warpedstone_polished_cut_bricks_pinwheel",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_PINWHEEL_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_pinwheel_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_PINWHEEL.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_PINWHEEL_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_pinwheel_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_PINWHEEL_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_pinwheel_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_PINWHEEL2 = registerBlock("warpedstone/warpedstone_polished_cut_bricks_pinwheel2",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_PINWHEEL2_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_pinwheel2_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_PINWHEEL2.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_PINWHEEL2_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_pinwheel2_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_PINWHEEL2_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_pinwheel2_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_ROAD = registerBlock("warpedstone/warpedstone_polished_cut_bricks_road",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_ROAD_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_road_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_ROAD.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_ROAD_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_road_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_ROAD_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_road_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICKS_ROAD2 = registerBlock("warpedstone/warpedstone_polished_cut_bricks_road2",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_ROAD2_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_brick_road2_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_BRICKS_ROAD2.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_ROAD2_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_brick_road2_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_BRICK_ROAD2_WALL = registerBlock("warpedstone/warpedstone_polished_cut_brick_road2_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANKS = registerBlock("warpedstone/warpedstone_polished_cut_planks",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_plank_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_plank_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_WALL = registerBlock("warpedstone/warpedstone_polished_cut_plank_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANKS_CRACKED = registerBlock("warpedstone/warpedstone_polished_cut_planks_cracked",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_CRACKED_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_plank_cracked_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_PLANKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_CRACKED_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_plank_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_CRACKED_WALL = registerBlock("warpedstone/warpedstone_polished_cut_plank_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR2 = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar2",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR2_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar2_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR2.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR2_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar2_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PLANK_PILLAR2_WALL = registerBlock("warpedstone/warpedstone_polished_cut_plank_pillar2_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PILLAR = registerBlock("warpedstone/warpedstone_polished_cut_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_cut_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILES = registerBlock("warpedstone/warpedstone_polished_cut_tiles",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_tile_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_TILES.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_WALL = registerBlock("warpedstone/warpedstone_polished_cut_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILES_DIAMOND = registerBlock("warpedstone/warpedstone_polished_cut_tiles_diamond",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_DIAMOND_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_tile_diamond_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_TILES_DIAMOND.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_DIAMOND_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_tile_diamond_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_DIAMOND_WALL = registerBlock("warpedstone/warpedstone_polished_cut_tile_diamond_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_PILLAR = registerBlock("warpedstone/warpedstone_polished_cut_tile_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_cut_tile_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CUT_TILE_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_cut_tile_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_CUT_TILE_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_cut_tile_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR = registerBlock("warpedstone/warpedstone_polished_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_PILLAR.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR2 = registerBlock("warpedstone/warpedstone_polished_pillar2",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR2_STAIRS = registerBlock("warpedstone/warpedstone_polished_pillar2_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_PILLAR2.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR2_SLAB = registerBlock("warpedstone/warpedstone_polished_pillar2_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_PILLAR2_WALL = registerBlock("warpedstone/warpedstone_polished_pillar2_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_TWISTED = registerBlock("warpedstone/warpedstone_polished_chiseled_twisted",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_TWISTED_STAIRS = registerBlock("warpedstone/warpedstone_polished_chiseled_twisted_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CHISELED_TWISTED.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_TWISTED_SLAB = registerBlock("warpedstone/warpedstone_polished_chiseled_twisted_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_TWISTED_WALL = registerBlock("warpedstone/warpedstone_polished_chiseled_twisted_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_GREEK = registerBlock("warpedstone/warpedstone_polished_chiseled_greek",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_GREEK_STAIRS = registerBlock("warpedstone/warpedstone_polished_chiseled_greek_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CHISELED_GREEK.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_GREEK_SLAB = registerBlock("warpedstone/warpedstone_polished_chiseled_greek_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_GREEK_WALL = registerBlock("warpedstone/warpedstone_polished_chiseled_greek_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE_STAIRS = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CHISELED_ORNATE.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE_SLAB = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE_WALL = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE2 = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate2",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE2_STAIRS = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate2_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CHISELED_ORNATE2.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE2_SLAB = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate2_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_ORNATE2_WALL = registerBlock("warpedstone/warpedstone_polished_chiseled_ornate2_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PILLAR = registerBlock("warpedstone/warpedstone_polished_chiseled_pillar",
            new PillarBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PILLAR_STAIRS = registerBlock("warpedstone/warpedstone_polished_chiseled_pillar_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CHISELED_ORNATE.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PILLAR_SLAB = registerBlock("warpedstone/warpedstone_polished_chiseled_pillar_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PILLAR_WALL = registerBlock("warpedstone/warpedstone_polished_chiseled_pillar_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PYRAMID = registerBlock("warpedstone/warpedstone_polished_chiseled_pyramid",
            new Block(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PYRAMID_STAIRS = registerBlock("warpedstone/warpedstone_polished_chiseled_pyramid_stairs",
            new StairsBlock(WarpedstoneBlocks.WARPEDSTONE_POLISHED_CHISELED_PYRAMID.getDefaultState(), AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PYRAMID_SLAB = registerBlock("warpedstone/warpedstone_polished_chiseled_pyramid_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));

    public static final Block WARPEDSTONE_POLISHED_CHISELED_PYRAMID_WALL = registerBlock("warpedstone/warpedstone_polished_chiseled_pyramid_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1.5f,6f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreNetherBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreNetherBlocks.LOGGER.info("Registering Warpedstone Blocks for " + MoreNetherBlocks.MOD_ID);
    }
}
