package net.weltontep.morenetherblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.weltontep.morenetherblocks.block.MiscBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(MiscBlocks.CHARCOAL_LOG.asItem())
                .add(MiscBlocks.CHARCOAL_WOOD.asItem())
                .add(MiscBlocks.CHARCOAL_LOG_STRIPPED.asItem())
                .add(MiscBlocks.CHARCOAL_WOOD_STRIPPED.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(MiscBlocks.CHARCOAL_PLANKS.asItem());

    }
}
