package net.nuggetmc.ai.bot.agent.legacyagent;

import org.bukkit.Location;
import org.bukkit.Material;

public class LegacyWorldManager {

    public static boolean aboveGround(Location loc) {
        int y = 1;
        int y0 = loc.getBlockY();
        while (y + y0 < y0 + 25) {
            if (loc.clone().add(0, y, 0).getBlock().getType() != Material.AIR) {
                return false;
            }
            y++;
        }
        return true;
    }
}
