package io.github.plajdo.trashmod.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.plajdo.trashmod.init.BlocksModded;
import net.minecraftforge.event.entity.item.ItemExpireEvent;

public class DespawnHandler{
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onDespawn(ItemExpireEvent event){
		if(!event.entityItem.worldObj.isRemote){
			if(event.entityItem.isOffsetPositionInLiquid(0.0d, 0.0d, 0.0d)){
				/*
				 * THIS FOR SOME FUCKING REASON RETURNS TRUE WHEN **NOT** IN A LIQUID AND FALSE WHEN IN A LIQUID (???)
				 */
				if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer2);
				}else if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer2){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer3);
				}else if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer3){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer4);
				}else if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer4){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer5);
				}else if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer5){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer6);
				}else if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer6){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer7);
				}else if(event.entityItem.worldObj.getBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ)) == BlocksModded.trashLayer7){
					event.entityItem.worldObj.removeTileEntity((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ));
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashBlock);
				}else{
					event.entityItem.worldObj.setBlock((int)Math.floor(event.entityItem.posX), (int)Math.floor(event.entityItem.posY), (int)Math.floor(event.entityItem.posZ), BlocksModded.trashLayer);
				}
				
			}else{
				/*
				 * TODO: Make water into dirty water
				 */
			}
			
		}
		
	}
	
}
