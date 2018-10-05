package com.krumlauf.alchemy.init;

import java.util.ArrayList;
import java.util.List;

import com.krumlauf.alchemy.blocks.BlockBase;
import com.krumlauf.alchemy.blocks.LesserFluxOre;
import com.krumlauf.alchemy.blocks.SpellboundOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block LESSER_FLUX_ORE = new LesserFluxOre("lesser_flux_ore", Material.ROCK);
	public static final Block SPELLBOUND_ORE = new SpellboundOre("spellbound_ore", Material.ROCK);

}
