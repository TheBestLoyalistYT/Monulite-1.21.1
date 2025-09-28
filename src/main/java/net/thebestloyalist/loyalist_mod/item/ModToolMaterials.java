package net.thebestloyalist.loyalist_mod.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.thebestloyalist.loyalist_mod.utils.ModTags;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    MONULITE_SWORD   (ModTags.Blocks.INCORRECT_MONULITE_TOOL, 2721, 1.2F, 3.0F, 18, ()
            -> Ingredient.ofItems(Items.FLINT)),

    MONULITE_PICKAXE   (ModTags.Blocks.INCORRECT_MONULITE_TOOL, 2731, 15.0F, 1.0F, 18, ()
            -> Ingredient.ofItems(Items.IRON_INGOT)),

    MONULITE_SHOVEL   (ModTags.Blocks.INCORRECT_MONULITE_TOOL, 2721, 15.0F, 1.5F, 18, ()
            -> Ingredient.ofItems(Items.FLINT)),

    MONULITE_AXE   (ModTags.Blocks.INCORRECT_MONULITE_TOOL, 2731, 15.0F, 3.5F, 18, ()
            -> Ingredient.ofItems(Items.FLINT)),

    MONULITE_HOE   (ModTags.Blocks.INCORRECT_MONULITE_TOOL, 2721, 1.2F, 0.1F, 18, ()
            -> Ingredient.ofItems(Items.FLINT));

    private final TagKey<Block> inverseTag;
    private final float miningSpeed;
    private final float attackDamage;
    private final int itemDurability;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {return this.itemDurability;}

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
