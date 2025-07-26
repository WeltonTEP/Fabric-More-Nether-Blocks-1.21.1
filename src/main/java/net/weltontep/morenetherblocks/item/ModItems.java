package net.weltontep.morenetherblocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.weltontep.morenetherblocks.MoreNetherBlocks;

public class ModItems {
    public static final Item BLUE_NETHER_BRICK = registerItem("misc/blue_nether_brick", new Item(new Item.Settings()));
    public static final Item RED_NETHER_BRICK = registerItem("misc/red_nether_brick", new Item(new Item.Settings()));
    public static final Item OBSIDIAN_SHARD = registerItem("obsidian/obsidian_shard", new Item(new Item.Settings()));
    public static final Item PLATINUM = registerItem("platinum/platinum", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreNetherBlocks.MOD_ID, name), item);

    }

    public static void registerModItems() {
        MoreNetherBlocks.LOGGER.info("Registering Mod Items for" + MoreNetherBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BLUE_NETHER_BRICK);
            entries.add(RED_NETHER_BRICK);
            entries.add(OBSIDIAN_SHARD);
            entries.add(PLATINUM);
        });

    }
}
