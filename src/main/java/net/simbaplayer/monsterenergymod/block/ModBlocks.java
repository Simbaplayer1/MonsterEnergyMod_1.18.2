package net.simbaplayer.monsterenergymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.simbaplayer.monsterenergymod.MonsterEnergyMod;
import net.minecraft.util.registry.Registry;
import net.simbaplayer.monsterenergymod.block.custom.MonsterLabBlock;
import net.simbaplayer.monsterenergymod.item.ModItemGroup;

public class  ModBlocks {

    public static final Block MONSTER_LAB = registerBlock("monster_lab",
    new MonsterLabBlock(FabricBlockSettings.of(Material.SOIL).strength(1f)), ItemGroup.MISC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MonsterEnergyMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MonsterEnergyMod.MOD_ID, name ),
                 new BlockItem(block, new FabricItemSettings().group(ModItemGroup.MONSTERS)));
    }

    public static void registerModBlocks() {
        MonsterEnergyMod.LOGGER.info("Registering ModBlocks for " + MonsterEnergyMod.MOD_ID);
    }

}