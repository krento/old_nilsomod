package com.krento.nilsomod.objects.blocks;

import com.krento.nilsomod.drop.DropProcessor;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public class Cache extends NilsoBlock {
    private static final String NAME = "cache";
    private static final DropProcessor dropProcessor = new DropProcessor();

    public Cache(Properties properties) {
        super(properties);
    }

    @Override
    public DropProcessor getDropProcessor() {
        return dropProcessor;
    }

    @Override
    @ParametersAreNonnullByDefault
    public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state,
                             @Nullable TileEntity te, ItemStack stack) {
        getDropProcessor().processDrop(worldIn, player, pos, state, te, stack);
        super.harvestBlock(worldIn, player, pos, state, te, stack);
    }

    @Override
    public String getObjectName() {
        return NAME;
    }
}

