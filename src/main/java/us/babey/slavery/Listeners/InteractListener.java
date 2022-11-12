package us.babey.slavery.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import us.babey.slavery.Main;

public class InteractListener implements Listener {

    private Main main;
    public InteractListener(Main main){
        this.main = main;
    }

    int compteur = 1;
    @EventHandler
    public void onRightClickEntity(PlayerInteractAtEntityEvent e){
        Player p = e.getPlayer();
        Player slave;
        ItemStack item = p.getItemInHand();
        boolean isLead = item.getType() == Material.LEAD;
        boolean isPlayer = e.getRightClicked().getType() == EntityType.PLAYER;
        boolean isMainHand = e.getHand() != EquipmentSlot.OFF_HAND;

        if(isLead && isPlayer && isMainHand){
            slave = (Player) e.getRightClicked();
            Bukkit.broadcastMessage(compteur+"");

            if(slave.isLeashed()){
                p.getEquipment().setHelmet(new ItemStack(Material.AIR));
            } else {
                p.getEquipment().setHelmet(new ItemStack(Material.GOLDEN_HELMET));
            }


            compteur++;
        }
    }



}
