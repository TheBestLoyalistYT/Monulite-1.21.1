package net.thebestloyalist.loyalist_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DEEPSLATE_MONULITE_ORE)
                .add(ModBlocks.MONULITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MONULITE_ORE)
                .add(ModBlocks.DEEPSLATE_MONULITE_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES);
        getOrCreateTagBuilder(BlockTags.WALLS);

    }
}