package com.krento.nilsomod.drop;

import com.krento.nilsomod.NilsoMod;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.ArrayList;

/*
 * Spawns entities (i.e blocks, items & mobs) on block dropped
 */

public class DropProcessor {
    public void processDrop(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        ArrayList<Entity> drops = new ArrayList<>();
        getDrops(worldIn, pos, drops);
        spawnDrops(worldIn, drops);
    }

    private void getDrops(World worldIn, BlockPos pos, ArrayList<Entity> drops) {
        drops.add(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(),
                new ItemStack(NilsoMod.Items.AMPHETAMINE, 2)));
        drops.add(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(),
                new ItemStack(NilsoMod.Items.COCAINE, 1)));
    }
    private void spawnDrops(World worldIn, ArrayList<Entity> drops) {
        for (final Entity e : drops) {
            worldIn.addEntity(e);
        }
    }
}
