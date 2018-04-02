package io.github.plajdo.trashmod.blocks;

import io.github.plajdo.trashmod.TrashConst;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TrashBlock extends Block{

	public TrashBlock(String name){
		super(Material.cloth);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setHardness(10F);
		this.setResistance(5F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		
	}
	
}
