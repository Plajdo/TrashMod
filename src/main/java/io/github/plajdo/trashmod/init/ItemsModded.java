package io.github.plajdo.trashmod.init;

import io.github.plajdo.trashmod.items.TrashItem;
import io.github.plajdo.trashmod.util.Registry;
import net.minecraft.item.Item;

public class ItemsModded{
	
	public static final Item trashItem = new TrashItem("trashItem");
	
	public static void registerItems(){
		Registry.registerItem(trashItem);
		
	}
	
}
