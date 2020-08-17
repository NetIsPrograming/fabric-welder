package com.netuserget.welder.registry;

import com.netuserget.welder.Welder;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class ModItems {

    public static Item STEEL = new Item(new Item.Settings().group(Welder.ALOWYS));
    public static Item ALUMINUM = new Item(new Item.Settings().group(Welder.ALOWYS));
    public static Item STEEL_MIX = new Item(new Item.Settings().group(Welder.MIX));
    public static Item ALUMINUM_DUST = new Item(new Item.Settings().group(Welder.MIX));
    public static Item HOT_DIAMOND = new Item(new Item.Settings().group(Welder.ALOWYS));
    public static Item HOT_DIAMOND_PIECES = new Item(new Item.Settings().group(Welder.ALOWYS));
    public static Item COLD_DIAMOND = new Item(new Item.Settings().group(Welder.ALOWYS));
    public static Item ALUMISTEEL_MIX = new Item(new Item.Settings().group(Welder.MIX));
    public static Item ALUMISTEEL = new Item(new Item.Settings().group(Welder.ALOWYS));
    public static Item SILVER = new Item(new Item.Settings().group(Welder.ALOWYS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "steel"), STEEL);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "aluminum"), ALUMINUM);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "steel_mix"), STEEL_MIX);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "aluminum_dust"), ALUMINUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "hot_diamond"), HOT_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "hot_diamond_pieces"), HOT_DIAMOND_PIECES);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "cold_diamond"), COLD_DIAMOND);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "alumisteel"), ALUMISTEEL);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "alumisteel_mix"), ALUMISTEEL_MIX);
        Registry.register(Registry.ITEM, new Identifier(Welder.MOD_ID, "silver"), SILVER);
    }


}
