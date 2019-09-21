package alty.tesmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class IronPistonOriginalClosed extends BlockBase {

    public final AxisAlignedBB IRON_PISTON_ORIGINAL_CLOSED_AABB = new AxisAlignedBB(0, 0, 0, 1, 1, 1);

    public IronPistonOriginalClosed(String name, Material iron) {
        super(name, Material.IRON);
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] { FACING});
    }


    @Override
    public IBlockState getStateFromMeta(int meta) {

        EnumFacing enumfacing = EnumFacing.getFront(meta);

        return this.getDefaultState().withProperty(FACING, enumfacing);
    }
    @Override
    public int getMetaFromState(IBlockState state) {

        EnumFacing facing=state.getValue(FACING);

        int meta=((EnumFacing)state.getValue(FACING)).getIndex();

        return meta;
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
        return IRON_PISTON_ORIGINAL_CLOSED_AABB;
    }


}

