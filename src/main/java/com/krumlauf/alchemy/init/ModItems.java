package com.krumlauf.alchemy.init;

import java.util.ArrayList;
import java.util.List;

import com.krumlauf.alchemy.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item LESSER_FLUX = new ItemBase("lesser_flux");
	public static final Item STABLE_FLUX = new ItemBase("stable_flux");
	public static final Item GREATER_FLUX = new ItemBase("greater_flux");
	public static final Item GIGA_FLUX = new ItemBase("giga_flux");
	public static final Item EMPTY_RUNE = new ItemBase("empty_rune");
	public static final Item FIRE_RUNE = new ItemBase("fire_rune");
	public static final Item WATER_RUNE = new ItemBase("water_rune");
	public static final Item AIR_RUNE = new ItemBase("air_rune");
	public static final Item EARTH_RUNE = new ItemBase("earth_rune");
}
