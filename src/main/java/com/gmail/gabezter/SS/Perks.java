package com.gmail.gabezter.SS;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Perks {
	// Items

	ItemStack gap = new ItemStack(Material.GOLDEN_APPLE, 2, (short) 1);

	ItemStack PironB = new ItemStack(Material.IRON_BOOTS, 1);
	ItemStack PironH = new ItemStack(Material.IRON_HELMET, 1);
	ItemStack PironL = new ItemStack(Material.IRON_LEGGINGS, 1);
	ItemStack PironC = new ItemStack(Material.IRON_CHESTPLATE, 1);

	ItemStack PgoldB = new ItemStack(Material.GOLD_BOOTS, 1);
	ItemStack PgoldH = new ItemStack(Material.GOLD_HELMET, 1);
	ItemStack PgoldL = new ItemStack(Material.GOLD_LEGGINGS, 1);
	ItemStack PgoldC = new ItemStack(Material.GOLD_CHESTPLATE, 1);

	ItemStack PleatherB = new ItemStack(Material.LEATHER_BOOTS, 1);
	ItemStack PleatherH = new ItemStack(Material.LEATHER_HELMET, 1);
	ItemStack PleatherL = new ItemStack(Material.LEATHER_LEGGINGS, 1);
	ItemStack PleatherC = new ItemStack(Material.LEATHER_CHESTPLATE, 1);

	ItemStack PdiamondB = new ItemStack(Material.DIAMOND_BOOTS, 1);
	ItemStack PdiamondH = new ItemStack(Material.DIAMOND_HELMET, 1);
	ItemStack PdiamondL = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
	ItemStack PdiamondC = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);

	ItemStack PchainB = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
	ItemStack PchainH = new ItemStack(Material.CHAINMAIL_HELMET, 1);
	ItemStack PchainL = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
	ItemStack PchainC = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);

	ItemStack headSteve = new ItemStack(Material.SKULL_ITEM, 15, (short) 3);
	ItemStack headCreep = new ItemStack(Material.SKULL_ITEM, 15, (short) 4);
	ItemStack headZombie = new ItemStack(Material.SKULL_ITEM, 15, (short) 2);
	ItemStack headWither = new ItemStack(Material.SKULL_ITEM, 15, (short) 1);
	ItemStack headSkeleton = new ItemStack(Material.SKULL_ITEM, 15, (short) 0);

	ItemStack potionHealth = new ItemStack(Material.POTION, 14, (short) 5);
	ItemStack potionRegen = new ItemStack(Material.POTION, 14, (short) 1);
	ItemStack potionFire = new ItemStack(Material.POTION, 14, (short) 3);
	ItemStack potionStrength = new ItemStack(Material.POTION, 14, (short) 8);

	ItemStack poppy = new ItemStack(Material.RED_ROSE, 64, (short) 0);
	ItemStack yellowFlower = new ItemStack(Material.YELLOW_FLOWER, 64);
	ItemStack allium = new ItemStack(Material.RED_ROSE, 64, (short) 2);
	ItemStack redTulip = new ItemStack(Material.RED_ROSE, 64, (short) 4);
	ItemStack pinkTulip = new ItemStack(Material.RED_ROSE, 64, (short) 7);
	ItemStack blueOrchid = new ItemStack(Material.RED_ROSE, 64, (short) 1);
	ItemStack azureBlue = new ItemStack(Material.RED_ROSE, 64, (short) 3);
	ItemStack whiteTulip = new ItemStack(Material.RED_ROSE, 64, (short) 6);
	ItemStack oxeyeDaisy = new ItemStack(Material.RED_ROSE, 64, (short) 8);
	ItemStack orangeTulip = new ItemStack(Material.RED_ROSE, 64, (short) 5);

	ItemStack sunFlower = new ItemStack(Material.DOUBLE_PLANT, 64, (short) 0);
	ItemStack lilac = new ItemStack(Material.DOUBLE_PLANT, 64, (short) 1);
	ItemStack doubleTallgrass = new ItemStack(Material.DOUBLE_PLANT, 64, (short) 2);
	ItemStack largeFern = new ItemStack(Material.DOUBLE_PLANT, 64, (short) 3);
	ItemStack roseBush = new ItemStack(Material.DOUBLE_PLANT, 64, (short) 4);
	ItemStack peony = new ItemStack(Material.DOUBLE_PLANT, 64, (short) 5);

	ItemStack eggs = new ItemStack(Material.EGG, 4);
	ItemStack emeralds = new ItemStack(Material.EMERALD, 19);
	ItemStack snowBalls = new ItemStack(Material.SNOW_BALL, 5);
	ItemStack enderEye = new ItemStack(Material.EYE_OF_ENDER, 3);
	ItemStack enderPearl = new ItemStack(Material.ENDER_PEARL, 2);

	ItemStack mobEggWolf = new ItemStack(Material.MONSTER_EGG, 5, (short) 95);
	ItemStack mobEggZombie = new ItemStack(Material.MONSTER_EGG, 5, (short) 54);
	ItemStack mobEggPigman = new ItemStack(Material.MONSTER_EGG, 5, (short) 57);
	ItemStack mobEggCreeper = new ItemStack(Material.MONSTER_EGG, 5, (short) 50);
	ItemStack mobEggSkeleton = new ItemStack(Material.MONSTER_EGG, 5, (short) 51);
	ItemStack mobEggEndermite = new ItemStack(Material.MONSTER_EGG, 5, (short) 67);

	ItemStack bucketLava = new ItemStack(Material.LAVA_BUCKET, 3);
	ItemStack bucketWater = new ItemStack(Material.WATER_BUCKET, 2);
	ItemStack bucketMilk = new ItemStack(Material.MILK_BUCKET, 2);

	ItemStack dragonEgg = new ItemStack(Material.DRAGON_EGG, 1);

	public void spawnHorse(World world, Location loc, Player player) {
		world.spawnEntity(loc, EntityType.HORSE).setCustomName(ChatColor.WHITE + player.getName().toString() + "'s Horse");
	}

	public void spawnDog(World world, Location loc, Player player) {
		world.spawnEntity(loc, EntityType.WOLF).setCustomName(ChatColor.WHITE + player.getName().toString() + "'s Dog");
	}

	public void spawnCat(World world, Location loc, Player player) {
		world.spawnEntity(loc, EntityType.OCELOT).setCustomName(ChatColor.WHITE + player.getName().toString() + "'s Car");
	}

	public void spawnDiamondArmor(World world, Location loc) {
		world.dropItemNaturally(loc, PleatherH);
		world.dropItemNaturally(loc, PleatherC);
		world.dropItemNaturally(loc, PleatherL);
		world.dropItemNaturally(loc, PleatherB);
	}

	public void spawnChainArmor(World world, Location loc) {
		world.dropItemNaturally(loc, PchainH);
		world.dropItemNaturally(loc, PchainC);
		world.dropItemNaturally(loc, PchainL);
		world.dropItemNaturally(loc, PchainB);
	}

	public void spawnGoldArmor(World world, Location loc) {
		world.dropItemNaturally(loc, PgoldH);
		world.dropItemNaturally(loc, PgoldC);
		world.dropItemNaturally(loc, PgoldL);
		world.dropItemNaturally(loc, PgoldB);
	}

	public void spawnIronArmor(World world, Location loc) {
		world.dropItemNaturally(loc, PironH);
		world.dropItemNaturally(loc, PironC);
		world.dropItemNaturally(loc, PironL);
		world.dropItemNaturally(loc, PironB);
	}

	public void spawnLeatherArmor(World world, Location loc) {
		world.dropItemNaturally(loc, PleatherH);
		world.dropItemNaturally(loc, PleatherC);
		world.dropItemNaturally(loc, PleatherL);
		world.dropItemNaturally(loc, PleatherB);
	}

	public void spawnFlowers(World world, Location loc) {
		world.dropItemNaturally(loc, poppy);
		world.dropItemNaturally(loc, redTulip);
		world.dropItemNaturally(loc, yellowFlower);
		world.dropItemNaturally(loc, allium);
		world.dropItemNaturally(loc, pinkTulip);
		world.dropItemNaturally(loc, azureBlue);
		world.dropItemNaturally(loc, blueOrchid);
		world.dropItemNaturally(loc, whiteTulip);
		world.dropItemNaturally(loc, oxeyeDaisy);
		world.dropItemNaturally(loc, orangeTulip);

		world.dropItemNaturally(loc, largeFern);
		world.dropItemNaturally(loc, roseBush);
		world.dropItemNaturally(loc, sunFlower);
		world.dropItemNaturally(loc, lilac);
		world.dropItemNaturally(loc, doubleTallgrass);
		world.dropItemNaturally(loc, peony);
	}

	public void spawnSheep(World world, Location loc) {
		for (int i = 0; i > 25; i++)
			world.spawnEntity(loc, EntityType.SHEEP);
	}
}
