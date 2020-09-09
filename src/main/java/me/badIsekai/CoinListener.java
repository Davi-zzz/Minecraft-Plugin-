package me.badIsekai;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class CoinListener implements Listener {

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
        Trade trade = new Trade();
        trade.teste(p);
        trade.traderVillager();

    }

//    @EventHandler
//    public void PlayerInteractEvent(PlayerInteractEvent event) {
//        Player p = event.getPlayer();
//        if (event.getAction().equals(Action.RIGHT_CLICK_AIR)) {
//
//        }
//
//    }
}