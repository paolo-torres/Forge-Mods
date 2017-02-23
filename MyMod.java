package com.paolotorres.mymod;

import com.paolotorres.mymod.init.MyBlocks;
import com.paolotorres.mymod.init.MyItems;
import com.paolotorres.mymod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MyMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MyBlocks.init();
		MyBlocks.register();
		MyItems.init();
		MyItems.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
