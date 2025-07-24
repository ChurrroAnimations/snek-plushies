package github.churrroanimations.snekplushies.provider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SnekPlushiesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack snekData = fabricDataGenerator.createPack();
        snekData.addProvider(MakerOfRecipes::new);
        snekData.addProvider(MakerOfWoolTag::new);
        snekData.addProvider(MakerOfPlushieTags::new);
    }
}
