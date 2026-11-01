package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.*;
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
        tag(BlockTags.NYLIUM)
                .add(EDNaturalBlocks.BLANCHED_NYLIUM.get());

        tag(BlockTags.LOGS_THAT_BURN)
                .add(EDWalls.SMALL_OAK_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_OAK_LOG.get())
                .add(EDWalls.SMALL_SPRUCE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get())
                .add(EDWalls.SMALL_BIRCH_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get())
                .add(EDWalls.SMALL_JUNGLE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get())
                .add(EDWalls.SMALL_ACACIA_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get())
                .add(EDWalls.SMALL_DARK_OAK_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get())
                .add(EDWalls.SMALL_MANGROVE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get())
                .add(EDWalls.SMALL_CHERRY_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get())
                .add(EDWalls.SMALL_CACTUS.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(EDWalls.SMALL_OAK_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_OAK_LOG.get())
                .add(EDWalls.SMALL_SPRUCE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get())
                .add(EDWalls.SMALL_BIRCH_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get())
                .add(EDWalls.SMALL_JUNGLE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get())
                .add(EDWalls.SMALL_ACACIA_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get())
                .add(EDWalls.SMALL_DARK_OAK_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get())
                .add(EDWalls.SMALL_MANGROVE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get())
                .add(EDWalls.SMALL_CHERRY_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get())
                .add(EDWalls.SMALL_CACTUS.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(EDStoneBlocks.RIVERSTONE.get())
                .add(EDBuildingBlocks.RIVERSTONE_STAIRS.get())
                .add(EDBuildingBlocks.RIVERSTONE_SLAB.get())
                .add(EDWalls.RIVERSTONE_WALL.get())

                .add(EDStoneBlocks.DARK_RIVERSTONE.get())
                .add(EDBuildingBlocks.DARK_RIVERSTONE_STAIRS.get())
                .add(EDBuildingBlocks.DARK_RIVERSTONE_SLAB.get())
                .add(EDWalls.DARK_RIVERSTONE_WALL.get())

                .add(EDStoneBlocks.WETSTONE.get())
                .add(EDBuildingBlocks.WETSTONE_STAIRS.get())
                .add(EDBuildingBlocks.WETSTONE_SLAB.get())
                .add(EDWalls.WETSTONE_WALL.get())

                .add(EDNaturalBlocks.TIN_ORE.get())
                .add(EDNaturalBlocks.DEEPSLATE_TIN_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(EDMetalBlocks.CUT_IRON.get())
                .add(EDMetalBlocks.CHISELED_IRON.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(EDNaturalBlocks.TIN_ORE.get())
                .add(EDNaturalBlocks.DEEPSLATE_TIN_ORE.get())
                .add(EDMetalBlocks.TIN_BLOCK.get())
                .add(EDMetalBlocks.CUT_TIN.get())
                .add(EDMetalBlocks.CHISELED_TIN.get());

        tag(BlockTags.WALLS)
                .add(EDWalls.SMALL_OAK_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_OAK_LOG.get())
                .add(EDWalls.SMALL_SPRUCE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get())
                .add(EDWalls.SMALL_BIRCH_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get())
                .add(EDWalls.SMALL_JUNGLE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get())
                .add(EDWalls.SMALL_ACACIA_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get())
                .add(EDWalls.SMALL_DARK_OAK_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get())
                .add(EDWalls.SMALL_MANGROVE_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get())
                .add(EDWalls.SMALL_CHERRY_LOG.get())
                .add(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get())
                .add(EDWalls.SMALL_CACTUS.get())
                .add(EDWalls.RIVERSTONE_WALL.get())
                .add(EDWalls.DARK_RIVERSTONE_WALL.get())
                .add(EDWalls.WETSTONE_WALL.get());
    }
}
