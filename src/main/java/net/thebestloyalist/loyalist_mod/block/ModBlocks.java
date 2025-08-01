package net.thebestloyalist.loyalist_mod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.thebestloyalist.loyalist_mod.LoyalistMod;

public class ModBlocks {

    public static final Block DEEPSLATE_MONULITE_ORE = registerBlock("deepslate_monulite_ore_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.2f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block MONULITE_ORE = registerBlock("monulite_ore_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.2f)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool()));

    public static final Block MONULITE_BLOCK = registerBlock("monulite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .sounds(BlockSoundGroup.NETHERITE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LoyalistMod.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(LoyalistMod.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LoyalistMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LoyalistMod.LOGGER.info("Registering Mod Blocks for " + LoyalistMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                    entries.add(ModBlocks.MONULITE_ORE);
                    entries.add(ModBlocks.DEEPSLATE_MONULITE_ORE);
                    entries.add(ModBlocks.MONULITE_BLOCK);
                });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
        };
}
