package isensehostility.improved_berries.util;

import isensehostility.improved_berries.ImprovedBerries;
import isensehostility.improved_berries.items.SweetBerryPieItem;
import isensehostility.improved_berries.items.SweetBerryWineItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ImprovedBerriesRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ImprovedBerries.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<SweetBerryPieItem> SWEET_BERRY_PIE = ITEMS.register("sweet_berry_pie", SweetBerryPieItem::new);
    public static final RegistryObject<SweetBerryWineItem> SWEET_BERRY_WINE = ITEMS.register("sweet_berry_wine", SweetBerryWineItem::new);
}
