package io.github.plajdo.trashmod.blocks;

import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer2;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrashLayer2 extends TrashLayer{

	public TrashLayer2(String name) {
		super(name);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTrashLayer2();
	}

}
