package me.maxmods.bossesplus.Events;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

public class BlockBreakActions implements Listener {

    void OnBlockBreakEvent(PlayerHarvestBlockEvent e){

        int HarvestedBlockX = e.getHarvestedBlock().getLocation().getBlockX();
        int HarvestedBlockY = e.getHarvestedBlock().getLocation().getBlockY();
        int HarvestedBlockZ = e.getHarvestedBlock().getLocation().getBlockZ();

    }
}
