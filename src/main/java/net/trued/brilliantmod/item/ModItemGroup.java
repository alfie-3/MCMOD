package net.trued.brilliantmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.trued.brilliantmod.BrilliantMod;

public class ModItemGroup {
	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.SILLYIUM))
		.name(Text.literal("Items"))
		.build();

	public static void registerModItemGroups(){
		Registry.register(Registries.ITEM_GROUP, new Identifier(BrilliantMod.MOD_ID, "items"), ITEM_GROUP);}

	public  static  void registerItemGroup(Item item, String itemGroup){
	ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BrilliantMod.MOD_ID, itemGroup))).register(content ->
		content.addItem(item)
		);
	}
}

