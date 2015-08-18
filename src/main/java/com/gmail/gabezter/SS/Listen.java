package com.gmail.gabezter.SS;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.AnimalTamer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Listen implements Listener {

	Perks perks = new Perks();
	Main plugin;

	public Listen(Main plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onBlockBreakEvent(BlockBreakEvent e) {
		if (e.getBlock().getType().equals(Material.SPONGE)) {
			Random chance = new Random();
			Player player = e.getPlayer();
			int a = chance.nextInt(100) + 1;
			Block eBlock = e.getBlock();
			World eWorld = eBlock.getWorld();
			Location eLoc = eBlock.getLocation();

			if (a <= 10) {
				player.sendMessage(ChatColor.RED + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, perks.gap);
			}
			if (a <= 20 && a > 10) {

				player.sendMessage(ChatColor.BLUE + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, perks.PleatherH);
				eWorld.dropItemNaturally(eLoc, perks.PleatherC);
				eWorld.dropItemNaturally(eLoc, perks.PleatherL);
				eWorld.dropItemNaturally(eLoc, perks.PleatherB);
			}
			if (a <= 30 && a > 20) {
				player.sendMessage(ChatColor.GREEN + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, perks.PgoldH);
				eWorld.dropItemNaturally(eLoc, perks.PgoldC);
				eWorld.dropItemNaturally(eLoc, perks.PgoldL);
				eWorld.dropItemNaturally(eLoc, perks.PgoldB);
			}
			if (a <= 40 && a > 30) {
				player.sendMessage(ChatColor.YELLOW + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, perks.PironH);
				eWorld.dropItemNaturally(eLoc, perks.PironC);
				eWorld.dropItemNaturally(eLoc, perks.PironL);
				eWorld.dropItemNaturally(eLoc, perks.PironB);
				perks.spawnCat(eWorld, eLoc, player);
			}
			if (a <= 50 && a > 40) {
				player.sendMessage(ChatColor.MAGIC + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, perks.PdiamondH);
				eWorld.dropItemNaturally(eLoc, perks.PdiamondC);
				eWorld.dropItemNaturally(eLoc, perks.PdiamondL);
				eWorld.dropItemNaturally(eLoc, perks.PdiamondB);
				perks.spawnHorse(eWorld,eLoc,player);
			}

			if (a > 50 && a < 60) {
				player.sendMessage(ChatColor.RED + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				perks.spawnDog(eWorld, eLoc, player);

			}
			if (a > 59) {
				player.sendMessage(ChatColor.RED + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.TRAPPED_CHEST);
				int c = eLoc.getBlockY();
				player.sendMessage(ChatColor.WHITE + Integer.toString(c));
				Location loc = new Location(eLoc.getWorld(), eLoc.getX(), eLoc.getY() - 1, eLoc.getZ());
				Block cs = loc.getBlock();
				player.sendMessage(Integer.toString(cs.getLocation().getBlockY()));
				cs.setType(Material.TNT);

			}
			perks.spawnSheep(eWorld, eLoc);
		}
	}

	@EventHandler
	public void onSpawn(final CreatureSpawnEvent e) {
		if (e.getEntity() instanceof Wolf) {
			for (final Player p : Bukkit.getOnlinePlayers()) {
				final String owner = p.getName().toString();
				Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
					public void run() {
						if (e.getEntity().getCustomName().equals(ChatColor.WHITE + owner + "'s Dog")) {
							Bukkit.getServer().broadcastMessage(e.getEntity().getCustomName());
							AnimalTamer at = Bukkit.getServer().getPlayer(owner);
							Entity et = e.getEntity();
							Wolf wolf = (Wolf) et;
							wolf.setTamed(true);
							wolf.setOwner(at);
							wolf.setAdult();
						}
					}
				}, 1L);
			}
		}

		if (e.getEntity() instanceof Ocelot) {
			for (final Player p : Bukkit.getOnlinePlayers()) {
				final String owner = p.getName().toString();
				Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
					public void run() {
						if (e.getEntity().getCustomName().equals(ChatColor.WHITE + owner + "'s Cat")) {
							Bukkit.getServer().broadcastMessage(e.getEntity().getCustomName());
							AnimalTamer at = Bukkit.getServer().getPlayer(owner);
							Entity et = e.getEntity();
							Ocelot wolf = (Ocelot) et;
							wolf.setTamed(true);
							wolf.setOwner(at);
							wolf.setAdult();
							Random i = new Random();
							int ps = i.nextInt(4);
							if (ps == 0) {
								wolf.setCatType(Ocelot.Type.WILD_OCELOT);
							}
							else
							if (ps == 1) {
								wolf.setCatType(Ocelot.Type.BLACK_CAT);
							}
							else
							if (ps == 2) {
								wolf.setCatType(Ocelot.Type.RED_CAT);
							}
							else
							if (ps == 3) {
								wolf.setCatType(Ocelot.Type.SIAMESE_CAT);
							}
						}
					}
				}, 1L);
			}
		}

		if (e.getEntity() instanceof Horse) {
			for (final Player p : Bukkit.getOnlinePlayers()) {
				final String owner = p.getName().toString();
				Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
					public void run() {
						if (e.getEntity().getCustomName().equals(ChatColor.WHITE + owner + "'s Horse")) {
							Bukkit.getServer().broadcastMessage(e.getEntity().getCustomName());
							AnimalTamer at = Bukkit.getServer().getPlayer(owner);
							Entity et = e.getEntity();
							Horse wolf = (Horse) et;
							wolf.setTamed(true);
							wolf.setOwner(at);
							wolf.setAdult();
						}
					}
				}, 1L);
			}
		}

	}

}