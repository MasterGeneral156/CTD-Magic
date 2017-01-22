package com.themastergeneral.ctdmagic.proxy;

import java.io.File;

import com.themastergeneral.ctdmagic.Config;
import com.themastergeneral.ctdmagic.items.ModItems;

import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Common 
{
	// Config instance
    public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "CTD/CTDMagic.cfg"));
        Config.readConfig();
		ModItems.registerItems();
		//Crafting.addRecipes();
	}

	public void init(FMLInitializationEvent e) 
	{
		
	}

	public void postInit(FMLPostInitializationEvent e) 
	{
		if (config.hasChanged()) 
		{
            config.save();
        }
	}
	public void registerItemRenderer(Item item, int meta, String id) 
    {
    	 
    }

}
