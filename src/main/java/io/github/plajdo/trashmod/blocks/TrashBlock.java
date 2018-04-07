package io.github.plajdo.trashmod.blocks;

import java.util.Random;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.ItemsModded;
import io.github.plajdo.trashmod.init.TabsModded;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class TrashBlock extends Block{

	public TrashBlock(String name){
		super(Material.cloth);
		this.setCreativeTab(TabsModded.trashTab);
		this.setHardness(0.2F);
		this.setResistance(0.1F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		this.setStepSound(soundTypeGravel);
		
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return ItemsModded.trashItem;
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_) {
		return 8;
	}
	
}
