package net.oneminus4.astrodyncore.common.item;


import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oneminus4.astrodyncore.ASDCore;

public class ASDGenericItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ASDCore.MOD_ID);

    // easter egg quest icons
    public static final RegistryObject<Item> ICON_CLAYLESS = ITEMS.register("icon_clayless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICON_576COKEOVEN = ITEMS.register("icon_576cokeovens.json",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);}
}
