package dev.dubhe.anvilcraft.init;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.Item;

import static dev.dubhe.anvilcraft.AnvilCraft.REGISTRATE;

public class ModItems {
    public static final RegistryEntry<Item> TEST_ITEM = REGISTRATE
            .item("test_item", Item::new).register();

    public static void register() {

    }
}
