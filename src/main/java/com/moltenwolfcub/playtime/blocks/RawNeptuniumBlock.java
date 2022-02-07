package com.moltenwolfcub.playtime.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RawNeptuniumBlock extends Block {

    public RawNeptuniumBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE)
            .strength(5.0f, 6.0f)
            .sound(SoundType.STONE)
        );
    }
    
}
