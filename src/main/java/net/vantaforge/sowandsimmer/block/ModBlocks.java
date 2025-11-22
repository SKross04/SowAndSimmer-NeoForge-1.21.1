package net.vantaforge.sowandsimmer.block;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.vantaforge.sowandsimmer.SowAndSimmer;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SowAndSimmer.MOD_ID);


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
