package io.github.plajdo.trashmod.init;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import io.github.plajdo.trashmod.tileEntity.RenderTileEntityTrashLayer;
import io.github.plajdo.trashmod.tileEntity.RenderTileEntityTrashLayer2;
import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer;
import io.github.plajdo.trashmod.tileEntity.TileEntityTrashLayer2;

public class TileEntitiesModded{
	
	public static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityTrashLayer.class, "tileTrashLayer");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrashLayer.class, new RenderTileEntityTrashLayer());
		
		GameRegistry.registerTileEntity(TileEntityTrashLayer2.class, "tileTrashLayer2");
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrashLayer2.class, new RenderTileEntityTrashLayer2());
		
	}
	
}
