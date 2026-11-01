package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.common.block.*;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

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

        add(EDNaturalBlocks.TIN_ORE.get(),
                block -> createMultipleOreDrops(EDNaturalBlocks.TIN_ORE.get(), EDModItems.RAW_TIN.get(), 1, 1));
        add(EDNaturalBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createMultipleOreDrops(EDNaturalBlocks.DEEPSLATE_TIN_ORE.get(), EDModItems.RAW_TIN.get(), 2, 2));


        dropSelf(EDNaturalBlocks.LIGHT_MUD.get());
        dropSelf(EDNaturalBlocks.MUD.get());
        dropSelf(EDNaturalBlocks.BLANCHED_NYLIUM.get());


        dropSelf(EDWalls.SMALL_OAK_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_OAK_LOG.get());
        dropSelf(EDWalls.SMALL_SPRUCE_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get());
        dropSelf(EDWalls.SMALL_BIRCH_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get());
        dropSelf(EDWalls.SMALL_JUNGLE_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get());
        dropSelf(EDWalls.SMALL_ACACIA_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get());
        dropSelf(EDWalls.SMALL_DARK_OAK_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get());
        dropSelf(EDWalls.SMALL_MANGROVE_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get());
        dropSelf(EDWalls.SMALL_CHERRY_LOG.get());
        dropSelf(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get());
        dropSelf(EDWalls.SMALL_CACTUS.get());


        dropSelf(EDMetalBlocks.CUT_IRON.get());
        dropSelf(EDMetalBlocks.CHISELED_IRON.get());
        dropSelf(EDMetalBlocks.TIN_BLOCK.get());
        dropSelf(EDMetalBlocks.CUT_TIN.get());
        dropSelf(EDMetalBlocks.CHISELED_TIN.get());


        dropSelf(EDStoneBlocks.RIVERSTONE.get());
        dropSelf(EDBuildingBlocks.RIVERSTONE_STAIRS.get());
        dropSelf(EDBuildingBlocks.RIVERSTONE_SLAB.get());
        dropSelf(EDWalls.RIVERSTONE_WALL.get());

        dropSelf(EDStoneBlocks.DARK_RIVERSTONE.get());
        dropSelf(EDBuildingBlocks.DARK_RIVERSTONE_STAIRS.get());
        dropSelf(EDBuildingBlocks.DARK_RIVERSTONE_SLAB.get());
        dropSelf(EDWalls.DARK_RIVERSTONE_WALL.get());

        dropSelf(EDStoneBlocks.WETSTONE.get());
        dropSelf(EDBuildingBlocks.WETSTONE_STAIRS.get());
        dropSelf(EDBuildingBlocks.WETSTONE_SLAB.get());
        dropSelf(EDWalls.WETSTONE_WALL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Stream.of(
                EDNaturalBlocks.NATURALBLOCK,
                EDWalls.WALL,
                EDStoneBlocks.STONE,
                EDBuildingBlocks.BUILDINGBLOCK,
                EDMetalBlocks.METALBLOCK
                )
                .flatMap(deferredRegister -> deferredRegister.getEntries().stream())
                .map(Holder::value)
                .toList();
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }
}
