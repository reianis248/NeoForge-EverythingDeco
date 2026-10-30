package com.degroni.everything_deco.common.util;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.EDBuildingBlocks;
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
                        output.accept(EDNaturalBlocks.MUD.get());
                        output.accept(EDBuildingBlocks.SMALL_OAK_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_SPRUCE_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_BIRCH_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_JUNGLE_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_ACACIA_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_DARK_OAK_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_MANGROVE_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_CHERRY_LOG.get());
                        output.accept(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG.get());
                        output.accept(EDBuildingBlocks.SMALL_CACTUS.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
