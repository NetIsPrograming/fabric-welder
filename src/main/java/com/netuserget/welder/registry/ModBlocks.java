package com.netuserget.welder.registry;


import com.netuserget.welder.Welder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block BAUXITE = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f));

    
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Welder.MOD_ID, "bauxite"), BAUXITE);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "bauxite"), new BlockItem(BAUXITE, new Item.Settings().group(Welder.ORE)));
    }

}
