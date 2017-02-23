package com.paolotorres.mymod.init;

import com.paolotorres.mymod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyItems {

	public static Item my_item;

	public static void init() {
		my_item = new Item().setUnlocalizedName("my_item");
	}

	public static void register()
	{
		GameRegistry.registerItem(my_item, my_item.getUnlocalizedName().substring(5));
	}

	public static void registerRenders()
	{
		registerRender(my_item);
	}

	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
