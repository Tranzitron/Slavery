package us.babey.slavery;

import us.babey.slavery.Listeners.InteractListener;
import us.babey.slavery.Listeners.JoinListener;
import us.babey.slavery.Listeners.MoveListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        registerEvents();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(this), this);
        pm.registerEvents(new MoveListener(this), this);
        pm.registerEvents(new InteractListener(this),this);
    }
}
