package com.themastergeneral.ctdmagic.items;

import net.minecraft.item.Item;

import com.themastergeneral.ctdmagic.Main;
import com.themastergeneral.ctdmagic.client.ItemModelProvider;

public class BasicWand extends BasicItem implements ItemModelProvider
{
	protected String name;
	public BasicWand(String unlocalizedName) 
	{
		super(unlocalizedName);
		this.setNoRepair();
        this.maxStackSize = 1;
        this.name=unlocalizedName;
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}
