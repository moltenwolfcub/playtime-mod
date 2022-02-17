package com.moltenwolfcub.playtime.blocks;

import com.moltenwolfcub.playtime.init.ModBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SoftplayPillar extends DirectionalBlock{
    public static final Tag.Named<Block> SOFTPLAY_PILLARS = BlockTags.bind("softplay_pillars");

    private static final VoxelShape SHAPE_X = Block.box(0, 4, 4, 16, 12, 12);
    private static final VoxelShape SHAPE_Y = Block.box(4, 0, 4, 12, 16, 12);
    private static final VoxelShape SHAPE_Z = Block.box(4, 4, 0, 12, 12, 16);

    public SoftplayPillar() {
        super(BlockBehaviour.Properties.of(Material.WOOL)
            .strength(0.8f)
            .sound(SoundType.WOOL)
        );
    }
    
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_154347_, BlockPos p_154348_, CollisionContext p_154349_) {
        switch(state.getValue(FACING).getAxis()) {
        case Y:
        default:
            return SHAPE_Y;
        case Z:
            return SHAPE_Z;
        case X:
            return SHAPE_X;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
       Direction direction = context.getClickedFace();
       BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos().relative(direction.getOpposite()));
       return blockstate.is(SOFTPLAY_PILLARS) ? this.defaultBlockState().setValue(FACING, direction.getOpposite()) : this.defaultBlockState().setValue(FACING, direction);
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
       return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }
 
    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
       return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
       builder.add(FACING);
    }

}
