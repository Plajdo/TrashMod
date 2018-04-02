package io.github.plajdo.trashmod.event;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.entity.item.ItemExpireEvent;

public class DespawnHandler{
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onDespawn(ItemExpireEvent event){
		if(!Minecraft.getMinecraft().theWorld.isRemote){
			Minecraft.getMinecraft().theWorld.setBlock((int)event.entity.posX, (int)event.entity.posY, (int)event.entity.posZ, Blocks.cobblestone);
		}
		
	}
	
}
