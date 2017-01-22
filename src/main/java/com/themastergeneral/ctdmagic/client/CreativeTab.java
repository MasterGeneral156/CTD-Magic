package com.themastergeneral.ctdmagic.client;

import com.themastergeneral.ctdmagic.Main;
import com.themastergeneral.ctdmagic.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTab extends CreativeTabs
{
	public CreativeTab() 
	{
		super(Main.MODID);
	}
	public Item getTabIconItem() 
	{
		return ModItems.runebasic; //shown icon on creative tab
	}
	public boolean hasSearchBar() 
	{
		return false;
	}
}
