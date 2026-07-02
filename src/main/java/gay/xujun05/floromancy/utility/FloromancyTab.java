package gay.xujun05.floromancy.utility;

import gay.xujun05.floromancy.Floromancy;
import gay.xujun05.floromancy.block.BlockRegistry;
import gay.xujun05.floromancy.item.ItemRegistry;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

public class FloromancyTab {
    public static final ResourceKey<CreativeModeTab> CREATIVE_MODE_TAB_RESOURCE_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Floromancy.MOD_ID, "creative_tab")
    );

    public static final CreativeModeTab CREATIVE_MODE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ItemRegistry.TEST))
            .title(Component.translatable("creativeTab.whimsy"))
            .displayItems((parameters, output) -> {
                //アイテム類
                output.accept(ItemRegistry.TEST);
                //ブろっく類
                output.accept(BlockRegistry.TEST_BLOCK);
            })
            .build();
    public static void initialize() {
        Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                CREATIVE_MODE_TAB_RESOURCE_KEY,
                CREATIVE_MODE_TAB
        );
    }
}