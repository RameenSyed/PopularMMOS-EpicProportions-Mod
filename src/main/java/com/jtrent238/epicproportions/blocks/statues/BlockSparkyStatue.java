package com.jtrent238.epicproportions.blocks.statues;

import com.jtrent238.epicproportions.tileentity.TileEntityJenStatue;
import com.jtrent238.epicproportions.tileentity.TileEntityPatStatue;
import com.jtrent238.epicproportions.tileentity.TileEntitySparkyStatue;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSparkyStatue extends BlockContainer{

	public BlockSparkyStatue(Material p_i45394_1_) {
		super(p_i45394_1_);
	}

	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntitySparkyStatue();
	}

}
