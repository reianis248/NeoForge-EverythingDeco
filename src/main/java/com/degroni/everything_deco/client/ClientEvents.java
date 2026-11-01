package com.degroni.everything_deco.client;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.*;
import com.degroni.everything_deco.common.item.EDModItems;
import com.degroni.everything_deco.common.util.EverythingDecoCreativeTabs;
import de.Roboter007.moderntabs.ModernTabs;
import de.Roboter007.moderntabs.section.item.SectionedItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = EverythingDeco.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            // Enable sections on your creative mode tab
            ModernTabs.TabDesign tabDesign = new ModernTabs.TabDesign()
                    .sectionsEnabled(true);

            ModernTabs.configureTab(EverythingDecoCreativeTabs.EVERYTHING_DECO.get(), tabDesign);

            ResourceLocation oresAndMaterialsSection = ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, "ores_and_materials");
            ResourceLocation naturalBlocksSection = ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, "natural_blocks");
            ResourceLocation buildingBlocksSection = ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, "building_blocks");
            ResourceLocation wallBlocksSection = ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, "wall_blocks");
            ResourceLocation miscSection = ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, "misc");

            /* Natural Blocks */
            SectionedItems.addItem(naturalBlocksSection, EDNaturalBlocks.BLANCHED_NYLIUM.get());
            SectionedItems.addItem(naturalBlocksSection, EDNaturalBlocks.LIGHT_MUD.get());
            SectionedItems.addItem(naturalBlocksSection, EDNaturalBlocks.MUD.get());
            SectionedItems.addItem(naturalBlocksSection, EDStoneBlocks.RIVERSTONE.get());
            SectionedItems.addItem(naturalBlocksSection, EDStoneBlocks.DARK_RIVERSTONE.get());
            SectionedItems.addItem(naturalBlocksSection, EDStoneBlocks.WETSTONE.get());

            /* Ores and Materials */
            SectionedItems.addItem(oresAndMaterialsSection, EDNaturalBlocks.TIN_ORE);
            SectionedItems.addItem(oresAndMaterialsSection, EDNaturalBlocks.DEEPSLATE_TIN_ORE);
            SectionedItems.addItem(oresAndMaterialsSection, EDMetalBlocks.TIN_BLOCK);
            SectionedItems.addItem(oresAndMaterialsSection, EDModItems.RAW_TIN);

            /* Building Blocks */
            SectionedItems.addItem(buildingBlocksSection, EDMetalBlocks.CUT_IRON);
            SectionedItems.addItem(buildingBlocksSection, EDMetalBlocks.CHISELED_IRON);
            SectionedItems.addItem(buildingBlocksSection, EDMetalBlocks.CUT_TIN);
            SectionedItems.addItem(buildingBlocksSection, EDMetalBlocks.CHISELED_TIN);

            SectionedItems.addItem(buildingBlocksSection, EDBuildingBlocks.RIVERSTONE_STAIRS);
            SectionedItems.addItem(buildingBlocksSection, EDBuildingBlocks.RIVERSTONE_SLAB);
            SectionedItems.addItem(buildingBlocksSection, EDWalls.RIVERSTONE_WALL);

            SectionedItems.addItem(buildingBlocksSection, EDBuildingBlocks.DARK_RIVERSTONE_STAIRS);
            SectionedItems.addItem(buildingBlocksSection, EDBuildingBlocks.DARK_RIVERSTONE_SLAB);
            SectionedItems.addItem(buildingBlocksSection, EDWalls.DARK_RIVERSTONE_WALL);

            SectionedItems.addItem(buildingBlocksSection, EDBuildingBlocks.WETSTONE_STAIRS);
            SectionedItems.addItem(buildingBlocksSection, EDBuildingBlocks.WETSTONE_SLAB);
            SectionedItems.addItem(buildingBlocksSection, EDWalls.WETSTONE_WALL);

            /* Wall Blocks */
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_OAK_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_OAK_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_SPRUCE_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_SPRUCE_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_BIRCH_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_BIRCH_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_JUNGLE_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_JUNGLE_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_ACACIA_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_ACACIA_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_DARK_OAK_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_DARK_OAK_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_MANGROVE_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_MANGROVE_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_CHERRY_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.STRIPPED_SMALL_CHERRY_LOG);
            SectionedItems.addItem(wallBlocksSection, EDWalls.SMALL_CACTUS);

            /* Misc */
            SectionedItems.addItem(miscSection, EDModItems.WHITE_SALT);
            SectionedItems.addItem(miscSection, EDModItems.PINK_SALT);
            SectionedItems.addItem(miscSection, EDModItems.TIN_INGOT);
            SectionedItems.addItem(miscSection, EDModItems.BRONZE_INGOT);
            SectionedItems.addItem(miscSection, EDModItems.STEEL_INGOT);
            SectionedItems.addItem(miscSection, EDModItems.CAST_IRON_INGOT);
            SectionedItems.addItem(miscSection, EDModItems.SINISTEEL_INGOT);
            SectionedItems.addItem(miscSection, EDModItems.COPPER_SHEET);
            SectionedItems.addItem(miscSection, EDModItems.GOLD_SHEET);
            SectionedItems.addItem(miscSection, EDModItems.IRON_SHEET);
        });
    }
}
