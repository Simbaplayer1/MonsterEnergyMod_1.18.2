package net.simbaplayer.monsterenergymod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.simbaplayer.monsterenergymod.item.ModItems;
import net.simbaplayer.monsterenergymod.villager.ModVillagers;

public class ModRegistries {
    public static void registerModStuffs() {
        registerCustomTrades();
    }


    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillagers.MONSTER_SCIENTIST, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.CAFFEINE_POWDER, 1),
                            10, 2, 0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.VITAMIN_POWDER, 1),
                            10, 3, 0.02f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.MONSTER_FORMULA, 1),
                            10, 3, 0.02f));
                });

            TradeOfferHelper.registerVillagerOffers(ModVillagers.MONSTER_SCIENTIST, 2,
                    factories -> {
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 7),
                                new ItemStack(ModItems.SWEETENER_POWDER, 1),
                                10, 2, 0.02f));
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 8),
                                new ItemStack(ModItems.TAURINE_POWDER, 1),
                                10, 2, 0.02f));
                        factories.add((entity, random) -> new TradeOffer(
                                new ItemStack(Items.EMERALD, 10),
                                new ItemStack(ModItems.MONSTER_FORMULA, 1),
                                10, 3, 0.02f));
                    });

                TradeOfferHelper.registerVillagerOffers(ModVillagers.MONSTER_SCIENTIST, 3,
                        factories -> {
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.EMERALD, 20),
                                    new ItemStack(ModItems.MONSTER_ORIGINAL, 1),
                                    6, 2, 0.02f));
                            factories.add((entity, random) -> new TradeOffer(
                                    new ItemStack(Items.EMERALD, 20),
                                    new ItemStack(ModItems.MONSTER_ORIGINAL_ZERO, 1),
                                    6, 2, 0.02f));

                        });

                    TradeOfferHelper.registerVillagerOffers(ModVillagers.MONSTER_SCIENTIST, 4,
                            factories -> {
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_RED, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_SUNRISE, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_CITRON, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_PARADISE, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_FIESTA, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_BLUE, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_VIOLET, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_BLACK, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_GOLD, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_ROSA, 1),
                                        6, 2, 0.02f));
                                factories.add((entity, random) -> new TradeOffer(
                                        new ItemStack(Items.EMERALD, 25),
                                        new ItemStack(ModItems.MONSTER_ULTRA_WATERMELON, 1),
                                        6, 2, 0.02f));

                            });
                }
    }