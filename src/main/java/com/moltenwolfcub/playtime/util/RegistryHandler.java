package com.moltenwolfcub.playtime.util;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.armor.ModArmorMaterial;
import com.moltenwolfcub.playtime.blocks.SoftplayBlock;
import com.moltenwolfcub.playtime.items.BlockItemBase;
import com.moltenwolfcub.playtime.items.CocktailSausage;
import com.moltenwolfcub.playtime.items.ItemBase;
import com.moltenwolfcub.playtime.tools.ModItemTier;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
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
    public static final RegistryObject<Item> SAUSAGE = ITEMS.register("sausage", ItemBase::new);
    public static final RegistryObject<CocktailSausage> COCKTAIL_SAUSAGE = ITEMS.register("cocktail_sausage", CocktailSausage::new);

    // Tools
    public static final RegistryObject<SwordItem> FOAM_SWORD = ITEMS.register("foam_sword", () -> new SwordItem(ModItemTier.FOAM, 2, -2.4f, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<PickaxeItem> FOAM_PICKAXE = ITEMS.register("foam_pickaxe", () -> new PickaxeItem(ModItemTier.FOAM, 0, -2.8f, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<ShovelItem> FOAM_SHOVEL = ITEMS.register("foam_shovel", () -> new ShovelItem(ModItemTier.FOAM, 0.5f, -3f, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<AxeItem> FOAM_AXE = ITEMS.register("foam_axe", () -> new AxeItem(ModItemTier.FOAM, 0.5f, -3.1f, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<HoeItem> FOAM_HOE = ITEMS.register("foam_hoe", () -> new HoeItem(ModItemTier.FOAM, 0, -1f, new Item.Properties().tab(Playtime.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> FOAM_HELMET = ITEMS.register("foam_helmet", () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.HEAD, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<ArmorItem> FOAM_CHESTPLATE = ITEMS.register("foam_chestplate", () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.CHEST, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<ArmorItem> FOAM_LEGGINGS = ITEMS.register("foam_leggings", () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.LEGS, new Item.Properties().tab(Playtime.TAB)));
    public static final RegistryObject<ArmorItem> FOAM_BOOTS = ITEMS.register("foam_boots", () -> new ArmorItem(ModArmorMaterial.FOAM, EquipmentSlot.FEET, new Item.Properties().tab(Playtime.TAB)));

    // Blocks
    public static final RegistryObject<Block> SOFTPLAY_BLOCK = BLOCKS.register("softplay_block", SoftplayBlock::new);

    // BlockItems
    public static final RegistryObject<Item> SOFTPLAY_BLOCK_ITEM = ITEMS.register("softplay_block", () -> new BlockItemBase(SOFTPLAY_BLOCK.get()));

}
