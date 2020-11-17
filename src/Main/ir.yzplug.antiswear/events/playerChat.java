package ir.yzplug.antiswear.events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;
import cn.nukkit.utils.TextFormat;

public class playerChat implements Listener {
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent e) {
		if(e.getMessage().toLowerCase().contains("fuck")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage(TextFormat.RED + "Please don't swearing");
		}
		if (e.getMessage().toLowerCase().contains("sex")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage(TextFormat.RED + "Please don't swearing");
		}
		if (e.getMessage().toLowerCase().contains("xxnx")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage(TextFormat.RED + "Please don't swearing");
		}
		if (e.getMessage().toLowerCase().contains("dick")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage("Please don't swearing");
		}
		if (e.getMessage().toLowerCase().contains("kir")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage("Please don't swearing");
		}
		if (e.getMessage().toLowerCase().contains("kos")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage("Please don't swearing");
		}
		if (e.getMessage().toLowerCase().contains("koon")) {
			e.setCancelled(true);
			Player player = e.getPlayer();
			player.sendMessage("Please don't swearing");
		}
	}

}
