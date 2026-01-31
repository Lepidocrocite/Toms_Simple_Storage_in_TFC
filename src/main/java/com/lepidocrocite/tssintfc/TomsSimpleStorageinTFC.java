package com.lepidocrocite.tssintfc;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
@Mod(TomsSimpleStorageinTFC.MODID)
public class TomsSimpleStorageinTFC {
    public static final String MODID = "tomssimplestorageintfc";
    public static final Logger LOGGER = LogUtils.getLogger();
    public TomsSimpleStorageinTFC(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
