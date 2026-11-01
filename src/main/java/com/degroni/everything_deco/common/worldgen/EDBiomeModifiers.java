package com.degroni.everything_deco.common.worldgen;

import com.degroni.everything_deco.EverythingDeco;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class EDBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("add_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_DEEPSLATE_TIN_ORE = registerKey("add_deepslate_tin_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        // CF -> PF -> BM
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

// Exmaple Biome Tag Generation
//      context.register(ADD_EXAMPLE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
//              biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
//              HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EXAMPLE_ORE_PLACED_KEY)),
//              GenerationStep.Decoration.UNDERGROUND_ORES
//      ));


// Exmaple Biome Generation
//      context.register(ADD_EXAMPLE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
//              HolderSet.direct(biomes.getOrThrow(Biomes.BIOME)),
//              HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.EXAMPLE_ORE_PLACED_KEY)),
//              GenerationStep.Decoration.UNDERGROUND_ORES
//      ));

        context.register(ADD_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EDPlacedFeatures.TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
        context.register(ADD_DEEPSLATE_TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(EDPlacedFeatures.DEEPSLATE_TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(EverythingDeco.MOD_ID, name));
    }
}
