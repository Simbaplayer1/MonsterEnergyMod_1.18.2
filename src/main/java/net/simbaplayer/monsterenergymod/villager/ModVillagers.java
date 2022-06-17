package net.simbaplayer.monsterenergymod.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.simbaplayer.monsterenergymod.MonsterEnergyMod;
import net.simbaplayer.monsterenergymod.block.ModBlocks;

public class ModVillagers {
    public static final PointOfInterestType MONSTER_LAB_POI = registerPOI("monsterlabpoi", ModBlocks.MONSTER_LAB);
    public static final VillagerProfession MONSTER_SCIENTIST = registerProfession("monsterscientist", MONSTER_LAB_POI);

    public static VillagerProfession registerProfession(String name, PointOfInterestType type) {

        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(MonsterEnergyMod.MOD_ID, name),
                VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                        SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(MonsterEnergyMod.MOD_ID, name),
                PointOfInterestTypeAccessor.callCreate(name,
                        ImmutableSet.copyOf(block.getStateManager().getStates()), 1,1));
    }

    public static void setupPOIs() {
        PointOfInterestTypeAccessor.callSetup(MONSTER_LAB_POI);
    }

}
