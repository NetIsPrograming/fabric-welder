package com.netuserget.welder.registry;


import me.shedaniel.cloth.api.dynamic.registry.v1.BiomesRegistry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;


public class ModOreGen {

    public static void addOres(RegistryKey<Biome> registryKey, Biome biome) {
        BiomesRegistry.registerFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, () -> Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.BAUXITE.getDefaultState(), 12)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(60, 35, 20)).spreadHorizontally().repeat(2)));
    }


}
