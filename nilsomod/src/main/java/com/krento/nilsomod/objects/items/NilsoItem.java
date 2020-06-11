package com.krento.nilsomod.objects.items;

import com.krento.nilsomod.objects.NilsoObject;
import net.minecraft.item.Item;

public abstract class NilsoItem extends Item implements NilsoObject {
    public NilsoItem(Properties properties) {
        super(properties);
    }
}
