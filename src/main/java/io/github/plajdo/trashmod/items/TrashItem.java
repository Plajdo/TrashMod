package io.github.plajdo.trashmod.items;

import io.github.plajdo.trashmod.TrashConst;
import io.github.plajdo.trashmod.init.TabsModded;
import net.minecraft.item.Item;

public class TrashItem extends Item{
	
	public TrashItem(String name){
		super();
		this.setCreativeTab(TabsModded.trashTab);
		this.setUnlocalizedName(name);
		this.setTextureName(TrashConst.MODID + ":" + name);
		
	}
	
}
