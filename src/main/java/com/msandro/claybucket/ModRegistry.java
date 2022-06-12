package com.msandro.claybucket;

import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ModRegistry {
	public static final Item RAW_CLAY_BUCKET = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final ClayBucketItem CLAY_BUCKET = new ClayBucketItem(Fluids.EMPTY, new Item.Settings().group(ItemGroup.MISC));
	public static final ClayBucketItem WATER_CLAY_BUCKET = new ClayBucketItem(Fluids.WATER,
			new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final ClayBucketItem LAVA_CLAY_BUCKET = new ClayBucketItem(Fluids.LAVA,
			new Item.Settings().group(ItemGroup.MISC).maxCount(1));

	public static void init() {
		Registry.register(Registry.ITEM, ClayBucket.id("raw_claybucket"), RAW_CLAY_BUCKET);
		Registry.register(Registry.ITEM, ClayBucket.id("claybucket"), CLAY_BUCKET);
		Registry.register(Registry.ITEM, ClayBucket.id("water_claybucket"), WATER_CLAY_BUCKET);
		Registry.register(Registry.ITEM, ClayBucket.id("lava_claybucket"), LAVA_CLAY_BUCKET);
	}
}