package me.maxmods.bossesplus.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class God implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (sender instanceof Player){

            Player player = (Player) sender;

            if (player.getAllowFlight() == false){
                player.setInvulnerable(true);
                player.setAllowFlight(true);
                player.sendMessage("You are now in " + ChatColor.RED + "GOD" + ChatColor.WHITE + " mode! You are now able to beat god himself.");
                player.setHealth(20);
            }

            else if(player.getAllowFlight()){
                player.setInvulnerable(false);
                player.setAllowFlight(false);
            player.sendMessage("You left " + ChatColor.RED + "GOD" + ChatColor.WHITE +" mode! You are now a normal person.");
            }



        }



        return true;
    }
}
