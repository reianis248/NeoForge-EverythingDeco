package com.degroni.everything_deco.common.util;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.*;
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
                        output.accept(EDNaturalBlocks.BLANCHED_NYLIUM.get());
                        output.accept(EDNaturalBlocks.LIGHT_MUD.get());
                        output.accept(EDNaturalBlocks.MUD.get());
                        output.accept(EDWalls.SMALL_OAK_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_OAK_LOG.get());
                        output.accept(EDWalls.SMALL_SPRUCE_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get());
                        output.accept(EDWalls.SMALL_BIRCH_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get());
                        output.accept(EDWalls.SMALL_JUNGLE_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get());
                        output.accept(EDWalls.SMALL_ACACIA_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get());
                        output.accept(EDWalls.SMALL_DARK_OAK_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get());
                        output.accept(EDWalls.SMALL_MANGROVE_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get());
                        output.accept(EDWalls.SMALL_CHERRY_LOG.get());
                        output.accept(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get());
                        output.accept(EDWalls.SMALL_CACTUS.get());
                        output.accept(EDNaturalBlocks.TIN_ORE.get());
                        output.accept(EDNaturalBlocks.DEEPSLATE_TIN_ORE.get());

                        /* BLOCKS */
                        output.accept(EDMetalBlocks.CUT_IRON.get());
                        output.accept(EDMetalBlocks.CHISELED_IRON.get());
                        output.accept(EDMetalBlocks.CUT_TIN.get());
                        output.accept(EDMetalBlocks.CHISELED_TIN.get());

                        output.accept(EDStoneBlocks.RIVERSTONE.get());
                        output.accept(EDBuildingBlocks.RIVERSTONE_STAIRS.get());
                        output.accept(EDBuildingBlocks.RIVERSTONE_SLAB.get());
                        output.accept(EDWalls.RIVERSTONE_WALL.get());

                        output.accept(EDStoneBlocks.DARK_RIVERSTONE.get());
                        output.accept(EDBuildingBlocks.DARK_RIVERSTONE_STAIRS.get());
                        output.accept(EDBuildingBlocks.DARK_RIVERSTONE_SLAB.get());
                        output.accept(EDWalls.DARK_RIVERSTONE_WALL.get());

                        output.accept(EDStoneBlocks.WETSTONE.get());
                        output.accept(EDBuildingBlocks.WETSTONE_STAIRS.get());
                        output.accept(EDBuildingBlocks.WETSTONE_SLAB.get());
                        output.accept(EDWalls.WETSTONE_WALL.get());

                        /* ITEMS */

                        output.accept(EDModItems.WHITE_SALT.get());
                        output.accept(EDModItems.PINK_SALT.get());
                        output.accept(EDModItems.RAW_TIN.get());
                        output.accept(EDModItems.TIN_INGOT.get());
                        output.accept(EDModItems.BRONZE_INGOT.get());
                        output.accept(EDModItems.CAST_IRON_INGOT.get());
                        output.accept(EDModItems.STEEL_INGOT.get());
                        output.accept(EDModItems.SINISTEEL_INGOT.get());
                        output.accept(EDModItems.COPPER_SHEET.get());
                        output.accept(EDModItems.GOLD_SHEET.get());
                        output.accept(EDModItems.IRON_SHEET.get());
                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
