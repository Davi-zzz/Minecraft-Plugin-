package me.badIsekai;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Coin {

    //adding 'custom' item to the plugin
    public ItemStack makingCoin(Material m, String name, String desc, int amount){

        ItemStack item = new ItemStack(m, amount);

        //adding item's meta data ex: name, desc and others
        ItemMeta ac = item.getItemMeta();

        ac.setDisplayName(name);

        ArrayList<String> description = new ArrayList<String>();
        description.add(desc);
        ac.setLore(description);

        //hide vanilla text about items
        ac.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ac.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        //sets the item's meta to the custom 'ac' meta
        item.setItemMeta(ac);

        return item;
    }
    public ItemStack goldCoin(int amount){
        Material m = Material.GOLD_NUGGET;
        String name = (ChatColor.GOLD + "" + "MOEDA DE OURO");
        String desc = (ChatColor.BLUE + "" + ChatColor.ITALIC + "Uma moeda valiosa, \n pode ser usada para trocas");

        return makingCoin(m, name, desc, amount);

    }
    public ItemStack silverCoin(int amount){
        Material m = Material.IRON_NUGGET;
        String name = (ChatColor.GRAY + "" + "MOEDA DE PRATA");
        String desc = (ChatColor.BLUE + "" + ChatColor.ITALIC + "Uma moeda valiosa, pode ser usada para trocas (100 moedas de prata virarão 1 de ouro)");

        return makingCoin(m, name, desc, amount);
    }
    public void autoAdjust(Player p){
        //BUSCANDO PELO ITEM NO INVENTARIO DA ENTITY
        for (int i = 0; i != p.getInventory().getSize(); i++) {
            p.getInventory().getItem(i);

            if (p.getInventory().getItem(i) != null) {
                System.out.println("entrou no diferente de null");
                if (p.getInventory().getItem(i).getItemMeta().getDisplayName().equals(ChatColor.GRAY + "" + "MOEDA DE PRATA")) {
                    System.out.println("entrou no eh moeda de prata");
                    if (p.getInventory().getItem(i).getAmount() > 10) {
                        p.getInventory().addItem(goldCoin(1));
                        p.getInventory().removeItem(silverCoin(10));
                        System.out.println("tentou remover");
                    }
                }
            }

        }
    }
}