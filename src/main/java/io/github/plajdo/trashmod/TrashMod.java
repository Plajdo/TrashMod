package io.github.plajdo.trashmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.plajdo.trashmod.crafting.Recipes;
import io.github.plajdo.trashmod.event.DespawnHandler;
import io.github.plajdo.trashmod.init.BlocksModded;
import io.github.plajdo.trashmod.init.ItemsModded;
import io.github.plajdo.trashmod.init.TileEntitiesModded;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = TrashConst.MODID, version = TrashConst.VERSION)
public class TrashMod{
	
	@Instance(TrashConst.MODID)
	public static TrashMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		BlocksModded.registerBlocks();
		ItemsModded.registerItems();
		TileEntitiesModded.registerTileEntities();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new DespawnHandler());
		Recipes.registerShaped();
		Recipes.registerShapeless();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
}
