package com.moltenwolfcub.playtime.init;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.blocks.DeepslateNeptuniumOre;
import com.moltenwolfcub.playtime.blocks.EndNeptuniumOre;
import com.moltenwolfcub.playtime.blocks.NeptuniumBlock;
import com.moltenwolfcub.playtime.blocks.NeptuniumOre;
import com.moltenwolfcub.playtime.blocks.NetherNeptuniumOre;
import com.moltenwolfcub.playtime.blocks.RawNeptuniumBlock;
import com.moltenwolfcub.playtime.blocks.SoftplayBlock;
import com.moltenwolfcub.playtime.blocks.SoftplayPillar;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final Tag.Named<Block> SOFTPLAY_PILLARS = BlockTags.bind("softplay_pillars");
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Playtime.MOD_ID);

    // Blocks
    public static final RegistryObject<Block> SOFTPLAY_BLOCK = BLOCKS.register("softplay_block", SoftplayBlock::new);
    public static final RegistryObject<Block> SOFTPLAY_PILLAR = BLOCKS.register("softplay_pillar", SoftplayPillar::new);
    public static final RegistryObject<Block> SOFTPLAY_PILLAR_END = BLOCKS.register("softplay_pillar_end", SoftplayPillar::new);

    public static final RegistryObject<Block> NEPTUNIUM_BLOCK = BLOCKS.register("neptunium_block", NeptuniumBlock::new);
    public static final RegistryObject<Block> RAW_NEPTUNIUM_BLOCK = BLOCKS.register("raw_neptunium_block", RawNeptuniumBlock::new);
    public static final RegistryObject<Block> NEPTUNIUM_ORE_BLOCK = BLOCKS.register("neptunium_ore", NeptuniumOre::new);
    public static final RegistryObject<Block> DEEPSLATE_NEPTUNIUM_ORE_BLOCK = BLOCKS.register("deepslate_neptunium_ore", DeepslateNeptuniumOre::new);
    public static final RegistryObject<Block> END_NEPTUNIUM_ORE_BLOCK = BLOCKS.register("end_neptunium_ore", EndNeptuniumOre::new);
    public static final RegistryObject<Block> NETHER_NEPTUNIUM_ORE_BLOCK = BLOCKS.register("nether_neptunium_ore", NetherNeptuniumOre::new);
    
}
