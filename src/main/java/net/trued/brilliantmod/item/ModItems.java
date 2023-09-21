package net.trued.brilliantmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trued.brilliantmod.BrilliantMod;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	//Ingredients
	public static final Item SILLYIUM = registerItem("sillyium", new Item(new QuiltItemSettings()), "items");

	//Tools
	public static final Item SILLYIUM_SWORD = registerItem("sillyium_sword", new Item(new QuiltItemSettings()), "items");
	public static final Item SILLYIUM_HAMMER = registerItem("sillyium_hammer", new PickaxeItem(ModToolMaterials.SILLYIUM, 4, 2, new QuiltItemSettings()), "items");

	private static Item registerItem(String name, Item item, String group) {
		Item registeredItem = Registry.register(Registries.ITEM, new Identifier(BrilliantMod.MOD_ID, name), item);
		ModItemGroup.registerItemGroup(item, group);
		return registeredItem;
	}

	public static  void registerModItems(){
		BrilliantMod.LOGGER.info("Registering Items");
	}
}
