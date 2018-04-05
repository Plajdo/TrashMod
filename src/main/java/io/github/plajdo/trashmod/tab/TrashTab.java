package io.github.plajdo.trashmod.tab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TrashTab extends CreativeTabs{

	public TrashTab(String name){
		super(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem(){
		/*
		 * TODO: Change to mod icon instead of fire charge
		 */
		return Items.fire_charge;
	}

}
