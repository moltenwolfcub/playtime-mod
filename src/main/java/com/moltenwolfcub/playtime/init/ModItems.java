package com.moltenwolfcub.playtime.init;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.items.BlockItemBase;
import com.moltenwolfcub.playtime.items.CocktailSausage;
import com.moltenwolfcub.playtime.items.ItemBase;

import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Playtime.MOD_ID);

    // Items
    public static final RegistryObject<Item> FOAM = ITEMS.register("foam", ItemBase::new);
    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage", ItemBase::new);
    public static final RegistryObject<CocktailSausage> COCKTAIL_SAUSAGE = ITEMS.register("cocktail_sausage", CocktailSausage::new);
    public static final RegistryObject<Item> RAW_NEPTUNIUM = ITEMS.register("raw_neptunium", ItemBase::new);
    public static final RegistryObject<Item> NEPTUNIUM_INGOT = ITEMS.register("neptunium_ingot", ItemBase::new);
    public static final RegistryObject<Item> NEPTUNIUM_NUGGET = ITEMS.register("neptunium_nugget", ItemBase::new);

    
    // BlockItems
    public static final RegistryObject<Item> SOFTPLAY_BLOCK_ITEM = ITEMS.register("softplay_block", 
        () -> new BlockItemBase(ModBlocks.SOFTPLAY_BLOCK.get()));

    public static final RegistryObject<Item> SOFTPLAY_PILLAR_ITEM = ITEMS.register("softplay_pillar", 
        () -> new BlockItemBase(ModBlocks.SOFTPLAY_PILLAR.get()));

    public static final RegistryObject<Item> SOFTPLAY_PILLAR_END_ITEM = ITEMS.register("softplay_pillar_end", 
        () -> new BlockItemBase(ModBlocks.SOFTPLAY_PILLAR_END.get()));

    public static final RegistryObject<Item> NEPTUNIUM_BLOCK_ITEM = ITEMS.register("neptunium_block", 
        () -> new BlockItemBase(ModBlocks.NEPTUNIUM_BLOCK.get()));

    public static final RegistryObject<Item> RAW_NEPTUNIUM_BLOCK_ITEM = ITEMS.register("raw_neptunium_block", 
        () -> new BlockItemBase(ModBlocks.RAW_NEPTUNIUM_BLOCK.get()));

    public static final RegistryObject<Item> NEPTUNIUM_ORE_BLOCK_ITEM = ITEMS.register("neptunium_ore", 
        () -> new BlockItemBase(ModBlocks.NEPTUNIUM_ORE_BLOCK.get()));

    public static final RegistryObject<Item> DEEPSLATE_NEPTUNIUM_ORE_BLOCK_ITEM = ITEMS.register("deepslate_neptunium_ore", 
        () -> new BlockItemBase(ModBlocks.DEEPSLATE_NEPTUNIUM_ORE_BLOCK.get()));

    public static final RegistryObject<Item> END_NEPTUNIUM_ORE_BLOCK_ITEM = ITEMS.register("end_neptunium_ore", 
        () -> new BlockItemBase(ModBlocks.END_NEPTUNIUM_ORE_BLOCK.get()));

    public static final RegistryObject<Item> NETHER_NEPTUNIUM_ORE_BLOCK_ITEM = ITEMS.register("nether_neptunium_ore", 
        () -> new BlockItemBase(ModBlocks.NETHER_NEPTUNIUM_ORE_BLOCK.get()));
    
}
