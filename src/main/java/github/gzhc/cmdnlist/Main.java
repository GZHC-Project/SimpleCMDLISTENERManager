package github.gzhc.cmdnlist;

import github.gzhc.cmdnlist.api.Command;
import github.gzhc.cmdnlist.api.CommandManager;
import github.gzhc.cmdnlist.cmds.TestCommand;
import github.gzhc.cmdnlist.list.TestListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public final class Main extends JavaPlugin {

    //AUTHOR: night++#4342
    //TODO: Describe everything

    private static PluginManager pluginManager;

    public static void registerCommands(List<Command> commands){
        commands.forEach(CommandManager::register);
    }

    @Override
    public void onEnable() {
        registerCommands();
        registerListeners();
    }


    public static void registerListeners(final Plugin plugin, final Listener... listeners) {
        if (Main.pluginManager == null) {
            Main.pluginManager = Bukkit.getPluginManager();
        }
        for (final Listener listener : listeners) {
            Main.pluginManager.registerEvents(listener, plugin);
        }
    }

    public void registerCommands(){
        registerCommands(Arrays.asList(
                /*
                To get multiple commands use:
                new foo(),
                new blah()
                 */

                new TestCommand()

        ));
    }

    public void registerListeners() {
        registerListeners(this, new TestListener());

    }
}
