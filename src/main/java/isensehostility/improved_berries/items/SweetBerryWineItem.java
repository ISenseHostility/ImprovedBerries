package isensehostility.improved_berries.items;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SweetBerryWineItem extends Item {
    public SweetBerryWineItem() {
        super(new Properties().maxStackSize(16).containerItem(Items.GLASS_BOTTLE).group(ItemGroup.FOOD).food(new Food.Builder().hunger(3).saturation(0.33F).effect(new EffectInstance(Effects.NAUSEA,200,1),1).effect(new EffectInstance(Effects.ABSORPTION,600,1),1).build()));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerentity = user instanceof PlayerEntity ? (PlayerEntity) user : null;

        if (playerentity == null || !playerentity.abilities.isCreativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.GLASS_BOTTLE);
            }

            if (playerentity != null) {
                playerentity.inventory.addItemStackToInventory(new ItemStack(Items.GLASS_BOTTLE));
            }
        }
        return this.isFood() ? user.onFoodEaten(world, stack) : stack;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
