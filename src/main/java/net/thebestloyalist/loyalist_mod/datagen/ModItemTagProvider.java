package net.thebestloyalist.loyalist_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.registry.tag.ItemTags;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;
import net.thebestloyalist.loyalist_mod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.MONULITE_SWORD)
                .add(ModItems.MONULITE_PICKAXE)
                .add(ModItems.MONULITE_SHOVEL)
                .add(ModItems.MONULITE_AXE)
                .add(ModItems.MONULITE_HOE);

        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.MONULITE_SWORD)
                .add(ModItems.MONULITE_AXE);

    }
}
