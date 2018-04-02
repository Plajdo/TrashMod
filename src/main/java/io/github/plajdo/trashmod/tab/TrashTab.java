package io.github.plajdo.trashmod.tab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TrashTab extends CreativeTabs{

	public TrashTab(){
		super("Trash mod");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem(){
		
		return null;
	}

}
