package net.weltontep.morenetherblocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class TallHangingPlantBlock extends Block {
    public static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);

    public TallHangingPlantBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.UPPER));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        BlockPos abovePos = blockPos.up();
        BlockState aboveState = world.getBlockState(abovePos);
        BlockPos belowPos = blockPos.down();

        if (aboveState.isSideSolidFullSquare(world, abovePos, Direction.DOWN) && world.getBlockState(belowPos).isAir()) {
            world.setBlockState(belowPos, this.getDefaultState().with(HALF, DoubleBlockHalf.LOWER), 3);
            return this.getDefaultState().with(HALF, DoubleBlockHalf.UPPER);
        }
        return null;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())) return;

        DoubleBlockHalf half = state.get(HALF);
        BlockPos lowerPos = pos.down();
        BlockPos upperPos = pos.up();

        if (half == DoubleBlockHalf.UPPER) {
            // If upper part is broken, remove the lower part
            if (world.getBlockState(lowerPos).isOf(this)) {
                world.breakBlock(lowerPos, true);
            }
        } else {
            // If lower part is broken, remove the upper part
            if (world.getBlockState(upperPos).isOf(this)) {
                world.breakBlock(upperPos, true);
            }
        }

        // If the solid block above the upper half is removed, break both parts
        BlockPos supportPos = (half == DoubleBlockHalf.UPPER) ? upperPos : pos;
        if (world.getBlockState(supportPos).isAir()) {
            world.breakBlock(pos, true);
            if (world.getBlockState(lowerPos).isOf(this)) {
                world.breakBlock(lowerPos, true);
            }
        }


    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) {
            BlockPos abovePos = pos.up();
            return world.getBlockState(abovePos).isSideSolidFullSquare(world, abovePos, Direction.DOWN);
        }
        return world.getBlockState(pos.up()).isOf(this);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        DoubleBlockHalf half = state.get(HALF);

        if (half == DoubleBlockHalf.UPPER) {
            // If lower half is missing, break this block
            if (!world.getBlockState(pos.down()).isOf(this)) {
                return Blocks.AIR.getDefaultState();
            }
        } else {
            // If upper half is missing, break this block
            if (!world.getBlockState(pos.up()).isOf(this)) {
                return Blocks.AIR.getDefaultState();
            }
        }

        return state;
    }
}
