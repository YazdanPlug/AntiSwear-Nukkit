package ir.yzplug.antiswear;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import ir.yzplug.antiswear.events.playerChat;

public class Main extends PluginBase {
	
	@Override
	public void onEnable() {
		this.getLogger().info("Enabled plugin AntiSwear");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new playerChat(), this);
		
		super.onEnable();
	}
	@Override
	public void onDisable() {
		this.getLogger().info("Disabled plugin AntiSwear");
		super.onDisable();
	}
	

}
