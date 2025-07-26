package net.weltontep.morenetherblocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.weltontep.morenetherblocks.block.*;

public class MoreNetherBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GlowstoneBlocks.GLOWSTONE_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ObsidianBlocks.OBSIDIAN_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(MiscBlocks.CHARCOAL_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MiscBlocks.SULPHUR_DUST, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CrimsonBlocks.CRIMSON_MYCELIAL_THREADS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WarpedBlocks.WARPED_MYCELIAL_THREADS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CrimsonBlocks.CRIMSON_TENDRILS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WarpedBlocks.WARPED_TENDRILS, RenderLayer.getCutout());
    }
}
