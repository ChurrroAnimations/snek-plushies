package github.churrroanimations.snekplushies.provider;

import github.churrroanimations.snekplushies.SnekPlushies;
import github.churrroanimations.snekplushies.init.ItemsReg;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class MakerOfPlushieTags extends FabricTagProvider.ItemTagProvider{
    public MakerOfPlushieTags(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    // Appropriately labelling the plushies as marketable and cute
    public static final TagKey<Item> cutePlusheTag = TagKey.of(RegistryKeys.ITEM, SnekPlushies.assetId("cute"));
    public static final TagKey<Item> marketablePlusheTag = TagKey.of(RegistryKeys.ITEM, SnekPlushies.assetId("marketable"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(cutePlusheTag)
                .add(ItemsReg.leviSnekkyPlushie)
                .add(ItemsReg.churroTurtlePlushie)
                .add(ItemsReg.cherrySnekkyPlushie)
                .add(ItemsReg.grimPupperPlushie);

        getOrCreateTagBuilder(marketablePlusheTag)
                .add(ItemsReg.leviSnekkyPlushie)
                .add(ItemsReg.churroTurtlePlushie)
                .add(ItemsReg.cherrySnekkyPlushie)
                .add(ItemsReg.grimPupperPlushie);
    }
}
