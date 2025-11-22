package net.vantaforge.sowandsimmer.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vantaforge.sowandsimmer.SowAndSimmer;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SowAndSimmer.MOD_ID);

    public static final Supplier<CreativeModeTab> SOW_AND_SIMMER_ITEMS_TAB =
            CREATIVE_MODE_TABS.register("sow_and_simmer_items_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.sowandsimmer.sow_and_simmer_items_tab"))
                    .icon(() -> new ItemStack(ModItems.ONION.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ONION);
                        output.accept(ModItems.GARLIC);
                        output.accept(ModItems.GARLIC_CLOVE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
