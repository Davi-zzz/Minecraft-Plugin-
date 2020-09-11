package me.badIsekai;
import org.bukkit.*;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;


import java.util.*;


public class Trade implements Listener {


    public Trade (){

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

    public Server traderVillager(Server server){
//        ArrayList<Entity> entidades = server.getWorld(server.getServerId()).getEntitiesByClasses(ArrayList<Entity> Villager);

            List<LivingEntity> entidades = Bukkit.getWorld("world").getLivingEntities();

            mayorGenerator(entidades, server);

            return server;


    }


    public Server mayorGenerator(List<LivingEntity> a, Server s){
        List<LivingEntity> aux = new ArrayList<LivingEntity>();
        addEntity(a,aux);
        for (int i = 0; i != aux.size(); i++){

            //para cada volta no for vai spawnar um prefeito em cada cidade

            Bukkit.getConsoleSender().sendMessage(ChatColor.RED+"TENTOU ADD ENTITY");
            Villager mayor = (Villager) s.getWorld("world").spawnEntity(aux.get(i).getLocation().add(1,0,-1), EntityType.VILLAGER);
            mayor.setCustomName("MICAEL");
            mayor.setCustomNameVisible(true);

            //dont work
//            Bukkit.getWorld(s.getServerId()).spawnEntity(a.get(i).getLocation(), EntityType.VILLAGER);

            //tentando spawnar a porra do npc
            //tentar pegar os populators e gerar atraves deles



            Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA+ "MAYOR GERADO EM "+aux.get(i).getLocation());
        }
        return s;
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
