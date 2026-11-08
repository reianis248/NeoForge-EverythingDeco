package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDMetalBlocks {
    public static final DeferredRegister.Blocks METALBLOCK = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<Block> CUT_IRON = registerMetalBlock("cut_iron",
            () -> new Block(ironProperties(MapColor.METAL)));
    public static final DeferredBlock<StairBlock> CUT_IRON_STAIRS = registerMetalBlock("cut_iron_stairs",
            () -> new StairBlock(EDMetalBlocks.CUT_IRON.get().defaultBlockState(), ironProperties(MapColor.METAL)));
    public static final DeferredBlock<SlabBlock> CUT_IRON_SLAB = registerMetalBlock("cut_iron_slab",
            () -> new SlabBlock(ironProperties(MapColor.METAL)));

    public static final DeferredBlock<Block> CHISELED_IRON = registerMetalBlock("chiseled_iron",
            () -> new Block(ironProperties(MapColor.METAL)));


    public static final DeferredBlock<Block> TIN_BLOCK = registerMetalBlock("tin_block",
            () -> new Block(tinProperties(MapColor.METAL)));

    public static final DeferredBlock<Block> CUT_TIN = registerMetalBlock("cut_tin",
            () -> new Block(tinProperties(MapColor.METAL)));
    public static final DeferredBlock<StairBlock> CUT_TIN_STAIRS = registerMetalBlock("cut_tin_stairs",
            () -> new StairBlock(EDMetalBlocks.CUT_TIN.get().defaultBlockState(), tinProperties(MapColor.METAL)));
    public static final DeferredBlock<SlabBlock> CUT_TIN_SLAB = registerMetalBlock("cut_tin_slab",
            () -> new SlabBlock(tinProperties(MapColor.METAL)));

    public static final DeferredBlock<Block> CHISELED_TIN = registerMetalBlock("chiseled_tin",
            () -> new Block(tinProperties(MapColor.METAL)));


    public static final DeferredBlock<Block> BRONZE_BLOCK = registerMetalBlock("bronze_block",
            () -> new Block(bronzeProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> CUT_BRONZE = registerMetalBlock("cut_bronze",
            () -> new Block(bronzeProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<StairBlock> CUT_BRONZE_STAIRS = registerMetalBlock("cut_bronze_stairs",
            () -> new StairBlock(EDMetalBlocks.CUT_BRONZE.get().defaultBlockState(), bronzeProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<SlabBlock> CUT_BRONZE_SLAB = registerMetalBlock("cut_bronze_slab",
            () -> new SlabBlock(bronzeProperties(MapColor.COLOR_BROWN)));
    public static final DeferredBlock<Block> CHISELED_BRONZE = registerMetalBlock("chiseled_bronze",
            () -> new Block(bronzeProperties(MapColor.COLOR_BROWN)));



    private static BlockBehaviour.Properties calciteMetalProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .sound(SoundType.CALCITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.75F);
    }
    private static BlockBehaviour.Properties ironProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL);
    }
    private static BlockBehaviour.Properties tinProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL);
    }
    private static BlockBehaviour.Properties bronzeProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.METAL);
    }

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
