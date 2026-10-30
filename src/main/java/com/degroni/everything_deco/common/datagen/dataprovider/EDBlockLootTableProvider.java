package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.common.block.EDBuildingBlocks;
import com.degroni.everything_deco.common.block.EDNaturalBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.stream.Stream;

public class EDBlockLootTableProvider extends BlockLootSubProvider {
    public EDBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

// Drops The Block Itself.
//        dropSelf(CaveMineralBlocks.EXAMPLE_BLOCK.get());


// Drops a Minimum to Maximum Amount of Item(s).
//        add(CaveMineralBlocks.TIDE_CRYSTAL_ORE.get(),
//                block -> createMultipleOreDrops(CaveMineralBlocks.TIDE_CRYSTAL_ORE.get(), CaveMineralItems.TIDE_CRYSTAL.get(), 1, 3));

// Drops ONE item from the specified Loot Table.
//        this.add(CampedBaitCrate.BASIC_BAIT_CRATE.get(),
//                block -> LootTable.lootTable().withPool(
//                        LootPool.lootPool()
//                                .setRolls(ConstantValue.exactly(1.0F))
//                                .add(TagEntry.expandTag(CPTags.Items.COMMON_BAIT))));

// Drops a Random Amount of an item from the specified Loot Table.
//        this.add(CampedBaitCrate.BASIC_BAIT_CRATE.get(),
//                block -> LootTable.lootTable().withPool(
//                        LootPool.lootPool()
//                                .setRolls(UniformGenerator.between(1.0F, 5.0f))
//                                .add(TagEntry.expandTag(CPTags.Items.COMMON_BAIT))));

        dropSelf(EDNaturalBlocks.LIGHT_MUD.get());
        dropSelf(EDNaturalBlocks.MUD.get());

        dropSelf(EDBuildingBlocks.SMALL_OAK_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_SPRUCE_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_BIRCH_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_JUNGLE_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_ACACIA_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_DARK_OAK_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_MANGROVE_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_CHERRY_LOG.get());
        dropSelf(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG.get());
        dropSelf(EDBuildingBlocks.SMALL_CACTUS.get());

        dropSelf(EDBuildingBlocks.RIVERSTONE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        // Collect entries from all your block registries
        return Stream.of(
                        EDNaturalBlocks.NATURALBLOCK,
                        EDBuildingBlocks.BUILDINGBLOCK
                )
                .flatMap(deferredRegister -> deferredRegister.getEntries().stream())
                .map(Holder::value)
                .toList();
    }

}
