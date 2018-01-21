package mod.runeology;

import java.io.File;

import mod.runeology.blocks.BlockRunestone;
import mod.runeology.registers.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "runeology.cfg"));
        Config.readConfig();
	}

	public void init(FMLInitializationEvent e) {
	}

	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged()) {
            config.save();
        }
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		  event.getRegistry().register(new BlockRunestone());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		   event.getRegistry().register(new ItemBlock(BlockRegister.runestone).setRegistryName(BlockRegister.runestone.getRegistryName()));
	}
}