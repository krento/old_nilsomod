package com.krento.nilsomod.objects.blocks;

import com.krento.nilsomod.drop.DropProcessor;
import com.krento.nilsomod.objects.NilsoObject;
import net.minecraft.block.Block;

public abstract class NilsoBlock extends Block implements NilsoObject {

    public NilsoBlock(Properties properties) {
        super(properties);
    }

    public abstract DropProcessor getDropProcessor();
}
