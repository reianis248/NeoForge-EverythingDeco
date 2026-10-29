package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MudBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDNaturalBlocks {
    public static final DeferredRegister.Blocks NATURALBLOCK = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<Block> LIGHT_MUD = registerBlock(
            "light_mud",
            () -> new MudBlock(BlockBehaviour.Properties.ofLegacyCopy(Blocks.MUD)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .isValidSpawn(EDNaturalBlocks::always)
                    .isRedstoneConductor(EDNaturalBlocks::always)
                    .isViewBlocking(EDNaturalBlocks::always)
                    .isSuffocating(EDNaturalBlocks::always)
                    .sound(SoundType.MUD)));


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
