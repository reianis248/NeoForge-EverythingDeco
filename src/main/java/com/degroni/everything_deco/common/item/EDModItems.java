package com.degroni.everything_deco.common.item;

import com.degroni.everything_deco.EverythingDeco;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EDModItems {
    public static final DeferredRegister.Items ITEM = DeferredRegister.createItems(EverythingDeco.MOD_ID);

    public static final DeferredItem<Item> BRONZE_DOOR = ITEM.register("bronze_door",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WHITE_SALT = ITEM.register("white_salt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINK_SALT = ITEM.register("pink_salt",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEM.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BRONZE_INGOT = ITEM.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEM.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CAST_IRON_INGOT = ITEM.register("cast_iron_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEM.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SINISTEEL_INGOT = ITEM.register("sinisteel_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_SHEET = ITEM.register("copper_sheet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_SHEET = ITEM.register("gold_sheet",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_SHEET = ITEM.register("iron_sheet",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEM.register(eventBus);
    }
}
