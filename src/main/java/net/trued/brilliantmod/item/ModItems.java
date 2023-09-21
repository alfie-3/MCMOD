package net.trued.brilliantmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trued.brilliantmod.BrilliantMod;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItems {

	public static final Item SILLYIUM = new Item(
		new QuiltItemSettings()
	);

	public static void RegisterItems() {
		Registry.register(Registries.ITEM, new Identifier(BrilliantMod.MOD_ID, "sillyium"), SILLYIUM);
		ModItemGroup.registerItemGroup(SILLYIUM, "items");
	}
}
