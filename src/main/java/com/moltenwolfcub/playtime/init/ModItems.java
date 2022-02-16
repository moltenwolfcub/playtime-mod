package com.moltenwolfcub.playtime.init;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.items.BlockItemBase;
import com.moltenwolfcub.playtime.items.CocktailSausage;
import com.moltenwolfcub.playtime.items.ItemBase;
import com.moltenwolfcub.playtime.util.enums.ModArmorMaterial;
import com.moltenwolfcub.playtime.util.enums.ModItemTier;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;

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

    
    // BlockItems
    public static final RegistryObject<Item> SOFTPLAY_BLOCK_ITEM = ITEMS.register("softplay_block", 
        () -> new BlockItemBase(ModBlocks.SOFTPLAY_BLOCK.get()));

    public static final RegistryObject<Item> SOFTPLAY_PILLAR_ITEM = ITEMS.register("softplay_pillar", 
    () -> new BlockItemBase(ModBlocks.SOFTPLAY_PILLAR.get()));

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


    // Tools
    public static final RegistryObject<SwordItem> FOAM_SWORD = ITEMS.register("foam_sword", 
        () -> new SwordItem(ModItemTier.FOAM, 2, -2.4f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<PickaxeItem> FOAM_PICKAXE = ITEMS.register("foam_pickaxe", 
        () -> new PickaxeItem(ModItemTier.FOAM, 0, -2.8f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ShovelItem> FOAM_SHOVEL = ITEMS.register("foam_shovel", 
        () -> new ShovelItem(ModItemTier.FOAM, 0.5f, -3f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<AxeItem> FOAM_AXE = ITEMS.register("foam_axe", 
        () -> new AxeItem(ModItemTier.FOAM, 0.5f, -3.1f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<HoeItem> FOAM_HOE = ITEMS.register("foam_hoe", 
        () -> new HoeItem(ModItemTier.FOAM, 0, -1f, new Item.Properties().tab(Playtime.TAB)));


    // Armor
    public static final RegistryObject<ArmorItem> FOAM_HELMET = ITEMS.register("foam_helmet", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.HEAD, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ArmorItem> FOAM_CHESTPLATE = ITEMS.register("foam_chestplate", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.CHEST, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ArmorItem> FOAM_LEGGINGS = ITEMS.register("foam_leggings", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.LEGS, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ArmorItem> FOAM_BOOTS = ITEMS.register("foam_boots", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.FEET, new Item.Properties().tab(Playtime.TAB)));
    
}
