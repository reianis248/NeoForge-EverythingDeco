package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.EDBuildingBlocks;
import com.degroni.everything_deco.common.block.EDNaturalBlocks;
import com.degroni.everything_deco.common.block.helper.EDWallBlock;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class EDBlockStateProvider extends BlockStateProvider {
    public EDBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EverythingDeco.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(EDNaturalBlocks.LIGHT_MUD);
        blockWithItem(EDNaturalBlocks.MUD);

        customWallBlock(EDBuildingBlocks.SMALL_OAK_LOG.get(), blockTexture(Blocks.OAK_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_SPRUCE_LOG.get(), blockTexture(Blocks.SPRUCE_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_BIRCH_LOG.get(), blockTexture(Blocks.BIRCH_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_JUNGLE_LOG.get(), blockTexture(Blocks.JUNGLE_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_ACACIA_LOG.get(), blockTexture(Blocks.ACACIA_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_DARK_OAK_LOG.get(), blockTexture(Blocks.DARK_OAK_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_MANGROVE_LOG.get(), blockTexture(Blocks.MANGROVE_LOG));
        customWallBlock(EDBuildingBlocks.SMALL_CHERRY_LOG.get(), blockTexture(Blocks.CHERRY_LOG));
        setTwoCustomWallBlock(EDBuildingBlocks.SMALL_CACTUS.get(), blockTexture(Blocks.CACTUS));

        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_OAK_LOG.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_SPRUCE_LOG.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_BIRCH_LOG.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_JUNGLE_LOG.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_ACACIA_LOG.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_DARK_OAK_LOG.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_MANGROVE_LOG.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));
        customWallBlock(EDBuildingBlocks.STRIPPED_SMALL_CHERRY_LOG.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));

//        blockItem(CampedNaturalBlocks.ASPEN_LEAVES);
//        blockItem(CampedNaturalBlocks.RED_OAK_LEAVES);
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<LeavesBlock> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        itemModels().withExistingParent(deferredBlock.getId().getPath(), modLoc("block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        itemModels().withExistingParent(deferredBlock.getId().getPath(), modLoc("block/" + deferredBlock.getId().getPath() + appendix));
    }

    public void customWallBlock(EDWallBlock block, ResourceLocation texture) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        ModelFile post = models().wallPost(name + "_post", texture);
        ModelFile side = models().wallSide(name + "_side", texture);
        ModelFile sideTall = models().wallSideTall(name + "_side_tall", texture);
        ModelFile inventory = models().wallInventory(name + "_inventory", texture);

        getMultipartBuilder(block)
                .part().modelFile(post).addModel().condition(BlockStateProperties.UP, true).end()
                .part().modelFile(side).addModel().condition(BlockStateProperties.NORTH_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).addModel().condition(BlockStateProperties.NORTH_WALL, WallSide.TALL).end()
                .part().modelFile(side).rotationY(90).addModel().condition(BlockStateProperties.EAST_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).rotationY(90).addModel().condition(BlockStateProperties.EAST_WALL, WallSide.TALL).end()
                .part().modelFile(side).rotationY(180).addModel().condition(BlockStateProperties.SOUTH_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).rotationY(180).addModel().condition(BlockStateProperties.SOUTH_WALL, WallSide.TALL).end()
                .part().modelFile(side).rotationY(270).addModel().condition(BlockStateProperties.WEST_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).rotationY(270).addModel().condition(BlockStateProperties.WEST_WALL, WallSide.TALL).end();
    }
    public void setTwoCustomWallBlock(WallBlock block, ResourceLocation texture) {
        String name = BuiltInRegistries.BLOCK.getKey(block).getPath();

        ModelFile post = models().wallPost(name + "_post", texture);
        ModelFile side = models().wallSide(name + "_side", texture);
        ModelFile sideTall = models().wallSideTall(name + "_side_tall", texture);
        ModelFile inventory = models().wallInventory(name + "_inventory", texture);

        getMultipartBuilder(block)
                .part().modelFile(post).addModel().condition(BlockStateProperties.UP, true).end()
                .part().modelFile(side).addModel().condition(BlockStateProperties.NORTH_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).addModel().condition(BlockStateProperties.NORTH_WALL, WallSide.TALL).end()
                .part().modelFile(side).rotationY(90).addModel().condition(BlockStateProperties.EAST_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).rotationY(90).addModel().condition(BlockStateProperties.EAST_WALL, WallSide.TALL).end()
                .part().modelFile(side).rotationY(180).addModel().condition(BlockStateProperties.SOUTH_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).rotationY(180).addModel().condition(BlockStateProperties.SOUTH_WALL, WallSide.TALL).end()
                .part().modelFile(side).rotationY(270).addModel().condition(BlockStateProperties.WEST_WALL, WallSide.LOW).end()
                .part().modelFile(sideTall).rotationY(270).addModel().condition(BlockStateProperties.WEST_WALL, WallSide.TALL).end();
    }
}
