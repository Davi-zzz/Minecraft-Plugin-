package me.badIsekai;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;


import java.util.*;


public class Trade implements Listener {


    public Trade (){

    }


    public Server teste(Player p ){

        p.getLocation();
//        p.getWorld().getBlockAt(p.getLocation().getBlockX()+1, p.getLocation().getBlockY(), p.getLocation().getBlock();
        return Bukkit.getServer();

    }

//    public ItemStack bau(Material m, String name, String desc, int amount){
//
//        ItemStack item = new ItemStack(m, amount);
//
//        //adding item's meta data ex: name, desc and others
//        ItemMeta ac = item.getItemMeta();
//
//        ac.setDisplayName(name);
//
//        ArrayList<String> description = new ArrayList<String>();
//        description.add(desc);
//        ac.setLore(description);
//
//        //hide vanilla text about items
//        ac.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
//        ac.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//
//        //sets the item's meta to the custom 'ac' meta
//        item.setItemMeta(ac);
//
//        return item;
//    }
//    public ItemStack meBau(){
//        Material m = Material.CHEST;
//        String name = "bau";
//        String desc= "1 bau simples";
//        int amount = 1;
//
//        return bau(m, name, desc, amount);
//    }

    public void traderVillager(){
        Server server = Bukkit.getServer();
//        ArrayList<Entity> entidades = server.getWorld(server.getServerId()).getEntitiesByClasses(ArrayList<Entity> Villager);
            List<LivingEntity> entidades = Bukkit.getWorld("world").getLivingEntities();

            mayorGenerator(entidades, server);
            Bukkit.getConsoleSender().sendMessage(entidades.get(0).getName());
    }


    public List<LivingEntity> mayorGenerator(List<LivingEntity> a, Server s){
        List<LivingEntity> aux = new ArrayList<LivingEntity>();
        for (int i = 0; i != a.size(); i++){
            addEntity(a,aux);
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"TENTOU ADD ENTITY");
            Bukkit.getWorld(s.getServerId()).spawnEntity(a.get(i).getLocation(), EntityType.VILLAGER);

            Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA+ "MAYOR GERADO EM "+a.get(i).getLocation());
        }
        return a;
    }
    public void addEntity (List<LivingEntity> b, List<LivingEntity> c) {

        for (int i = 0; i != b.size(); i++) {
            //add a primeira entidade
            if (b.get(i).getName().equals("Villager")) {
                if (!c.isEmpty()) {
                    for (int j = 0; j != c.size(); j++) {
                        if (b.get(i).getLocation().getBlockX() + 300 < c.get(j).getLocation().getBlockX()
                                && b.get(i).getLocation().getBlockZ() + 300 < c.get(j).getLocation().getBlockZ()) {
                            c.add(b.get(i));
                        }
                    }
                } else {
                    c.add(b.get(i));
                }


            }

        }
    }
}
