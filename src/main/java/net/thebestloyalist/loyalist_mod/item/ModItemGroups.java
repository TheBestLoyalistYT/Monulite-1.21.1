package net.thebestloyalist.loyalist_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thebestloyalist.loyalist_mod.LoyalistMod;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MONULITE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(LoyalistMod.MOD_ID, "monulite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MONULITE_INGOT))
                    .displayName(Text.translatable("itemgroup.loyalistmod.monulite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DEEPSLATE_MONULITE_ORE);
                        entries.add(ModBlocks.MONULITE_ORE);
                        entries.add(ModBlocks.MONULITE_BLOCK);
                        entries.add(ModItems.RAW_MONULITE);
                        entries.add(ModItems.MONULITE_INGOT);
                        entries.add(ModItems.MONULITE_OOZ);
                        entries.add(ModItems.MONULITE_COIN);
                        entries.add(ModItems.COIN_MOLD);

                    }).build());

    public static void registerItemGroups() {
        LoyalistMod.LOGGER.info("Registering Item Groups for " + LoyalistMod.MOD_ID);
    }
}
