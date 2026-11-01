package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDBuildingBlocks {
    public static final DeferredRegister.Blocks BUILDINGBLOCK = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<StairBlock> RIVERSTONE_STAIRS = registerBuildingBlock(
            "riverstone_stairs",
            () -> new StairBlock(EDStoneBlocks.RIVERSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .sound(SoundType.CALCITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(0.75F)));
    public static final DeferredBlock<SlabBlock> RIVERSTONE_SLAB = registerBuildingBlock(
            "riverstone_slab",
            () -> new SlabBlock(calciteStoneProperties(MapColor.TERRACOTTA_WHITE)));


    public static final DeferredBlock<StairBlock> DARK_RIVERSTONE_STAIRS = registerBuildingBlock(
            "dark_riverstone_stairs",
            () -> new StairBlock(EDStoneBlocks.DARK_RIVERSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_BLACK)
                            .sound(SoundType.CALCITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(0.75F)));
    public static final DeferredBlock<SlabBlock> DARK_RIVERSTONE_SLAB = registerBuildingBlock(
            "dark_riverstone_slab",
            () -> new SlabBlock(calciteStoneProperties(MapColor.TERRACOTTA_BLACK)));


    public static final DeferredBlock<StairBlock> WETSTONE_STAIRS = registerBuildingBlock(
            "wetstone_stairs",
            () -> new StairBlock(EDStoneBlocks.WETSTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .sound(SoundType.CALCITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(0.75F)));
    public static final DeferredBlock<SlabBlock> WETSTONE_SLAB = registerBuildingBlock(
            "wetstone_slab",
            () -> new SlabBlock(calciteStoneProperties(MapColor.TERRACOTTA_GRAY)));



    private static BlockBehaviour.Properties calciteStoneProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .sound(SoundType.CALCITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.75F);
    }

    private static <T extends Block> DeferredBlock<T> registerBuildingBlock(String name, Supplier<T> block) {
            DeferredBlock<T> toReturn = BUILDINGBLOCK.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EDModItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BUILDINGBLOCK.register(eventBus);
    }
}
