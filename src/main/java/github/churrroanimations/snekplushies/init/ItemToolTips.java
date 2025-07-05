package github.churrroanimations.snekplushies.init;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class ItemToolTips extends ArmorItem {
    private final String plushName;

    public ItemToolTips(RegistryEntry<ArmorMaterial> material, Type type, Settings settings, String plushName) {
        super(material, type, settings);
        this.plushName = plushName;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);

        String tTipKey = "ttip.snekplushies." + plushName;

        tooltip.add(Text.translatable(tTipKey).formatted(Formatting.YELLOW));
    }
}