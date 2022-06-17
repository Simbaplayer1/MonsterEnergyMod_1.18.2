package net.simbaplayer.monsterenergymod;

import net.fabricmc.api.ModInitializer;
import net.simbaplayer.monsterenergymod.block.ModBlocks;
import net.simbaplayer.monsterenergymod.item.ModItems;
import net.simbaplayer.monsterenergymod.util.ModRegistries;
import net.simbaplayer.monsterenergymod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonsterEnergyMod implements ModInitializer {
	public static final String MOD_ID = "monsterenergymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.setupPOIs();
		ModRegistries.registerModStuffs();

	}
}
