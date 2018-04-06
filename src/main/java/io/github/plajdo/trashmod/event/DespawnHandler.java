package io.github.plajdo.trashmod.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.plajdo.trashmod.init.BlocksModded;
import net.minecraftforge.event.entity.item.ItemExpireEvent;

public class DespawnHandler{
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onDespawn(ItemExpireEvent event){
		if(!event.entityItem.worldObj.isRemote){
			if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer){
				event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer, event.entityItem.worldObj.getBlockMetadata((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) + 1, 2);
			}else{
				event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer);
			}
			
		}
		
	}
	
}
