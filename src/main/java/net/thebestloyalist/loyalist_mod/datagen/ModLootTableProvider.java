package net.thebestloyalist.loyalist_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;
import net.thebestloyalist.loyalist_mod.item.ModItems;
import java.util.concurrent.CompletableFuture;

    public class ModLootTableProvider extends FabricBlockLootTableProvider {
        public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
            super(dataOutput, registryLookup);
        }

        @Override
        public void generate() {

            addDrop(ModBlocks.MONULITE_ORE, drops(ModBlocks.MONULITE_ORE, ModItems.RAW_MONULITE));
            addDrop(ModBlocks.DEEPSLATE_MONULITE_ORE, drops(ModBlocks.DEEPSLATE_MONULITE_ORE, ModItems.RAW_MONULITE));

        }
    }
