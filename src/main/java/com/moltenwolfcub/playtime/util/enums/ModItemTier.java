package com.moltenwolfcub.playtime.util.enums;

import java.util.function.Supplier;

import com.moltenwolfcub.playtime.init.ModItems;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModItemTier implements Tier{

    FOAM(0, 100, 3.0f, 1.0f, 5, () -> {
        return Ingredient.of(ModItems.FOAM.get());
    }),

    NEPTUNIUM(4, 2300, 10.0f, 5.0f, 18, () -> {
        return Ingredient.of(ModItems.NEPTUNIUM_INGOT.get());
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue, Supplier<Ingredient> repairMaterial) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
    
}
