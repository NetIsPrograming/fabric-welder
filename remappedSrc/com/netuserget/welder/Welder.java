package com.netuserget.welder;

import com.netuserget.welder.registry.ModBlocks;
import com.netuserget.welder.registry.ModItems;
import com.netuserget.welder.registry.ModOreGen;
import me.shedaniel.cloth.api.dynamic.registry.v1.DynamicRegistryCallback;
import me.shedaniel.cloth.api.dynamic.registry.v1.EarlyInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Welder implements ModInitializer, EarlyInitializer {

    public static final String MOD_ID = "welder-alloy";
    public static final ItemGroup ALLOYS = FabricItemGroupBuilder.build(new Identifier(Welder.MOD_ID, "alloys"), () -> new ItemStack(ModItems.STEEL));
    public static final ItemGroup MIX = FabricItemGroupBuilder.build(new Identifier(Welder.MOD_ID, "mixes"), () -> new ItemStack(ModItems.STEEL_MIX));
    public static final ItemGroup ORE = FabricItemGroupBuilder.build(new Identifier(Welder.MOD_ID, "ores"), () -> new ItemStack(ModBlocks.BAUXITE));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }

    @Override
    public void onEarlyInitialization() {
        DynamicRegistryCallback.callback(Registry.BIOME_KEY).register((dynamicRegistryManager, registryKey, biome) -> {
            ModOreGen.addOres(registryKey, biome);
        });
}}
