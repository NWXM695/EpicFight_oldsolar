package net.EpicFight_oldsolar;

import net.EpicFight_oldsolar.Network.PacketHandler;
import net.EpicFight_oldsolar.capabilites.oldsolarCapability;
import net.EpicFight_oldsolar.gameasset.EpicFigeht_oldarAnimations;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("epicfight_oldsolar")
public class EpicFight_oldsolar {
    public static final String MODID = "epicfight_oldsolar";

    public EpicFight_oldsolar() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(oldsolarCapability::register);
        bus.addListener(EpicFigeht_oldarAnimations::registerAnimations);
        PacketHandler.register();
    }
}
