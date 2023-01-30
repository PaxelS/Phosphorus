package net.paxel.grassrevampmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class grassRevampMod implements ModInitializer {
	public static final String MOD_ID = "grassRevampMod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("mod" + MOD_ID + " initialized");
	}
}
