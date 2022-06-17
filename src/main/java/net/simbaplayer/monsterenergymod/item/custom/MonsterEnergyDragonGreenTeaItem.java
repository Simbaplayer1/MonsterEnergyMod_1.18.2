package net.simbaplayer.monsterenergymod.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.simbaplayer.monsterenergymod.item.ModItems;

public class MonsterEnergyDragonGreenTeaItem extends Item {
    public MonsterEnergyDragonGreenTeaItem(Settings settings) {
        super(settings);
    }


    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }


    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        super.finishUsing(stack, world, user);
        if (user instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity) user;
            Criteria.CONSUME_ITEM.trigger(serverPlayerEntity, stack);
            serverPlayerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
        }
        if (stack.isEmpty()) {
            return new ItemStack(ModItems.MONSTER_CAN);
        }
        if (user instanceof PlayerEntity && !((PlayerEntity) user).getAbilities().creativeMode) {
            ItemStack itemStack = new ItemStack(ModItems.MONSTER_CAN);
            PlayerEntity playerEntity = (PlayerEntity) user;
            if (!playerEntity.getInventory().insertStack(itemStack)) {
                playerEntity.dropItem(itemStack, false);
            }
        }
        return stack;
    }
}

