package arda.bridge.mythic;

import arda.bridge.pk.PKAbilityExecutor;
import io.lumine.mythic.api.skills.*;
import io.lumine.mythic.api.config.MythicLineConfig;

public class PKMechanic implements ITargetedEntitySkill {

    private final String ability;

    public PKMechanic(MythicLineConfig config) {
        this.ability = config.getString(new String[]{"ability","a"}, "FireBlast");
    }

    @Override
    public SkillResult castAtEntity(SkillMetadata data, AbstractEntity target) {
        PKAbilityExecutor.execute(data.getCaster().getEntity().getBukkitEntity(), ability);
        return SkillResult.SUCCESS;
    }
}
