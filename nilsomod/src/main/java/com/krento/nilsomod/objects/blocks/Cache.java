package com.krento.nilsomod.objects.blocks;

import com.krento.nilsomod.objects.items.Amphetamine;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SandBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Cache extends Block {

    public Cache(Properties properties) {
        super(properties);

    }

    @Override
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
        Entity e = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(),
                new ItemStack(Amphetamine.getInstance(), 2));
        worldIn.addEntity(e);
        super.harvestBlock(worldIn, player, pos, state, te, stack);
    }
}

