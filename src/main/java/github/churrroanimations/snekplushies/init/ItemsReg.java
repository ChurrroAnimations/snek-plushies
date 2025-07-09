package github.churrroanimations.snekplushies.init;

import github.churrroanimations.snekplushies.SnekPlushies;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class ItemsReg {
    public static final RegistryEntry<ArmorMaterial> leviMaterial = ArmorReg.plushMaterialReg("levi_material");
    public static final Item leviSnekkyPlushie = regPlushItem("levi_snekky_plush", leviMaterial);


    public static final RegistryEntry<ArmorMaterial> churroMaterial = ArmorReg.plushMaterialReg("churro_material");
    public static final Item churroTurtlePlushie = regPlushItem("churro_turtle_plush", churroMaterial);


    public static void addItemsToCreativeInv (FabricItemGroupEntries itemsGroup) {
        itemsGroup.add(ItemsReg.leviSnekkyPlushie);
        itemsGroup.add(ItemsReg.churroTurtlePlushie);
    }

    public static Item regPlushItem (String plushName, RegistryEntry<ArmorMaterial> plushMaterial) {
        return itemReg(plushName, new ItemToolTips(plushMaterial, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1), plushName));
    }

    public static <ItemClass extends Item> ItemClass itemReg (String itemName, ItemClass itemData) {
        return Registry.register(Registries.ITEM, SnekPlushies.assetId(itemName), itemData);
    }

    public static void itemsLoad() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ItemsReg::addItemsToCreativeInv);
    }
}
