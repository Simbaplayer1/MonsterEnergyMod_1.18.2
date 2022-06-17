# MonsterEnergyMod_1.18.2
Monster Energy in Minecraft!
Adds 43 Monster Energy Flavors!

Getting started:
- Craft a empty Monster Can from 8 iron nuggets
- Filled it with water by right clicking the empty can to a water sourceblock
- Craft the Monster Lab block and place it next to a villager to make it a "Monster Scientist"
- Trade the necessary items to craft the Monsters!

You can go to src/main/recources/data/recipes to look at or change any recipe!

You can change the effects the monsters give by going to src/main/java/ney/simbaplayer/monsterenergymod/item/custom/ModFoodComponents!

 public static final FoodComponent MONSTER_EXAMPLE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(
            StatusEffects.(Insert minecraft effect in ALL CAPS), (Duration in Ticks), (Amplifier, a 0 means a level 1 effect)), 1.0f).statusEffect(new StatusEffectInstance(
            StatusEffects.(Insert minecraft effect in ALL CAPS), (Duration in Ticks), (Amplifier, a 0 means a level 1 effect)), 1.0f).alwaysEdible().build();
