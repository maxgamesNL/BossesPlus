package me.maxmods.bossesplus.commands;

import me.maxmods.bossesplus.BossSpawnItems.ZombieMasterSpawnerItem;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SpawnBossesGUI implements CommandExecutor{


    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if(sender instanceof Player){
            Player player = (Player) sender;

            Inventory SpawnItemsGUI = Bukkit.createInventory(player, 9, "Spawns of the bosses!");


            SpawnItemsGUI.setItem(0, ZombieMasterSpawnerItem.ZombieMasterSpawnerItem);

            player.openInventory(SpawnItemsGUI);



        }



        return true;
    }

}
