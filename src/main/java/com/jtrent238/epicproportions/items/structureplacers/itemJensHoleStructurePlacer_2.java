package com.jtrent238.epicproportions.items.structureplacers;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemJensHoleStructurePlacer_2   extends Item{

public itemJensHoleStructurePlacer_2(int par1){
setMaxDamage(0);
maxStackSize = 1;
}
public int getItemEnchantability()
{
    return 0;
}
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 0;
}
public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
{
    return 1.0F;
}
public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
float var4 = 1.0F;

if(true){
boolean place = true;

if(place){
	
	//world.setBlock(i+0, j+0, k+0, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+1, j+0, k+0, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+2, j+0, k+0, Block.getBlockById(12), 0, 2);
	world.setBlock(i+3, j+0, k+0, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+0, j+0, k+1, Block.getBlockById(2), 0, 2);
	//world.setBlock(i+1, j+0, k+1, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+2, j+0, k+1, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+3, j+0, k+1, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+0, j+0, k+2, Block.getBlockById(3), 0, 2);
	//world.setBlock(i+1, j+0, k+2, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+2, j+0, k+2, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+3, j+0, k+2, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+0, j+0, k+3, Block.getBlockById(2), 0, 2);
	//world.setBlock(i+1, j+0, k+3, Block.getBlockById(3), 0, 2);
	//world.setBlock(i+2, j+0, k+3, Block.getBlockById(12), 0, 2);
	//world.setBlock(i+3, j+0, k+3, Block.getBlockById(12), 0, 2);
	world.setBlock(i+0, j+1, k+0, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+1, j+1, k+0, Block.getBlockById(1), 0, 2);
	//world.setBlock(i+2, j+1, k+0, Block.getBlockById(1), 0, 2);
	world.setBlock(i+3, j+1, k+0, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+0, j+1, k+1, Block.getBlockById(1), 0, 2);
	world.setBlock(i+1, j+1, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+1, k+1, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+3, j+1, k+1, Block.getBlockById(1), 0, 2);
	//world.setBlock(i+0, j+1, k+2, Block.getBlockById(1), 0, 2);
	world.setBlock(i+1, j+1, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+1, k+2, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+3, j+1, k+2, Block.getBlockById(1), 0, 2);
	world.setBlock(i+0, j+1, k+3, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+1, j+1, k+3, Block.getBlockById(1), 0, 2);
	//world.setBlock(i+2, j+1, k+3, Block.getBlockById(1), 0, 2);
	world.setBlock(i+3, j+1, k+3, Block.getBlockById(0), 0, 2);
	world.setBlock(i+0, j+2, k+0, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+1, j+2, k+0, Block.getBlockById(1), 0, 2);
	//world.setBlock(i+2, j+2, k+0, Block.getBlockById(1), 0, 2);
	world.setBlock(i+3, j+2, k+0, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+0, j+2, k+1, Block.getBlockById(1), 0, 2);
	world.setBlock(i+1, j+2, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+2, k+1, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+3, j+2, k+1, Block.getBlockById(1), 0, 2);
	//world.setBlock(i+0, j+2, k+2, Block.getBlockById(1), 0, 2);
	world.setBlock(i+1, j+2, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+2, k+2, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+3, j+2, k+2, Block.getBlockById(1), 0, 2);
	world.setBlock(i+0, j+2, k+3, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+1, j+2, k+3, Block.getBlockById(1), 0, 2);
	//world.setBlock(i+2, j+2, k+3, Block.getBlockById(1), 0, 2);
	world.setBlock(i+3, j+2, k+3, Block.getBlockById(0), 0, 2);
	world.setBlock(i+0, j+3, k+0, Block.getBlockById(0), 0, 2);
	world.setBlock(i+1, j+3, k+0, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+0, Block.getBlockById(0), 0, 2);
	//world.setBlock(i+3, j+3, k+0, Block.getBlockById(1), 0, 2);
	world.setBlock(i+0, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+1, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+3, j+3, k+1, Block.getBlockById(0), 0, 2);
	world.setBlock(i+0, j+3, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+1, j+3, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+3, j+3, k+2, Block.getBlockById(0), 0, 2);
	world.setBlock(i+0, j+3, k+3, Block.getBlockById(0), 0, 2);
	world.setBlock(i+1, j+3, k+3, Block.getBlockById(0), 0, 2);
	world.setBlock(i+2, j+3, k+3, Block.getBlockById(0), 0, 2);
	world.setBlock(i+3, j+3, k+3, Block.getBlockById(0), 0, 2);
	
	
}
}

return true;
}




}
