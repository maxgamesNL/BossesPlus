package me.maxmods.bossesplus.BossSpawnItems;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ZombieMasterSpawnerItem {

    public static ItemStack ZombieMasterSpawnerItem;

    public static void init(){
        createZombieMasterSpawnerItem();
    }


    private static void createZombieMasterSpawnerItem(){
        ItemStack spawnItem = new ItemStack(Material.ROTTEN_FLESH, 1);

        ItemMeta spawnItemMeta = spawnItem.getItemMeta();
        spawnItemMeta.setDisplayName(ChatColor.DARK_GREEN + "ZombieMaster Spawner");
        spawnItem.addUnsafeEnchantment(Enchantment.LUCK, 1);
        spawnItemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        spawnItem.setItemMeta(spawnItemMeta);

        ZombieMasterSpawnerItem = spawnItem;


    }


}
