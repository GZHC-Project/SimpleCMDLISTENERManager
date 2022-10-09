package github.gzhc.cmdnlist.cmds;

import github.gzhc.cmdnlist.api.PlayerCommand;
import org.bukkit.entity.Player;

public class TestCommand extends PlayerCommand {

        public TestCommand() {
            super("test", "test", "/test", "permission", "t");
        }

        @Override
        public boolean onCommand(final Player p, final String[] args) {
            p.sendMessage("Hello World!");
            return true;
        }
}
