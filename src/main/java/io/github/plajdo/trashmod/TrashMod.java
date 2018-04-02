package io.github.plajdo.trashmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.plajdo.trashmod.event.DespawnHandler;
import io.github.plajdo.trashmod.init.Blocks;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = TrashConst.MODID, version = TrashConst.VERSION)
public class TrashMod{
	
	@Instance(TrashConst.MODID)
	public static TrashMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Blocks.registerBlocks();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new DespawnHandler());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
