package com.moltenwolfcub.playtime.armor;

import java.util.function.Supplier;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.util.RegistryHandler;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ModArmorMaterial implements ArmorMaterial{

    FOAM(Playtime.MOD_ID + ":foam", 8, new int[] { 1, 2, 3, 1 }, 5,
        SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, () -> { return Ingredient.of(RegistryHandler.FOAM.get()); }, 0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final int knockbackResistance;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, int knockbackResistance) {
         this.name = name;
         this.maxDamageFactor = maxDamageFactor;
         this.damageReductionAmountArray = damageReductionAmountArray;
         this.enchantability = enchantability;
         this.soundEvent = soundEvent;
         this.toughness = toughness;
         this.repairMaterial = repairMaterial;
         this.knockbackResistance = knockbackResistance;
     }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
    
}
