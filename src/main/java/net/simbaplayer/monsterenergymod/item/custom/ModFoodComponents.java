package net.simbaplayer.monsterenergymod.item.custom;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent MONSTER_ULTRA_VIOLET = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.NIGHT_VISION, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_DRAGON_WHITE_TEA = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 4), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_DRAGON_GREEN_TEA = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 4), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_DRAGON_YERBA_MATE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 4), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_GOLDEN_DRAGON = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 999999999, 1), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.RESISTANCE, 999999999, 1), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.FIRE_RESISTANCE, 999999999, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.ABSORPTION, 999999999, 4), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ORIGINAL = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 3600, 2), 1.0f).alwaysEdible().build();

    public static final FoodComponent WATER_FILLED_MONSTER_ENERGY_CAN = new FoodComponent.Builder().hunger(0).saturationModifier(0f).build();

    public static final FoodComponent MONSTER_ORIGINAL_ZERO = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_M80 = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_M80_ALT = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_MIXXD = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_MEAN_BEAN = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SLOW_FALLING, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_MULE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_DOCTOR = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.INSTANT_HEALTH, 1, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_HAMILTON = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.JUMP_BOOST, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 2), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_GREEN = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_PINK_LEMONADE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_LEMONADE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_PROTEAN = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_PEACH = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_ROJO = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_RASPBERRY = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_REHAB_ORANGEADE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_PACIFIC = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.DOLPHINS_GRACE, 2400, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_MANGO_LOCO = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.INSTANT_HEALTH, 1, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 3600, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_KHAOS = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_KHAOS_ALT = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_KHAOTIC = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.INSTANT_HEALTH, 1, 2), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.JUMP_BOOST, 600, 4), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.WEAKNESS, 600, 4), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.BLINDNESS, 600, 4), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.SLOW_FALLING, 600, 0), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.NAUSEA, 600, 9), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.LEVITATION, 600, 4), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 600, 4), 0.5f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_RIPPER = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SATURATION, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_NITRO = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 2400, 3), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_MAD_DOG = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.JUMP_BOOST, 6000, 2), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_BALLERS_BLEND = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.JUMP_BOOST, 6000, 1), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 2), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ASSAULT = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.STRENGTH, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_UNLEADED = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.RESISTANCE, 6000, 2), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SLOWNESS, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_PIPELINE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 1800, 1), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.STRENGTH, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 3600, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_RED = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.STRENGTH,6000, 0), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_SUNRISE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.FIRE_RESISTANCE, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_PEACH = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.HASTE, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_CITRON = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.ABSORPTION, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_PARADISE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.JUMP_BOOST, 6000, 1), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_BLUE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.WATER_BREATHING, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_BLACK = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.RESISTANCE, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SLOW_FALLING, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_GOLD = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.LUCK, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_ROSA = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_WATERMELON = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.INSTANT_HEALTH, 1, 1), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();

    public static final FoodComponent MONSTER_ULTRA_FIESTA = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.REGENERATION, 6000, 0), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.SPEED, 6000, 1), 1.0f).alwaysEdible().build();




}
