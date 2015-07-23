package com.xyniux.dsmcmod.init;

import com.xyniux.dsmcmod.item.ItemDSMC;
import com.xyniux.dsmcmod.item.ItemEstusFlask;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Xyniux on 23.07.2015.
 */
public class ModItems {

    public static final ItemDSMC EstusFlask = new ItemEstusFlask();

    public static void init(){
        GameRegistry.registerItem(EstusFlask, "EstsuFlask");
    }

}
