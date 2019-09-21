package alty.tesmod.init;

import java.util.ArrayList;
import java.util.List;

import alty.tesmod.blocks.BlockBase;
import alty.tesmod.blocks.IronPistonOriginal;
import alty.tesmod.blocks.IronPistonOriginalClosed;
import alty.tesmod.blocks.IronPistonOriginalHead;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Iron Piston
    public static final Block IRON_PISTON_ORIGINAL_BLOCK = new IronPistonOriginal("block_iron_piston_original", Material.IRON);
    public static final Block IRON_PISTON_ORIGINAL_PISTONHEAD_BLOCK = new IronPistonOriginalHead("block_iron_piston_original_pistonhead", Material.IRON);
    public static final Block IRON_PISTON_ORIGINAL_CLOSED_BLOCK = new IronPistonOriginalClosed("block_iron_piston_original_closed", Material.IRON);


}
