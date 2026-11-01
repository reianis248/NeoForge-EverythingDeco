package com.degroni.everything_deco.common.datagen.dataprovider.lang;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.EDBuildingBlocks;
import com.degroni.everything_deco.common.block.EDStoneBlocks;
import com.degroni.everything_deco.common.block.EDWalls;
import com.degroni.everything_deco.common.block.EDNaturalBlocks;
import com.degroni.everything_deco.common.item.EDModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EDLanguageProviderEnglish extends LanguageProvider {
    public EDLanguageProviderEnglish(PackOutput output, String locale) {
        super(output, EverythingDeco.MOD_ID, "en_us");
    }

    @Override protected void addTranslations() {
        add("itemGroup.everything_deco", "Everything Deco");
        add("section.everything_deco.natural_blocks", "Natural Blocks");
        add("section.everything_deco.ores_and_materials", "Ores and Materials");
        add("section.everything_deco.building_blocks", "Building Blocks");
        add("section.everything_deco.wall_blocks", "Wall Blocks");
        add("section.everything_deco.misc", "Misc");
        add(Blocks.MUD, "Dark Mud");
        add(Blocks.MUDDY_MANGROVE_ROOTS, "Dark Muddy Mangrove Roots");

        add(EDNaturalBlocks.BLANCHED_NYLIUM.get(), "Blanched Nylium");
        add(EDNaturalBlocks.LIGHT_MUD.get(), "Light Mud");
        add(EDNaturalBlocks.MUD.get(), "Mud");

        add(EDNaturalBlocks.TIN_ORE.get(), "Tin Ore");
        add(EDNaturalBlocks.DEEPSLATE_TIN_ORE.get(), "Deepslate Tin Ore");

        /* Walls */
        add(EDWalls.SMALL_OAK_LOG.get(), "Small Oak Log");
        add(EDWalls.STRIPPED_SMALL_OAK_LOG.get(), "Stripped Small Oak Log");
        add(EDWalls.SMALL_SPRUCE_LOG.get(), "Small Spruce Log");
        add(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get(), "Stripped Small Spruce Log");
        add(EDWalls.SMALL_BIRCH_LOG.get(), "Small Birch Log");
        add(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get(), "Stripped Small Birch Log");
        add(EDWalls.SMALL_JUNGLE_LOG.get(), "Small Jungle Log");
        add(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get(), "Stripped Small Jungle Log");
        add(EDWalls.SMALL_ACACIA_LOG.get(), "Small Acacia Log");
        add(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get(), "Stripped Small Acacia Log");
        add(EDWalls.SMALL_DARK_OAK_LOG.get(), "Small Dark Oak Log");
        add(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get(), "Stripped Small Dark Oak Log");
        add(EDWalls.SMALL_MANGROVE_LOG.get(), "Small Mangrove Log");
        add(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get(), "Stripped Small Mangrove Log");
        add(EDWalls.SMALL_CHERRY_LOG.get(), "Small Cherry Log");
        add(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get(), "Stripped Small Cherry Log");
        add(EDWalls.SMALL_CACTUS.get(), "Small Cactus");

        add(EDBuildingBlocks.CUT_IRON.get(), "Cut Iron");
        add(EDBuildingBlocks.CHISELED_IRON.get(), "Chiseled Iron");
        add(EDBuildingBlocks.CUT_TIN.get(), "Cut Tin");
        add(EDBuildingBlocks.CHISELED_TIN.get(), "Chiseled Tin");

        add(EDStoneBlocks.RIVERSTONE.get(), "Riverstone");
        add(EDBuildingBlocks.RIVERSTONE_STAIRS.get(), "Riverstone Stairs");
        add(EDBuildingBlocks.RIVERSTONE_SLAB.get(), "Riverstone Slab");
        add(EDWalls.RIVERSTONE_WALL.get(), "Riverstone Wall");

        add(EDStoneBlocks.DARK_RIVERSTONE.get(), "Dark Riverstone");
        add(EDBuildingBlocks.DARK_RIVERSTONE_STAIRS.get(), "Dark Riverstone Stairs");
        add(EDBuildingBlocks.DARK_RIVERSTONE_SLAB.get(), "Dark Riverstone Slab");
        add(EDWalls.DARK_RIVERSTONE_WALL.get(), "Dark Riverstone Wall");

        add(EDStoneBlocks.WETSTONE.get(), "Wetstone");
        add(EDBuildingBlocks.WETSTONE_STAIRS.get(), "Wetstone Stairs");
        add(EDBuildingBlocks.WETSTONE_SLAB.get(), "Wetstone Slab");
        add(EDWalls.WETSTONE_WALL.get(), "Wetstone Wall");

        /* Items */
        add(EDModItems.WHITE_SALT.get(), "White Salt");
        add(EDModItems.PINK_SALT.get(), "Pink Salt");
        add(EDModItems.RAW_TIN.get(), "Raw Tin");
        add(EDModItems.TIN_INGOT.get(), "Tin Ingot");
        add(EDModItems.CAST_IRON_INGOT.get(), "Cast Iron Ingot");
        add(EDModItems.STEEL_INGOT.get(), "Steel Ingot");
        add(EDModItems.BRONZE_INGOT.get(), "Bronze Ingot");
        add(EDModItems.SINISTEEL_INGOT.get(), "Sinisteel Ingot");
        add(EDModItems.COPPER_SHEET.get(), "Copper Sheet");
        add(EDModItems.GOLD_SHEET.get(), "Gold Sheet");
        add(EDModItems.IRON_SHEET.get(), "Iron Sheet");
    }
}
