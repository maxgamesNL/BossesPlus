package me.maxmods.bossesplus.Events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreakActions implements Listener {

    //Make sure the spawn blocks dont get destroyed.
    @EventHandler
    void OnBlockBreakEvent(BlockBreakEvent e){

        int HarvestedBlockX = e.getBlock().getLocation().getBlockX();
        int HarvestedBlockY = e.getBlock().getLocation().getBlockY();
        int HarvestedBlockZ = e.getBlock().getLocation().getBlockZ();

        if(e.getBlock().getType().equals(Material.IRON_BLOCK)){

            if(HarvestedBlockX < 5 && HarvestedBlockX > -5){
                if(HarvestedBlockZ < 5 && HarvestedBlockZ > -5){
                    if(HarvestedBlockY == 69){
                        e.setCancelled(true);
                    }
                }
            }}


    }
}
