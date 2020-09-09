package me.badIsekai;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BadIsekai extends JavaPlugin implements Listener {

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Inicializando Plugin...");
        Bukkit.getConsoleSender().sendMessage("\n" + ChatColor.GOLD +
                " ███████████   █████████  ██████████  █████  █████████  ██████████ █████   ████  █████████  █████\n" +
                "░░███░░░░░███ ███░░░░░███░░███░░░░███░░███  ███░░░░░███░░███░░░░░█░░███   ███░  ███░░░░░███░░███ \n" +
                " ░███    ░███░███    ░███ ░███   ░░███░███ ░███    ░░░  ░███  █ ░  ░███  ███   ░███    ░███ ░███ \n" +
                " ░██████████ ░███████████ ░███    ░███░███ ░░█████████  ░██████    ░███████    ░███████████ ░███ \n" +
                " ░███░░░░░███░███░░░░░███ ░███    ░███░███  ░░░░░░░░███ ░███░░█    ░███░░███   ░███░░░░░███ ░███ \n" +
                " ░███    ░███░███    ░███ ░███    ███ ░███  ███    ░███ ░███ ░   █ ░███ ░░███  ░███    ░███ ░███ \n" +
                " ███████████ █████   ███████████████  █████░░█████████  ██████████ █████ ░░█████████   ██████████\n"+
                "░░░░░░░░░░░ ░░░░░   ░░░░░░░░░░░░░░░  ░░░░░  ░░░░░░░░░  ░░░░░░░░░░ ░░░░░   ░░░░░░░░░   ░░░░░░░░░░ \n");

        PluginManager pm = getServer().getPluginManager();
        CoinListener cl = new CoinListener(this);
        Trade trade = new Trade();
        pm.registerEvents(cl, this);
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("desativando plugin...");
    }


}
