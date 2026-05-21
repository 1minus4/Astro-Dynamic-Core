package net.oneminus4.astrodyncore.common.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oneminus4.astrodyncore.ASDCore;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ASDCore.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ASDC_GENERIC = CREATIVE_MODE_TABS.register("asdc_generic_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ASDGenericItems.ICON_CLAYLESS.get()))
                    .title(Component.translatable("creativetab.asdc_generic_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // steam ulv items
                        pOutput.accept(ASDGenericItems.HYDRAULIC_CONTROL_UNIT.get());
                        // easter egg quest items
                        pOutput.accept(ASDGenericItems.ICON_CLAYLESS.get());
                        pOutput.accept(ASDGenericItems.ICON_576COKEOVEN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
