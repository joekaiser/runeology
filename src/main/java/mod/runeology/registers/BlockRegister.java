package mod.runeology.registers;

import mod.runeology.NameRegistry;
import mod.runeology.blocks.BlockRunestone;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRegister {

	@ObjectHolder(NameRegistry.MOD_PREFIX + NameRegistry.BLOCKNAME_RUNESTONE)
	public static BlockRunestone runestone;

	 @SideOnly(Side.CLIENT)
	    public static void initModels() {
	        runestone.initModel();
	    }
}