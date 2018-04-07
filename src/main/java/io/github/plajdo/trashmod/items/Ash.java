package io.github.plajdo.trashmod.items;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.ItemsModded;
import io.github.plajdo.trashmod.init.TabsModded;
import net.minecraft.block.IGrowable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Ash extends Item{
	
	public Ash(String name){
		super();
		this.setCreativeTab(TabsModded.trashTab);
		this.setUnlocalizedName(name);
		this.setTextureName(TrashConst.MODID + ":" + name);
		
	}
	
	@Override
	public boolean onItemUse(ItemStack p_77648_1, EntityPlayer p_77648_2, World p_77648_3, int p_77648_4, int p_77648_5, int p_77648_6, int p_77648_7, float p_77648_8, float p_77648_9, float p_77648_10){
		if(!p_77648_2.canPlayerEdit(p_77648_4, p_77648_5, p_77648_6, p_77648_7, p_77648_1)){
			return false;
			
		}else{
			if(p_77648_3.getBlock(p_77648_4, p_77648_5, p_77648_6) instanceof IGrowable){
				p_77648_3.spawnParticle("villagerHappy", p_77648_4, p_77648_5, p_77648_6, 0.0D, 0.5D, 0.0D);
				p_77648_2.inventory.consumeInventoryItem(ItemsModded.ash);
				p_77648_3.setBlockMetadataWithNotify(p_77648_4, p_77648_5, p_77648_6, p_77648_3.getBlockMetadata(p_77648_4, p_77648_5, p_77648_6) + 1, 2);	//TODO: Why it keeps overflowing..?
				return true;
				
			}
			
		}
		return false;
		
	}
	
}
