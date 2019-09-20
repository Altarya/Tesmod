package alty.tesmod.blocks;

import alty.tesmod.Main;
import alty.tesmod.init.ModBlocks;
import alty.tesmod.init.ModItems;
import alty.tesmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName("block_iron_piston_original");
        setRegistryName("registry_block_iron_piston_original");
        setCreativeTab(CreativeTabs.REDSTONE);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");
    }

}
