package dev.dubhe.anvilcraft;

import dev.dubhe.anvilcraft.api.registry.AnvilCraftRegistrate;
import dev.dubhe.anvilcraft.data.AnvilCraftDatagen;
import dev.dubhe.anvilcraft.init.ModItems;

public class AnvilCraft {
	public static final String MOD_ID = "anvilcraft";

	public static final AnvilCraftRegistrate REGISTRATE = AnvilCraftRegistrate.create(MOD_ID);

	public static void init() {
		// common init
		ModItems.register();

		// datagen init
		AnvilCraftDatagen.init();

		// fabric exclusive, squeeze this in here to register before stuff is used
		REGISTRATE.registerRegistrate();
	}
}
