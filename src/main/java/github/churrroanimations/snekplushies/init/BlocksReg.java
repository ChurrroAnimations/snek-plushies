package github.churrroanimations.snekplushies.init;

import github.churrroanimations.snekplushies.SnekPlushies;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class BlocksReg {
    public static final Block transWool = regPrideWool("trans", MapColor.LIGHT_BLUE);
    public static final Block gayWool = regPrideWool("gay", MapColor.RED);

    public static void addBlocksToCreativeInv(FabricItemGroupEntries itemsGroup) {
        itemsGroup.add(BlocksReg.transWool);
        itemsGroup.add(BlocksReg.gayWool);
    }

    public static Block regPrideWool (String prideName, MapColor prideColor) {
        return regBlock(prideName + "_wool",  new Block(AbstractBlock.Settings.create().mapColor(prideColor).instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()));
    }

    public static <gay extends Block> gay regBlock (String blockName, gay blockData) {
        gay regedBlock = Registry.register(Registries.BLOCK, SnekPlushies.assetId(blockName), blockData);
        ItemsReg.itemReg(blockName, new BlockToolTips(regedBlock, new Item.Settings(), blockName));
        return regedBlock;
    }

    public static void blocksLoad() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(BlocksReg::addBlocksToCreativeInv);
    }
}
