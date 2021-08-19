package me.maxmods.bossesplus;

import me.maxmods.bossesplus.BossSpawnItems.ZombieMasterSpawnerItem;
import me.maxmods.bossesplus.Events.AtSpawnBoss;
import me.maxmods.bossesplus.Events.BlockBreakActions;
import me.maxmods.bossesplus.commands.God;
import me.maxmods.bossesplus.commands.SpawnBossesGUI;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossesPlus extends JavaPlugin {


    //this is how you comment
    @Override
    public void onEnable() {
        getCommand("god").setExecutor(new God());
        getCommand("SpawnBosses").setExecutor(new SpawnBossesGUI());
        getServer().getPluginManager().registerEvents(new BlockBreakActions(), this);
        getServer().getPluginManager().registerEvents(new AtSpawnBoss(), this);
        ZombieMasterSpawnerItem.init();

    }

}



