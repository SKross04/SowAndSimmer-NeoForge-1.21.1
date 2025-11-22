package net.vantaforge.sowandsimmer.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vantaforge.sowandsimmer.SowAndSimmer;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SowAndSimmer.MOD_ID);

    public static final DeferredItem<Item> ONION = ITEMS.registerItem("onion", Item::new, new Item.Properties().food(ModFoodProperties.ONION));
    public static final DeferredItem<Item> GARLIC_CLOVE = ITEMS.registerItem("garlic_clove", Item::new, new Item.Properties().food(ModFoodProperties.GARLIC_CLOVE));
    public static final DeferredItem<Item> GARLIC = ITEMS.registerItem("garlic", Item::new, new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
