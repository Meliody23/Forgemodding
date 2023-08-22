package net.meliody.tutorialmod.customitem;

import net.meliody.tutorialmod.TutorialMod;
import net.minecraft.advancements.critereon.DamagePredicate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCustomItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);
    public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register("custom_sword",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)
                    .stacksTo(1).rarity(Rarity.EPIC).durability(5000)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
