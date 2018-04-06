package io.github.plajdo.trashmod.blocks;

import java.util.Random;

import io.github.plajdo.trashmod.init.BlocksModded;
import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer2;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrashLayer2 extends TrashLayer{

	public TrashLayer2(String name) {
		super(name);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
	}
	
	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p_149727_5, int p_149727_6, float p_149727_7, float p_149727_8, float p_149727_9){
		if(!w.isRemote){
			if(p_149727_5.getEquipmentInSlot(0) != null){
				if(p_149727_5.getEquipmentInSlot(0).getItem() == BlocksModded.trashLayer.getItem(w, x, y, z)){
					p_149727_5.inventory.consumeInventoryItem(BlocksModded.trashLayer.getItem(w, x, y, z));
					w.removeTileEntity(x, y, z);
					w.setBlock(x, y, z, BlocksModded.trashLayer3);
					
				}
				
			}
			
		}
		return true;
		
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 2;
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTrashLayer2();
	}

}
