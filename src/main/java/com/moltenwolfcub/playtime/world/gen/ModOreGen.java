package com.moltenwolfcub.playtime.world.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.moltenwolfcub.playtime.Playtime;
import com.moltenwolfcub.playtime.init.ModBlocks;

import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class ModOreGen {

    //copied private methods from vanilla net.minecraft.data.worldgen.placement.OrePlacements
    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier location) {
        return List.of(count, InSquarePlacement.spread(), location, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier location) {
        return orePlacement(CountPlacement.of(count), location);
    }

    private static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier location) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), location);
    }

    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();
    public static final List<PlacedFeature> NETHER_ORES = new ArrayList<>();
    public static final List<PlacedFeature> END_ORES = new ArrayList<>();

    public static final RuleTest ENDSTONE_REPLACEABLES = new BlockMatchTest(Blocks.END_STONE);

    public static void registerOres() {

        final ConfiguredFeature<?, ?> neptuniumOre = FeatureUtils.register("neptunium_ore",
            Feature.ORE.configured(new OreConfiguration(List.of(
                OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, 
                        ModBlocks.NEPTUNIUM_ORE_BLOCK.get().defaultBlockState()),
                        
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                        ModBlocks.DEEPSLATE_NEPTUNIUM_ORE_BLOCK.get().defaultBlockState())),

                    10)));

        final PlacedFeature placedNeptuniumOre = PlacementUtils.register("neptunium_ore",
            neptuniumOre.placed(commonOrePlacement(6, HeightRangePlacement
                .uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(30)))));

        OVERWORLD_ORES.add(placedNeptuniumOre);



        final ConfiguredFeature<?, ?> netherNeptuniumOre = FeatureUtils.register("nether_neptunium_ore",
            Feature.ORE.configured(new OreConfiguration(List.of(
                OreConfiguration.target(OreFeatures.NETHERRACK,
                    ModBlocks.NETHER_NEPTUNIUM_ORE_BLOCK.get().defaultBlockState())),
                    
                6)));

        final PlacedFeature placedNetherNeptuniumOre = PlacementUtils.register("nether_neptunium_ore",
        netherNeptuniumOre.placed(commonOrePlacement(8, HeightRangePlacement
            .triangle(VerticalAnchor.bottom(), VerticalAnchor.top()))));
        
        NETHER_ORES.add(placedNetherNeptuniumOre);



        final ConfiguredFeature<?, ?> endNeptuniumOre = FeatureUtils.register("end_neptunium_ore",
            Feature.ORE.configured(new OreConfiguration(List.of(
                OreConfiguration.target(ENDSTONE_REPLACEABLES,
                    ModBlocks.END_NEPTUNIUM_ORE_BLOCK.get().defaultBlockState())),
                    
                8)));

        final PlacedFeature placedEndNeptuniumOre = PlacementUtils.register("end_neptunium_ore",
        endNeptuniumOre.placed(commonOrePlacement(16, HeightRangePlacement
            .uniform(VerticalAnchor.bottom(), VerticalAnchor.top()))));
        
        END_ORES.add(placedEndNeptuniumOre);
    }

    @Mod.EventBusSubscriber(modid = Playtime.MOD_ID, bus = Bus.FORGE)
    public static class ForgeBusSubscriber {

        @SubscribeEvent
        public static void biomeLoading(BiomeLoadingEvent event) {
            List<Supplier<PlacedFeature>> features = event.getGeneration()
                    .getFeatures(Decoration.UNDERGROUND_ORES);

            switch(event.getCategory()) {
                case NETHER -> ModOreGen.NETHER_ORES.forEach(ore -> features.add(() -> ore));
                case THEEND -> ModOreGen.END_ORES.forEach(ore -> features.add(() -> ore));
                default -> ModOreGen.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));
            }
        }
    }
}

