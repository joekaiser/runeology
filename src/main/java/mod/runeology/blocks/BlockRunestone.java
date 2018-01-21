package mod.runeology.blocks;

import mod.runeology.NameRegistry;
import net.minecraft.block.state.IBlockState;

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

//    public boolean isFullCube(IBlockState state)
//    {
//        return false;
//    }
}
