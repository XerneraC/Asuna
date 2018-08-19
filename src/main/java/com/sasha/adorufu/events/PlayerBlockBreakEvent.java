package com.sasha.adorufu.events;

import com.sasha.eventsys.SimpleCancellableEvent;
import com.sasha.adorufu.AdorufuMod;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

/**
 * Created by Sasha on 11/08/2018 at 5:19 PM
 **/
public class PlayerBlockBreakEvent extends SimpleCancellableEvent {

    private Block block;

    public PlayerBlockBreakEvent(BlockPos pos) {
        block = AdorufuMod.minecraft.world.getBlockState(pos).getBlock();
    }

    public Block getBlock() {
        return block;
    }
}