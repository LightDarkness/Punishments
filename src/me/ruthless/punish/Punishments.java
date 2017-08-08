package me.ruthless.punish;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Punishments extends JavaPlugin
{
	// Register some stuff on the enable
	@Override
	public void onEnable() 
	{
		registerCommands();
		registerListeners();
	}
	
	@Override
	public void onDisable() 
	{
		
	}
	
	// Register the commands
	public void registerCommands() 
	{
		
	}
	
	// Register the listeners
	public void registerListeners() 
	{
		PluginManager pm = Bukkit.getPluginManager();
	}
}