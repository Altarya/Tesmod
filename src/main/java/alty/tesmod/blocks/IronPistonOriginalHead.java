package alty.tesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class IronPistonOriginalHead extends BlockBase {

    final AxisAlignedBB IRON_PISTON_ORIGINAL_HEAD_AABB = new AxisAlignedBB(0, 0, 0, 1, 1, 1);

    public IronPistonOriginalHead(String name, Material iron) {
        super(name, Material.IRON);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return IRON_PISTON_ORIGINAL_HEAD_AABB;
    }
}
