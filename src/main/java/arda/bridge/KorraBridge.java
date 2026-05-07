package arda.bridge;

import arda.bridge.mythic.PKMechanic;
import io.lumine.mythic.bukkit.events.MythicMechanicLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class KorraBridge extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onLoad(MythicMechanicLoadEvent e) {
        if (e.getMechanicName().equalsIgnoreCase("projectkorra")) {
            e.register(new PKMechanic(e.getConfig()));
        }
    }
}
