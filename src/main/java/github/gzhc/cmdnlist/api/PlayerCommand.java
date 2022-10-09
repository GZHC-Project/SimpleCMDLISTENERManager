package github.gzhc.cmdnlist.api;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class PlayerCommand extends Command {
    public PlayerCommand(final String name, final String desc, final String usage, final String permission, final String... aliases) {
        super(name, desc, usage, permission, aliases);
    }

    @Override
    public boolean onExecute(final CommandSender sender, final String[] args) {
        if (!(sender instanceof Player)) {
            return ColorFixer.sendMessage(sender, "&cU can't use this command as Console!");
        }
        return this.onCommand((Player) sender, args);
    }

    public abstract boolean onCommand(final Player p0, final String[] p1);
}
