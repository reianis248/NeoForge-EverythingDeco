package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.EDBuildingBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EDBlockTagProvider extends BlockTagsProvider {
    public EDBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EverythingDeco.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.LOGS_THAT_BURN)
                .add(EDBuildingBlocks.SMALL_OAK_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG.get())
                .add(EDBuildingBlocks.SMALL_SPRUCE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG.get())
                .add(EDBuildingBlocks.SMALL_BIRCH_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG.get())
                .add(EDBuildingBlocks.SMALL_JUNGLE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG.get())
                .add(EDBuildingBlocks.SMALL_ACACIA_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG.get())
                .add(EDBuildingBlocks.SMALL_DARK_OAK_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG.get())
                .add(EDBuildingBlocks.SMALL_MANGROVE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG.get())
                .add(EDBuildingBlocks.SMALL_CHERRY_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG.get())
                .add(EDBuildingBlocks.SMALL_CACTUS.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EDBuildingBlocks.SMALL_OAK_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG.get())
                .add(EDBuildingBlocks.SMALL_SPRUCE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG.get())
                .add(EDBuildingBlocks.SMALL_BIRCH_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG.get())
                .add(EDBuildingBlocks.SMALL_JUNGLE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG.get())
                .add(EDBuildingBlocks.SMALL_ACACIA_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG.get())
                .add(EDBuildingBlocks.SMALL_DARK_OAK_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG.get())
                .add(EDBuildingBlocks.SMALL_MANGROVE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG.get())
                .add(EDBuildingBlocks.SMALL_CHERRY_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG.get())
                .add(EDBuildingBlocks.SMALL_CACTUS.get());

//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(CampedBaitCrate.STONE_BAIT_CRATE.get());

        tag(BlockTags.WALLS)
                .add(EDBuildingBlocks.SMALL_OAK_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG.get())
                .add(EDBuildingBlocks.SMALL_SPRUCE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG.get())
                .add(EDBuildingBlocks.SMALL_BIRCH_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG.get())
                .add(EDBuildingBlocks.SMALL_JUNGLE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG.get())
                .add(EDBuildingBlocks.SMALL_ACACIA_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG.get())
                .add(EDBuildingBlocks.SMALL_DARK_OAK_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG.get())
                .add(EDBuildingBlocks.SMALL_MANGROVE_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG.get())
                .add(EDBuildingBlocks.SMALL_CHERRY_LOG.get())
                .add(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG.get())
                .add(EDBuildingBlocks.SMALL_CACTUS.get());
    }
}
