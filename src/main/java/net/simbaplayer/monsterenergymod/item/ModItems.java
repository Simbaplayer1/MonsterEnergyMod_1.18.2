package net.simbaplayer.monsterenergymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.simbaplayer.monsterenergymod.MonsterEnergyMod;
import net.simbaplayer.monsterenergymod.item.custom.*;
import net.simbaplayer.monsterenergymod.item.custom.MonsterEnergyCanItem;



public class ModItems {

    public static final Item MONSTER_ORIGINAL = registerItem("monster_original",
            new MonsterEnergyOriginalItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ORIGINAL)));

    public static final Item MONSTER_DRAGON_WHITE_TEA = registerItem("monster_dragon_white_tea",
            new MonsterEnergyDragonWhiteTeaItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_DRAGON_WHITE_TEA)));

    public static final Item MONSTER_DRAGON_GREEN_TEA = registerItem("monster_dragon_green_tea",
            new MonsterEnergyDragonGreenTeaItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_DRAGON_GREEN_TEA)));

    public static final Item MONSTER_DRAGON_YERBA_MATE = registerItem("monster_dragon_yerba_mate",
            new MonsterEnergyDragonYerbaMateItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_DRAGON_YERBA_MATE)));

    public static final Item MONSTER_GOLDEN_DRAGON = registerItem("monster_golden_dragon",
            new MonsterEnergyGoldenDragonItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_GOLDEN_DRAGON)));

    public static final Item MONSTER_ORIGINAL_ZERO = registerItem("monster_original_zero",
            new MonsterEnergyOriginalZeroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ORIGINAL_ZERO)));

    public static final Item MONSTER_M80 = registerItem("monster_m80",
            new MonsterEnergyM80Item(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_M80)));

    public static final Item MONSTER_M80_ALT = registerItem("monster_m80_alt",
            new MonsterEnergyM80AltItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_M80_ALT)));

    public static final Item MONSTER_MEAN_BEAN = registerItem("monster_mean_bean",
            new MonsterEnergyMeanBeanItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_MEAN_BEAN)));

    public static final Item MONSTER_RIPPER = registerItem("monster_ripper",
            new MonsterEnergyRipperItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_RIPPER)));

    public static final Item MONSTER_ASSAULT = registerItem("monster_assault",
            new MonsterEnergyAssaultItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ASSAULT)));

    public static final Item MONSTER_UNLEADED = registerItem("monster_unleaded",
            new MonsterEnergyUnleadedItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_UNLEADED)));

    public static final Item MONSTER_MULE = registerItem("monster_mule",
            new MonsterEnergyMuleItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_MULE)));

    public static final Item MONSTER_MAD_DOG = registerItem("monster_mad_dog",
            new MonsterEnergyMadDogItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_MAD_DOG)));

    public static final Item MONSTER_BALLERS_BLEND = registerItem("monster_ballers_blend",
            new MonsterEnergyMuleItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_BALLERS_BLEND)));

    public static final Item MONSTER_MANGO_LOCO = registerItem("monster_mango_loco",
            new MonsterEnergyMangoLocoItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_MANGO_LOCO)));

    public static final Item MONSTER_DOCTOR = registerItem("monster_doctor",
            new MonsterEnergyDoctorItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_DOCTOR)));

    public static final Item MONSTER_PIPELINE = registerItem("monster_pipeline",
            new MonsterEnergyPipelinePunchItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_PIPELINE)));

    public static final Item MONSTER_PACIFIC = registerItem("monster_pacific",
            new MonsterEnergyPacificItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_PACIFIC)));

    public static final Item MONSTER_MIXXD = registerItem("monster_mixxd",
            new MonsterEnergyMIXXDPunchItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_MIXXD)));

    public static final Item MONSTER_HAMILTON = registerItem("monster_hamilton",
            new MonsterEnergyLewisHamiltonItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_HAMILTON)));

    public static final Item MONSTER_KHAOS = registerItem("monster_khaos",
            new MonsterEnergyKhaosItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_KHAOS)));

    public static final Item MONSTER_KHAOS_ALT = registerItem("monster_khaos_alt",
            new MonsterEnergyKhaosAltItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_KHAOS_ALT)));

    public static final Item MONSTER_KHAOTIC = registerItem("monster_khaotic",
            new MonsterEnergyKhaoticItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_KHAOTIC)));

    public static final Item MONSTER_ULTRA_BLUE = registerItem("monster_ultra_blue",
            new MonsterEnergyUltraBlueItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_BLUE)));

    public static final Item MONSTER_ULTRA_RED = registerItem("monster_ultra_red",
            new MonsterEnergyUltraRedItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_RED)));

    public static final Item MONSTER_ULTRA_FIESTA = registerItem("monster_ultra_fiesta",
            new MonsterEnergyUltraFiestaItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_FIESTA)));

    public static final Item MONSTER_ULTRA = registerItem("monster_ultra",
            new MonsterEnergyUltraItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA)));

    public static final Item MONSTER_ULTRA_VIOLET = registerItem("monster_ultra_violet",
            new MonsterEnergyUltraVioletItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_VIOLET)));

    public static final Item MONSTER_ULTRA_BLACK = registerItem("monster_ultra_black",
            new MonsterEnergyUltraBlackItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_BLACK)));

    public static final Item MONSTER_ULTRA_CITRON = registerItem("monster_ultra_citron",
            new MonsterEnergyUltraCitronItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_CITRON)));

    public static final Item MONSTER_ULTRA_SUNRISE = registerItem("monster_ultra_sunrise",
            new MonsterEnergyUltraSunriseItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_SUNRISE)));

    public static final Item MONSTER_ULTRA_GOLD = registerItem("monster_ultra_gold",
            new MonsterEnergyUltraGoldItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_GOLD)));

    public static final Item MONSTER_ULTRA_ROSA = registerItem("monster_ultra_rosa",
            new MonsterEnergyUltraRosaItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_ROSA)));

    public static final Item MONSTER_ULTRA_WATERMELON = registerItem("monster_ultra_watermelon",
            new MonsterEnergyUltraWatermelonItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_WATERMELON)));

    public static final Item MONSTER_ULTRA_PEACH = registerItem("monster_ultra_peach",
            new MonsterEnergyUltraPeachItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_PEACH)));

    public static final Item MONSTER_ULTRA_PARADISE = registerItem("monster_ultra_paradise",
            new MonsterEnergyUltraParadiseItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_ULTRA_PARADISE)));

    public static final Item MONSTER_NITRO = registerItem("monster_nitro",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_NITRO)));

    public static final Item MONSTER_REHAB_GREEN = registerItem("monster_rehab_green",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_GREEN)));

    public static final Item MONSTER_REHAB_RASPBERRY = registerItem("monster_rehab_raspberry",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_RASPBERRY)));

    public static final Item MONSTER_REHAB_LEMONADE = registerItem("monster_rehab_lemonade",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_LEMONADE)));

    public static final Item MONSTER_REHAB_PEACH = registerItem("monster_rehab_peach",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_PEACH)));

    public static final Item MONSTER_REHAB_ORANGEADE = registerItem("monster_rehab_orangeade",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_ORANGEADE)));

    public static final Item MONSTER_REHAB_PINK_LEMONADE = registerItem("monster_rehab_pink_lemonade",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_PINK_LEMONADE)));

    public static final Item MONSTER_REHAB_PROTEAN = registerItem("monster_rehab_protean",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_PROTEAN)));

    public static final Item MONSTER_REHAB_ROJO = registerItem("monster_rehab_rojo",
            new MonsterEnergyNitroItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.MONSTER_REHAB_ROJO)));



    public static final Item MONSTER_CAN = registerItem("monster_can",
            new MonsterEnergyCanItem(new FabricItemSettings().group(ModItemGroup.MONSTERS)));

    public static final Item DRAGON_BREATH_MONSTER_CAN = registerItem("dragon_breath_monster_can",
            new Item(new FabricItemSettings().group(ModItemGroup.MONSTERS)));

    public static final Item CAFFEINE_POWDER = registerItem("caffeine_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.MONSTERS)));

    public static final Item TAURINE_POWDER = registerItem("taurine_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.MONSTERS)));

    public static final Item VITAMIN_POWDER = registerItem("vitamin_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.MONSTERS)));

    public static final Item SWEETENER_POWDER = registerItem("sweetener_powder",
            new Item(new FabricItemSettings().group(ModItemGroup.MONSTERS)));

    public static final Item WATER_FILLED_MONSTER_CAN = registerItem("water_filled_monster_can",
            new WaterFilledMonsterEnergyCanItem(new FabricItemSettings().group(ModItemGroup.MONSTERS).maxCount(8).food(ModFoodComponents.WATER_FILLED_MONSTER_ENERGY_CAN)));

    public static final Item MONSTER_FORMULA = registerItem("monster_formula",
            new Item(new FabricItemSettings().group(ModItemGroup.MONSTERS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MonsterEnergyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MonsterEnergyMod.LOGGER.info("Registering Mod Items for " + MonsterEnergyMod.MOD_ID);
    }

}
