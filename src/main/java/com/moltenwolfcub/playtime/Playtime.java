package com.moltenwolfcub.playtime;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.CreativeModeTab;

import com.moltenwolfcub.playtime.items.group.MainCreativeTab;
import com.moltenwolfcub.playtime.util.RegistryHandler;

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

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}

}
