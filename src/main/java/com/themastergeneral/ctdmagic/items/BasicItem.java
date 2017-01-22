package com.themastergeneral.ctdmagic.items;

import com.themastergeneral.ctdmagic.Main;
import com.themastergeneral.ctdmagic.client.ItemModelProvider;

import net.minecraft.item.Item;

public class BasicItem extends Item implements ItemModelProvider
{
	protected String name;
	public BasicItem(String unlocalizedName) 
	{
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(Main.creativeTab);
        this.setRegistryName(unlocalizedName);
        this.name = unlocalizedName;
    }
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}
