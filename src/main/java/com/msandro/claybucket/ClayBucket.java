package com.msandro.claybucket;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class ClayBucket implements ModInitializer {
    public static final String MOD_ID = "claybucket";

    @Override
    public void onInitialize() {
        com.msandro.claybucket.ModRegistry.init();
    }

    public static Identifier id(String id) {
        return new Identifier(MOD_ID, id);
    }

    public static Identifier identifier(String path)
    {
        return new Identifier(MOD_ID, path);
    }
}
