package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.helper.EDWallBlock;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDWalls {
    public static final DeferredRegister.Blocks WALL = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    /* Walls */
    public static final DeferredBlock<EDWallBlock> SMALL_OAK_LOG = registerWallBlock(
            "small_oak_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_OAK_LOG = registerWallBlock(
            "stripped_small_oak_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_SPRUCE_LOG = registerWallBlock(
            "small_spruce_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_SPRUCE_LOG = registerWallBlock(
            "stripped_small_spruce_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_BIRCH_LOG = registerWallBlock(
            "small_birch_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_BIRCH_LOG = registerWallBlock(
            "stripped_small_birch_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_JUNGLE_LOG = registerWallBlock(
            "small_jungle_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_JUNGLE_LOG = registerWallBlock(
            "stripped_small_jungle_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_ACACIA_LOG = registerWallBlock(
            "small_acacia_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_ACACIA_LOG = registerWallBlock(
            "stripped_small_acacia_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_DARK_OAK_LOG = registerWallBlock(
            "small_dark_oak_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_DARK_OAK_LOG = registerWallBlock(
            "stripped_small_dark_oak_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_MANGROVE_LOG = registerWallBlock(
            "small_mangrove_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_MANGROVE_LOG = registerWallBlock(
            "stripped_small_mangrove_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<EDWallBlock> SMALL_CHERRY_LOG = registerWallBlock(
            "small_cherry_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));
    public static final DeferredBlock<EDWallBlock> STRIPPED_SMALL_CHERRY_LOG = registerWallBlock(
            "stripped_small_cherry_log",
            () -> new EDWallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PODZOL)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(2.0F)
                    .sound(SoundType.WOOD)
                    .ignitedByLava()));

    public static final DeferredBlock<WallBlock> SMALL_CACTUS = registerWallBlock(
            "small_cactus",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .strength(0.4F)
                    .sound(SoundType.WOOL)));

    public static final DeferredBlock<WallBlock> RIVERSTONE_WALL = registerWallBlock(
            "riverstone_wall",
            () -> new WallBlock(calciteStoneProperties(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<WallBlock> DARK_RIVERSTONE_WALL = registerWallBlock(
            "dark_riverstone_wall",
            () -> new WallBlock(calciteStoneProperties(MapColor.TERRACOTTA_BLACK)));
    public static final DeferredBlock<WallBlock> WETSTONE_WALL = registerWallBlock(
            "wetstone_wall",
            () -> new WallBlock(calciteStoneProperties(MapColor.TERRACOTTA_GRAY)));

//    public static final DeferredBlock<WallBlock> RIVERSTONE_WALL = registerWallBlock(
//            "riverstone_wall",
//            () -> new WallBlock(BlockBehaviour.Properties.of()
//                    .mapColor(MapColor.TERRACOTTA_WHITE)
//                    .sound(SoundType.STONE)
//                    .instrument(NoteBlockInstrument.BASEDRUM)
//                    .requiresCorrectToolForDrops()
//                    .strength(1.5F, 6.0F)));


    private static BlockBehaviour.Properties stoneProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .sound(SoundType.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F);
    }
    private static BlockBehaviour.Properties calciteStoneProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .sound(SoundType.CALCITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.75F);
    }

    private static <T extends Block> DeferredBlock<T> registerWallBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = WALL.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EDModItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        WALL.register(eventBus);
    }
}
