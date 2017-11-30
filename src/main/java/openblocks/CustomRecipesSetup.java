package openblocks;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import openblocks.common.recipe.CrayonGlassesRecipe;
import openblocks.common.recipe.CrayonMergeRecipe;
import openblocks.common.recipe.CrayonMixingRecipe;
import openblocks.common.recipe.EpicEraserRecipe;
import openblocks.common.recipe.GoldenEyeRechargeRecipe;
import openblocks.common.recipe.MapCloneRecipe;
import openblocks.common.recipe.MapResizeRecipe;

@EventBusSubscriber
public class CustomRecipesSetup {

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> evt) {
		final IForgeRegistry<IRecipe> registry = evt.getRegistry();
		if (OpenBlocks.Blocks.imaginary != null) {
			registry.register(new CrayonMixingRecipe().setRegistryName(OpenBlocks.location("crayon_mix")));
			registry.register(new CrayonMergeRecipe().setRegistryName(OpenBlocks.location("crayon_merge")));

			if (OpenBlocks.Items.crayonGlasses != null) {
				registry.register(new CrayonGlassesRecipe().setRegistryName(OpenBlocks.location("crayon_glasses")));
			}
		}

		if (OpenBlocks.Items.emptyMap != null) {
			if (OpenBlocks.Items.heightMap != null) {
				registry.register(new MapCloneRecipe().setRegistryName(OpenBlocks.location("map_clone")));
			}

			if (OpenBlocks.Items.generic != null) {
				registry.register(new MapResizeRecipe().setRegistryName(OpenBlocks.location("map_resize")));
			}
		}

		if (OpenBlocks.Items.goldenEye != null) {
			registry.register(new GoldenEyeRechargeRecipe().setRegistryName(OpenBlocks.location("golden_eye_recharge")));
		}

		if (OpenBlocks.Items.epicEraser != null) {
			registry.register(new EpicEraserRecipe().setRegistryName(OpenBlocks.location("epic_eraser_action")));
		}

	}

}
