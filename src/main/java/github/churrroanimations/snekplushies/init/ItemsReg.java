package github.churrroanimations.snekplushies.init;

import github.churrroanimations.snekplushies.SnekPlushies;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class ItemsReg {
    // Make Levi a marketable plushie
    public static final RegistryEntry<ArmorMaterial> leviMaterial = ArmorReg.plushMaterialReg("levi_material");
    public static final Item leviSnekkyPlushie = regPlushItem("levi_snekky_plush", leviMaterial);

    // Make Churro a marketable plushie
    public static final RegistryEntry<ArmorMaterial> churroMaterial = ArmorReg.plushMaterialReg("churro_material");
    public static final Item churroTurtlePlushie = regPlushItem("churro_turtle_plush", churroMaterial);

    // Make Churro a marketable plushie
    public static final RegistryEntry<ArmorMaterial> cherryMaterial = ArmorReg.plushMaterialReg("cherry_material");
    public static final Item cherrySnekkyPlushie = regPlushItem("cherry_snekky_plush", cherryMaterial);

    // Make Grim a marketable plushie
    public static final RegistryEntry<ArmorMaterial> grimMaterial = ArmorReg.plushMaterialReg("grim_material");
    public static final Item grimPupperPlushie = regPlushItem("grim_pupper_plush", grimMaterial);


    // Book of Plushies
    public static final Item bookOfPlushies = itemReg("book_of_plushies", new BookOfPlushies(new Item.Settings().maxCount(1)));

    public static void addItemsToCreativeInv (FabricItemGroupEntries itemsGroup) {
        itemsGroup.add(ItemsReg.leviSnekkyPlushie);
        itemsGroup.add(ItemsReg.churroTurtlePlushie);
        itemsGroup.add(ItemsReg.cherrySnekkyPlushie);
        itemsGroup.add(ItemsReg.grimPupperPlushie);
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
