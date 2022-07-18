package sumo.sumobyr1dd1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Sumo extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SumoMechanic(), this);
        getCommand("start").setExecutor(new Commands());
    }


}
