

package net.cct.luau;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import net.fabricmc.api.ModInitializer;

public class CCTLuaUServer implements ModInitializer {

	public static final String MOD_ID = "cctluau";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("CCTLuaUServer has initialized!");
	}

}
