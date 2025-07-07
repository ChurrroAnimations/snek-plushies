package github.churrroanimations.snekplushies.init;

import github.churrroanimations.snekplushies.SnekPlushies;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ArmorReg {
    public static final Map<ArmorItem.Type, Integer> materialProtecc = Map.of(
            ArmorItem.Type.HELMET, 1,
            ArmorItem.Type.CHESTPLATE, 0,
            ArmorItem.Type.LEGGINGS, 0,
            ArmorItem.Type.BOOTS, 0
    );
    public static final int materialEnchant = 0;
    public static final RegistryEntry<SoundEvent> materialNoises = Registry.registerReference(
            Registries.SOUND_EVENT,
            SnekPlushies.itemId("plush_squeak"),
            SoundEvent.of(SnekPlushies.itemId("plush_squeak"))
    );
    public static final Supplier<Ingredient> materialRepair = () -> Ingredient.empty();
    public static final float materialStrength = 0;
    public static final float materialYeetRes = 0;
    public static final boolean materialColorable = false;

    public static RegistryEntry<ArmorMaterial> plushMaterialReg (String materialName) {

        List<ArmorMaterial.Layer> materialLayers = List.of(new ArmorMaterial.Layer(SnekPlushies.itemId(materialName), "", materialColorable));
        var armorMaterial = new ArmorMaterial(materialProtecc, materialEnchant, materialNoises, materialRepair, materialLayers, materialStrength, materialYeetRes);
        var regedMaterial = Registry.register(Registries.ARMOR_MATERIAL, SnekPlushies.itemId(materialName), armorMaterial);


        return RegistryEntry.of(regedMaterial);
    }

    public static void armorLoad () {}
}

