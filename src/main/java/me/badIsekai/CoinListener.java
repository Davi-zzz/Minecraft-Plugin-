package me.badIsekai;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class CoinListener implements Listener {

    public CoinListener (BadIsekai plugin){

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        Bukkit.getConsoleSender().sendMessage("um player entrou");
        Coin coin = new Coin();


        for(int i = 0; i < 2 ; i++) {

//            ItemStack item = new Coin().goldCoin(1);
            ItemStack item2 = new Coin().silverCoin(11);

//            p.getInventory().addItem(item);
            p.getInventory().addItem(item2);
            coin.autoAdjust(p);


        }


    }
}
