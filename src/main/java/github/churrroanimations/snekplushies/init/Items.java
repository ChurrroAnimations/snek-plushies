package github.churrroanimations.snekplushies.init;

import github.churrroanimations.snekplushies.SnekPlushies;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class Items {
    public static final RegistryEntry<ArmorMaterial> leviMaterial = Armor.plushMaterialReg("levi_material");
    public static final Item leviSnekkyPlushie = regPlushItem("levi_snekky_plush", leviMaterial);



    public static void addItemsToCreativeInv (FabricItemGroupEntries itemsGroup) {
        itemsGroup.add(Items.leviSnekkyPlushie);
    }

    public static Item regPlushItem (String plushName, RegistryEntry<ArmorMaterial> plushMaterial) {
        return itemReg(plushName, new ItemToolTips(plushMaterial, ArmorItem.Type.HELMET, new Item.Settings().maxCount(1), plushName));
    }

    public static <ItemClass extends Item> ItemClass itemReg (String itemName, ItemClass itemData) {
        return Registry.register(Registries.ITEM, SnekPlushies.itemId(itemName), itemData);
    }

    public static void itemsLoad() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(Items::addItemsToCreativeInv);
    }
}
