package io.github.plajdo.trashmod.tileEntity;

import org.lwjgl.opengl.GL11;

import io.github.plajdo.trashmod.TrashConst;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderTileEntityTrashLayer extends TileEntitySpecialRenderer{
	
	ResourceLocation texture;
	ResourceLocation objModelLocation;
	IModelCustom model;
	
	public RenderTileEntityTrashLayer(){
		texture = new ResourceLocation(TrashConst.MODID, "textures/blocks/trashLayer.png");
		objModelLocation = new ResourceLocation(TrashConst.MODID, "models/model.obj");
		model = AdvancedModelLoader.loadModel(objModelLocation);
	}

	@Override
	public void renderTileEntityAt(TileEntity p_147500_1_, double x, double y, double z, float dt){
		bindTexture(texture);
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5F, y + 0.5F, z + 0.5F);
		GL11.glPushMatrix();
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	
}
