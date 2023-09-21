package net.trued.brilliantmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import net.trued.brilliantmod.block.ModBlocks;
import net.trued.brilliantmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SILLYIUM_BLOCK);
	}

	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
	itemModelGenerator.register(ModItems.SILLYIUM, Models.HANDHELD);
	itemModelGenerator.register(ModItems.SILLYIUM_SWORD, Models.HANDHELD);
	itemModelGenerator.register(ModItems.SILLYIUM_HAMMER, Models.HANDHELD);
	}
}
