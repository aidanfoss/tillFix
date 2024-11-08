package quantumaidan.tillfix;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.TillableBlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.HoeItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tillfix implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("tillfix");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		TillableBlockRegistry.register(Blocks.PODZOL, HoeItem::canTillFarmland, HoeItem.createTillAction(Blocks.FARMLAND.getDefaultState()));
		TillableBlockRegistry.register(Blocks.MYCELIUM, HoeItem::canTillFarmland, HoeItem.createTillAction(Blocks.FARMLAND.getDefaultState()));
		LOGGER.info("TillFix Applied! - https://github.com/aidanfoss/tillFix");
	}
}