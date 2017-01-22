package com.themastergeneral.ctdmagic.items;

import com.themastergeneral.ctdmagic.client.ItemModelProvider;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems 
{
	public static BasicItem runebasic;
	
	public static BasicWand wandbasic;
	public static void registerItems() 
	{
		runebasic = register(new BasicItem("runebasic"));
		wandbasic = register(new BasicWand("wandbasic"));
	}
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}
}
