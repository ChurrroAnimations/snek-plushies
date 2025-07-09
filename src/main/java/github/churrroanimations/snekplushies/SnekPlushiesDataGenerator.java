package github.churrroanimations.snekplushies;

import github.churrroanimations.snekplushies.provider.SnekPlushiesTags;
import github.churrroanimations.snekplushies.provider.SnekPlusiesRecipies;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SnekPlushiesDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack snekData = fabricDataGenerator.createPack();
        snekData.addProvider(SnekPlusiesRecipies::new);
        snekData.addProvider(SnekPlushiesTags::new);
    }
}
