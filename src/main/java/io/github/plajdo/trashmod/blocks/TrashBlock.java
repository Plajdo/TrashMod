package io.github.plajdo.trashmod.blocks;

import java.util.ArrayList;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TrashBlock extends Block{

	public TrashBlock(String name){
		super(Material.cloth);
		this.setCreativeTab(Tabs.trashTab);
		this.setHardness(2F);
		this.setResistance(1F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(Blocks.cobblestone, 8));	//TODO: Drop custom trash item when it is done
		
		return drops;
	}
	
	/*
	 * TODO: Set proper mining tool here (pickaxe ofc)
	 */
	
}
