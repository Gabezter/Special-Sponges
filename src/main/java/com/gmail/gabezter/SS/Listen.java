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

	Drops iss = new Drops();
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
				eWorld.dropItemNaturally(eLoc, iss.bp);
				eWorld.dropItemNaturally(eLoc, iss.app);
				eWorld.dropItemNaturally(eLoc, iss.gap);
			}
			if (a <= 20 && a > 10) {

				player.sendMessage(ChatColor.BLUE + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, iss.PleatherH);
				eWorld.dropItemNaturally(eLoc, iss.PleatherC);
				eWorld.dropItemNaturally(eLoc, iss.PleatherL);
				eWorld.dropItemNaturally(eLoc, iss.PleatherB);
			}
			if (a <= 30 && a > 20) {
				player.sendMessage(ChatColor.GREEN + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, iss.PgoldH);
				eWorld.dropItemNaturally(eLoc, iss.PgoldC);
				eWorld.dropItemNaturally(eLoc, iss.PgoldL);
				eWorld.dropItemNaturally(eLoc, iss.PgoldB);
			}
			if (a <= 40 && a > 30) {
				player.sendMessage(ChatColor.YELLOW + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, iss.PironH);
				eWorld.dropItemNaturally(eLoc, iss.PironC);
				eWorld.dropItemNaturally(eLoc, iss.PironL);
				eWorld.dropItemNaturally(eLoc, iss.PironB);
				eWorld.spawnEntity(eLoc, EntityType.OCELOT).setCustomName(ChatColor.WHITE + player.getName().toString() + "'s Cat");
			}
			if (a <= 50 && a > 40) {
				player.sendMessage(ChatColor.MAGIC + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.dropItemNaturally(eLoc, iss.PdiamondH);
				eWorld.dropItemNaturally(eLoc, iss.PdiamondC);
				eWorld.dropItemNaturally(eLoc, iss.PdiamondL);
				eWorld.dropItemNaturally(eLoc, iss.PdiamondB);
				eWorld.spawnEntity(eLoc, EntityType.HORSE).setCustomName(ChatColor.WHITE + player.getName().toString() + "'s Horse");
			}

			if (a > 50 && a < 60) {
				player.sendMessage(ChatColor.RED + Integer.toString(a));
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				eWorld.spawnEntity(eLoc, EntityType.WOLF).setCustomName(ChatColor.WHITE + player.getName().toString() + "'s Dog");

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