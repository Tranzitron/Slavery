package us.babey.slavery.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import us.babey.slavery.Main;

public class MoveListener implements Listener {

    private Main main;
    public MoveListener(Main main){
        this.main = main;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){

    }
}
