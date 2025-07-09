package github.churrroanimations.snekplushies.provider;

import github.churrroanimations.snekplushies.init.BlocksReg;
import github.churrroanimations.snekplushies.init.ItemsReg;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class SnekPlusiesRecipies extends FabricRecipeProvider {

    public SnekPlusiesRecipies(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter snekPlushiesRecipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsReg.leviSnekkyPlushie)
                .input('G', Items.GRAY_WOOL)
                .input('L', Items.LIME_WOOL)
                .input('Y', Items.YELLOW_DYE)
                .pattern("GLG")
                .pattern("Y G")
                .criterion(hasItem(Items.GRAY_WOOL), conditionsFromItem(Items.GRAY_WOOL))
                .criterion(hasItem(Items.GRAY_WOOL), conditionsFromItem(Items.LIME_WOOL))
                .criterion(hasItem(Items.GRAY_WOOL), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(snekPlushiesRecipeExporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsReg.churroTurtlePlushie)
                .input('G', Items.GREEN_WOOL)
                .input('L', Items.LIME_DYE)
                .pattern("GGG")
                .pattern(" LL")
                .criterion(hasItem(Items.GREEN_WOOL), conditionsFromItem(Items.GREEN_WOOL))
                .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                .offerTo(snekPlushiesRecipeExporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksReg.transWool, 5)
                .input(Items.LIGHT_BLUE_WOOL)
                .input(Items.PINK_WOOL)
                .input(Items.WHITE_WOOL)
                .input(Items.PINK_WOOL)
                .input(Items.LIGHT_BLUE_WOOL)
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL), conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.PINK_WOOL), conditionsFromItem(Items.PINK_WOOL))
                .criterion(hasItem(Items.WHITE_WOOL), conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(snekPlushiesRecipeExporter);
    }
}
