package io.github.plajdo.trashmod.blocks;

import java.util.Random;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.BlocksModded;
import io.github.plajdo.trashmod.init.ItemsModded;
import io.github.plajdo.trashmod.init.TabsModded;
import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TrashLayer extends BlockContainer{
	
	public TrashLayer(String name){
		super(Material.ground);
		this.setCreativeTab(TabsModded.trashTab);
		this.setHardness(0.2F);
		this.setResistance(0.1F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
		
	}

	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p_149727_5, int p_149727_6, float p_149727_7, float p_149727_8, float p_149727_9){
		if(!w.isRemote){
			if(p_149727_5.getEquipmentInSlot(0) != null){
				if(p_149727_5.getEquipmentInSlot(0).getItem() == BlocksModded.trashLayer.getItem(w, x, y, z)){
					p_149727_5.inventory.consumeInventoryItem(BlocksModded.trashLayer.getItem(w, x, y, z));
					w.removeTileEntity(x, y, z);
					w.setBlock(x, y, z, BlocksModded.trashLayer2);
					
				}
				
			}
			
		}
		return true;
		
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_){
		return ItemsModded.trashItem;
	}
	
	@Override
	public int quantityDropped(int meta, int fortune, Random random){
		return 1;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityTrashLayer();
	}

}
