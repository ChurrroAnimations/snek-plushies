package github.churrroanimations.snekplushies.provider;

import github.churrroanimations.snekplushies.init.BlocksReg;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class MakerOfWoolTag extends FabricTagProvider.BlockTagProvider {

    public MakerOfWoolTag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(BlocksReg.transWool)
                .add(BlocksReg.gayWool);
    }
}
