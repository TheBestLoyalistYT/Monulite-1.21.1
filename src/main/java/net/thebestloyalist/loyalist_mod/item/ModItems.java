package net.thebestloyalist.loyalist_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.thebestloyalist.loyalist_mod.LoyalistMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;

import javax.tools.Tool;

public class ModItems {

    public static final Item COIN_MOLD = registerItem("coin_mold", new Item(new Item.Settings()));
    public static final Item RAW_MONULITE = registerItem("raw_monulite", new Item(new Item.Settings()));
    public static final Item MONULITE_INGOT = registerItem("monulite_ingot", new Item(new Item.Settings()));
    public static final Item MONULITE_OOZ = registerItem("monulite_ooz", new Item(new Item.Settings()));
    public static final Item MONULITE_COIN = registerItem("monulite_coin", new Item(new Item.Settings()
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LoyalistMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        LoyalistMod.LOGGER.info("Registering Mod Items for " + LoyalistMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries ->{

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(RAW_MONULITE);
            fabricItemGroupEntries.add(MONULITE_INGOT);
            fabricItemGroupEntries.add(MONULITE_OOZ);
            fabricItemGroupEntries.add(COIN_MOLD);
            fabricItemGroupEntries.add(MONULITE_COIN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries ->{

        });
    }
}