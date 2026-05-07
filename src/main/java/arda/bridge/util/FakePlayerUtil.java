package arda.bridge.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class FakePlayerUtil {

    public static Player getOrCreate(LivingEntity entity) {
        return Bukkit.getOnlinePlayers().stream().findFirst().orElse(null);
    }
}
