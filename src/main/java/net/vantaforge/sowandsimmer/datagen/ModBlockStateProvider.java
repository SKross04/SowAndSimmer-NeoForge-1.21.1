package net.vantaforge.sowandsimmer.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.vantaforge.sowandsimmer.SowAndSimmer;
import net.vantaforge.sowandsimmer.block.ModBlocks;
import net.vantaforge.sowandsimmer.block.custom.OnionCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SowAndSimmer.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    makeCrop(((OnionCropBlock) ModBlocks.ONION_CROP.get()), "onion_crop_stage_", "onion_crop_stage_");
    makeCrop(((OnionCropBlock) ModBlocks.RED_ONION_CROP.get()), "red_onion_crop_stage_", "red_onion_crop_stage_");
    makeCrop(((OnionCropBlock) ModBlocks.GARLIC_CROP.get()), "garlic_crop_stage_", "garlic_crop_stage_");


    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((OnionCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(SowAndSimmer.MOD_ID, "block/" + textureName +
                        state.getValue(((OnionCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),cubeAll(deferredBlock.get()));
    }
}
