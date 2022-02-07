package com.moltenwolfcub.playtime.blocks;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class NeptuniumOre extends OreBlock {

    public NeptuniumOre() {
        super(BlockBehaviour.Properties.of(Material.STONE)
            .strength(3.0f, 4.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        );
    }

}
