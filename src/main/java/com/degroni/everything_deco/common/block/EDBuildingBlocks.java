package com.degroni.everything_deco.common.block;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EDBuildingBlocks {
    public static final DeferredRegister.Blocks BUILDINGBLOCK = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = registerBlock(
            "example_block",
            () -> new Block(BlockBehaviour.Properties.of()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
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
