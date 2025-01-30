package net.EpicFight_oldsolar.capabilites;
import java.util.function.Function;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import reascer.wom.gameasset.WOMAnimations;
import reascer.wom.gameasset.WOMWeaponColliders;
import yesman.epicfight.api.animation.LivingMotions;
import yesman.epicfight.api.animation.types.StaticAnimation;
import yesman.epicfight.api.forgeevent.WeaponCapabilityPresetRegistryEvent;
import yesman.epicfight.gameasset.*;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import yesman.epicfight.world.capabilities.item.WeaponCapability;
import yesman.epicfight.world.capabilities.item.CapabilityItem.Styles;
import yesman.epicfight.world.capabilities.item.CapabilityItem.WeaponCategories;
import yesman.epicfight.gameasset.Animations;
import yesman.epicfight.gameasset.EpicFightSounds;

public class oldsolarCapability {
    public static final Function<Item, CapabilityItem.Builder> OLDSOLAR = (item) -> {
        WeaponCapability.Builder builder = WeaponCapability.builder().category(WeaponCategories.GREATSWORD).styleProvider((playerpatch) -> Styles.TWO_HAND).collider(WOMWeaponColliders.TORMENT).
                hitSound((SoundEvent)EpicFightSounds.BLADE_HIT.get()).swingSound((SoundEvent)EpicFightSounds.WHOOSH_BIG.get()).newStyleCombo(Styles.TWO_HAND,
                        new StaticAnimation[]{WOMAnimations.TORMENT_AUTO_1, WOMAnimations.TORMENT_AUTO_2, WOMAnimations.RUINE_AUTO_2, WOMAnimations.RUINE_AUTO_3, WOMAnimations.TORMENT_DASH, WOMAnimations.TORMENT_AIRSLAM}).
                newStyleCombo(Styles.MOUNT, new StaticAnimation[]{Animations.STEEL_WHIRLWIND}).innateSkill(Styles.TWO_HAND, (itemStack) -> EpicFightSkills.STEEL_WHIRLWIND).livingMotionModifier(Styles.TWO_HAND,
                        LivingMotions.IDLE, WOMAnimations.SOLAR_IDLE).livingMotionModifier(Styles.TWO_HAND,
                        LivingMotions.WALK, WOMAnimations.SOLAR_IDLE).livingMotionModifier(Styles.TWO_HAND,
                        LivingMotions.CHASE, WOMAnimations.SOLAR_RUN).livingMotionModifier(Styles.TWO_HAND,
                        LivingMotions.RUN, WOMAnimations.SOLAR_RUN).livingMotionModifier(Styles.TWO_HAND,
                        LivingMotions.SWIM, WOMAnimations.SOLAR_IDLE).livingMotionModifier(Styles.TWO_HAND,
                        LivingMotions.BLOCK, Animations.GREATSWORD_GUARD);
        return builder;
    };

    public oldsolarCapability() {
    }

    public static void register(WeaponCapabilityPresetRegistryEvent event) {
        event.getTypeEntry().put(new ResourceLocation("epicfight_oldsolar", "oldsolar"), OLDSOLAR);
    }
}


