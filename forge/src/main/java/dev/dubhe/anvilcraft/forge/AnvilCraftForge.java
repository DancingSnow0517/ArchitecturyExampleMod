package dev.dubhe.anvilcraft.forge;

import dev.dubhe.anvilcraft.AnvilCraft;
import net.minecraftforge.fml.common.Mod;

@Mod(AnvilCraft.MOD_ID)
public class AnvilCraftForge {
    public AnvilCraftForge() {
        AnvilCraft.init();
    }
}