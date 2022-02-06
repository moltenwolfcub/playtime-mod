package com.moltenwolfcub.playtime.items;

import com.moltenwolfcub.playtime.Playtime;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class CocktailSausage extends Item {

    public CocktailSausage() {
        super(new Item.Properties()
                .tab(Playtime.TAB)
                .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(1.5f)
                    .alwaysEat()
                    .fast()
                    .meat()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 50, 0), 1)
                    .effect(new MobEffectInstance(MobEffects.JUMP, 50, 0), 1)
                    .build()
                )
        
        
        );
    }
    
}
