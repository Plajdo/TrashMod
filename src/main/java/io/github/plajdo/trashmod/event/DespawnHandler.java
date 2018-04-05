package io.github.plajdo.trashmod.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.plajdo.trashmod.init.Blocks;
import net.minecraftforge.event.entity.item.ItemExpireEvent;

public class DespawnHandler{
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onDespawn(ItemExpireEvent event){
		if(!event.entityItem.worldObj.isRemote){
			event.entity.worldObj.setBlock((int)event.entityItem.posX, (int)event.entityItem.posY, (int)event.entityItem.posZ, Blocks.trashLayer);
		}
		
	}
	
}
