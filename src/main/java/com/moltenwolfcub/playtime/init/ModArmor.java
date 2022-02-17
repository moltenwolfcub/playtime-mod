package com.moltenwolfcub.playtime.init;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.util.enums.ModArmorMaterial;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArmor {

    public static final DeferredRegister<Item> ARMOR_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Playtime.MOD_ID);

    //foam
    public static final RegistryObject<ArmorItem> FOAM_HELMET = ARMOR_ITEMS.register("foam_helmet", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.HEAD, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ArmorItem> FOAM_CHESTPLATE = ARMOR_ITEMS.register("foam_chestplate", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.CHEST, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ArmorItem> FOAM_LEGGINGS = ARMOR_ITEMS.register("foam_leggings", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.LEGS, new Item.Properties().tab(Playtime.TAB)));

    public static final RegistryObject<ArmorItem> FOAM_BOOTS = ARMOR_ITEMS.register("foam_boots", 
        () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.FEET, new Item.Properties().tab(Playtime.TAB)));


    //neptunium
    public static final RegistryObject<ArmorItem> NEPTUNIUM_HELMET = ARMOR_ITEMS.register("neptunium_helmet", 
        () -> new ArmorItem(ModArmorMaterial.NEPTUNIUM, EquipmentSlot.HEAD, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<ArmorItem> NEPTUNIUM_CHESTPLATE = ARMOR_ITEMS.register("neptunium_chestplate", 
        () -> new ArmorItem(ModArmorMaterial.NEPTUNIUM, EquipmentSlot.CHEST, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<ArmorItem> NEPTUNIUM_LEGGINGS = ARMOR_ITEMS.register("neptunium_leggings", 
        () -> new ArmorItem(ModArmorMaterial.NEPTUNIUM, EquipmentSlot.LEGS, new Item.Properties().tab(Playtime.TAB).fireResistant()));

    public static final RegistryObject<ArmorItem> NEPTUNIUM_BOOTS = ARMOR_ITEMS.register("neptunium_boots", 
        () -> new ArmorItem(ModArmorMaterial.NEPTUNIUM, EquipmentSlot.FEET, new Item.Properties().tab(Playtime.TAB).fireResistant()));
    
}
