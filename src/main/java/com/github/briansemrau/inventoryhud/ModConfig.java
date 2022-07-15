package com.github.briansemrau.inventoryhud;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = InventoryHUDMod.MOD_ID)
public class ModConfig implements ConfigData {

    @Comment("Changes the background alpha of the HUD.")
    public float alpha = 1;

    @Comment("Changes the items alpha of the HUD.")
    public float items_alpha = 1;

    @Comment("Switch between on or off.")
    public boolean show = true;

    @Comment("X position of HUD. Can be negative.")
    public int x = -5;

    @Comment("Y position of HUD. Can be negative.")
    public int y = -5;
}
