package net.cct.luau;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ClientModInitializer;

public class CCTLuaUClient implements ClientModInitializer {

	public static final String MOD_ID = "cctluau";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("CCTLuaUClient has been initialized!");
	}

}
