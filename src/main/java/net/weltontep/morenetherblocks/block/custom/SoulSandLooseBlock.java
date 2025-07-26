package net.weltontep.morenetherblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.EntityShapeContext;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class SoulSandLooseBlock extends FallingBlock {

    public VoxelShape getBlockSupportShape(BlockState state, World world, BlockPos pos) {
        return VoxelShapes.empty();
    }
    private static final VoxelShape SHAPE = VoxelShapes.fullCube();

    public SoulSandLooseBlock(Settings settings) {
        super(settings);
    }

    protected MapCodec<SoulSandLooseBlock> getCodec() {
        return MapCodec.unit(() -> new SoulSandLooseBlock(this.settings));
    }

    public VoxelShape getOutlineShape(BlockState state, World world, BlockPos pos, ShapeContext context) {
        if (context instanceof EntityShapeContext entityContext) {
            Entity entity = entityContext.getEntity();
            if (entity instanceof LivingEntity livingEntity) {
                if (canWalkOnLooseSoulSand(livingEntity)) {
                    return VoxelShapes.empty();
                }
            }
        }
        return VoxelShapes.empty();
    }

    public VoxelShape getCollisionShape(BlockState state, World world, BlockPos pos, ShapeContext context) {
        if (context instanceof EntityShapeContext entityContext) {
            Entity entity = entityContext.getEntity();
            if (entity instanceof LivingEntity livingEntity) {
                if (canWalkOnLooseSoulSand(livingEntity)) {
                    return VoxelShapes.empty();
                }
            }
        }
        return VoxelShapes.empty();
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (entity instanceof LivingEntity livingEntity) {
            boolean hasLeatherBoots = canWalkOnLooseSoulSand(livingEntity);

            if (!hasLeatherBoots) {
                Vec3d velocity = entity.getVelocity();
                entity.setVelocity(velocity.x * 0.4, -0.5, velocity.z * 0.4);
                entity.slowMovement(state, new Vec3d(0.5, 0.02, 0.5));

                // Simulate suffocation when head is inside block
                if (world.getBlockState(pos.up()).getBlock() instanceof SoulSandLooseBlock) {
                    if (livingEntity.getAir() > 0 && livingEntity.getAir() < livingEntity.getMaxAir()) {
                        livingEntity.setAir(livingEntity.getAir() - 3);
                    } else {
                        entity.damage(world.getDamageSources().inWall(), 1.0F);
                    }
                }
            }
        }
    }

    private boolean canWalkOnLooseSoulSand(LivingEntity entity) {
        ItemStack boots = entity.getEquippedStack(EquipmentSlot.FEET);
        return boots.isOf(Items.LEATHER_BOOTS);
    }

}
