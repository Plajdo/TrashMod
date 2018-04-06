package io.github.plajdo.trashmod.blocks;

import java.util.Random;

import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer5;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrashLayer5 extends TrashLayer{
	
	public TrashLayer5(String name) {
		super(name);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 5;
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTrashLayer5();
	}
	
}
