package net.trued.brilliantmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.trued.brilliantmod.block.ModBlocks;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
	protected ModLootTableGenerator(FabricDataOutput dataOutput) {
		super(dataOutput);
	}

	@Override
	public void generate() {
		addDrop(ModBlocks.SILLYIUM_BLOCK);
	}
}
