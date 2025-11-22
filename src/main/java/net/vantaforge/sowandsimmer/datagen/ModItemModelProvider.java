package net.vantaforge.sowandsimmer.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.vantaforge.sowandsimmer.SowAndSimmer;
import net.vantaforge.sowandsimmer.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SowAndSimmer.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ONION.get());
        basicItem(ModItems.GARLIC.get());
        basicItem(ModItems.GARLIC_CLOVE.get());
    }
}
