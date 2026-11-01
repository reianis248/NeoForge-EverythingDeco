package com.degroni.everything_deco.common.datagen.dataprovider;

import com.degroni.everything_deco.EverythingDeco;
import com.degroni.everything_deco.common.worldgen.EDBiomeModifiers;
import com.degroni.everything_deco.common.worldgen.EDConfiguredFeatures;
import com.degroni.everything_deco.common.worldgen.EDPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EDDatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EDConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EDPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EDBiomeModifiers::bootstrap);

    public EDDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(EverythingDeco.MOD_ID));
    }
}
