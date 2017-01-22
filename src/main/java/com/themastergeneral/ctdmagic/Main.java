package com.themastergeneral.ctdmagic;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdmagic.client.CreativeTab;
import com.themastergeneral.ctdmagic.proxy.Common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, acceptedMinecraftVersions = Main.acceptedMinecraftVersions, updateJSON = Main.updateJSON)
public class Main 
{
	public static final String MODID = "ctdmagic";
    public static final String MODNAME = "CTD Magic";
    public static final String VERSION = "1.0.0";
    public static final String acceptedMinecraftVersions = "1.10.2";
	public static final String updateJSON = "https://dl.dropboxusercontent.com/u/72961306/TMG%20Assets/Update%20JSONs/CTD-Magic.json";
    
    @Instance
    public static Main instance = new Main();
    public static final CreativeTab creativeTab = new CreativeTab();
    
    public static Logger logger;
    
    @SidedProxy(clientSide="com.themastergeneral.ctdmagic.proxy.Client", serverSide="com.themastergeneral.ctdmagic.proxy.Server")
    public static Common proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	proxy.preInit(e);
    }
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    }
}
