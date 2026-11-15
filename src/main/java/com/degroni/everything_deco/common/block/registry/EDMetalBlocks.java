package com.degroni.everything_deco.common.block.registry;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.degroni.everything_deco.common.block.properties.EDBlockProperties.*;

public class EDMetalBlocks {
    public static final DeferredRegister.Blocks METALBLOCK = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<Block> CUT_IRON = registerMetalBlock(
            "cut_iron",
            () -> new Block(ironProperties()));
    public static final DeferredBlock<StairBlock> CUT_IRON_STAIRS = registerMetalBlock(
            "cut_iron_stairs",
            () -> new StairBlock(EDMetalBlocks.CUT_IRON.get().defaultBlockState(),ironProperties()));
    public static final DeferredBlock<SlabBlock> CUT_IRON_SLAB = registerMetalBlock(
            "cut_iron_slab",
            () -> new SlabBlock(ironProperties()));
    public static final DeferredBlock<Block> CHISELED_IRON = registerMetalBlock(
            "chiseled_iron",
            () -> new Block(ironProperties()));


    public static final DeferredBlock<Block> TIN_BLOCK = registerMetalBlock(
            "tin_block",
            () ->new Block(tinProperties()));
    public static final DeferredBlock<Block> CUT_TIN = registerMetalBlock(
            "cut_tin",
            () -> new Block(tinProperties()));
    public static final DeferredBlock<StairBlock> CUT_TIN_STAIRS = registerMetalBlock(
            "cut_tin_stairs",
            () -> new StairBlock(EDMetalBlocks.CUT_TIN.get().defaultBlockState(), tinProperties()));
    public static final DeferredBlock<SlabBlock> CUT_TIN_SLAB = registerMetalBlock(
            "cut_tin_slab",
            () -> new SlabBlock(tinProperties()));
    public static final DeferredBlock<Block> CHISELED_TIN = registerMetalBlock(
            "chiseled_tin",
            () -> new Block(tinProperties()));


    public static final DeferredBlock<Block> BRONZE_BLOCK = registerMetalBlock(
            "bronze_block",
            () -> new Block(bronzeProperties()));
    public static final DeferredBlock<Block> CUT_BRONZE = registerMetalBlock(
            "cut_bronze",
            () -> new Block(bronzeProperties()));
    public static final DeferredBlock<StairBlock> CUT_BRONZE_STAIRS = registerMetalBlock(
            "cut_bronze_stairs",
            () -> new StairBlock(EDMetalBlocks.CUT_BRONZE.get().defaultBlockState(), bronzeProperties()));
    public static final DeferredBlock<SlabBlock> CUT_BRONZE_SLAB = registerMetalBlock(
            "cut_bronze_slab",
            () -> new SlabBlock(bronzeProperties()));
    public static final DeferredBlock<Block> CHISELED_BRONZE = registerMetalBlock(
            "chiseled_bronze",
            () -> new Block(bronzeProperties()));




    private static <T extends Block> DeferredBlock<T> registerMetalBlock(String name, Supplier<T> block) {
            DeferredBlock<T> toReturn = METALBLOCK.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EDModItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        METALBLOCK.register(eventBus);
    }
}
