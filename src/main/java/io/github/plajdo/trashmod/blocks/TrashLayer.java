package io.github.plajdo.trashmod.blocks;

import io.github.plajdo.trashmod.TrashConst;
import net.minecraft.block.BlockSnow;
import net.minecraft.creativetab.CreativeTabs;

public class TrashLayer extends BlockSnow{
	
	public TrashLayer(String name){
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setHardness(10F);
		this.setResistance(5F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		
	}

}
