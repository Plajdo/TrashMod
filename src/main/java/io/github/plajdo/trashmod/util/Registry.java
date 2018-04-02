package io.github.plajdo.trashmod.util;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.plajdo.trashmod.TrashConst;
import net.minecraft.block.Block;

public class Registry{
	
	public static void registerBlock(Block block){
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(TrashConst.MODID.length() + 1));
	}
	
}
