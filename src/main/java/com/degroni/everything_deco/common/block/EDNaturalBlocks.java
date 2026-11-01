package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.helper.EDMudBlock;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDNaturalBlocks {
    public static final DeferredRegister.Blocks NATURALBLOCK = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

//    public static final DeferredBlock<Block> LIGHT_MUD = registerBlock(
//            "light_mud",
//            () -> new MudBlock(BlockBehaviour.Properties.ofLegacyCopy(EDNaturalBlocks.MUD.get())
//                    .mapColor(MapColor.TERRACOTTA_CYAN)
//                    .isValidSpawn(EDNaturalBlocks::always)
//                    .isRedstoneConductor(EDNaturalBlocks::always)
//                    .isViewBlocking(EDNaturalBlocks::always)
//                    .isSuffocating(EDNaturalBlocks::always)
//                    .sound(SoundType.MUD)));
//    public static final DeferredBlock<Block> MUD = registerBlock(
//            "mud",
//            () -> new MudBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.MUD)
//                    .mapColor(MapColor.TERRACOTTA_CYAN)
//                    .isValidSpawn(EDNaturalBlocks::always)
//                    .isRedstoneConductor(EDNaturalBlocks::always)
//                    .isViewBlocking(EDNaturalBlocks::always)
//                    .isSuffocating(EDNaturalBlocks::always)
//                    .sound(SoundType.MUD)));

//    public static final DeferredBlock<Block> LIGHT_MUD = registerBlock(
//            "light_mud",
//            () -> new MudBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD)));
//    public static final DeferredBlock<Block> MUD = registerBlock(
//            "mud",
//            () -> new MudBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.MUD)));


//    public static final DeferredBlock<Block> LIGHT_MUD = registerBlock(
//            "light_mud",
//            () -> new EDMudBlock(mudProperties(MapColor.TERRACOTTA_CYAN), () -> null)
//    );

    public static final DeferredBlock<Block> MUD = registerBlock(
            "mud",
            () -> new EDMudBlock(mudProperties(MapColor.COLOR_BROWN), () -> Blocks.MUD));
    public static final DeferredBlock<Block> LIGHT_MUD = registerBlock(
            "light_mud",
            () -> new EDMudBlock(mudProperties(MapColor.COLOR_BROWN), MUD));
    public static final DeferredBlock<Block> BLANCHED_NYLIUM = registerBlock(
            "blanched_nylium",
            () -> new NyliumBlock(nyliumProperties(MapColor.COLOR_CYAN)));
    public static final DeferredBlock<Block> TIN_ORE = registerBlock(
            "tin_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 3.0F)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock(
            "deepslate_tin_ore",
            () -> new DropExperienceBlock(ConstantInt.of(0),
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.STONE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresCorrectToolForDrops()
                            .strength(4.2F, 4.2F)));


    private static BlockBehaviour.Properties mudProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .strength(0.5F, 0.5F)
                .sound(SoundType.MUD)
                .isValidSpawn(EDNaturalBlocks::always)
                .isRedstoneConductor(EDNaturalBlocks::always)
                .isViewBlocking(EDNaturalBlocks::always)
                .isSuffocating(EDNaturalBlocks::always);
    }
    private static BlockBehaviour.Properties nyliumProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.4F)
                .sound(SoundType.NYLIUM)
                .randomTicks();
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = NATURALBLOCK.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EDModItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static boolean always(BlockState state, BlockGetter level, BlockPos pos) {
        return true;
    }

    private static boolean always(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return true;
    }

    public static void register(IEventBus eventBus) {
        NATURALBLOCK.register(eventBus);
    }
}
