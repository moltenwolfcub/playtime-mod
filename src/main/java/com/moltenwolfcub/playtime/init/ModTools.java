package com.moltenwolfcub.playtime.init;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.util.enums.ModItemTier;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools {
    
    public static final DeferredRegister<Item> TOOL_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Playtime.MOD_ID);

    //foam
    public static final RegistryObject<SwordItem> FOAM_SWORD = TOOL_ITEMS.register("foam_sword", 
        () -> new SwordItem(ModItemTier.FOAM, 2, -2.4f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<PickaxeItem> FOAM_PICKAXE = TOOL_ITEMS.register("foam_pickaxe", 
        () -> new PickaxeItem(ModItemTier.FOAM, 1, -2.8f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ShovelItem> FOAM_SHOVEL = TOOL_ITEMS.register("foam_shovel", 
        () -> new ShovelItem(ModItemTier.FOAM, 0.5f, -3f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<AxeItem> FOAM_AXE = TOOL_ITEMS.register("foam_axe", 
        () -> new AxeItem(ModItemTier.FOAM, 2.5f, -3.1f, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<HoeItem> FOAM_HOE = TOOL_ITEMS.register("foam_hoe", 
        () -> new HoeItem(ModItemTier.FOAM, 0, -1f, new Item.Properties().tab(Playtime.TAB)));


    //neptunium
    public static final RegistryObject<SwordItem> NEPTUNIUM_SWORD = TOOL_ITEMS.register("neptunium_sword", 
        () -> new SwordItem(ModItemTier.NEPTUNIUM, 3, -2.4f, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<PickaxeItem> NEPTUNIUM_PICKAXE = TOOL_ITEMS.register("neptunium_pickaxe", 
        () -> new PickaxeItem(ModItemTier.NEPTUNIUM, 1, -2.8f, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<ShovelItem> NEPTUNIUM_SHOVEL = TOOL_ITEMS.register("neptunium_shovel", 
        () -> new ShovelItem(ModItemTier.NEPTUNIUM, 1.5f, -3f, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<AxeItem> NEPTUNIUM_AXE = TOOL_ITEMS.register("neptunium_axe", 
        () -> new AxeItem(ModItemTier.NEPTUNIUM, 5.0f, -3.0f, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<HoeItem> NEPTUNIUM_HOE = TOOL_ITEMS.register("neptunium_hoe", 
        () -> new HoeItem(ModItemTier.NEPTUNIUM, -4, 0f, new Item.Properties().tab(Playtime.TAB).fireResistant()));
    
}
