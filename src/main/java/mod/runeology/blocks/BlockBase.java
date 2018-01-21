package mod.runeology.blocks;

import mod.runeology.Logging;
import mod.runeology.NameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block {

	public BlockBase(String name) {
		this(Material.ROCK, name, null, 2);
	}

	public BlockBase(Material material, String name) {
		this(material, name, null, 2);

	}

	public BlockBase(Material material, String name, Class<? extends ItemBlock> itemclass, float hardness) {
		super(material);
		setUnlocalizedName(String.format("%s.%s", NameRegistry.MODID, name));
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);

		setSoundType(SoundType.STONE);
		setHardness(hardness);
		Logging.devLog("created block: " + getUnlocalizedName());
	}

	 @SideOnly(Side.CLIENT)
	 public void initModel() {
		 ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	 }

	// private ItemBlock createItemBlock(Class<? extends ItemBlock> itemBlockClass)
	// {
	// try {
	// Class<?>[] ctorArgClasses = new Class<?>[1];
	// ctorArgClasses[0] = Block.class;
	// Constructor<? extends ItemBlock> itemCtor =
	// itemBlockClass.getConstructor(ctorArgClasses);
	// return itemCtor.newInstance(this);
	// } catch (NoSuchMethodException | InstantiationException |
	// IllegalAccessException
	// | InvocationTargetException e) {
	// throw new RuntimeException(e);
	// }
	// }
	//
	// public boolean isBlockPowered(World worldIn, BlockPos pos) {
	// return worldIn.isBlockIndirectlyGettingPowered(pos) > 0 ||
	// worldIn.isBlockPowered(pos);
	// }

}
