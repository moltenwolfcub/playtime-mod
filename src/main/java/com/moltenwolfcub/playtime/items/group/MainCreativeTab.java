package com.moltenwolfcub.playtime.items.group;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.util.RegistryHandler;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MainCreativeTab extends CreativeModeTab {
    public MainCreativeTab() {
        super(Playtime.MOD_ID);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(RegistryHandler.FOAM.get());
    }
}
