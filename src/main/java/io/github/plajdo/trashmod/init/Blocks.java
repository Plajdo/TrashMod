package io.github.plajdo.trashmod.init;

import io.github.plajdo.trashmod.blocks.TrashBlock;
import io.github.plajdo.trashmod.blocks.TrashLayer;
import io.github.plajdo.trashmod.util.Registry;
import net.minecraft.block.Block;

public class Blocks{
	
	public static Block trashBlock = new TrashBlock("trashBlock");
	public static Block trashLayer = new TrashLayer("trashLayer");
	
	public static void registerBlocks(){
		Registry.registerBlock(trashBlock);
		Registry.registerBlock(trashLayer);
	}
	
}
