package io.github.plajdo.trashmod.blocks;

import java.util.Random;

import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer3;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrashLayer3 extends TrashLayer{
	
	public TrashLayer3(String name) {
		super(name);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 3;
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTrashLayer3();
	}
	
}
