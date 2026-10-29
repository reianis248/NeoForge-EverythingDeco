package com.degroni.everything_deco.common.util;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.EDNaturalBlocks;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EverythingDecoCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EverythingDeco.MOD_ID);

    public static final Supplier<CreativeModeTab> EVERYTHING_DECO = CREATIVE_MODE_TABS.register("everything_deco",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.everything_deco"))
                    .icon(() -> new ItemStack(EDNaturalBlocks.LIGHT_MUD.get()))
                    .displayItems(((parameters, output) -> {
                        output.accept(EDModItems.EXAMPLE_ITEM.get());
                        output.accept(EDNaturalBlocks.LIGHT_MUD.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
