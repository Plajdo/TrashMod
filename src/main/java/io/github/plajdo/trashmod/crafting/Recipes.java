package io.github.plajdo.trashmod.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.plajdo.trashmod.init.BlocksModded;
import io.github.plajdo.trashmod.init.ItemsModded;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes{
	
	public static void registerShaped(){
		GameRegistry.addShapedRecipe(new ItemStack(BlocksModded.trashBlock), new Object[]{
				"AAA",
				"AAA",
				"AAA",
				'A', Items.compass
		});
		
	}
	
	public static void registerShapeless(){
		GameRegistry.addShapelessRecipe(new ItemStack(BlocksModded.trashBlock), 
				ItemsModded.trashItem,
				ItemsModded.trashItem,
				ItemsModded.trashItem,
				ItemsModded.trashItem,
				ItemsModded.trashItem,
				ItemsModded.trashItem,
				ItemsModded.trashItem,
				ItemsModded.trashItem
		);
		
	}
	
	public static void registerSmelting(){
		
	}
	
}
