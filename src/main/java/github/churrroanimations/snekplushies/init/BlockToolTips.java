package github.churrroanimations.snekplushies.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class BlockToolTips extends BlockItem {
    private final String prideWoolName;

    public BlockToolTips(Block block, Settings settings, String prideWoolName) {
        super(block, settings);
        this.prideWoolName = prideWoolName;
    }

    @Override
    public void appendTooltip (ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);

        String tTipKey = "ttip.snekplushies." + prideWoolName;

        tooltip.add(Text.translatable(tTipKey).formatted(Formatting.YELLOW));
    }
}
