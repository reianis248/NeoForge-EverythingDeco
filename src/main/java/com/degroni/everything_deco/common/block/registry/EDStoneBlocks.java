package com.degroni.everything_deco.common.block.registry;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.properties.EDMapColor;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.degroni.everything_deco.common.block.properties.EDBlockProperties.calciteStoneProperties;

public class EDStoneBlocks {
    public static final DeferredRegister.Blocks STONE = DeferredRegister.createBlocks(EverythingDeco.MOD_ID);

    public static final DeferredBlock<Block> RIVERSTONE = registerStoneBlock("riverstone",
            () -> new Block(calciteStoneProperties(EDMapColor.RIVERSTONE)));
    public static final DeferredBlock<Block> DARK_RIVERSTONE = registerStoneBlock("dark_riverstone",
            () -> new Block(calciteStoneProperties(EDMapColor.DARKSTONE)));
    public static final DeferredBlock<Block> WETSTONE = registerStoneBlock("wetstone",
            () -> new Block(calciteStoneProperties(EDMapColor.DARKSTONE)));


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
