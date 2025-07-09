package github.churrroanimations.snekplushies;

import github.churrroanimations.snekplushies.init.ArmorReg;
import github.churrroanimations.snekplushies.init.BlocksReg;
import github.churrroanimations.snekplushies.init.ItemsReg;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SnekPlushies implements ModInitializer {
	public static final String MODID = "snekplushies";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialising");
		ArmorReg.armorLoad();
		ItemsReg.itemsLoad();
		BlocksReg.blocksLoad();
	}

	public static Identifier assetId(String itemPath) {
		return Identifier.of(MODID, itemPath);
	}
}