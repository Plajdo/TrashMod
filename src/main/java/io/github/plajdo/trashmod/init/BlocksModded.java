package io.github.plajdo.trashmod.init;

import io.github.plajdo.trashmod.blocks.TrashBlock;
import io.github.plajdo.trashmod.blocks.TrashLayer;
import io.github.plajdo.trashmod.blocks.TrashLayer2;
import io.github.plajdo.trashmod.blocks.TrashLayer3;
import io.github.plajdo.trashmod.blocks.TrashLayer4;
import io.github.plajdo.trashmod.blocks.TrashLayer5;
import io.github.plajdo.trashmod.blocks.TrashLayer6;
import io.github.plajdo.trashmod.blocks.TrashLayer7;
import io.github.plajdo.trashmod.util.Registry;
import net.minecraft.block.Block;

public class BlocksModded{
	
	public static final Block trashBlock = new TrashBlock("trashBlock");
	public static final Block trashLayer = new TrashLayer("trashLayer");
	public static final Block trashLayer2 = new TrashLayer2("trashLayer2");
	public static final Block trashLayer3 = new TrashLayer3("trashLayer3");
	public static final Block trashLayer4 = new TrashLayer4("trashLayer4");
	public static final Block trashLayer5 = new TrashLayer5("trashLayer5");
	public static final Block trashLayer6 = new TrashLayer6("trashLayer6");
	public static final Block trashLayer7 = new TrashLayer7("trashLayer7");
	
	public static void registerBlocks(){
		Registry.registerBlock(trashBlock);
		Registry.registerBlock(trashLayer);
		Registry.registerBlock(trashLayer2);
		Registry.registerBlock(trashLayer3);
		Registry.registerBlock(trashLayer4);
		Registry.registerBlock(trashLayer5);
		Registry.registerBlock(trashLayer6);
		Registry.registerBlock(trashLayer7);
	}
	
}
