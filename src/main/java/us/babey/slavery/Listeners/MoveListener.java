package us.babey.slavery.Listeners;

import us.babey.slavery.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class MoveListener implements Listener {

    private Main main;
    public MoveListener(Main main){
        this.main = main;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        ItemStack hand1 = p.getItemInHand();
        p.sendMessage(""+hand1.toString());
    }
}
