package com.degroni.everything_deco.common.datagen;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.datagen.dataprovider.*;
import com.degroni.everything_deco.common.datagen.dataprovider.lang.EDLanguageProviderEnglish;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = EverythingDeco.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(EDBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        BlockTagsProvider blockTagsProvider = new EDBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new EDItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeServer(), new EDLanguageProviderEnglish(packOutput, "en_us"));

//        generator.addProvider(event.includeServer(), new EDDataMapProvider(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new EDItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new EDBlockStateProvider(packOutput, existingFileHelper));

//        generator.addProvider(event.includeServer(), new EDDatapackProvider(packOutput, lookupProvider));
    }
}
