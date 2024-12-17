package plugin.pluginMinecraft;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Salut! Le serveur est active!!!");

    }

    @Override
    public void onDisable() {
        // Plugin shut down logic
        System.out.println("Le serveur est désactive!!! a plus tard :) "); //au cas ou
    }
}
