package com.moltenwolfcub.playtime.blocks;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class DeepslateNeptuniumOre extends OreBlock {

    public DeepslateNeptuniumOre() {
        super(BlockBehaviour.Properties.of(Material.STONE)
            .strength(4.5f, 4.0f)
            .sound(SoundType.NETHER_ORE)
            .requiresCorrectToolForDrops()
        );
    }

}
