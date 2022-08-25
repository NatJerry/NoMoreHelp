package github.ncc.jerry;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class EventHelp implements Listener {

    @EventHandler
    public void HelpListening(PlayerCommandPreprocessEvent e){
        if(e.getMessage()=="/help"){
            e.setCancelled(true);
            e.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&' , "&c你不能这么做"));

        }
    }

}
