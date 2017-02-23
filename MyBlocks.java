package com.paolotorres.mymod.init;

import com.paolotorres.mymod.Reference;
import com.paolotorres.mymod.blocks.BlockTest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MyBlocks {

	public static Block my_block;

	public static void init()
	{
		my_block = new BlockTest(Material.CLOTH).setUnlocalizedName("my_block");
	}

	public static void register()
	{
		GameRegistry.registerBlock(my_block, my_block.getUnlocalizedName().substring(5));
	}

	public static void registerRenders()
	{
		registerRender(my_block);
	}

	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
