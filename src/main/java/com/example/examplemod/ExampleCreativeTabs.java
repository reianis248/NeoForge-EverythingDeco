package com.example.examplemod;

import com.example.examplemod.block.ExampleBlocks;
import com.example.examplemod.item.ExampleItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ExampleCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    public static final Supplier<CreativeModeTab> EXAMPLE_MOD = CREATIVE_MODE_TABS.register("examplemod",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.examplemod"))
                    .icon(() -> new ItemStack(ExampleItems.EXAMPLE_ITEM.get()))
                    .displayItems(((parameters, output) -> {
                        output.accept(ExampleItems.EXAMPLE_ITEM.get());
                        output.accept(ExampleBlocks.EXAMPLE_BLOCK.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
