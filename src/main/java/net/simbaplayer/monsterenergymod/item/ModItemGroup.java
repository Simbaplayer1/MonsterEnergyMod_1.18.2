package net.simbaplayer.monsterenergymod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.simbaplayer.monsterenergymod.MonsterEnergyMod;

public class ModItemGroup {
    public static final ItemGroup MONSTERS = FabricItemGroupBuilder.build(new Identifier(MonsterEnergyMod.MOD_ID, "monsters"),
    () -> new ItemStack(ModItems.MONSTER_ORIGINAL));

}

