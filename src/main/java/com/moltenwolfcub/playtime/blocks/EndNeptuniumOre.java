package com.moltenwolfcub.playtime.blocks;

import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class EndNeptuniumOre extends OreBlock {

    public EndNeptuniumOre() {
        super(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND)
            .strength(4.5f, 9.0f)
            .sound(SoundType.STONE)
            .requiresCorrectToolForDrops()
        );
    }

}
