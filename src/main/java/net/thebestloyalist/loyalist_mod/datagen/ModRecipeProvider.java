package net.thebestloyalist.loyalist_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.tag.vanilla.VanillaItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.thebestloyalist.loyalist_mod.block.ModBlocks;
import net.thebestloyalist.loyalist_mod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.client.TextureMap.pattern;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture){
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> MONULITE_SMELTABLES = List.of(ModItems.RAW_MONULITE, ModBlocks.MONULITE_ORE,
                ModBlocks.DEEPSLATE_MONULITE_ORE);

        offerBlasting(recipeExporter, MONULITE_SMELTABLES, RecipeCategory.MISC, ModItems.MONULITE_INGOT, 0.5f, 300, "monulite_ingot");

}
}
