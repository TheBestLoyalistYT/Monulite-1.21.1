package net.thebestloyalist.loyalist_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.thebestloyalist.loyalist_mod.LoyalistMod;
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
    public static final Item MONULITE_COIN = registerItem("monulite_coin", new Item(new Item.Settings()));
    public static final Item MONULITE_COIN_STACK = registerItem("monulite_coin_stack", new Item(new Item.Settings()
    ));

    public static final Item MONULITE_SWORD = registerItem("monulite_sword",
            new SwordItem(ModToolMaterials.MONULITE_SWORD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MONULITE_SWORD, 3, -2.4f))));

    public static final Item MONULITE_PICKAXE = registerItem("monulite_pickaxe",
            new PickaxeItem(ModToolMaterials.MONULITE_PICKAXE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MONULITE_PICKAXE, 1, -2.8f))));

    public static final Item MONULITE_SHOVEL = registerItem("monulite_shovel",
            new ShovelItem(ModToolMaterials.MONULITE_SHOVEL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MONULITE_SHOVEL, 1, -3.0f))));

    public static final Item MONULITE_AXE = registerItem("monulite_axe",
            new AxeItem(ModToolMaterials.MONULITE_AXE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MONULITE_AXE, 3, -3.0f))));

    public static final Item MONULITE_HOE = registerItem("monulite_hoe",
            new HoeItem(ModToolMaterials.MONULITE_HOE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.MONULITE_HOE, 1, 0.0f))));

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
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(MONULITE_COIN);
            fabricItemGroupEntries.add(MONULITE_COIN_STACK);

        });
    }
}