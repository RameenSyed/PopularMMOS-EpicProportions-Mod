package com.jtrent238.epicproportions.worldgen;

import java.util.Random;

import com.jtrent238.epicproportions.BlockLoader;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenPumpkin_Jen extends WorldGenerator
{
    private static final String __OBFID = "CL_00000428";

    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = p_76484_3_ + p_76484_2_.nextInt(8) - p_76484_2_.nextInt(8);
            int j1 = p_76484_4_ + p_76484_2_.nextInt(4) - p_76484_2_.nextInt(4);
            int k1 = p_76484_5_ + p_76484_2_.nextInt(8) - p_76484_2_.nextInt(8);

            if (p_76484_1_.isAirBlock(i1, j1, k1) && p_76484_1_.getBlock(i1, j1 - 1, k1) == Blocks.grass && BlockLoader.BlockPumpkinJen.canPlaceBlockAt(p_76484_1_, i1, j1, k1))
            {
                p_76484_1_.setBlock(i1, j1, k1, BlockLoader.BlockPumpkinJen, p_76484_2_.nextInt(4), 2);
            }
        }

        return true;
    }
}