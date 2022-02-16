package com.moltenwolfcub.playtime.events;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.world.gen.ModOreGen;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Playtime.MOD_ID, bus = Bus.MOD)
public class CommonModEvents {
    
    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(ModOreGen::registerOres);
    }
}
