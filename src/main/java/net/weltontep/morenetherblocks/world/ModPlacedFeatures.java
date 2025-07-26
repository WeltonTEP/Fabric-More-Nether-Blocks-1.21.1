package net.weltontep.morenetherblocks.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.weltontep.morenetherblocks.MoreNetherBlocks;
import net.weltontep.morenetherblocks.block.MiscBlocks;


import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SMOOTH_BASALT_DELTA_ORE_PLACED_KEY = registryKey("smooth_basalt_delta_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_DEEPSLATE_ORE_PLACED_KEY = registryKey("down_deepslate_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_SMOOTH_BASALT_ORE_PLACED_KEY = registryKey("down_smooth_basalt_ore_placed");
    public static final RegistryKey<PlacedFeature> UP_SMOOTH_BASALT_ORE_PLACED_KEY = registryKey("up_smooth_basalt_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERITE_ORE_PLACED_KEY = registryKey("netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> DOWN_NETHERITE_ORE_PLACED_KEY = registryKey("down_netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERRACK_ORE_PLACED_KEY = registryKey("netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> UP_DEEPSLATE_ORE_PLACED_KEY = registryKey("up_deepslate_ore_placed");
    public static final RegistryKey<PlacedFeature> OBSIDIAN_ORE_PLACED_KEY = registryKey("obsidian_ore_placed");
    public static final RegistryKey<PlacedFeature> CRYING_OBSIDIAN_ORE_PLACED_KEY = registryKey("crying_ore_placed");
    public static final RegistryKey<PlacedFeature> GILDED_BLACKSTONE_ORE_PLACED_KEY = registryKey("gilded_blackstone_ore_placed");
    public static final RegistryKey<PlacedFeature> MAGMA_ORE_PLACED_KEY = registryKey("magma_ore_placed");
    public static final RegistryKey<PlacedFeature> LAVA_ORE_PLACED_KEY = registryKey("lava_ore_placed");
    public static final RegistryKey<PlacedFeature> COBBLESTONE_ORE_PLACED_KEY = registryKey("cobblestone_ore_placed");
    public static final RegistryKey<PlacedFeature> ANDESITE_ORE_PLACED_KEY = registryKey("andesite_ore_placed");
    public static final RegistryKey<PlacedFeature> BASALT_COBBLED_ORE_PLACED_KEY = registryKey("basalt_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> BASALT_SMOOTH_CRACKED_ORE_PLACED_KEY = registryKey("basalt_smooth_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> BLACKSTONE_COBBLED_ORE_PLACED_KEY = registryKey("blackstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> BLACKSTONE_NETHERITE_ORE_PLACED_KEY = registryKey("blackstone_netherite_ore_placed");
    public static final RegistryKey<PlacedFeature> BLOODSTONE_COBBLED_ORE_PLACED_KEY = registryKey("bloodstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_NETHERRACK_ORE_PLACED_KEY = registryKey("crimson_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_NETHERRACK_CRACKED_ORE_PLACED_KEY = registryKey("crimson_netherrack_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> CRACKED_NETHER_BRICK_ORE_PLACED_KEY = registryKey("cracked_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERSTONE_COBBLED_ORE_PLACED_KEY = registryKey("netherstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY = registryKey("netherstone_polished_cut_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHERSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("netherstone_polished_cut_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_PLACED_KEY = registryKey("crimson_blackstone_polished_large_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("crimson_blackstone_polished_large_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_NETHER_BRICK_ORE_PLACED_KEY = registryKey("crimson_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_NETHER_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("crimson_nether_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_NETHER_BRICK_ORE_PLACED_KEY = registryKey("red_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("red_nether_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_RED_NETHER_BRICK_ORE_PLACED_KEY = registryKey("crimson_red_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSON_RED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("crimson_red_nether_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSONSTONE_COBBLED_ORE_PLACED_KEY = registryKey("crimsonstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSONSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY = registryKey("crimsonstone_polished_cut_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> CRIMSONSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("crimsonstone_polished_cut_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_NETHERRACK_ORE_PLACED_KEY = registryKey("warped_netherrack_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_NETHERRACK_CRACKED_ORE_PLACED_KEY = registryKey("warped_netherrack_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_PLACED_KEY = registryKey("warped_blackstone_polished_large_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("warped_blackstone_polished_large_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_NETHER_BRICK_ORE_PLACED_KEY = registryKey("warped_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("warped_nether_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> BLUE_NETHER_BRICK_ORE_PLACED_KEY = registryKey("blue_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> BLUE_NETHER_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("blue_nether_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_BLUE_NETHER_BRICK_ORE_PLACED_KEY = registryKey("warped_blue_nether_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPED_BLUE_NETHER_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("warped_blue_nether_brick_cracked_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPEDSTONE_COBBLED_ORE_PLACED_KEY = registryKey("warpedstone_cobbled_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPEDSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY = registryKey("warpedstone_polished_cut_brick_ore_placed");
    public static final RegistryKey<PlacedFeature> WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY = registryKey("warpedstone_polished_cut_brick_cracked_ore_placed");

    public static final RegistryKey<PlacedFeature> CHARCOAL_PLACED_KEY = registryKey("charcoal_placed");
    public static final RegistryKey<PlacedFeature> CHARCOAL_SAPLING_PLACED_KEY = registryKey("charcoal_sapling_placed");

    public static final RegistryKey<PlacedFeature> SOUL_SAND_LOOSE_DISK_PLACED_KEY = registryKey("soul_sand_loose_placed");

    public static final RegistryKey<PlacedFeature> CRIMSON_MYCELIAL_THREADS_MULTIFACE_GROWTH_PLACED_KEY = registryKey("crimson_mycelial_threads_multiface_growth");

    public static final RegistryKey<PlacedFeature> CRIMSON_TENDRILS_PLACED_KEY = registryKey("crimson_tendrils_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, SMOOTH_BASALT_DELTA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMOOTH_BASALT_DELTA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, DOWN_DEEPSLATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_DEEPSLATE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(7)))
        );

        register(context, DOWN_SMOOTH_BASALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_SMOOTH_BASALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(16)))
        );

        register(context, UP_SMOOTH_BASALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.UP_SMOOTH_BASALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(111), YOffset.fixed(127)))
        );

        register(context, NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(128)))
        );

        register(context, DOWN_NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOWN_NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(32)))
        );

        register(context, NETHERRACK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERRACK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, UP_DEEPSLATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.UP_DEEPSLATE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(48,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(119), YOffset.fixed(127)))
        );

        register(context, OBSIDIAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OBSIDIAN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(32,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(15)))
        );

        register(context, CRYING_OBSIDIAN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRYING_OBSIDIAN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, GILDED_BLACKSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GILDED_BLACKSTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(128,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(128)))
        );

        register(context, MAGMA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAGMA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, LAVA_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAVA_ORE_KEY),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, COBBLESTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.COBBLESTONE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, ANDESITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANDESITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, BASALT_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BASALT_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BASALT_SMOOTH_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BASALT_SMOOTH_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BLACKSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BLACKSTONE_NETHERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACKSTONE_NETHERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BLOODSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLOODSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(31)))
        );

        register(context, CRIMSON_NETHERRACK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_NETHERRACK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_NETHERRACK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_NETHERRACK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRACKED_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRACKED_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, NETHERSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, NETHERSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERSTONE_POLISHED_CUT_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, NETHERSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHERSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_NETHER_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_NETHER_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, RED_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, RED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_NETHER_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_RED_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_RED_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSON_RED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_RED_NETHER_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSONSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSONSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSONSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSONSTONE_POLISHED_CUT_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CRIMSONSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSONSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_NETHERRACK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_NETHERRACK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_NETHERRACK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_NETHERRACK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_BLACKSTONE_POLISHED_LARGE_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_NETHER_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_NETHER_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BLUE_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, BLUE_NETHER_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_NETHER_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_BLUE_NETHER_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_BLUE_NETHER_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPED_BLUE_NETHER_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPED_BLUE_NETHER_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPEDSTONE_COBBLED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPEDSTONE_COBBLED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPEDSTONE_POLISHED_CUT_BRICK_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPEDSTONE_POLISHED_CUT_BRICK_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WARPEDSTONE_POLISHED_CUT_BRICK_CRACKED_ORE_KEY),
                ModOrePlacement.modifiersWithCount(256,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(127)))
        );

        register(context, CHARCOAL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHARCOAL_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(20, 0.1f, 2), MiscBlocks.CHARCOAL_SAPLING));

        register(context, CHARCOAL_SAPLING_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHARCOAL_SAPLING_KEY),
                CountPlacementModifier.of(10), SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of()
        );

        register(context, SOUL_SAND_LOOSE_DISK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SOUL_SAND_LOOSE_DISK_KEY),
                CountPlacementModifier.of(25),SquarePlacementModifier.of(),PlacedFeatures.BOTTOM_TO_120_RANGE, BiomePlacementModifier.of()
        );

        register(context, CRIMSON_MYCELIAL_THREADS_MULTIFACE_GROWTH_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_MYCELIAL_THREADS_MULTIFACE_GROWTH_KEY),
                CountPlacementModifier.of(UniformIntProvider.create(104, 157)),
                PlacedFeatures.BOTTOM_TO_120_RANGE, SquarePlacementModifier.of(), SurfaceThresholdFilterPlacementModifier.of(Heightmap.Type.OCEAN_FLOOR_WG, Integer.MIN_VALUE, -13), BiomePlacementModifier.of());

        register(context, CRIMSON_TENDRILS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_TENDRILS_KEY),
                // CountPlacementModifier: Controls how many times the feature attempts to spawn per chunk.
                // Adjust this value to make the pillars more or less common.
                CountPlacementModifier.of(1),

                // HeightRangePlacementModifier: Restricts the Y-level range where the feature can spawn.
                // For Nether, Y-levels typically range from 0 to 127.
                // UniformIntProvider.create(0, 120) allows it to spawn anywhere from bedrock to near the ceiling.
                HeightRangePlacementModifier.uniform(
                        YOffset.fixed(0), YOffset.fixed(120) // Using YOffset.fixed for consistency
                ),
                BiomePlacementModifier.of() // Always include BiomePlacementModifier for biome-specific placement
        );
    }

    public static RegistryKey<PlacedFeature> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MoreNetherBlocks.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
