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

public class MakerOfRecipes extends FabricRecipeProvider {

    public MakerOfRecipes(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter snekPlushiesRecipeExporter) {
        // Plushie recipes
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsReg.cherrySnekkyPlushie)
                .input('R', Items.RED_WOOL)
                .input('B', Items.BLACK_CARPET)
                .input('W', Items.WHITE_DYE)
                .pattern(" WB")
                .pattern("RRR")
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .criterion(hasItem(Items.BLACK_CARPET), conditionsFromItem(Items.BLACK_CARPET))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(snekPlushiesRecipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsReg.grimPupperPlushie)
                .input('L', Items.LIGHT_BLUE_WOOL)
                .input('P', Items.PURPLE_DYE)
                .input('B', Items.BLUE_DYE)
                .input('C', Items.CYAN_DYE)
                .pattern("LLL")
                .pattern("PBC")
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL), conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .offerTo(snekPlushiesRecipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemsReg.grimPupperPlushie)
                .input('L', Items.LIGHT_BLUE_WOOL)
                .input('P', Items.PURPLE_DYE)
                .input('C', Items.CYAN_DYE)
                .input('B', Items.BLUE_DYE)
                .pattern("LLL")
                .pattern("PCB")
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL), conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .criterion(hasItem(Items.CYAN_DYE), conditionsFromItem(Items.CYAN_DYE))
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(snekPlushiesRecipeExporter);





        // Pride wool recipes
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

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlocksReg.gayWool, 6)
                .input(Items.RED_WOOL)
                .input(Items.ORANGE_WOOL)
                .input(Items.YELLOW_WOOL)
                .input(Items.GREEN_WOOL)
                .input(Items.BLUE_WOOL)
                .input(Items.PURPLE_WOOL)
                .criterion(hasItem(Items.RED_WOOL), conditionsFromItem(Items.RED_WOOL))
                .criterion(hasItem(Items.ORANGE_WOOL), conditionsFromItem(Items.ORANGE_WOOL))
                .criterion(hasItem(Items.YELLOW_WOOL), conditionsFromItem(Items.YELLOW_WOOL))
                .criterion(hasItem(Items.GREEN_WOOL), conditionsFromItem(Items.GREEN_WOOL))
                .criterion(hasItem(Items.BLUE_WOOL), conditionsFromItem(Items.BLUE_WOOL))
                .criterion(hasItem(Items.PURPLE_WOOL), conditionsFromItem(Items.PURPLE_WOOL))
                .offerTo(snekPlushiesRecipeExporter);
    }
}
