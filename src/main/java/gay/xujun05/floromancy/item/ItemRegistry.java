package gay.xujun05.floromancy.item;

import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ItemRegistry {

    public static final Item TEST = register("test", Item::new, new Item.Properties());
    public static final Item FLORA_TOME = register("flora_tome", Item::new, new Item.Properties());
    public static <T extends net.minecraft.world.item.Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        return null;
    }

    public static void initialize() {
    }
}
