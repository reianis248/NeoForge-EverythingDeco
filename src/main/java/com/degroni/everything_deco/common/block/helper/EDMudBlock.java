package com.degroni.everything_deco.common.block.helper;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.function.Supplier;

public class EDMudBlock extends Block {
    private final Supplier<Block> nextStageBlock;

    public EDMudBlock(Properties properties, Supplier<Block> nextStageBlock) {
        super(properties);
        this.nextStageBlock = nextStageBlock;
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (isWaterBottle(stack)) {
            if (!level.isClientSide()) {
                level.setBlock(pos, nextStageBlock.get().defaultBlockState(), 3);
                level.playSound(null, pos, SoundEvents.PLAYER_SPLASH, SoundSource.BLOCKS, 1.0F, 1.0F);
                consumeWaterBottle(player, stack);
                level.playSound(null, pos, SoundEvents.BOTTLE_EMPTY, SoundSource.BLOCKS, 1.0F, 1.0F);
            }
            return ItemInteractionResult.sidedSuccess(level.isClientSide());
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    // Shared helper: checks if the item is a water bottle
    public static boolean isWaterBottle(ItemStack stack) {
        return stack.is(Items.POTION) 
                && stack.has(DataComponents.POTION_CONTENTS) 
                && stack.get(DataComponents.POTION_CONTENTS).is(Potions.WATER);
    }

    // Shared helper: shrinks the water bottle and gives a glass bottle back
    public static void consumeWaterBottle(Player player, ItemStack stack) {
        if (!player.getAbilities().instabuild) {
            stack.shrink(1);
            ItemStack glassBottle = new ItemStack(Items.GLASS_BOTTLE);
            if (!player.getInventory().add(glassBottle)) {
                player.drop(glassBottle, false);
            }
        }
    }
}