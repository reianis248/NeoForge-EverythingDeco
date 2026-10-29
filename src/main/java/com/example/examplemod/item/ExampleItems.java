package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ExampleItems {
    public static final DeferredRegister.Items ITEM = DeferredRegister.createItems(ExampleMod.MOD_ID);

    public static final DeferredItem<Item> EXAMPLE_ITEM = ITEM.register(
            "example_item",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
