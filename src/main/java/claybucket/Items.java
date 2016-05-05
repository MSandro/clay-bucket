package claybucket;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items
{
    public static final String UNFIRED_CLAYBUCKET = "unfiredClaybucket";
    public static final String CLAYBUCKET = "claybucket";

    public static final String[] NAMES = {"water", "lava"};
    public static final Block[] BLOCKS = {Blocks.water, Blocks.lava};
    public static final Fluid[] FLUIDS = {FluidRegistry.WATER, FluidRegistry.LAVA};
    public static final boolean[] DESTROY_BUCKET = {false, true};

    public static Item unfiredClaybucket;
    public static Item claybucket;

    public static void registerAll()
    {
        unfiredClaybucket = new ItemUnfiredClaybucket();
        GameRegistry.registerItem(unfiredClaybucket, UNFIRED_CLAYBUCKET);

        claybucket = new ItemClayBucket();
        GameRegistry.registerItem(claybucket, CLAYBUCKET);
    }
}