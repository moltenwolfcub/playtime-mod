package com.moltenwolfcub.playtime.util;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.blocks.BlockItemBase;
import com.moltenwolfcub.playtime.blocks.SoftplayBlock;
import com.moltenwolfcub.playtime.items.ItemBase;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RegistryHandler {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Playtime.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Playtime.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> FOAM = ITEMS.register("foam", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> SOFTPLAY_BLOCK = BLOCKS.register("softplay_block", SoftplayBlock::new);

    // BlockItems
    public static final RegistryObject<Item> SOFTPLAY_BLOCK_ITEM = ITEMS.register("softplay_block", () -> new BlockItemBase(SOFTPLAY_BLOCK.get()));

}
