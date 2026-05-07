package arda.bridge.pk;

import arda.bridge.util.FakePlayerUtil;
import com.projectkorra.projectkorra.ability.CoreAbility;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class PKAbilityExecutor {

    public static void execute(LivingEntity entity, String abilityName) {

        Player fake = FakePlayerUtil.getOrCreate(entity);

        if (fake == null) return;

        CoreAbility ability = CoreAbility.getAbility(abilityName);

        if (ability == null) return;

        try {
            ability.getClass().getConstructor(Player.class).newInstance(fake);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
