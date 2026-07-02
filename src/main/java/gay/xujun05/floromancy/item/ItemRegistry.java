package gay.xujun05.floromancy.item;

import java.util.function.Function;

public class ItemRegistry {

    public static final net.minecraft.world.item.Item TEST = register("test", net.minecraft.world.item.Item::new, new net.minecraft.world.item.Item.Properties());

    public static <T extends net.minecraft.world.item.Item> T register(String name, Function<net.minecraft.world.item.Item.Properties, T> itemFactory, net.minecraft.world.item.Item.Properties settings) {
        return null;
    }

    public static void initialize() {
    }
}
