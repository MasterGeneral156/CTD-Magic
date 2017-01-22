package com.themastergeneral.ctdmagic;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdmagic.proxy.Common;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

public class Config 
{
    private static final String CATEGORY_GENERAL = "General";
    private static final String CATEGORY_BALANCE = "Balance";

    public static boolean DoPaintBrushBreak = true;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() 
    {
        Configuration cfg = Common.config;
        try 
        {
            cfg.load();
            initGeneralConfig(cfg);
        } 
        catch (Exception e1) 
        {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        }
        finally 
        {
            if (cfg.hasChanged()) 
            {
                cfg.save();
            }
        }
    }
    private static void initGeneralConfig(Configuration cfg) 
    {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration for the CTD Magic mod.");
        cfg.addCustomCategoryComment(CATEGORY_BALANCE, "Tweak things here to balance the mod out as best as you can.");
        //ModVersion = cfg.getString("ModVersion", CATEGORY_GENERAL, ModVersion, "Internal. Don't need to mess with this.");
    }
}
