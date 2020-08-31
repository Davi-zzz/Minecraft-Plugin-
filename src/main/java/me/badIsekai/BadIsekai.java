package me.badIsekai;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BadIsekai extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Inicializando Plugin...");
        Bukkit.getConsoleSender().sendMessage("\n" +
                ":::::::::      :::     :::::::::   :::::::::::  ::::::::  :::::::::: :::    :::     :::     :::::::::::  :::::::::  :::        :::    :::  ::::::::  ::::::::::: ::::    ::: \n" +
                ":+:    :+:   :+: :+:   :+:    :+:      :+:     :+:    :+: :+:        :+:   :+:    :+: :+:       :+:      :+:    :+: :+:        :+:    :+: :+:    :+:     :+:     :+:+:   :+: \n" +
                "+:+    +:+  +:+   +:+  +:+    +:+      +:+     +:+        +:+        +:+  +:+    +:+   +:+      +:+      +:+    +:+ +:+        +:+    +:+ +:+            +:+     :+:+:+  +:+ \n" +
                "+#++:++#+  +#++:++#++: +#+    +:+      +#+     +#++:++#++ +#++:++#   +#++:++    +#++:++#++:     +#+      +#++:++#+  +#+        +#+    +:+ :#:            +#+     +#+ +:+ +#+ \n" +
                "+#+    +#+ +#+     +#+ +#+    +#+      +#+            +#+ +#+        +#+  +#+   +#+     +#+     +#+      +#+        +#+        +#+    +#+ +#+   +#+#     +#+     +#+  +#+#+# \n" +
                "#+#    #+# #+#     #+# #+#    #+#      #+#     #+#    #+# #+#        #+#   #+#  #+#     #+#     #+#      #+#        #+#        #+#    #+# #+#    #+#     #+#     #+#   #+#+# \n" +
                "#########  ###     ### #########   ###########  ########  ########## ###    ### ###     ### ###########  ###        ##########  ########   ########  ########### ###    #### \n");

        PluginManager pm = getServer().getPluginManager();
        CoinListener cl = new CoinListener(this);
        pm.registerEvents(cl, this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("desativando plugin...");
    }


}
