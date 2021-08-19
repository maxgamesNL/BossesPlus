package me.maxmods.bossesplus.Events;

import me.maxmods.bossesplus.BossSpawnItems.ZombieMasterSpawnerItem;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class AtSpawnBoss implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent e){

        Player p = e.getPlayer();

        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getItem() != null){
                if(e.getItem().getItemMeta().equals(ZombieMasterSpawnerItem.ZombieMasterSpawnerItem.getItemMeta())){
                    //if the player right clicks on a block with the ZombieMasterSpawnerItem in their hand this code get run.
                    Location SpawnCoords = e.getClickedBlock().getLocation();
                    p.getWorld().spawnEntity(SpawnCoords, EntityType.ZOMBIE);

                }
            }
        }


    }

}
