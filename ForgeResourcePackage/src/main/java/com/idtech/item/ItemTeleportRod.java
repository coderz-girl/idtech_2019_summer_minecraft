package com.idtech.item;

import net.minecraft.util.math.BlockPos;

public class ItemTeleportRod<name, moveToBlock> extends QuickItem {
    {
        name = "Teleport Rod";
        texture = "teleportrod";
    }


    public void onRightClick() {
        BlockPos block = findBlockAtCursor(100);

        moveToBlock(block);
    }
}