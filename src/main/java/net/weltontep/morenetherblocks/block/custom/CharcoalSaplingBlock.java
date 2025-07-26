package net.weltontep.morenetherblocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.weltontep.morenetherblocks.block.SoulSandstoneBlocks;

public class CharcoalSaplingBlock extends SaplingBlock {
    private final Block blockToPlaceOn;

    public CharcoalSaplingBlock(SaplingGenerator generator, Settings settings, Block block) {
        super(generator, settings);
        this.blockToPlaceOn = block;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos) || floor.isOf(Blocks.NETHERRACK) || floor.isOf(Blocks.SOUL_SAND) || floor.isOf(Blocks.SOUL_SOIL) || floor.isOf(SoulSandstoneBlocks.SOUL_SAND_LOOSE);
    }
}
