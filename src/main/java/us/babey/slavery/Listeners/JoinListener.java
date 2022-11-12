package us.babey.slavery.Listeners;

import us.babey.slavery.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private Main main;
    public JoinListener(Main main){
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
//        event.getPlayer().kick();
    }
}
