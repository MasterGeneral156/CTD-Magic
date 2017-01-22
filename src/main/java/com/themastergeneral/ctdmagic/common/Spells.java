package com.themastergeneral.ctdmagic.common;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class Spells 
{
	private final List<IRecipe> recipes = Lists.<IRecipe>newArrayList();
	public static void registerSpells(Item staff, Item[] runes, Item[] quantity)
	{
		
	}
	public static void getSpells (Item staff, Item[] runes, Item[] quantity)
	{
		
	}
	@Nullable
    public ItemStack findMatchingRecipe(InventoryCrafting craftMatrix, World worldIn)
    {
        for (IRecipe irecipe : this.recipes)
        {
            if (irecipe.matches(craftMatrix, worldIn))
            {
                return irecipe.getCraftingResult(craftMatrix);
            }
        }
        return null;
    }
}
