package com.netuserget.welder;

import com.netuserget.welder.registry.ModBlocks;
import com.netuserget.welder.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Welder implements ModInitializer {

    public static final String MOD_ID = "welder-alloy";
    public static final ItemGroup ALOWYS = FabricItemGroupBuilder.build(new Identifier(Welder.MOD_ID, "alloys"), () -> new ItemStack(ModItems.STEEL));
    public static final ItemGroup MIX = FabricItemGroupBuilder.build(new Identifier(Welder.MOD_ID, "mixes"), () -> new ItemStack(ModItems.STEEL_MIX));
    public static final ItemGroup ORE = FabricItemGroupBuilder.build(new Identifier(Welder.MOD_ID, "ores"), () -> new ItemStack(ModBlocks.BAUXITE));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
