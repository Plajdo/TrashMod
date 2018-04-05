package io.github.plajdo.trashmod.blocks;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.Blocks;
import io.github.plajdo.trashmod.init.Tabs;
import net.minecraft.block.BlockSnow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TrashLayer extends BlockSnow{
	
	public TrashLayer(String name){
		this.setCreativeTab(Tabs.trashTab);
		this.setHardness(10F);
		this.setResistance(5F);
		this.setBlockName(name);
		this.setBlockTextureName(TrashConst.MODID + ":" + name);
		
	}

	@Override
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p_149727_5, int p_149727_6, float p_149727_7, float p_149727_8, float p_149727_9){
		if(!w.isRemote){
			if(p_149727_5.getEquipmentInSlot(0) != null){
				if(p_149727_5.getEquipmentInSlot(0).getItem() == Blocks.trashLayer.getItem(w, x, y, z)){
					p_149727_5.inventory.consumeInventoryItem(Blocks.trashLayer.getItem(w, x, y, z));
					if(w.getBlockMetadata(x, y, z) == 6){
						w.setBlock(x, y, z, Blocks.trashBlock);
					}else{
						w.setBlockMetadataWithNotify(x, y, z, w.getBlockMetadata(x, y, z) + 1, 2);
					}
					
				}
				
			}
			
		}
		return true;
		
	}

}
