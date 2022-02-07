package com.moltenwolfcub.playtime.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class NeptuniumBlock extends Block {

    public NeptuniumBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL)
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
        );
    }
    
}
