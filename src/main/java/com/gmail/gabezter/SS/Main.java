package com.gmail.gabezter.SS;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin	{

	Listen listen = new Listen(this);
	
	public void onEnable(){
		getServer().getPluginManager().registerEvents(listen, this);
	}
	
	public void onDisable(){
		
	}
	
}
