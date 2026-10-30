package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.EDBuildingBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class EDItemModelProvider extends ItemModelProvider {
    public EDItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EverythingDeco.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_OAK_LOG, Blocks.OAK_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_SPRUCE_LOG, Blocks.SPRUCE_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_BIRCH_LOG, Blocks.BIRCH_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_JUNGLE_LOG, Blocks.JUNGLE_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_ACACIA_LOG, Blocks.ACACIA_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_DARK_OAK_LOG, Blocks.DARK_OAK_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_MANGROVE_LOG, Blocks.MANGROVE_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_CHERRY_LOG, Blocks.CHERRY_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.SMALL_CACTUS, Blocks.CACTUS);

        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG, Blocks.STRIPPED_OAK_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG);
        vanillaTextureWallItem(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG);

//        basicItem(CampedFood.BEAR.get());
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID,"block/" + item.getId().getPath()));
    }

    public void customSimpleBlockItem(DeferredBlock<?> block) {
        this.withExistingParent(block.getId().getPath(),
                ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, "block/" + block.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void newWallItem(DeferredBlock<?> block, Block baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath("everything_deco",
                        "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath()));
    }

    public void vanillaTextureWallItem(DeferredBlock<?> block, Block baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath("minecraft",
                        "block/" + BuiltInRegistries.BLOCK.getKey(baseBlock).getPath()));
    }
}
