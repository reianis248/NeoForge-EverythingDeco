package com.degroni.everything_deco.common.event;

import com.degroni.everything_deco.common.block.EDNaturalBlocks;
import com.degroni.everything_deco.common.block.helper.EDMudBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;

@EventBusSubscriber(modid = "everything_deco")
public class MudInteractionEvent {

    @SubscribeEvent
    public static void onUseItemOnBlock(UseItemOnBlockEvent event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos(); // Corrected method for position
        BlockState state = level.getBlockState(pos);
        ItemStack stack = event.getItemStack();
        Player player = event.getPlayer(); // Corrected method for entity/player

        // Check if player is right-clicking vanilla Mud with a water bottle
        if (state.is(EDNaturalBlocks.LIGHT_MUD) && EDMudBlock.isWaterBottle(stack)) {
            if (!level.isClientSide()) {
                // Replace vanilla mud with your custom MUD block
                level.setBlock(pos, EDNaturalBlocks.MUD.get().defaultBlockState(), 3);
                level.playSound(null, pos, SoundEvents.PLAYER_SPLASH, SoundSource.BLOCKS, 1.0F, 1.0F);
                EDMudBlock.consumeWaterBottle(player, stack);
            }

            // Cancel the default item behavior (stops drinking) and swing the hand
            event.cancelWithResult(ItemInteractionResult.sidedSuccess(level.isClientSide()));
        }
    }
}