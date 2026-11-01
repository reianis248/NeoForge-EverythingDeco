package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDStoneBlocks {
    public static final DeferredRegister.Blocks STONE = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<Block> RIVERSTONE = registerStoneBlock(
            "riverstone",
            () -> new Block(calciteStoneProperties(MapColor.TERRACOTTA_WHITE)));
    public static final DeferredBlock<Block> DARK_RIVERSTONE = registerStoneBlock(
            "dark_riverstone",
            () -> new Block(calciteStoneProperties(MapColor.TERRACOTTA_BLACK)));
    public static final DeferredBlock<Block> WETSTONE = registerStoneBlock(
            "wetstone",
            () -> new Block(calciteStoneProperties(MapColor.TERRACOTTA_GRAY)));


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

    private static <T extends Block> DeferredBlock<T> registerStoneBlock(String name, Supplier<T> block) {
            DeferredBlock<T> toReturn = STONE.register(name, block);
            registerBlockItem(name, toReturn);
            return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        EDModItems.ITEM.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        STONE.register(eventBus);
    }
}
