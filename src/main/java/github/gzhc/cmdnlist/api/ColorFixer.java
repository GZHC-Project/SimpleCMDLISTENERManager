package github.gzhc.cmdnlist.api;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ColorFixer {

    public static String fixColor(final String s) {
        if (s == null) {
            return "";
        }
        return s.replaceAll("&", "§").replace(">>", "»").replace("{.}", "\u2022").replace("{>}", "»").replace("<<", "«");
    }

    public static boolean sendMessage(final CommandSender sender, final String message) {
        if (sender instanceof Player) {
            if (message != null || message != "") {
                sender.sendMessage(fixColor(message));
            }
        } else {
            sender.sendMessage(ChatColor.stripColor(fixColor(message)));
        }
        return true;
    }
}
