package net.paxel.phosphorus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Phosphorus implements ModInitializer {
	public static final String MOD_ID = "phosphorus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("mod " + MOD_ID + " initialized");
	}
}
