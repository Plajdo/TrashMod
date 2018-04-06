package io.github.plajdo.trashmod.init;

import io.github.plajdo.trashmod.blocks.TrashBlock;
import io.github.plajdo.trashmod.blocks.TrashLayer;
import io.github.plajdo.trashmod.blocks.TrashLayer2;
import io.github.plajdo.trashmod.blocks.TrashLayer3;
import io.github.plajdo.trashmod.util.Registry;
import net.minecraft.block.Block;

public class BlocksModded{
	
	public static final Block trashBlock = new TrashBlock("trashBlock");
	public static final Block trashLayer = new TrashLayer("trashLayer");
	public static final Block trashLayer2 = new TrashLayer2("trashLayer2");
	public static final Block trashLayer3 = new TrashLayer3("trashLayer3");
	
	public static void registerBlocks(){
		Registry.registerBlock(trashBlock);
		Registry.registerBlock(trashLayer);
		Registry.registerBlock(trashLayer2);
		Registry.registerBlock(trashLayer3);
	}
	
}
