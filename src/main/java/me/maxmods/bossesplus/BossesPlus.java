package me.maxmods.bossesplus;

import me.maxmods.bossesplus.Events.BlockBreakActions;
import me.maxmods.bossesplus.commands.God;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossesPlus extends JavaPlugin {


    //this is how you comment
    @Override
    public void onEnable() {
        getCommand("god").setExecutor(new God());
        getServer().getPluginManager().registerEvents(new BlockBreakActions(), this);

    }

}



