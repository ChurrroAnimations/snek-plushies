package github.churrroanimations.snekplushies;

import github.churrroanimations.snekplushies.init.Armor;
import github.churrroanimations.snekplushies.init.Items;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SnekPlushies implements ModInitializer {
	public static final String MODID = "snekplushies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialising");
		Armor.armorLoad();
		Items.itemsLoad();
	}

	public static Identifier itemId (String itemPath) {
		return Identifier.of(MODID, itemPath);
	}
}