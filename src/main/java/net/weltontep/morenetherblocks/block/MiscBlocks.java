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
import net.weltontep.morenetherblocks.block.custom.CharcoalSaplingBlock;
import net.weltontep.morenetherblocks.world.tree.ModSaplingGenerators;

public class MiscBlocks {
    public static final Block BLUE_NETHER_BRICKS = registerBlock("misc/blue_nether_bricks",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("misc/blue_nether_brick_stairs",
            new StairsBlock(MiscBlocks.BLUE_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("misc/blue_nether_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("misc/blue_nether_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlock("misc/blue_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICKS_CRACKED = registerBlock("misc/blue_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_CRACKED_STAIRS = registerBlock("misc/blue_nether_brick_cracked_stairs",
            new StairsBlock(MiscBlocks.BLUE_NETHER_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_CRACKED_SLAB = registerBlock("misc/blue_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_CRACKED_WALL = registerBlock("misc/blue_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICK_CRACKED_FENCE = registerBlock("misc/blue_nether_brick_cracked_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICKS_CHISELED = registerBlock("misc/blue_nether_bricks_chiseled",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block NETHER_BRICK_CRACKED_STAIRS = registerBlock("misc/nether_brick_cracked_stairs",
            new StairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block NETHER_BRICK_CRACKED_SLAB = registerBlock("misc/nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block NETHER_BRICK_CRACKED_WALL = registerBlock("misc/nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block NETHER_BRICK_CRACKED_FENCE = registerBlock("misc/nether_brick_cracked_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_FENCE = registerBlock("misc/red_nether_brick_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICKS_CRACKED = registerBlock("misc/red_nether_bricks_cracked",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_CRACKED_STAIRS = registerBlock("misc/red_nether_brick_cracked_stairs",
            new StairsBlock(MiscBlocks.RED_NETHER_BRICKS_CRACKED.getDefaultState(), AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_CRACKED_SLAB = registerBlock("misc/red_nether_brick_cracked_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_CRACKED_WALL = registerBlock("misc/red_nether_brick_cracked_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICK_CRACKED_FENCE = registerBlock("misc/red_nether_brick_cracked_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block RED_NETHER_BRICKS_CHISELED = registerBlock("misc/red_nether_bricks_chiseled",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHARCOAL_LOG = registerBlock("misc/charcoal_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2f,3f)
                    .burnable().sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS)));

    public static final Block CHARCOAL_LOG_STRIPPED = registerBlock("misc/charcoal_log_stripped",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f,3f)
                    .burnable().sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS)));

    public static final Block CHARCOAL_WOOD = registerBlock("misc/charcoal_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2f,3f)
                    .burnable().sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS)));

    public static final Block CHARCOAL_WOOD_STRIPPED = registerBlock("misc/charcoal_wood_stripped",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f,3f)
                    .burnable().sounds(BlockSoundGroup.WOOD).instrument(NoteBlockInstrument.BASS)));

    public static final Block CHARCOAL_PLANKS = registerBlock("misc/charcoal_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f,3f)
                    .burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block CHARCOAL_STAIRS = registerBlock("misc/charcoal_stairs",
            new StairsBlock(MiscBlocks.CHARCOAL_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).strength(2f,6f)
                    .burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block CHARCOAL_SLAB = registerBlock("misc/charcoal_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).strength(2f,6f)
                    .burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block CHARCOAL_FENCE = registerBlock("misc/charcoal_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).strength(2f,6f)
                    .burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block CHARCOAL_SAPLING = registerBlock("misc/charcoal_sapling",
            new CharcoalSaplingBlock(ModSaplingGenerators.CHARCOAL, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), Blocks.SOUL_SOIL));

    public static final Block FLINT_BLOCK = registerBlock("misc/flint_block",
            new Block(AbstractBlock.Settings.create().strength(2f,6f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block SULPHUR_DUST = registerBlock("misc/sulphur_dust",
            new GlowLichenBlock(AbstractBlock.Settings.create().breakInstantly()
                    .nonOpaque().sounds(BlockSoundGroup.WOOL)));

    public static final Block NETHERRACK_STAIRS = registerBlock("misc/netherrack_stairs",
            new StairsBlock(CrimsonBlocks.CRIMSON_NETHERRACK.getDefaultState(), AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block NETHERRACK_SLAB = registerBlock("misc/netherrack_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHERRACK)));

    public static final Block NETHERRACK_WALL = registerBlock("misc/netherrack_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(0.4F)
                    .requiresTool().instrument(NoteBlockInstrument.BASEDRUM).sounds(BlockSoundGroup.NETHERRACK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreNetherBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreNetherBlocks.LOGGER.info("Registering Miscellaneous Blocks for " + MoreNetherBlocks.MOD_ID);
    }
}
