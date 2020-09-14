package me.badIsekai;

import org.bukkit.Bukkit;

import org.bukkit.ChatColor;
import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.io.BukkitObjectInputStream;

public class CoinListener extends Trade implements Listener {

    public CoinListener(BadIsekai plugin) {

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        Bukkit.getConsoleSender().sendMessage("um player entrou");
        Coin coin = new Coin();


        ItemStack item = new Coin().goldCoin(20);
        ItemStack item2 = new Coin().silverCoin(63);

        p.getInventory().addItem(item);
        p.getInventory().addItem(item2);
        coin.autoAdjust(p);


    }
    @EventHandler
    public void onChunckLoadEvent(ChunkLoadEvent event, Trade tr){

        if(event.isNewChunk()){

            tr.traderVillager(Bukkit.getServer());



        }
    }




//    @EventHandler
//    public void PlayerInteractEvent(PlayerInteractEvent event) {
//        Player p = event.getPlayer();
//        if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
//            Trade trade = new Trade();
//            trade.teste(p);
//            trade.traderVillager();
//        }
//
//    }
}