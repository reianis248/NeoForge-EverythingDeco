package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.block.*;
import com.degroni.everything_deco.common.block.helper.EDWallBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.MultiPartBlockStateBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Map;

public class EDBlockStateProvider extends BlockStateProvider {
    public EDBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EverythingDeco.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(EDNaturalBlocks.LIGHT_MUD);
        blockWithItem(EDNaturalBlocks.MUD);
        blockWithItem(EDNaturalBlocks.TIN_ORE);
        blockWithItem(EDNaturalBlocks.DEEPSLATE_TIN_ORE);


        blockWithItem(EDMetalBlocks.CUT_IRON);
        blockWithItem(EDMetalBlocks.CHISELED_IRON);
        blockWithItem(EDMetalBlocks.TIN_BLOCK);
        blockWithItem(EDMetalBlocks.CUT_TIN);
        blockWithItem(EDMetalBlocks.CHISELED_TIN);


        blockWithItem(EDStoneBlocks.RIVERSTONE);
        stairsBlock(EDBuildingBlocks.RIVERSTONE_STAIRS.get(), blockTexture(EDStoneBlocks.RIVERSTONE.get()));
        slabBlock(EDBuildingBlocks.RIVERSTONE_SLAB.get(), blockTexture(EDStoneBlocks.RIVERSTONE.get()), blockTexture(EDStoneBlocks.RIVERSTONE.get()));
        setTwoCustomWallBlock(EDWalls.RIVERSTONE_WALL.get(), blockTexture(EDStoneBlocks.RIVERSTONE.get()));
        blockItem(EDBuildingBlocks.RIVERSTONE_STAIRS);
        blockItem(EDBuildingBlocks.RIVERSTONE_SLAB);

        blockWithItem(EDStoneBlocks.DARK_RIVERSTONE);
        stairsBlock(EDBuildingBlocks.DARK_RIVERSTONE_STAIRS.get(), blockTexture(EDStoneBlocks.DARK_RIVERSTONE.get()));
        slabBlock(EDBuildingBlocks.DARK_RIVERSTONE_SLAB.get(), blockTexture(EDStoneBlocks.DARK_RIVERSTONE.get()), blockTexture(EDStoneBlocks.DARK_RIVERSTONE.get()));
        setTwoCustomWallBlock(EDWalls.DARK_RIVERSTONE_WALL.get(), blockTexture(EDStoneBlocks.DARK_RIVERSTONE.get()));
        blockItem(EDBuildingBlocks.DARK_RIVERSTONE_STAIRS);
        blockItem(EDBuildingBlocks.DARK_RIVERSTONE_SLAB);

        blockWithItem(EDStoneBlocks.WETSTONE);
        stairsBlock(EDBuildingBlocks.WETSTONE_STAIRS.get(), blockTexture(EDStoneBlocks.WETSTONE.get()));
        slabBlock(EDBuildingBlocks.WETSTONE_SLAB.get(), blockTexture(EDStoneBlocks.WETSTONE.get()), blockTexture(EDStoneBlocks.WETSTONE.get()));
        setTwoCustomWallBlock(EDWalls.WETSTONE_WALL.get(), blockTexture(EDStoneBlocks.WETSTONE.get()));
        blockItem(EDBuildingBlocks.WETSTONE_STAIRS);
        blockItem(EDBuildingBlocks.WETSTONE_SLAB);


        newWallBlock(EDWalls.SMALL_OAK_LOG.get(), blockTexture(Blocks.OAK_LOG));
        newWallBlock(EDWalls.SMALL_SPRUCE_LOG.get(), blockTexture(Blocks.SPRUCE_LOG));
        newWallBlock(EDWalls.SMALL_BIRCH_LOG.get(), blockTexture(Blocks.BIRCH_LOG));
        newWallBlock(EDWalls.SMALL_JUNGLE_LOG.get(), blockTexture(Blocks.JUNGLE_LOG));
        newWallBlock(EDWalls.SMALL_ACACIA_LOG.get(), blockTexture(Blocks.ACACIA_LOG));
        newWallBlock(EDWalls.SMALL_DARK_OAK_LOG.get(), blockTexture(Blocks.DARK_OAK_LOG));
        newWallBlock(EDWalls.SMALL_MANGROVE_LOG.get(), blockTexture(Blocks.MANGROVE_LOG));
        newWallBlock(EDWalls.SMALL_CHERRY_LOG.get(), blockTexture(Blocks.CHERRY_LOG));
        setTwoCustomWallBlock(EDWalls.SMALL_CACTUS.get(), blockTexture(Blocks.CACTUS));


        newWallBlock(EDWalls.STRIPPED_SMALL_OAK_LOG.get(), blockTexture(Blocks.STRIPPED_OAK_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_SPRUCE_LOG.get(), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_BIRCH_LOG.get(), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_JUNGLE_LOG.get(), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_ACACIA_LOG.get(), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_DARK_OAK_LOG.get(), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_MANGROVE_LOG.get(), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));
        newWallBlock(EDWalls.STRIPPED_SMALL_CHERRY_LOG.get(), blockTexture(Blocks.STRIPPED_CHERRY_LOG));

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

    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    /* Wall Block */
    /* Close Open */
    public void newWallBlock(EDWallBlock block, ResourceLocation texture) {
        this.newWallBlockInternal(block, this.key(block).toString(), texture);
    }

    public void newWallBlock(EDWallBlock block, String name, ResourceLocation texture) {
        this.newWallBlockInternal(block, name + "_wall", texture);
    }

    public void newWallBlockWithRenderType(EDWallBlock block, ResourceLocation texture, String renderType) {
        this.newWallBlockInternalWithRenderType(block, this.key(block).toString(), texture, ResourceLocation.tryParse(renderType));
    }

    public void newWallBlockWithRenderType(EDWallBlock block, String name, ResourceLocation texture, String renderType) {
        this.newWallBlockInternalWithRenderType(block, name + "_wall", texture, ResourceLocation.tryParse(renderType));
    }

    public void newWallBlockWithRenderType(EDWallBlock block, ResourceLocation texture, ResourceLocation renderType) {
        this.newWallBlockInternalWithRenderType(block, this.key(block).toString(), texture, renderType);
    }

    public void newWallBlockWithRenderType(EDWallBlock block, String name, ResourceLocation texture, ResourceLocation renderType) {
        this.newWallBlockInternalWithRenderType(block, name + "_wall", texture, renderType);
    }

    private void newWallBlockInternal(EDWallBlock block, String baseName, ResourceLocation texture) {
        this.newWallBlock(block, this.models().wallPost(baseName + "_post", texture), this.models().wallSide(baseName + "_side", texture), this.models().wallSideTall(baseName + "_side_tall", texture));
    }

    private void newWallBlockInternalWithRenderType(EDWallBlock block, String baseName, ResourceLocation texture, ResourceLocation renderType) {
        this.newWallBlock(block, ((BlockModelBuilder)this.models().wallPost(baseName + "_post", texture)).renderType(renderType), ((BlockModelBuilder)this.models().wallSide(baseName + "_side", texture)).renderType(renderType), ((BlockModelBuilder)this.models().wallSideTall(baseName + "_side_tall", texture)).renderType(renderType));
    }

    public void newWallBlock(EDWallBlock block, ModelFile post, ModelFile side, ModelFile sideTall) {
        MultiPartBlockStateBuilder builder = ((MultiPartBlockStateBuilder.PartBuilder)this.getMultipartBuilder(block).part().modelFile(post).addModel()).condition(EDWallBlock.UP, new Boolean[]{true}).end();
        WALL_PROPS.entrySet().stream().filter((e) -> ((Direction)e.getKey()).getAxis().isHorizontal()).forEach((e) -> {
            this.newWallSidePart(builder, side, e, WallSide.LOW);
            this.newWallSidePart(builder, sideTall, e, WallSide.TALL);
        });
    }

    private void newWallSidePart(MultiPartBlockStateBuilder builder, ModelFile model, Map.Entry<Direction, Property<WallSide>> entry, WallSide height) {
        ((MultiPartBlockStateBuilder.PartBuilder)builder.part().modelFile(model).rotationY(((int)((Direction)entry.getKey()).toYRot() + 180) % 360).uvLock(true).addModel()).condition((Property)entry.getValue(), new WallSide[]{height});
    }
}
