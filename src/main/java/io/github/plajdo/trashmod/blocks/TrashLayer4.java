package io.github.plajdo.trashmod.blocks;

import java.util.Random;

import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer4;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrashLayer4 extends TrashLayer{
	
	public TrashLayer4(String name) {
		super(name);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 4;
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTrashLayer4();
	}
	
}
