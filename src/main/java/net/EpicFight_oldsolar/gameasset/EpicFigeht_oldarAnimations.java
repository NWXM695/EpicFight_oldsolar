package net.EpicFight_oldsolar.gameasset;

import yesman.epicfight.api.animation.types.StaticAnimation;
import yesman.epicfight.api.forgeevent.AnimationRegistryEvent;
import yesman.epicfight.gameasset.Armatures;
import yesman.epicfight.model.armature.HumanoidArmature;

public class EpicFigeht_oldarAnimations {
    public static StaticAnimation HEROBRINE3FLY;

    public EpicFigeht_oldarAnimations() {
    }

    public static void registerAnimations(AnimationRegistryEvent event) {
        event.getRegistryMap().put("epicfight_oldsolar", EpicFigeht_oldarAnimations::build);
    }

    public static void build() {
        HumanoidArmature biped = Armatures.BIPED;
        HEROBRINE3FLY = new StaticAnimation(true, "biped/epicfight_oldsolar/herobrine3fly", biped);
    }
}
