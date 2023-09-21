package net.trued.brilliantmod.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trued.brilliantmod.BrilliantMod;
import net.trued.brilliantmod.item.ModItemGroup;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModBlocks {
	public static final Block SILLYIUM_BLOCK = registerBlock("sillyium_block",
		new Block(QuiltBlockSettings.create()
			.strength(2, 3)
			.requiresTool()),
			"items");


	public static  Block registerBlock(String name, Block block, String group){
		registerBlockItem(name, block, group);
		return Registry.register(Registries.BLOCK, new Identifier(BrilliantMod.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, String group) {
		Item item = Registry.register(Registries.ITEM, new Identifier(BrilliantMod.MOD_ID, name),
		new BlockItem(block, new QuiltItemSettings()));
		ModItemGroup.registerItemGroup(item, group);
		return item;
	}

	public  static void reigsterModBlocks() {
	BrilliantMod.LOGGER.info("Registering Blocks");
	}
}
