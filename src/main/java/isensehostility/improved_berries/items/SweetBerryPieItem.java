package isensehostility.improved_berries.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SweetBerryPieItem extends Item {
    public SweetBerryPieItem() {
        super(new Properties().group(ItemGroup.FOOD).food(new Food.Builder().hunger(6).saturation(1.06F).build()));
    }
}
