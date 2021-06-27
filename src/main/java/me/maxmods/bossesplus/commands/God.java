package me.maxmods.bossesplus.commands;

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
                player.sendMessage("You are now in god mode! You are now able to beat god himself.");
            }

            else if(player.getAllowFlight()){
                player.setInvulnerable(false);
                player.setAllowFlight(false);
                player.sendMessage("You left god mode! You are now a normal person.");
            }



        }



        return true;
    }
}
