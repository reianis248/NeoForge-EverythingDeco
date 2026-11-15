package com.degroni.everything_deco.common.block.properties;

import com.degroni.everything_deco.common.block.registry.EDNaturalBlocks;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class EDBlockProperties {
    public static BlockBehaviour.Properties mudProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .strength(0.5F, 0.5F)
                .sound(SoundType.MUD)
                .isValidSpawn(EDNaturalBlocks::always)
                .isRedstoneConductor(EDNaturalBlocks::always)
                .isViewBlocking(EDNaturalBlocks::always)
                .isSuffocating(EDNaturalBlocks::always);
    }
    public static BlockBehaviour.Properties nyliumProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(EDMapColor.BLANCHED_NYLIUM)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.4F)
                .sound(SoundType.NYLIUM)
                .randomTicks();
    }

    public static BlockBehaviour.Properties stoneProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE)
                .sound(SoundType.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F);
    }
    public static BlockBehaviour.Properties blackstoneProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.COLOR_BLACK)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(1.5F, 6.0F);
    }
    public static BlockBehaviour.Properties calciteStoneProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(mapColor)
                .sound(SoundType.CALCITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.75F);
    }

    public static BlockBehaviour.Properties ironProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.COPPER);
    }
    public static BlockBehaviour.Properties tinProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(EDMapColor.TIN)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.COPPER);
    }
    public static BlockBehaviour.Properties bronzeProperties() {
        return BlockBehaviour.Properties.of()
                .mapColor(EDMapColor.BRONZE)
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .requiresCorrectToolForDrops()
                .strength(5.0F, 6.0F)
                .sound(SoundType.COPPER);
    }
    public static BlockBehaviour.Properties calciteMetalProperties(MapColor mapColor) {
        return BlockBehaviour.Properties.of()
                .mapColor(EDMapColor.CALCITE)
                .sound(SoundType.CALCITE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresCorrectToolForDrops()
                .strength(0.75F);
    }
}
