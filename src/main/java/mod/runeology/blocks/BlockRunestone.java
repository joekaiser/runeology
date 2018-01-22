package mod.runeology.blocks;

import mod.runeology.NameRegistry;
import mod.runeology.helpers.BlockHelpers;
import mod.runeology.helpers.EntityHelpers;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRunestone extends BlockBase {
	
	public BlockRunestone() {
		super(NameRegistry.BLOCKNAME_RUNESTONE);
	}
	
	   /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    @Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer,
			ItemStack stack) {
		world.setBlockState(pos,
				state.withProperty(BlockHelpers.FACING, EntityHelpers.getFacingFromEntity(pos, placer)), 2);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(BlockHelpers.FACING, EnumFacing.getFront(meta & 7));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(BlockHelpers.FACING).getIndex();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, BlockHelpers.FACING);
	}

}
