package com.moltenwolfcub.playtime.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class SoftplayBlock extends Block {

    public SoftplayBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOL)
            .strength(0.7f)
            .sound(SoundType.WOOL)
        );
    }
    
}
