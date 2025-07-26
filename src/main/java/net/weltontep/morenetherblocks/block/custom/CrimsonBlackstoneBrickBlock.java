package net.weltontep.morenetherblocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.weltontep.morenetherblocks.block.CrimsonBlocks;

public class CrimsonBlackstoneBrickBlock extends NetherrackBlock implements Fertilizable {
    public CrimsonBlackstoneBrickBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        if (!world.getBlockState(pos.up()).isTransparent(world, pos)) {
            return false;
        } else {
            for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
                if (world.getBlockState(blockPos).isIn(BlockTags.NYLIUM)) {
                    return true;
                }
            }

            return false;
        }
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        boolean bl = false;
        boolean bl2 = false;

        for (BlockPos blockPos : BlockPos.iterate(pos.add(-1, -1, -1), pos.add(1, 1, 1))) {
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.isOf(CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICKS)) {
                bl2 = true;
            }

            if (blockState.isOf(Blocks.CRIMSON_NYLIUM)) {
                bl = true;
            }

            if (bl2 && bl) {
                break;
            }
        }

        if (bl2 && bl) {
            world.setBlockState(pos, random.nextBoolean() ? CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_BRICKS.getDefaultState() : CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS.getDefaultState(), Block.NOTIFY_ALL);
        } else if (bl2) {
            world.setBlockState(pos, CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS.getDefaultState(), Block.NOTIFY_ALL);
        } else if (bl) {
            world.setBlockState(pos, CrimsonBlocks.CRIMSON_BLACKSTONE_POLISHED_LARGE_NYLIUM_BRICKS.getDefaultState(), Block.NOTIFY_ALL);
        }
    }

    @Override
    public Fertilizable.FertilizableType getFertilizableType() {
        return Fertilizable.FertilizableType.NEIGHBOR_SPREADER;
    }

}