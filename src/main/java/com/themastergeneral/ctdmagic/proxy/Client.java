package com.themastergeneral.ctdmagic.proxy;

import com.themastergeneral.ctdmagic.Main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Client extends Common 
{
    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) 
    {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) 
    {
        super.postInit(e);
    }
    public void registerItemRenderer(Item item, int meta, String id)
    {
    	 ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation("ctdmagic:" + id, "inventory"));
    }
}
