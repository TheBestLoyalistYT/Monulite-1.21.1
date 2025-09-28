package net.thebestloyalist.loyalist_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.Models;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;
import net.thebestloyalist.loyalist_mod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MONULITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONULITE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MONULITE_BLOCK);

    }

    @Override
    public void generateItemModels(net.minecraft.data.client.ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COIN_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONULITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONULITE_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONULITE_COIN_STACK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MONULITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MONULITE_OOZ, Models.GENERATED);

        itemModelGenerator.register(ModItems.MONULITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MONULITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MONULITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MONULITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MONULITE_HOE, Models.HANDHELD);

    }
}
