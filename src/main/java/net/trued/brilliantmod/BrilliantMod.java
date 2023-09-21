package net.trued.brilliantmod;

import net.trued.brilliantmod.block.ModBlocks;
import net.trued.brilliantmod.item.ModItemGroup;
import net.trued.brilliantmod.item.ModItems;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrilliantMod implements ModInitializer {
	public static final String MOD_ID = "brilliant_mod";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(ModContainer mod) {
		ModBlocks.reigsterModBlocks();
		ModItems.registerModItems();
	}
}
