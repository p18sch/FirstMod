package com.p18sch.TestMod.init;


import com.p18sch.TestMod.item.itemMapleLeaf;
import com.p18sch.TestMod.item.itemTM;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final itemTM mapleLeaf = new itemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "Maple Leaf");
    }

}
