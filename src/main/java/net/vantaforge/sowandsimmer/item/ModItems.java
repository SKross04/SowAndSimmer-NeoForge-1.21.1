package net.vantaforge.sowandsimmer.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vantaforge.sowandsimmer.SowAndSimmer;
import net.vantaforge.sowandsimmer.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SowAndSimmer.MOD_ID);

    public static final DeferredItem<Item> ONION = ITEMS.registerItem("onion", Item::new, new Item.Properties().food(ModFoodProperties.ONION));
    public static final DeferredItem<Item> RED_ONION = ITEMS.registerItem("red_onion", Item::new, new Item.Properties().food(ModFoodProperties.ONION));
    public static final DeferredItem<Item> GARLIC = ITEMS.registerItem("garlic", Item::new, new Item.Properties());
    public static final DeferredItem<Item> DICED_RED_ONION = ITEMS.registerItem("diced_red_onion", Item::new, new Item.Properties());
    public static final DeferredItem<Item> DICED_ONION = ITEMS.registerItem("diced_onion", Item::new, new Item.Properties());

    public static final DeferredItem<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ONION_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> RED_ONION_SEEDS = ITEMS.register("red_onion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RED_ONION_CROP.get(), new Item.Properties()));
    public static final DeferredItem<Item> GARLIC_CLOVE = ITEMS.register("garlic_clove",
            () -> new ItemNameBlockItem(ModBlocks.GARLIC_CROP.get(), new Item.Properties().food(ModFoodProperties.GARLIC_CLOVE)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
