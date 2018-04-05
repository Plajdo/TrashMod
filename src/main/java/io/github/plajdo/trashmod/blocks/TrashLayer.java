package io.github.plajdo.trashmod.blocks;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.Tabs;
import net.minecraft.block.BlockSnow;

public class TrashLayer extends BlockSnow{
	
	public TrashLayer(String name){
		this.setCreativeTab(Tabs.trashTab);
		this.setHardness(10F);
		this.setResistance(5F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		
	}

}
