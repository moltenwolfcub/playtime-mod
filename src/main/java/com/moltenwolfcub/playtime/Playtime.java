package com.moltenwolfcub.playtime;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.CreativeModeTab;

import com.moltenwolfcub.playtime.init.ModArmor;
import com.moltenwolfcub.playtime.init.ModBlocks;
import com.moltenwolfcub.playtime.init.ModItems;
import com.moltenwolfcub.playtime.init.ModTools;
import com.moltenwolfcub.playtime.items.group.MainCreativeTab;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("playtime")
public class Playtime
{

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "playtime";
    public static final CreativeModeTab TAB = new MainCreativeTab();

    public Playtime() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModArmor.ARMOR_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModTools.TOOL_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}

}
