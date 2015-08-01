package com.gmail.gabezter.SS;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Listen implements Listener {

	@EventHandler
	public void onBlockBreakEvent(BlockBreakEvent e) {
		if (e.getBlock().getType().equals(Material.SPONGE)) {
			Random chance = new Random();
			Player player = e.getPlayer();
			int a = chance.nextInt(50) + 1;
			if (a < 10) {
				player.sendMessage(ChatColor.RED + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ARMOR_STAND));
			}
			if (a < 20 && a > 10) {
				player.sendMessage(ChatColor.BLUE + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ARMOR_STAND));
			}
			if (a < 30 && a > 20) {
				player.sendMessage(ChatColor.GREEN + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ARMOR_STAND));
			}
			if (a < 40 && a > 30) {
				player.sendMessage(ChatColor.YELLOW + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ARMOR_STAND));
			}
			if (a < 50 && a > 40) {
				player.sendMessage(ChatColor.MAGIC + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.ARMOR_STAND));
			}

		}
	}
}
