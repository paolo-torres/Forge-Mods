package com.paolotorres.mymod.proxy;

import com.paolotorres.mymod.init.MyBlocks;
import com.paolotorres.mymod.init.MyItems;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenders(){
		MyBlocks.registerRenders();
		MyItems.registerRenders();
	}
}
