/*      */ package de.synex.bingo.main;
/*      */ 
/*      */

import Utilities.DataManager;
import Utilities.Items;
import Utilities.RandomEnchantment;
import de.synex.bingo.commands.*;
import de.synex.bingo.listeners.Listeners;
import de.synex.bingo.util.ConfigLink;
import io.netty.util.internal.ThreadLocalRandom;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.*;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


/*      */ 
/*      */ public class Main
/*      */   extends JavaPlugin
/*      */ {
			 public DataManager data;
/*      */   public boolean LobbyStatus = true;
/*      */   public static boolean GameStarted = false;
/*      */   public boolean isRestarting = false;
/*      */   public String winner1;
/*      */   public String winner2;
/*   54 */   public static ArrayList<Player> t1 = new ArrayList<>();
/*   55 */   public static ArrayList<Player> t2 = new ArrayList<>();
/*   56 */   public static ArrayList<Player> t3 = new ArrayList<>();
/*   57 */   public static ArrayList<Player> t4 = new ArrayList<>();
/*   58 */   public static ArrayList<Player> t5 = new ArrayList<>();
/*   59 */   public static ArrayList<Player> t6 = new ArrayList<>();
/*   60 */   public static ArrayList<Player> t7 = new ArrayList<>();
/*   61 */   public static ArrayList<Player> t8 = new ArrayList<>();
/*   62 */   public static ArrayList<Player> t9 = new ArrayList<>();
/*      */ 
/*      */
/*      */   
/*   66 */   public int players = 0;
/*   67 */   public int spectator = 0;
/*      */   


/*  240 */   public static HashSet<ItemStack> itemlist = new HashSet<>();
			 public ArrayList<ItemStack> items = new ArrayList<>();
			 

/*      */   
/*      */   public static ItemStack b1;
/*      */   
/*      */   public static ItemStack b2;
/*      */   
/*      */   public static ItemStack b3;
/*      */   
/*      */   public static ItemStack b4;
/*      */   
/*      */   public static ItemStack b5;
/*      */   
/*      */   public static ItemStack b6;
/*      */   
/*      */   public static ItemStack b7;
/*      */   
/*      */   public static ItemStack b8;
/*      */   
/*      */   public static ItemStack b9;
/*      */   
/*      */   public boolean b1t1 = false;
/*      */   
/*      */   public boolean b2t1 = false;
/*      */   
/*      */   public boolean b3t1 = false;
/*      */   
/*      */   public boolean b4t1 = false;
/*      */   
/*      */   public boolean b5t1 = false;
/*      */   
/*      */   public boolean b6t1 = false;
/*      */   
/*      */   public boolean b7t1 = false;
/*      */   
/*      */   public boolean b8t1 = false;
/*      */   
/*      */   public boolean b9t1 = false;
/*      */   public boolean b1t2 = false;
/*      */   public boolean b2t2 = false;
/*      */   public boolean b3t2 = false;
/*      */   public boolean b4t2 = false;
/*      */   public boolean b5t2 = false;
/*      */   public boolean b6t2 = false;
/*      */   public boolean b7t2 = false;
/*      */   public boolean b8t2 = false;
/*      */   public boolean b9t2 = false;
/*      */   public boolean b1t3 = false;
/*      */   public boolean b2t3 = false;
/*      */   public boolean b3t3 = false;
/*      */   public boolean b4t3 = false;
/*      */   public boolean b5t3 = false;
/*      */   public boolean b6t3 = false;
/*      */   public boolean b7t3 = false;
/*      */   public boolean b8t3 = false;
/*      */   public boolean b9t3 = false;
/*      */   public boolean b1t4 = false;
/*      */   public boolean b2t4 = false;
/*      */   public boolean b3t4 = false;
/*      */   public boolean b4t4 = false;
/*      */   public boolean b5t4 = false;
/*      */   public boolean b6t4 = false;
/*      */   public boolean b7t4 = false;
/*      */   public boolean b8t4 = false;
/*      */   public boolean b9t4 = false;
/*      */   public boolean b1t5 = false;
/*      */   public boolean b2t5 = false;
/*      */   public boolean b3t5 = false;
/*      */   public boolean b4t5 = false;
/*      */   public boolean b5t5 = false;
/*      */   public boolean b6t5 = false;
/*      */   public boolean b7t5 = false;
/*      */   public boolean b8t5 = false;
/*      */   public boolean b9t5 = false;
/*      */   public boolean b1t6 = false;
/*      */   public boolean b2t6 = false;
/*      */   public boolean b3t6 = false;
/*      */   public boolean b4t6 = false;
/*      */   public boolean b5t6 = false;
/*      */   public boolean b6t6 = false;
/*      */   public boolean b7t6 = false;
/*      */   public boolean b8t6 = false;
/*      */   public boolean b9t6 = false;
/*      */   public boolean b1t7 = false;
/*      */   public boolean b2t7 = false;
/*      */   public boolean b3t7 = false;
/*      */   public boolean b4t7 = false;
/*      */   public boolean b5t7 = false;
/*      */   public boolean b6t7 = false;
/*      */   public boolean b7t7 = false;
/*      */   public boolean b8t7 = false;
/*      */   public boolean b9t7 = false;
/*      */   public boolean b1t8 = false;
/*      */   public boolean b2t8 = false;
/*      */   public boolean b3t8 = false;
/*      */   public boolean b4t8 = false;
/*      */   public boolean b5t8 = false;
/*      */   public boolean b6t8 = false;
/*      */   public boolean b7t8 = false;
/*      */   public boolean b8t8 = false;
/*      */   public boolean b9t8 = false;
/*      */   public boolean b1t9 = false;
/*      */   public boolean b2t9 = false;
/*      */   public boolean b3t9 = false;
/*      */   public boolean b4t9 = false;
/*      */   public boolean b5t9 = false;
/*      */   public boolean b6t9 = false;
/*      */   public boolean b7t9 = false;
/*      */   public boolean b8t9 = false;
/*      */   public boolean b9t9 = false;
/*      */   public int gotitems1;
/*      */   public int gotitems2;
/*      */   public int gotitems3;
/*      */   public int gotitems4;
/*      */   public int gotitems5;
/*      */   public int gotitems6;
/*      */   public int gotitems7;
/*      */   public int gotitems8;
/*      */   public int gotitems9;
/*  358 */   public ArrayList<ItemStack> foundItemsT1 = new ArrayList<>();
/*  359 */   public ArrayList<ItemStack> foundItemsT2 = new ArrayList<>();
/*  360 */   public ArrayList<ItemStack> foundItemsT3 = new ArrayList<>();
/*  361 */   public ArrayList<ItemStack> foundItemsT4 = new ArrayList<>();
/*  362 */   public ArrayList<ItemStack> foundItemsT5 = new ArrayList<>();
/*  363 */   public ArrayList<ItemStack> foundItemsT6 = new ArrayList<>();
/*  364 */   public ArrayList<ItemStack> foundItemsT7 = new ArrayList<>();
/*  365 */   public ArrayList<ItemStack> foundItemsT8 = new ArrayList<>();
/*  366 */   public ArrayList<ItemStack> foundItemsT9 = new ArrayList<>();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  372 */   public static ChatColor ColorGrayb1t1 = ChatColor.GRAY;
/*  373 */   public static ChatColor ColorGrayb2t1 = ChatColor.GRAY;
/*  374 */   public static ChatColor ColorGrayb3t1 = ChatColor.GRAY;
/*  375 */   public static ChatColor ColorGrayb4t1 = ChatColor.GRAY;
/*  376 */   public static ChatColor ColorGrayb5t1 = ChatColor.GRAY;
/*  377 */   public static ChatColor ColorGrayb6t1 = ChatColor.GRAY;
/*  378 */   public static ChatColor ColorGrayb7t1 = ChatColor.GRAY;
/*  379 */   public static ChatColor ColorGrayb8t1 = ChatColor.GRAY;
/*  380 */   public static ChatColor ColorGrayb9t1 = ChatColor.GRAY;
/*      */   
/*  382 */   public static ChatColor ColorGrayb1t2 = ChatColor.GRAY;
/*  383 */   public static ChatColor ColorGrayb2t2 = ChatColor.GRAY;
/*  384 */   public static ChatColor ColorGrayb3t2 = ChatColor.GRAY;
/*  385 */   public static ChatColor ColorGrayb4t2 = ChatColor.GRAY;
/*  386 */   public static ChatColor ColorGrayb5t2 = ChatColor.GRAY;
/*  387 */   public static ChatColor ColorGrayb6t2 = ChatColor.GRAY;
/*  388 */   public static ChatColor ColorGrayb7t2 = ChatColor.GRAY;
/*  389 */   public static ChatColor ColorGrayb8t2 = ChatColor.GRAY;
/*  390 */   public static ChatColor ColorGrayb9t2 = ChatColor.GRAY;
/*      */   
/*  392 */   public static ChatColor ColorGrayb1t3 = ChatColor.GRAY;
/*  393 */   public static ChatColor ColorGrayb2t3 = ChatColor.GRAY;
/*  394 */   public static ChatColor ColorGrayb3t3 = ChatColor.GRAY;
/*  395 */   public static ChatColor ColorGrayb4t3 = ChatColor.GRAY;
/*  396 */   public static ChatColor ColorGrayb5t3 = ChatColor.GRAY;
/*  397 */   public static ChatColor ColorGrayb6t3 = ChatColor.GRAY;
/*  398 */   public static ChatColor ColorGrayb7t3 = ChatColor.GRAY;
/*  399 */   public static ChatColor ColorGrayb8t3 = ChatColor.GRAY;
/*  400 */   public static ChatColor ColorGrayb9t3 = ChatColor.GRAY;
/*      */   
/*  402 */   public static ChatColor ColorGrayb1t4 = ChatColor.GRAY;
/*  403 */   public static ChatColor ColorGrayb2t4 = ChatColor.GRAY;
/*  404 */   public static ChatColor ColorGrayb3t4 = ChatColor.GRAY;
/*  405 */   public static ChatColor ColorGrayb4t4 = ChatColor.GRAY;
/*  406 */   public static ChatColor ColorGrayb5t4 = ChatColor.GRAY;
/*  407 */   public static ChatColor ColorGrayb6t4 = ChatColor.GRAY;
/*  408 */   public static ChatColor ColorGrayb7t4 = ChatColor.GRAY;
/*  409 */   public static ChatColor ColorGrayb8t4 = ChatColor.GRAY;
/*  410 */   public static ChatColor ColorGrayb9t4 = ChatColor.GRAY;
/*      */   
/*  412 */   public static ChatColor ColorGrayb1t5 = ChatColor.GRAY;
/*  413 */   public static ChatColor ColorGrayb2t5 = ChatColor.GRAY;
/*  414 */   public static ChatColor ColorGrayb3t5 = ChatColor.GRAY;
/*  415 */   public static ChatColor ColorGrayb4t5 = ChatColor.GRAY;
/*  416 */   public static ChatColor ColorGrayb5t5 = ChatColor.GRAY;
/*  417 */   public static ChatColor ColorGrayb6t5 = ChatColor.GRAY;
/*  418 */   public static ChatColor ColorGrayb7t5 = ChatColor.GRAY;
/*  419 */   public static ChatColor ColorGrayb8t5 = ChatColor.GRAY;
/*  420 */   public static ChatColor ColorGrayb9t5 = ChatColor.GRAY;
/*      */   
/*  422 */   public static ChatColor ColorGrayb1t6 = ChatColor.GRAY;
/*  423 */   public static ChatColor ColorGrayb2t6 = ChatColor.GRAY;
/*  424 */   public static ChatColor ColorGrayb3t6 = ChatColor.GRAY;
/*  425 */   public static ChatColor ColorGrayb4t6 = ChatColor.GRAY;
/*  426 */   public static ChatColor ColorGrayb5t6 = ChatColor.GRAY;
/*  427 */   public static ChatColor ColorGrayb6t6 = ChatColor.GRAY;
/*  428 */   public static ChatColor ColorGrayb7t6 = ChatColor.GRAY;
/*  429 */   public static ChatColor ColorGrayb8t6 = ChatColor.GRAY;
/*  430 */   public static ChatColor ColorGrayb9t6 = ChatColor.GRAY;
/*      */   
/*  432 */   public static ChatColor ColorGrayb1t7 = ChatColor.GRAY;
/*  433 */   public static ChatColor ColorGrayb2t7 = ChatColor.GRAY;
/*  434 */   public static ChatColor ColorGrayb3t7 = ChatColor.GRAY;
/*  435 */   public static ChatColor ColorGrayb4t7 = ChatColor.GRAY;
/*  436 */   public static ChatColor ColorGrayb5t7 = ChatColor.GRAY;
/*  437 */   public static ChatColor ColorGrayb6t7 = ChatColor.GRAY;
/*  438 */   public static ChatColor ColorGrayb7t7 = ChatColor.GRAY;
/*  439 */   public static ChatColor ColorGrayb8t7 = ChatColor.GRAY;
/*  440 */   public static ChatColor ColorGrayb9t7 = ChatColor.GRAY;
/*      */   
/*  442 */   public static ChatColor ColorGrayb1t8 = ChatColor.GRAY;
/*  443 */   public static ChatColor ColorGrayb2t8 = ChatColor.GRAY;
/*  444 */   public static ChatColor ColorGrayb3t8 = ChatColor.GRAY;
/*  445 */   public static ChatColor ColorGrayb4t8 = ChatColor.GRAY;
/*  446 */   public static ChatColor ColorGrayb5t8 = ChatColor.GRAY;
/*  447 */   public static ChatColor ColorGrayb6t8 = ChatColor.GRAY;
/*  448 */   public static ChatColor ColorGrayb7t8 = ChatColor.GRAY;
/*  449 */   public static ChatColor ColorGrayb8t8 = ChatColor.GRAY;
/*  450 */   public static ChatColor ColorGrayb9t8 = ChatColor.GRAY;
/*      */   
/*  452 */   public static ChatColor ColorGrayb1t9 = ChatColor.GRAY;
/*  453 */   public static ChatColor ColorGrayb2t9 = ChatColor.GRAY;
/*  454 */   public static ChatColor ColorGrayb3t9 = ChatColor.GRAY;
/*  455 */   public static ChatColor ColorGrayb4t9 = ChatColor.GRAY;
/*  456 */   public static ChatColor ColorGrayb5t9 = ChatColor.GRAY;
/*  457 */   public static ChatColor ColorGrayb6t9 = ChatColor.GRAY;
/*  458 */   public static ChatColor ColorGrayb7t9 = ChatColor.GRAY;
/*  459 */   public static ChatColor ColorGrayb8t9 = ChatColor.GRAY;
/*  460 */   public static ChatColor ColorGrayb9t9 = ChatColor.GRAY;
/*      */ 
/*      */   public static boolean s1 = false;
/*      */   public static boolean s2 = false;
/*      */   public static boolean s3 = false;
/*      */   public static boolean s4 = false;
/*      */   public static boolean s5 = false;
/*      */   public static boolean s6 = false;
/*      */   public static boolean s7 = false;
/*      */   public static boolean s8 = false;
/*      */   public static boolean s9 = false;
/*      */   public static boolean s10 = false;
/*      */   public static boolean s11 = false;
/*      */   public static boolean s12 = false;
/*      */   public static boolean s13 = false;
/*      */   public static boolean s14 = false;
/*      */   public static boolean s15 = false;
/*      */   public static boolean s16 = false;
/*      */   public static boolean s17 = false;
/*      */   public static boolean s18 = false;
			 public static boolean f1 = false;

/*      */   
/*      */   public boolean randomized;

			 public static boolean hunger = true;
			 
			 public static boolean keepinventory = false;
			 
			 
			 
			 
/*      */ 	 public static int Teamsize = 2;
/*      */   
/*  477 */   public static int SpawnArea = 100;
/*      */   

/*  479 */   public static int hours = 0;
/*  479 */   public static int minutes = 10;
/*  480 */   public static int seconds = 0;



			 public static int Restartseconds = 20;
			 
/*      */   
/*  482 */   static String MM = "Minuten";
/*  483 */   static String SS = "Sekunden";
			 static String HH = "Stunden";
			        
/*      */ 
/*      */ 
/*      */   
/*      */   private static Main instance;
/*      */ 
/*      */ 
/*      */   
/*      */   public FileConfiguration LangConfig;
/*      */ 
/*      */ 
/*      */   
/*      */   public File LangConfigFile;
 /*      */ 
/*      */ 
/*      */   
/*      */   static ConfigLink cl;
/*      */ 	 


/*      */   
/*      */   public void deleteWorld() {
/*  504 */     File file = new File("world");
/*  505 */     if (!file.exists() || !file.isDirectory())
/*      */       return;  try {
/*  507 */       for (Player players : Bukkit.getOnlinePlayers()) {
/*  508 */         players.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).gameisrestarting);
/*      */       }
/*      */       
/*  511 */       FileUtils.deleteDirectory(file);
/*  512 */     } catch (IOException iOException) {}
/*      */   }
/*      */   
/*      */   public void deleteNether() {
/*  516 */     File file = new File("world_nether");
/*  517 */     if (!file.exists() || !file.isDirectory())
/*      */       return;  try {
/*  519 */       for (Player players : Bukkit.getOnlinePlayers()) {
/*  520 */         players.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).gameisrestarting);
/*      */       }
/*      */       
/*  523 */       FileUtils.deleteDirectory(file);
/*  524 */     } catch (IOException iOException) {}
/*      */   }
/*      */   
/*      */   public void deleteEnd() {
/*  528 */     File file = new File("world_the_end");
/*  529 */     if (!file.exists() || !file.isDirectory())
/*      */       return;  try {
/*  531 */       for (Player players : Bukkit.getOnlinePlayers()) {
/*  532 */         players.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).gameisrestarting);
/*      */       }
/*      */       
/*  535 */       FileUtils.deleteDirectory(file);
/*  536 */     } catch (IOException iOException) {}
/*      */   }
/*      */ 
/*      */ 
			public  void getData(String type, String name) {
				if (type.equalsIgnoreCase("int")) {
					data.getConfig().getInt(name);
				} else if (type.equalsIgnoreCase("boolean")) {
					data.getConfig().getBoolean(name);
				} else {
					System.out.print("undefinded");
				}
	
			}
/*      */ 
/*      */ 
/*      */   
/*      */   public void onLoad() {
/*  543 */     data.reloadConfig();
/*  544 */     if (data.getConfig().contains("Gamesettings.reset") && data.getConfig().getBoolean("Gamesettings.reset")) {
/*      */       
/*  546 */       deleteWorld();
/*  547 */       deleteNether();
/*  548 */       deleteEnd();
/*  549 */       Main.GameStarted = false;
/*  550 */       this.LobbyStatus = true;  

/*  552 */       data.getConfig().set("Gamesettings.reset", Boolean.valueOf(false)); 

/*  559 */       this.randomized = false;
/*  560 */       Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "World is Reseting!");
/*      */     } else {
/*  562 */       Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "World is not Reseting!");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void onEnable() {
/*  569 */     createCustomConfig();
			   Utilities.DefaultData.setDefaultData();
			   this.data = new DataManager(this);
/*  570 */     instance = this;
/*  571 */     Main.t1.clear();
/*  572 */     Main.t2.clear();
/*  573 */     Main.t3.clear();
/*  574 */     Main.t4.clear();
/*  575 */     Main.t5.clear();
/*  576 */     Main.t6.clear();
/*  577 */     Main.t7.clear();
/*  578 */     Main.t8.clear();
/*  579 */     Main.t9.clear();
/*      */ 
/*      */     

/*  582 */     getCommand("bingopl").setExecutor((CommandExecutor)new Bingo_guide(this));
/*  583 */     getCommand("bingorestart").setExecutor((CommandExecutor)new Bingo_restart(this));
/*  584 */     getCommand("top").setExecutor((CommandExecutor)new Bingo_top(this));
/*  585 */     getCommand("bingo").setExecutor((CommandExecutor)new Bingo(this));
/*  586 */     getCommand("start").setExecutor((CommandExecutor)new Start(this));
			   getCommand("teams").setExecutor((CommandExecutor)new teams(this));		   
/*  587 */     getCommand("brestart").setExecutor((CommandExecutor)new Restart(this));
			   getCommand("settings").setExecutor((CommandExecutor)new settings(this));
/*  588 */     getServer().getPluginManager().registerEvents((Listener)new Listeners(this), (Plugin)this);
/*  589 */     WorldBorder wb = Bukkit.getWorld("world").getWorldBorder();
/*  590 */     wb.setCenter(0.0D, 0.0D);
/*  591 */     wb.setSize(8000.0D, 8000L);
/*  592 */     wb.setWarningTime(5);
/*  593 */     wb.setDamageAmount(0.5D);
/*  594 */     Main.cl = new ConfigLink(this);
/*  595 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).pluginstarted);
/*      */ 
/*      */ 
/*      */ 	   if (!data.getConfig().getBoolean("Gamesettings.timercountdown")) {
	/*  479 */ hours = 0;
	/*  479 */ minutes = 0;
	/*  480 */ seconds = 0;
			}  else if (data.getConfig().getBoolean("Gamesettings.timercountdown")) {
	/*  479 */ hours = 0;
	/*  479 */ minutes = 10;
	/*  480 */ seconds = 0;
			}
/*      */ 
/*      */ }
/*      */

/*      */ 
/*      */ 
/*      */   
/*      */   public void onDisable() {
/*  614 */     Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).pluginstopped);

					data.saveConfig();
					Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + ChatColor.GREEN + "Config Saved");
			
/*      */   }
/*      */ 
/*      */   
/*      */   public FileConfiguration getLangConfig() {
/*  619 */     return this.LangConfig;
/*      */   }
/*      */   
/*      */   public static ConfigLink getCL() {
/*  623 */     return cl;
/*      */   }
/*      */   
/*      */   private void createCustomConfig() {
/*  627 */     this.LangConfigFile = new File(getDataFolder(), "language.yml");
/*  628 */     if (!this.LangConfigFile.exists()) {
/*  629 */       this.LangConfigFile.getParentFile().mkdirs();
/*  630 */       saveResource("language.yml", false);
/*      */     } 
/*      */     
/*  633 */     this.LangConfig = (FileConfiguration)new YamlConfiguration();
/*      */     try {
/*  635 */       this.LangConfig.load(this.LangConfigFile);
/*  636 */     } catch (IOException|org.bukkit.configuration.InvalidConfigurationException e) {
/*  637 */       e.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static Main getPlugin() {
/*  643 */     return instance;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void deleteWorldWithoutChunk() {
/*  651 */     World world = Bukkit.getWorld("world");
/*  652 */     File file = new File("world");
/*  653 */     if (!file.exists() || !file.isDirectory())
/*      */       return;  try {
/*  655 */       for (Player players : Bukkit.getOnlinePlayers()) {
/*  656 */         players.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).gameisrestarting);
/*      */       }
/*  658 */       Bukkit.unloadWorld(world.getName(), false);
/*  659 */       FileUtils.deleteDirectory(file);
/*  660 */     } catch (IOException e) {
/*  661 */       e.printStackTrace();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 

/*      */   public void RestartCountDown() {
	
	
	if (winner1 != null && winner2 != null) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			
			player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3F, 1.0F);
			player.sendTitle(ChatColor.GREEN + "Die Gewinner sind", ChatColor.GOLD + winner1 + " " + ChatColor.GREEN + "und" + " " + ChatColor.GOLD + winner2, 20, 100, 40);
		}
	
	} else if (winner1 != null) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			
			player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3F, 1.0F);
			player.sendTitle(ChatColor.GREEN + "Der Gewinner ist", ChatColor.GOLD + winner1, 20, 100, 40);
		}
	
	} else if (winner1 == null && winner2 == null) {
		for (Player player : Bukkit.getOnlinePlayers()) {
			
			player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3F, 1.0F);
			player.sendTitle(ChatColor.GREEN + "Kein Gewinner", ChatColor.RED + "Gleichstand!", 20, 100, 40);
		}
	}
	
	
/* 1161 */     (new BukkitRunnable()
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void run()
/*      */         {

         
/* 1193 */           if (Main.Restartseconds > 0)
/*      */           { 
					   Bukkit.broadcastMessage(String.valueOf((getCL()).prefix) + " " + ChatColor.GREEN + "Spiel Restartet in:" + " " + ChatColor.RED + Restartseconds);
					   Main.Restartseconds--;
					   
					   if (Main.Restartseconds < 10) {
/* 36 */                     for (Player soundplayer : Bukkit.getOnlinePlayers()) {
/* 37 */                       soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3F, 1.0F);
/*    */                  }
						   
					   }
/*      */           }
/* 1198 */           else 
/*      */           {
/* 1200 */             restartGame();
					   cancel();
/*      */           
/*      */           }
       
/*      */         }
/* 1214 */       }).runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
/*      */   }










/*      */ 
/*      */   
/*      */   public void restartGame() {
/*  669 */     for (Player player : Bukkit.getOnlinePlayers()) {
/*  670 */       if (Main.t1.contains(player)) {
/*  671 */         Main.t1.remove(player);
/*  672 */       } else if (Main.t2.contains(player)) {
/*  673 */         Main.t2.remove(player);
/*  674 */       } else if (Main.t3.contains(player)) {
/*  675 */         Main.t3.remove(player);
/*  676 */       } else if (Main.t4.contains(player)) {
/*  677 */         Main.t4.remove(player);
/*  678 */       } else if (Main.t5.contains(player)) {
/*  679 */         Main.t5.remove(player);
/*  680 */       } else if (Main.t6.contains(player)) {
/*  681 */         Main.t6.remove(player);
/*  682 */       } else if (Main.t7.contains(player)) {
/*  683 */         Main.t7.remove(player);
/*  684 */       } else if (Main.t8.contains(player)) {
/*  685 */         Main.t8.remove(player);
/*  686 */       } else if (Main.t9.contains(player)) {
/*  687 */         Main.t9.remove(player);
/*  688 */       }  if (this.winner2 == null && this.winner1 != null) {
/*  689 */         player.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).kickmsgwinOnePlayer.replace("%player%", this.winner1)); continue;
/*      */       } else if (this.winner1 == null && this.winner2 == null) {
				   player.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + ChatColor.GREEN + "Kein Gewinner" + " " + ChatColor.RED + "Gleichstand!"); continue;
				 } else if (this.winner1 != null && this.winner2 != null) {
/*  691 */       player.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).kickmsgwinTwoPlayer.replace("%player1%", this.winner1).replace("%player2%", this.winner2));
				 }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  696 */     data.reloadConfig();
/*  697 */     if (data.getConfig().contains("Gamesettings.reset") && data.getConfig().getBoolean("Gamesettings.reset") == true) {
/*      */ 
/*      */       
/*  700 */       Main.GameStarted = false;
/*  701 */       this.LobbyStatus = true;
/*      */       
/*  703 */       data.getConfig().set("Gamesettings.reset", Boolean.valueOf(true));
/*  705 */       data.saveConfig();
/*  706 */ 
/*      */       
/*  710 */       this.randomized = false;
/*      */       
/*  712 */       this.gotitems1 = 0;
/*  713 */       this.gotitems2 = 0;
/*  714 */       this.gotitems3 = 0;
/*  715 */       this.gotitems4 = 0;
/*  716 */       this.gotitems5 = 0;
/*  717 */       this.gotitems6 = 0;
/*  718 */       this.gotitems7 = 0;
/*  719 */       this.gotitems8 = 0;
/*  720 */       this.gotitems9 = 0;
/*      */       
/*  722 */       this.b1t1 = false;
/*  723 */       this.b2t1 = false;
/*  724 */       this.b3t1 = false;
/*  725 */       this.b4t1 = false;
/*  726 */       this.b5t1 = false;
/*  727 */       this.b6t1 = false;
/*  728 */       this.b7t1 = false;
/*  729 */       this.b8t1 = false;
/*  730 */       this.b9t1 = false;
/*      */       
/*  732 */       this.b1t2 = false;
/*  733 */       this.b2t2 = false;
/*  734 */       this.b3t2 = false;
/*  735 */       this.b4t2 = false;
/*  736 */       this.b5t2 = false;
/*  737 */       this.b6t2 = false;
/*  738 */       this.b7t2 = false;
/*  739 */       this.b8t2 = false;
/*  740 */       this.b9t2 = false;
/*      */       
/*  742 */       this.b1t3 = false;
/*  743 */       this.b2t3 = false;
/*  744 */       this.b3t3 = false;
/*  745 */       this.b4t3 = false;
/*  746 */       this.b5t3 = false;
/*  747 */       this.b6t3 = false;
/*  748 */       this.b7t3 = false;
/*  749 */       this.b8t3 = false;
/*  750 */       this.b9t3 = false;
/*      */       
/*  752 */       this.b1t4 = false;
/*  753 */       this.b2t4 = false;
/*  754 */       this.b3t4 = false;
/*  755 */       this.b4t4 = false;
/*  756 */       this.b5t4 = false;
/*  757 */       this.b6t4 = false;
/*  758 */       this.b7t4 = false;
/*  759 */       this.b8t4 = false;
/*  760 */       this.b9t4 = false;
/*      */       
/*  762 */       this.b1t5 = false;
/*  763 */       this.b2t5 = false;
/*  764 */       this.b3t5 = false;
/*  765 */       this.b4t5 = false;
/*  766 */       this.b5t5 = false;
/*  767 */       this.b6t5 = false;
/*  768 */       this.b7t5 = false;
/*  769 */       this.b8t5 = false;
/*  770 */       this.b9t5 = false;
/*      */       
/*  772 */       this.b1t6 = false;
/*  773 */       this.b2t6 = false;
/*  774 */       this.b3t6 = false;
/*  775 */       this.b4t6 = false;
/*  776 */       this.b5t6 = false;
/*  777 */       this.b6t6 = false;
/*  778 */       this.b7t6 = false;
/*  779 */       this.b8t6 = false;
/*  780 */       this.b9t6 = false;
/*      */       
/*  782 */       this.b1t7 = false;
/*  783 */       this.b2t7 = false;
/*  784 */       this.b3t7 = false;
/*  785 */       this.b4t7 = false;
/*  786 */       this.b5t7 = false;
/*  787 */       this.b6t7 = false;
/*  788 */       this.b7t7 = false;
/*  789 */       this.b8t7 = false;
/*  790 */       this.b9t7 = false;
/*      */       
/*  792 */       this.b1t8 = false;
/*  793 */       this.b2t8 = false;
/*  794 */       this.b3t8 = false;
/*  795 */       this.b4t8 = false;
/*  796 */       this.b5t8 = false;
/*  797 */       this.b6t8 = false;
/*  798 */       this.b7t8 = false;
/*  799 */       this.b8t8 = false;
/*  800 */       this.b9t8 = false;
/*      */       
/*  802 */       this.b1t9 = false;
/*  803 */       this.b2t9 = false;
/*  804 */       this.b3t9 = false;
/*  805 */       this.b4t9 = false;
/*  806 */       this.b5t9 = false;
/*  807 */       this.b6t9 = false;
/*  808 */       this.b7t9 = false;
/*  809 */       this.b8t9 = false;
/*  810 */       this.b9t9 = false;
/*      */       
/*  812 */       this.winner1 = null;
/*  813 */       this.winner2 = null;
/*      */       
/*  815 */       Main.t1.clear();
/*  816 */       Main.t2.clear();
/*  817 */       Main.t3.clear();
/*  818 */       Main.t4.clear();
/*  819 */       Main.t5.clear();
/*  820 */       Main.t6.clear();
/*  821 */       Main.t7.clear();
/*  822 */       Main.t8.clear();
/*  823 */       Main.t9.clear();
/*      */       
/*  825 */       this.foundItemsT1.clear();
/*  826 */       this.foundItemsT2.clear();
/*  827 */       this.foundItemsT3.clear();
/*  828 */       this.foundItemsT4.clear();
/*  829 */       this.foundItemsT5.clear();
/*  830 */       this.foundItemsT6.clear();
/*  831 */       this.foundItemsT7.clear();
/*  832 */       this.foundItemsT8.clear();
/*  833 */       this.foundItemsT9.clear();
/*      */       
/*  835 */       
/*      */     }
				Bukkit.spigot().restart();
/*      */   }
/*      */ 
/*      */   
/*      */   public void manuallyRestarting() {
/*  841 */     this.isRestarting = true;
/*  842 */     for (Player player : Bukkit.getOnlinePlayers()) {
/*  843 */       if (Main.t1.contains(player)) {
/*  844 */         Main.t1.remove(player);
/*  845 */       } else if (Main.t2.contains(player)) {
/*  846 */         Main.t2.remove(player);
/*  847 */       } else if (Main.t3.contains(player)) {
/*  848 */         Main.t3.remove(player);
/*  849 */       } else if (Main.t4.contains(player)) {
/*  850 */         Main.t4.remove(player);
/*  851 */       } else if (Main.t5.contains(player)) {
/*  852 */         Main.t5.remove(player);
/*  853 */       } else if (Main.t6.contains(player)) {
/*  854 */         Main.t6.remove(player);
/*  855 */       } else if (Main.t7.contains(player)) {
/*  856 */         Main.t7.remove(player);
/*  857 */       } else if (Main.t8.contains(player)) {
/*  858 */         Main.t8.remove(player);
/*  859 */       } else if (Main.t9.contains(player)) {
/*  860 */         Main.t9.remove(player);
/*      */       } 
/*  862 */       player.kickPlayer(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).gameisrestarting);
/*      */     } 
/*      */ 
/*      */     
/*  866 */     data.reloadConfig();
/*  867 */     if (data.getConfig().contains("Gamesettings.reset") && data.getConfig().getBoolean("Gamesettings.reset") == true) {
/*      */       
/*  869 */       Main.GameStarted = false;
/*  870 */       this.LobbyStatus = true;
/*      */       
/*  872 */       data.getConfig().set("Gamesettings.reset", Boolean.valueOf(true));
				 data.saveConfig();
				 
/*  878 */       this.randomized = false;
/*      */       
/*  880 */       this.gotitems1 = 0;
/*  881 */       this.gotitems2 = 0;
/*  882 */       this.gotitems3 = 0;
/*  883 */       this.gotitems4 = 0;
/*  884 */       this.gotitems5 = 0;
/*  885 */       this.gotitems6 = 0;
/*  886 */       this.gotitems7 = 0;
/*  887 */       this.gotitems8 = 0;
/*  888 */       this.gotitems9 = 0;
/*      */       
/*  890 */       this.b1t1 = false;
/*  891 */       this.b2t1 = false;
/*  892 */       this.b3t1 = false;
/*  893 */       this.b4t1 = false;
/*  894 */       this.b5t1 = false;
/*  895 */       this.b6t1 = false;
/*  896 */       this.b7t1 = false;
/*  897 */       this.b8t1 = false;
/*  898 */       this.b9t1 = false;
/*      */       
/*  900 */       this.b1t2 = false;
/*  901 */       this.b2t2 = false;
/*  902 */       this.b3t2 = false;
/*  903 */       this.b4t2 = false;
/*  904 */       this.b5t2 = false;
/*  905 */       this.b6t2 = false;
/*  906 */       this.b7t2 = false;
/*  907 */       this.b8t2 = false;
/*  908 */       this.b9t2 = false;
/*      */       
/*  910 */       this.b1t3 = false;
/*  911 */       this.b2t3 = false;
/*  912 */       this.b3t3 = false;
/*  913 */       this.b4t3 = false;
/*  914 */       this.b5t3 = false;
/*  915 */       this.b6t3 = false;
/*  916 */       this.b7t3 = false;
/*  917 */       this.b8t3 = false;
/*  918 */       this.b9t3 = false;
/*      */       
/*  920 */       this.b1t4 = false;
/*  921 */       this.b2t4 = false;
/*  922 */       this.b3t4 = false;
/*  923 */       this.b4t4 = false;
/*  924 */       this.b5t4 = false;
/*  925 */       this.b6t4 = false;
/*  926 */       this.b7t4 = false;
/*  927 */       this.b8t4 = false;
/*  928 */       this.b9t4 = false;
/*      */       
/*  930 */       this.b1t5 = false;
/*  931 */       this.b2t5 = false;
/*  932 */       this.b3t5 = false;
/*  933 */       this.b4t5 = false;
/*  934 */       this.b5t5 = false;
/*  935 */       this.b6t5 = false;
/*  936 */       this.b7t5 = false;
/*  937 */       this.b8t5 = false;
/*  938 */       this.b9t5 = false;
/*      */       
/*  940 */       this.b1t6 = false;
/*  941 */       this.b2t6 = false;
/*  942 */       this.b3t6 = false;
/*  943 */       this.b4t6 = false;
/*  944 */       this.b5t6 = false;
/*  945 */       this.b6t6 = false;
/*  946 */       this.b7t6 = false;
/*  947 */       this.b8t6 = false;
/*  948 */       this.b9t6 = false;
/*      */       
/*  950 */       this.b1t7 = false;
/*  951 */       this.b2t7 = false;
/*  952 */       this.b3t7 = false;
/*  953 */       this.b4t7 = false;
/*  954 */       this.b5t7 = false;
/*  955 */       this.b6t7 = false;
/*  956 */       this.b7t7 = false;
/*  957 */       this.b8t7 = false;
/*  958 */       this.b9t7 = false;
/*      */       
/*  960 */       this.b1t8 = false;
/*  961 */       this.b2t8 = false;
/*  962 */       this.b3t8 = false;
/*  963 */       this.b4t8 = false;
/*  964 */       this.b5t8 = false;
/*  965 */       this.b6t8 = false;
/*  966 */       this.b7t8 = false;
/*  967 */       this.b8t8 = false;
/*  968 */       this.b9t8 = false;
/*      */       
/*  970 */       this.b1t9 = false;
/*  971 */       this.b2t9 = false;
/*  972 */       this.b3t9 = false;
/*  973 */       this.b4t9 = false;
/*  974 */       this.b5t9 = false;
/*  975 */       this.b6t9 = false;
/*  976 */       this.b7t9 = false;
/*  977 */       this.b8t9 = false;
/*  978 */       this.b9t9 = false;
/*      */       
/*  980 */       Main.t1.clear();
/*  981 */       Main.t2.clear();
/*  982 */       Main.t3.clear();
/*  983 */       Main.t4.clear();
/*  984 */       Main.t5.clear();
/*  985 */       Main.t6.clear();
/*  986 */       Main.t7.clear();
/*  987 */       Main.t8.clear();
/*  988 */       Main.t9.clear();
/*      */       
/*  990 */       this.winner1 = null;
/*  991 */       this.winner2 = null;
/*  992 */       this.foundItemsT1.clear();
/*  993 */       this.foundItemsT2.clear();
/*  994 */       this.foundItemsT3.clear();
/*  995 */       this.foundItemsT4.clear();
/*  996 */       this.foundItemsT5.clear();
/*  997 */       this.foundItemsT6.clear();
/*  998 */       this.foundItemsT7.clear();
/*  999 */       this.foundItemsT8.clear();
/* 1000 */       this.foundItemsT9.clear();
/*      */       
/* 1002 */       
/*      */     } 
				Bukkit.spigot().restart();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void noPlayerRestart() {
/* 1012 */     data.reloadConfig();
/* 1013 */     if (data.getConfig().contains("Gamesettings.reset") && data.getConfig().getBoolean("Gamesettings.reset") == true) {
/*      */ 
/*      */       
/* 1016 */       Main.GameStarted = false;
/* 1017 */       this.LobbyStatus = true;
/*      */       
/* 1019 */       data.getConfig().set("Gamesettings.reset", Boolean.valueOf(false));
				 data.saveConfig();

/*      */       
/* 1026 */       this.randomized = false;
/*      */       
/* 1028 */       this.gotitems1 = 0;
/* 1029 */       this.gotitems2 = 0;
/* 1030 */       this.gotitems3 = 0;
/* 1031 */       this.gotitems4 = 0;
/* 1032 */       this.gotitems5 = 0;
/* 1033 */       this.gotitems6 = 0;
/* 1034 */       this.gotitems7 = 0;
/* 1035 */       this.gotitems8 = 0;
/* 1036 */       this.gotitems9 = 0;
/*      */       
/* 1038 */       this.b1t1 = false;
/* 1039 */       this.b2t1 = false;
/* 1040 */       this.b3t1 = false;
/* 1041 */       this.b4t1 = false;
/* 1042 */       this.b5t1 = false;
/* 1043 */       this.b6t1 = false;
/* 1044 */       this.b7t1 = false;
/* 1045 */       this.b8t1 = false;
/* 1046 */       this.b9t1 = false;
/*      */       
/* 1048 */       this.b1t2 = false;
/* 1049 */       this.b2t2 = false;
/* 1050 */       this.b3t2 = false;
/* 1051 */       this.b4t2 = false;
/* 1052 */       this.b5t2 = false;
/* 1053 */       this.b6t2 = false;
/* 1054 */       this.b7t2 = false;
/* 1055 */       this.b8t2 = false;
/* 1056 */       this.b9t2 = false;
/*      */       
/* 1058 */       this.b1t3 = false;
/* 1059 */       this.b2t3 = false;
/* 1060 */       this.b3t3 = false;
/* 1061 */       this.b4t3 = false;
/* 1062 */       this.b5t3 = false;
/* 1063 */       this.b6t3 = false;
/* 1064 */       this.b7t3 = false;
/* 1065 */       this.b8t3 = false;
/* 1066 */       this.b9t3 = false;
/*      */       
/* 1068 */       this.b1t4 = false;
/* 1069 */       this.b2t4 = false;
/* 1070 */       this.b3t4 = false;
/* 1071 */       this.b4t4 = false;
/* 1072 */       this.b5t4 = false;
/* 1073 */       this.b6t4 = false;
/* 1074 */       this.b7t4 = false;
/* 1075 */       this.b8t4 = false;
/* 1076 */       this.b9t4 = false;
/*      */       
/* 1078 */       this.b1t5 = false;
/* 1079 */       this.b2t5 = false;
/* 1080 */       this.b3t5 = false;
/* 1081 */       this.b4t5 = false;
/* 1082 */       this.b5t5 = false;
/* 1083 */       this.b6t5 = false;
/* 1084 */       this.b7t5 = false;
/* 1085 */       this.b8t5 = false;
/* 1086 */       this.b9t5 = false;
/*      */       
/* 1088 */       this.b1t6 = false;
/* 1089 */       this.b2t6 = false;
/* 1090 */       this.b3t6 = false;
/* 1091 */       this.b4t6 = false;
/* 1092 */       this.b5t6 = false;
/* 1093 */       this.b6t6 = false;
/* 1094 */       this.b7t6 = false;
/* 1095 */       this.b8t6 = false;
/* 1096 */       this.b9t6 = false;
/*      */       
/* 1098 */       this.b1t7 = false;
/* 1099 */       this.b2t7 = false;
/* 1100 */       this.b3t7 = false;
/* 1101 */       this.b4t7 = false;
/* 1102 */       this.b5t7 = false;
/* 1103 */       this.b6t7 = false;
/* 1104 */       this.b7t7 = false;
/* 1105 */       this.b8t7 = false;
/* 1106 */       this.b9t7 = false;
/*      */       
/* 1108 */       this.b1t8 = false;
/* 1109 */       this.b2t8 = false;
/* 1110 */       this.b3t8 = false;
/* 1111 */       this.b4t8 = false;
/* 1112 */       this.b5t8 = false;
/* 1113 */       this.b6t8 = false;
/* 1114 */       this.b7t8 = false;
/* 1115 */       this.b8t8 = false;
/* 1116 */       this.b9t8 = false;
/*      */       
/* 1118 */       this.b1t9 = false;
/* 1119 */       this.b2t9 = false;
/* 1120 */       this.b3t9 = false;
/* 1121 */       this.b4t9 = false;
/* 1122 */       this.b5t9 = false;
/* 1123 */       this.b6t9 = false;
/* 1124 */       this.b7t9 = false;
/* 1125 */       this.b8t9 = false;
/* 1126 */       this.b9t9 = false;
/*      */       
/* 1128 */       Main.t1.clear();
/* 1129 */       Main.t2.clear();
/* 1130 */       Main.t3.clear();
/* 1131 */       Main.t4.clear();
/* 1132 */       Main.t5.clear();
/* 1133 */       Main.t6.clear();
/* 1134 */       Main.t7.clear();
/* 1135 */       Main.t8.clear();
/* 1136 */       Main.t9.clear();
/*      */       
/* 1138 */       this.winner1 = null;
/* 1139 */       this.winner2 = null;
/* 1140 */       this.foundItemsT1.clear();
/* 1141 */       this.foundItemsT2.clear();
/* 1142 */       this.foundItemsT3.clear();
/* 1143 */       this.foundItemsT4.clear();
/* 1144 */       this.foundItemsT5.clear();
/* 1145 */       this.foundItemsT6.clear();
/* 1146 */       this.foundItemsT7.clear();
/* 1147 */       this.foundItemsT8.clear();
/* 1148 */       this.foundItemsT9.clear();
/*      */       
/* 1150 */       Bukkit.spigot().restart();
/*      */     } 
				
/*      */   }
/*      */ 
/*      */ 
/*      */ 

/*      */ 
/*      */ 
/*      */   
/*      */   public void CountDown() {

				
/* 1161 */     (new BukkitRunnable()
/*      */       {
				

/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         public void run()

/*      */         {
					 if (Main.GameStarted) {
						 for (Player player : Bukkit.getOnlinePlayers()) {
							 
							 	
								String Zeit = " " + ChatColor.GRAY + "||" + " " + ChatColor.GOLD + Main.hours + " " + ChatColor.GREEN + Main.HH + " " + ChatColor.GOLD + Main.minutes + " " + ChatColor.GREEN + Main.MM + " " + ChatColor.GOLD + Main.seconds + " " + ChatColor.GREEN + Main.SS;

								/* 1463 */             if (Main.t1.contains(player)) {
								/* 1464 */               String actionbar1 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems1));
								/* 1465 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(String.valueOf(actionbar1) + Zeit));
								/*      */             }
								/* 1467 */             else if (Main.t2.contains(player)) {
								/* 1468 */               String actionbar2 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems2));
								/* 1469 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar2 + Zeit));
								/*      */             }
								/* 1471 */             else if (Main.t3.contains(player)) {
								/* 1472 */               String actionbar3 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems3));
								/* 1473 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar3 + Zeit));
								/*      */             }
								/* 1475 */             else if (Main.t4.contains(player)) {
								/* 1476 */               String actionbar4 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems4));
								/* 1477 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar4 + Zeit));
								/*      */             }
								/* 1479 */             else if (Main.t5.contains(player)) {
								/* 1480 */               String actionbar5 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems5));
								/* 1481 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar5 + Zeit));
								/*      */             }
								/* 1483 */             else if (Main.t6.contains(player)) {
								/* 1484 */               String actionbar6 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems6));
								/* 1485 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar6 + Zeit));
								/*      */             }
								/* 1487 */             else if (Main.t7.contains(player)) {
								/* 1488 */               String actionbar7 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems7));
								/* 1489 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar7 + Zeit));
								/*      */             }
								/* 1491 */             else if (Main.t8.contains(player)) {
								/* 1492 */               String actionbar8 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems8));
								/* 1493 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar8 + Zeit));
								/*      */             }
								/* 1495 */             else if (Main.t9.contains(player)) {
								/* 1496 */               String actionbar9 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems9));
								/* 1497 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar9 + Zeit));
								/*      */             } 
							 
						 }
						 
						 
					 }
	
	
	
	
/* 1170 */           if (Main.seconds == 1) {
/*      */             
/* 1172 */             Main.SS = "Sekunde";
/* 1173 */           } else if (Main.seconds == 0) {
/*      */             
/* 1175 */             Main.SS = "Sekunden";
/*      */           } else if (Main.seconds > 1) {
	
					   Main.SS = "Sekunden";
					  }
/*      */           
/* 1178 */           if (Main.minutes == 1) {
/*      */             
/* 1180 */             Main.MM = "Minute";
/* 1181 */           } else if (Main.minutes == 0) {
/*      */             
/* 1183 */             Main.MM = "Minuten";
/*      */           } else if (Main.minutes > 1) {
	
					   Main.MM = "Minuten";
						}

/* 1178 */           if (Main.hours == 1) {
/*      */             
/* 1180 */             Main.HH = "Stunde";
/* 1181 */           } else if (Main.hours > 1) {
/*      */             
/* 1183 */             Main.HH = "Stunden";
/*      */           } else if (Main.hours == 0) {
	
						Main.HH = "Stunden";
							}
/*      */ 
/*      */ 
/*      */ 
/*      */ 			
/*      */ 				
/*      */ 			
					
					if (data.getConfig().getBoolean("Gamesettings.timercountdown")) {
/* 1193 */           if (Main.seconds > 0)
/*      */           {
/*      */             
/* 1196 */             Main.seconds--;
/*      */           }
/* 1198 */           else if (Main.seconds == 0 && Main.minutes > 0)
/*      */           {
/* 1200 */             Main.minutes--;
/* 1201 */             Main.seconds = 60;
/*      */           
/*      */           }
/* 1204 */           else if (Main.minutes == 0 && Main.hours > 0) {
	/* 1200 */             Main.hours--;
	/* 1201 */             Main.minutes = 60;
	
					}
/*      */           else if (Main.minutes == 0 && Main.seconds == 0 && Main.hours == 0 ) {
						if (data.getConfig().getBoolean("Gamesettings.timercountdown")) {
					   Bukkit.broadcastMessage(String.valueOf((getCL()).prefix) + " " + ChatColor.RED + "Die Zeit ist abgelaufen!");
					   
					   if (gotitems1 > gotitems2 && gotitems1 > gotitems3 && gotitems1 > gotitems4 && gotitems1 > gotitems5 && gotitems1 > gotitems6 && gotitems1 > gotitems7 && gotitems1 > gotitems8 && gotitems1 > gotitems9) {
							
						   /* 2374 */                 if (Main.t1.size() == 1) {
						   /* 2375 */                   Main.this.winner1 = ((Player)Main.t1.get(0)).getName();
						   /*      */                 } else {
						   /* 2377 */                   Main.this.winner1 = ((Player)Main.t1.get(0)).getName();
						   /* 2378 */                   Main.this.winner2 = ((Player)Main.t1.get(1)).getName();
						   /*      */                 } 
						   /* 2380 */                 Main.this.isRestarting = true;
						   /* 2381 */                 Main.this.RestartCountDown();
						   								cancel();
						   /* 2382 */               }  if (gotitems2 > gotitems1 && gotitems2 > gotitems3 && gotitems2 > gotitems4 && gotitems2 > gotitems5 && gotitems2 > gotitems6 && gotitems2 > gotitems7 && gotitems2 > gotitems8 && gotitems2 > gotitems9) {
						   /* 2383 */                 if (Main.t2.size() == 1) {
						   /* 2384 */                   Main.this.winner1 = ((Player)Main.t2.get(0)).getName();
						   /*      */                 } else {
						   /* 2386 */                   Main.this.winner1 = ((Player)Main.t2.get(0)).getName();
						   /* 2387 */                   Main.this.winner2 = ((Player)Main.t2.get(1)).getName();
						   /*      */                 } 
						   /* 2389 */                 Main.this.isRestarting = true;
						   /* 2390 */                 Main.this.RestartCountDown();
						   								cancel();
						   /* 2391 */               }  if (gotitems3 > gotitems2 && gotitems3 > gotitems1 && gotitems3 > gotitems4 && gotitems3 > gotitems5 && gotitems3 > gotitems6 && gotitems3 > gotitems7 && gotitems3 > gotitems8 && gotitems3 > gotitems9) {
						   /* 2392 */                 if (Main.t3.size() == 1) {
						   /* 2393 */                   Main.this.winner1 = ((Player)Main.t3.get(0)).getName();
						   /*      */                 } else {
						   /* 2395 */                   Main.this.winner1 = ((Player)Main.t3.get(0)).getName();
						   /* 2396 */                   Main.this.winner2 = ((Player)Main.t3.get(1)).getName();
						   /*      */                 } 
						   /* 2398 */                 Main.this.isRestarting = true;
						   /* 2399 */                 Main.this.RestartCountDown(); 
						   								cancel();
						   /* 2400 */               }  if (gotitems4 > gotitems2 && gotitems4 > gotitems3 && gotitems4 > gotitems1 && gotitems4 > gotitems5 && gotitems4 > gotitems6 && gotitems4 > gotitems7 && gotitems4 > gotitems8 && gotitems4 > gotitems9) {
						   /* 2401 */                 if (Main.t4.size() == 1) {
						   /* 2402 */                   Main.this.winner1 = ((Player)Main.t4.get(0)).getName();
						   /*      */                 } else {
						   /* 2404 */                   Main.this.winner1 = ((Player)Main.t4.get(0)).getName();
						   /* 2405 */                   Main.this.winner2 = ((Player)Main.t4.get(1)).getName();
						   /*      */                 } 
						   /* 2407 */                 Main.this.isRestarting = true;
						   /* 2408 */                 Main.this.RestartCountDown(); 
						   								cancel();
						   /* 2409 */               }  if (gotitems5 > gotitems2 && gotitems5 > gotitems3 && gotitems5 > gotitems4 && gotitems5 > gotitems1 && gotitems5 > gotitems6 && gotitems5 > gotitems7 && gotitems5 > gotitems8 && gotitems5 > gotitems9) {
						   /* 2410 */                 if (Main.t5.size() == 1) {
						   /* 2411 */                   Main.this.winner1 = ((Player)Main.t5.get(0)).getName();
						   /*      */                 } else {
						   /* 2413 */                   Main.this.winner1 = ((Player)Main.t5.get(0)).getName();
						   /* 2414 */                   Main.this.winner2 = ((Player)Main.t5.get(1)).getName();
						   /*      */                 } 
						   /* 2416 */                 Main.this.isRestarting = true;
						   /* 2417 */                 Main.this.RestartCountDown(); 
						   								cancel();
						   /* 2418 */               }  if (gotitems6 > gotitems2 && gotitems6 > gotitems3 && gotitems6 > gotitems4 && gotitems6 > gotitems5 && gotitems6 > gotitems1 && gotitems6 > gotitems7 && gotitems6 > gotitems8 && gotitems6 > gotitems9) {
						   /* 2419 */                 if (Main.t6.size() == 1) {
						   /* 2420 */                   Main.this.winner1 = ((Player)Main.t6.get(0)).getName();
						   /*      */                 } else {
						   /* 2422 */                   Main.this.winner1 = ((Player)Main.t6.get(0)).getName();
						   /* 2423 */                   Main.this.winner2 = ((Player)Main.t6.get(1)).getName();
						   /*      */                 } 
						   /* 2425 */                 Main.this.isRestarting = true;
						   /* 2426 */                 Main.this.RestartCountDown(); 
						   								cancel();
						   /* 2427 */               }  if (gotitems7 > gotitems2 && gotitems7 > gotitems3 && gotitems7 > gotitems4 && gotitems7 > gotitems5 && gotitems7 > gotitems6 && gotitems7 > gotitems1 && gotitems7 > gotitems8 && gotitems7 > gotitems9) {
						   /* 2428 */                 if (Main.t7.size() == 1) {
						   /* 2429 */                   Main.this.winner1 = ((Player)Main.t7.get(0)).getName();
						   /*      */                 } else {
						   /* 2431 */                   Main.this.winner1 = ((Player)Main.t7.get(0)).getName();
						   /* 2432 */                   Main.this.winner2 = ((Player)Main.t7.get(1)).getName();
						   /*      */                 } 
						   /* 2434 */                 Main.this.isRestarting = true;
						   /* 2435 */                 Main.this.RestartCountDown(); 
						   								cancel();
						   /* 2436 */               }  if (gotitems8 > gotitems2 && gotitems8 > gotitems3 && gotitems8 > gotitems4 && gotitems8 > gotitems5 && gotitems8 > gotitems6 && gotitems8 > gotitems7 && gotitems8 > gotitems1 && gotitems8 > gotitems9) {
						   /* 2437 */                 if (Main.t8.size() == 1) {
						   /* 2438 */                   Main.this.winner1 = ((Player)Main.t8.get(0)).getName();
						   /*      */                 } else {
						   /* 2440 */                   Main.this.winner1 = ((Player)Main.t8.get(0)).getName();
						   /* 2441 */                   Main.this.winner2 = ((Player)Main.t8.get(1)).getName();
						   /*      */                 } 
						   /* 2443 */                 Main.this.isRestarting = true;
						   /* 2444 */                 Main.this.RestartCountDown(); 
						   								cancel();
						   /* 2445 */               }  if (gotitems9 > gotitems2 && gotitems9 > gotitems3 && gotitems9 > gotitems4 && gotitems9 > gotitems5 && gotitems9 > gotitems6 && gotitems9 > gotitems7 && gotitems9 > gotitems8 && gotitems9 > gotitems1) {
						   /* 2446 */                 if (Main.t9.size() == 1) {
						   /* 2447 */                   Main.this.winner1 = ((Player)Main.t9.get(0)).getName();
						   /*      */                 } else {
						   /* 2449 */                   Main.this.winner1 = ((Player)Main.t9.get(0)).getName();
						   /* 2450 */                   Main.this.winner2 = ((Player)Main.t9.get(1)).getName(); 
						   /*      */                 } 
						   /* 2452 */                 Main.this.isRestarting = true;
						   /* 2453 */                 Main.this.RestartCountDown();
						   /* 2453 */					cancel();
						   /*      */               } if (gotitems9 == gotitems2 && gotitems9 == gotitems3 && gotitems9 == gotitems4 && gotitems9 == gotitems5 && gotitems9 == gotitems6 && gotitems9 == gotitems7 && gotitems9 == gotitems8 && gotitems9 == gotitems1) {
						   					   
						   /* 2452 */                 Main.this.isRestarting = true;
						   /* 2453 */                 Main.this.RestartCountDown();
						   								cancel();
						   /*      */               }					   
					 }
					} 
					}
					if (!data.getConfig().getBoolean("Gamesettings.timercountdown")) {
						
						if (Main.hours == 0 && Main.minutes == 0 && Main.seconds == 0 && !data.getConfig().getBoolean("Gamesettings.timercountdown")) {
							Main.seconds = 5;
							Main.seconds = 0;
						}
						
						
					
/* 1193 */            if (Main.seconds == 0 || Main.seconds > 0 && !data.getConfig().getBoolean("Gamesettings.timercountdown"))
/*      */           {
/* 1196 */             Main.seconds++;
					 }
/*      */           if (Main.seconds == 59 && !data.getConfig().getBoolean("Gamesettings.timercountdown"))
/*      */           {
/* 1200 */             Main.minutes++;
/* 1201 */             Main.seconds = 0;
				
					 } 
					 if (Main.minutes == 59 && !data.getConfig().getBoolean("Gamesettings.timercountdown")) {
					   Main.hours++;
					   Main.minutes = 0;
					 } 
					}  
					
/*      */         }
/* 1214 */       }).runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
/*      */   }


/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void startGame() {
/* 1229 */     CountDown();
/*      */     
/* 1231 */     for (Player aplayer : Bukkit.getOnlinePlayers()) {
/*      */       
/* 1233 */       if (!Main.t1.contains(aplayer) && !Main.t2.contains(aplayer) && !Main.t3.contains(aplayer) && !Main.t4.contains(aplayer) && !Main.t5.contains(aplayer) && !Main.t6.contains(aplayer) && !Main.t7.contains(aplayer) && !Main.t8.contains(aplayer) && !Main.t9.contains(aplayer)) {
/* 1234 */         if (Main.t1.size() < Main.Teamsize) {
/* 1235 */           Main.t1.add(aplayer);
/* 1236 */         } else if (Main.t2.size() < Main.Teamsize) {
/* 1237 */           Main.t2.add(aplayer);
/* 1238 */         } else if (Main.t3.size() < Main.Teamsize) {
/* 1239 */           Main.t3.add(aplayer);
/* 1240 */         } else if (Main.t4.size() < Main.Teamsize) {
/* 1241 */           Main.t4.add(aplayer);
/* 1242 */         } else if (Main.t5.size() < Main.Teamsize) {
/* 1243 */           Main.t5.add(aplayer);
/* 1244 */         } else if (Main.t6.size() < Main.Teamsize) {
/* 1245 */           Main.t6.add(aplayer);
/* 1246 */         } else if (Main.t7.size() < Main.Teamsize) {
/* 1247 */           Main.t7.add(aplayer);
/* 1248 */         } else if (Main.t8.size() < Main.Teamsize) {
/* 1249 */           Main.t8.add(aplayer);
/* 1250 */         } else if (Main.t9.size() < Main.Teamsize) {
/* 1251 */           Main.t9.add(aplayer);
/*      */         } 
/*      */       }
/*      */ 
/*      */       
/* 1256 */       if (Main.t1.contains(aplayer)) {
/* 1257 */         aplayer.setPlayerListName("§6" + aplayer.getName()); continue;
/* 1258 */       }  if (Main.t2.contains(aplayer)) {
/* 1259 */         aplayer.setPlayerListName("§c" + aplayer.getName()); continue;
/* 1260 */       }  if (Main.t3.contains(aplayer)) {
/* 1261 */         aplayer.setPlayerListName("§d" + aplayer.getName()); continue;
/* 1262 */       }  if (Main.t4.contains(aplayer)) {
/* 1263 */         aplayer.setPlayerListName("§f" + aplayer.getName()); continue;
/* 1264 */       }  if (Main.t5.contains(aplayer)) {
/* 1265 */         aplayer.setPlayerListName("§1" + aplayer.getName()); continue;
/* 1266 */       }  if (Main.t6.contains(aplayer)) {
/* 1267 */         aplayer.setPlayerListName("§e" + aplayer.getName()); continue;
/* 1268 */       }  if (Main.t7.contains(aplayer)) {
/* 1269 */         aplayer.setPlayerListName("§a" + aplayer.getName()); continue;
/* 1270 */       }  if (Main.t8.contains(aplayer)) {
/* 1271 */         aplayer.setPlayerListName("§7" + aplayer.getName()); continue;
/* 1272 */       }  if (Main.t9.contains(aplayer)) {
/* 1273 */         aplayer.setPlayerListName("§5" + aplayer.getName());
/*      */       }
/*      */     } 
/* 1276 */     Main.GameStarted = true;
/* 1277 */     this.LobbyStatus = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1283 */     data.reloadConfig();
/* 1284 */     int l1x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1285 */     int l1z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1286 */     int l2x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1287 */     int l2z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1288 */     int l3x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1289 */     int l3z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1290 */     int l4x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1291 */     int l4z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1292 */     int l5x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1293 */     int l5z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1294 */     int l6x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1295 */     int l6z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1296 */     int l7x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1297 */     int l7z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1298 */     int l8x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1299 */     int l8z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1300 */     int l9x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/* 1301 */     int l9z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
/*      */     
/* 1303 */     Location l1 = new Location(Bukkit.getWorld("world"), l1x, Bukkit.getWorld("world").getHighestBlockAt(l1x, l1z).getY(), l1z);
/* 1304 */     Location l2 = new Location(Bukkit.getWorld("world"), l2x, Bukkit.getWorld("world").getHighestBlockAt(l2x, l2z).getY(), l2z);
/* 1305 */     Location l3 = new Location(Bukkit.getWorld("world"), l3x, Bukkit.getWorld("world").getHighestBlockAt(l3x, l3z).getY(), l3z);
/* 1306 */     Location l4 = new Location(Bukkit.getWorld("world"), l4x, Bukkit.getWorld("world").getHighestBlockAt(l4x, l4z).getY(), l4z);
/* 1307 */     Location l5 = new Location(Bukkit.getWorld("world"), l5x, Bukkit.getWorld("world").getHighestBlockAt(l5x, l5z).getY(), l5z);
/* 1308 */     Location l6 = new Location(Bukkit.getWorld("world"), l6x, Bukkit.getWorld("world").getHighestBlockAt(l6x, l6z).getY(), l6z);
/* 1309 */     Location l7 = new Location(Bukkit.getWorld("world"), l7x, Bukkit.getWorld("world").getHighestBlockAt(l7x, l7z).getY(), l7z);
/* 1310 */     Location l8 = new Location(Bukkit.getWorld("world"), l8x, Bukkit.getWorld("world").getHighestBlockAt(l8x, l8z).getY(), l8z);
/* 1311 */     Location l9 = new Location(Bukkit.getWorld("world"), l9x, Bukkit.getWorld("world").getHighestBlockAt(l9x, l9z).getY(), l9z);
/*      */     
/* 1313 */     Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).FollowingTeamTeleported);
/* 1314 */     if (!Main.t1.isEmpty()) {
/* 1315 */       if (Main.t1.size() == 1) {
/* 1316 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T1OnePlayer.replace("%player%", ((Player)Main.t1.get(0)).getName()));
/*      */       } else {
/* 1318 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T1TwoPlayer.replace("%player1%", ((Player)Main.t1.get(0)).getName()).replace("%player2%", ((Player)Main.t1.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1321 */     if (!Main.t2.isEmpty()) {
/* 1322 */       if (Main.t2.size() == 1) {
/* 1323 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T2OnePlayer.replace("%player%", ((Player)Main.t2.get(0)).getName()));
/*      */       } else {
/* 1325 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T2TwoPlayer.replace("%player1%", ((Player)Main.t2.get(0)).getName()).replace("%player2%", ((Player)Main.t2.get(1)).getName()));
/*      */       } 
/*      */     }
/*      */     
/* 1329 */     if (!Main.t3.isEmpty()) {
/* 1330 */       if (Main.t3.size() == 1) {
/* 1331 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T3OnePlayer.replace("%player%", ((Player)Main.t3.get(0)).getName()));
/*      */       } else {
/* 1333 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T3TwoPlayer.replace("%player1%", ((Player)Main.t3.get(0)).getName()).replace("%player2%", ((Player)Main.t3.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1336 */     if (!Main.t4.isEmpty()) {
/* 1337 */       if (Main.t4.size() == 1) {
/* 1338 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T4OnePlayer.replace("%player%", ((Player)Main.t4.get(0)).getName()));
/*      */       } else {
/* 1340 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T4TwoPlayer.replace("%player1%", ((Player)Main.t4.get(0)).getName()).replace("%player2%", ((Player)Main.t4.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1343 */     if (!Main.t5.isEmpty()) {
/* 1344 */       if (Main.t5.size() == 1) {
/* 1345 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T5OnePlayer.replace("%player%", ((Player)Main.t5.get(0)).getName()));
/*      */       } else {
/* 1347 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T5TwoPlayer.replace("%player1%", ((Player)Main.t5.get(0)).getName()).replace("%player2%", ((Player)Main.t5.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1350 */     if (!Main.t6.isEmpty()) {
/* 1351 */       if (Main.t6.size() == 1) {
/* 1352 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T6OnePlayer.replace("%player%", ((Player)Main.t6.get(0)).getName()));
/*      */       } else {
/* 1354 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T6TwoPlayer.replace("%player1%", ((Player)Main.t6.get(0)).getName()).replace("%player2%", ((Player)Main.t6.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1357 */     if (!Main.t7.isEmpty()) {
/* 1358 */       if (Main.t7.size() == 1) {
/* 1359 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T7OnePlayer.replace("%player%", ((Player)Main.t7.get(0)).getName()));
/*      */       } else {
/* 1361 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T7TwoPlayer.replace("%player1%", ((Player)Main.t7.get(0)).getName()).replace("%player2%", ((Player)Main.t7.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1364 */     if (!Main.t8.isEmpty()) {
/* 1365 */       if (Main.t8.size() == 1) {
/* 1366 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T8OnePlayer.replace("%player%", ((Player)Main.t8.get(0)).getName()));
/*      */       } else {
/* 1368 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T8TwoPlayer.replace("%player1%", ((Player)Main.t8.get(0)).getName()).replace("%player2%", ((Player)Main.t8.get(1)).getName()));
/*      */       } 
/*      */     }
/* 1371 */     if (!Main.t9.isEmpty()) {
/* 1372 */       if (Main.t9.size() == 1) {
/* 1373 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T9OnePlayer.replace("%player%", ((Player)Main.t9.get(0)).getName()));
/*      */       } else {
/* 1375 */         Bukkit.broadcastMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).T9TwoPlayer.replace("%player1%", ((Player)Main.t9.get(0)).getName()).replace("%player2%", ((Player)Main.t9.get(1)).getName()));
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1381 */     for (Player tplayer : Main.t1) {
/* 1382 */       tplayer.teleport(l1);
/*      */     }
/* 1384 */     for (Player tplayer : Main.t2) {
/* 1385 */       tplayer.teleport(l2);
/*      */     }
/* 1387 */     for (Player tplayer : Main.t3) {
/* 1388 */       tplayer.teleport(l3);
/*      */     }
/* 1390 */     for (Player tplayer : Main.t4) {
/* 1391 */       tplayer.teleport(l4);
/*      */     }
/* 1393 */     for (Player tplayer : Main.t5) {
/* 1394 */       tplayer.teleport(l5);
/*      */     }
/* 1396 */     for (Player tplayer : Main.t6) {
/* 1397 */       tplayer.teleport(l6);
/*      */     }
/* 1399 */     for (Player tplayer : Main.t7) {
/* 1400 */       tplayer.teleport(l7);
/*      */     }
/* 1402 */     for (Player tplayer : Main.t8) {
/* 1403 */       tplayer.teleport(l8);
/*      */     }
/* 1405 */     for (Player tplayer : Main.t9) {
/* 1406 */       tplayer.teleport(l9);
/*      */     }
/* 1408 */     for (Player soundplayer : Bukkit.getOnlinePlayers()) {
/* 1409 */       soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 0.3F, 1.0F);
/*      */     }
/* 1411 */     for (Player player : Bukkit.getOnlinePlayers()) {
/*      */       
/* 1413 */       player.setAllowFlight(false);
/* 1414 */       player.getPlayer().setFlying(false);
/* 1416 */       player.getPlayer().setCollidable(true);
/* 1417 */       player.setHealth(20.0D);
/* 1418 */       player.setFoodLevel(20);
/* 1419 */       player.getPlayer().getInventory().clear();
/*      */ 
/*      */       
/* 1422 */       ItemStack boat = new ItemStack(Material.OAK_BOAT, 1);
/* 1423 */       ItemMeta boatmeta = boat.getItemMeta();
/* 1424 */       boatmeta.setDisplayName((getCL()).BoatName);
/* 1425 */       boat.setItemMeta(boatmeta);
/* 1426 */       player.getInventory().setItem(0, boat);
/*      */       
/* 1428 */       player.sendMessage(String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).StartMessage);
/* 1429 */       player.setPlayerListHeader((getCL()).tablistheaderingame);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1435 */       final String foundt1 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam1;
/* 1436 */       final String foundt2 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam2;
/* 1437 */       final String foundt3 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam3;
/* 1438 */       final String foundt4 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam4;
/* 1439 */       final String foundt5 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam5;
/* 1440 */       final String foundt6 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam6;
/* 1441 */       final String foundt7 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam7;
/* 1442 */       final String foundt8 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam8;
/* 1443 */       final String foundt9 = String.valueOf(String.valueOf((getCL()).prefix)) + " " + (getCL()).teamfounditemTeam9;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1448 */       (new BukkitRunnable()
/*      */         {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           public void run()
/*      */           {
/* 1459 */             
/*      */ 
/*      */ 



/* 1256 */       if (Main.t1.contains(player)) {
/* 1257 */         player.setPlayerListName("ï¿½6" + player.getName()); 
/* 1258 */       }  if (Main.t2.contains(player)) {
/* 1259 */         player.setPlayerListName("ï¿½c" + player.getName()); 
/* 1260 */       }  if (Main.t3.contains(player)) {
/* 1261 */         player.setPlayerListName("ï¿½d" + player.getName()); 
/* 1262 */       }  if (Main.t4.contains(player)) {
/* 1263 */         player.setPlayerListName("ï¿½f" + player.getName()); 
/* 1264 */       }  if (Main.t5.contains(player)) {
/* 1265 */         player.setPlayerListName("ï¿½1" + player.getName()); 
/* 1266 */       }  if (Main.t6.contains(player)) {
/* 1267 */         player.setPlayerListName("ï¿½e" + player.getName()); 
/* 1268 */       }  if (Main.t7.contains(player)) {
/* 1269 */         player.setPlayerListName("ï¿½a" + player.getName()); 
/* 1270 */       }  if (Main.t8.contains(player)) {
/* 1271 */         player.setPlayerListName("ï¿½7" + player.getName()); 
/* 1272 */       }  if (Main.t9.contains(player)) {
/* 1273 */         player.setPlayerListName("ï¿½5" + player.getName());
/*      */       }


					   String Zeit = " " + ChatColor.GRAY + "||" + " " + ChatColor.GOLD + Main.hours + " " + ChatColor.GREEN + Main.HH + " " + ChatColor.GOLD + Main.minutes + " " + ChatColor.GREEN + Main.MM + " " + ChatColor.GOLD + Main.seconds + " " + ChatColor.GREEN + Main.SS;
/*      */             
/* 1463 */             if (Main.t1.contains(player)) {
/* 1464 */               String actionbar1 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems1));
/* 1465 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(String.valueOf(actionbar1) + Zeit));
/*      */             }
/* 1467 */             else if (Main.t2.contains(player)) {
/* 1468 */               String actionbar2 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems2));
/* 1469 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar2 + Zeit));
/*      */             }
/* 1471 */             else if (Main.t3.contains(player)) {
/* 1472 */               String actionbar3 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems3));
/* 1473 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar3 + Zeit));
/*      */             }
/* 1475 */             else if (Main.t4.contains(player)) {
/* 1476 */               String actionbar4 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems4));
/* 1477 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar4 + Zeit));
/*      */             }
/* 1479 */             else if (Main.t5.contains(player)) {
/* 1480 */               String actionbar5 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems5));
/* 1481 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar5 + Zeit));
/*      */             }
/* 1483 */             else if (Main.t6.contains(player)) {
/* 1484 */               String actionbar6 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems6));
/* 1485 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar6 + Zeit));
/*      */             }
/* 1487 */             else if (Main.t7.contains(player)) {
/* 1488 */               String actionbar7 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems7));
/* 1489 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar7 + Zeit));
/*      */             }
/* 1491 */             else if (Main.t8.contains(player)) {
/* 1492 */               String actionbar8 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems8));
/* 1493 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar8 + Zeit));
/*      */             }
/* 1495 */             else if (Main.t9.contains(player)) {
/* 1496 */               String actionbar9 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems9));
/* 1497 */               player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar9 + Zeit));
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1503 */             for (Player p : Bukkit.getOnlinePlayers()) {
/* 1504 */               if (p.getInventory().containsAtLeast(Main.b1, 1)) {
/* 1505 */                 if (Main.t1.contains(p)) {
/* 1506 */                   if (!Main.this.b1t1) {
/* 1507 */                     Main.this.b1t1 = true;
/* 1508 */                     Main.this.gotitems1++;
/* 1509 */                     Main.this.foundItemsT1.add(Main.b1);
/*      */                     
/* 1511 */                     Main.ColorGrayb1t1 = ChatColor.GREEN;
/*      */                     
/* 1513 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b1.getType().name()));
/*      */                   }
/*      */                 
/* 1516 */                 } else if (Main.t2.contains(p)) {
/* 1517 */                   if (!Main.this.b1t2) {
/* 1518 */                     Main.this.b1t2 = true;
/* 1519 */                     Main.this.gotitems2++;
/* 1520 */                     Main.this.foundItemsT2.add(Main.b1);
/*      */                     
/* 1522 */                     Main.ColorGrayb1t2 = ChatColor.GREEN;
/*      */                     
/* 1524 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b1.getType().name()));
/*      */                   } 
/* 1526 */                 } else if (Main.t4.contains(p)) {
/* 1527 */                   if (!Main.this.b1t4) {
/* 1528 */                     Main.this.b1t4 = true;
/* 1529 */                     Main.this.gotitems4++;
/* 1530 */                     Main.this.foundItemsT4.add(Main.b1);
/*      */                     
/* 1532 */                     Main.ColorGrayb1t4 = ChatColor.GREEN;
/*      */                     
/* 1534 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b1.getType().name()));
/*      */                   } 
/* 1536 */                 } else if (Main.t5.contains(p)) {
/* 1537 */                   if (!Main.this.b1t5) {
/* 1538 */                     Main.this.b1t5 = true;
/* 1539 */                     Main.this.gotitems5++;
/* 1540 */                     Main.this.foundItemsT5.add(Main.b1);
/*      */                     
/* 1542 */                     Main.ColorGrayb1t5 = ChatColor.GREEN;
/*      */                     
/* 1544 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b1.getType().name()));
/*      */                   } 
/* 1546 */                 } else if (Main.t6.contains(p)) {
/* 1547 */                   if (!Main.this.b1t6) {
/* 1548 */                     Main.this.b1t6 = true;
/* 1549 */                     Main.this.gotitems6++;
/* 1550 */                     Main.this.foundItemsT6.add(Main.b1);
/*      */                     
/* 1552 */                     Main.ColorGrayb1t6 = ChatColor.GREEN;
/*      */                     
/* 1554 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b1.getType().name()));
/*      */                   } 
/* 1556 */                 } else if (Main.t7.contains(p)) {
/* 1557 */                   if (!Main.this.b1t7) {
/* 1558 */                     Main.this.b1t7 = true;
/* 1559 */                     Main.this.gotitems7++;
/* 1560 */                     Main.this.foundItemsT7.add(Main.b1);
/*      */                     
/* 1562 */                     Main.ColorGrayb1t7 = ChatColor.GREEN;
/*      */                     
/* 1564 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b1.getType().name()));
/*      */                   } 
/* 1566 */                 } else if (Main.t8.contains(p)) {
/* 1567 */                   if (!Main.this.b1t8) {
/* 1568 */                     Main.this.b1t8 = true;
/* 1569 */                     Main.this.gotitems8++;
/* 1570 */                     Main.this.foundItemsT8.add(Main.b1);
/*      */                     
/* 1572 */                     Main.ColorGrayb1t8 = ChatColor.GREEN;
/*      */                     
/* 1574 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b1.getType().name()));
/*      */                   } 
/* 1576 */                 } else if (Main.t9.contains(p)) {
/* 1577 */                   if (!Main.this.b1t9) {
/* 1578 */                     Main.this.b1t9 = true;
/* 1579 */                     Main.this.gotitems9++;
/* 1580 */                     Main.this.foundItemsT9.add(Main.b1);
/*      */                     
/* 1582 */                     Main.ColorGrayb1t9 = ChatColor.GREEN;
/*      */                     
/* 1584 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b1.getType().name()));
/*      */                   }
/*      */                 
/* 1587 */                 } else if (Main.t3.contains(p) && 
/* 1588 */                   !Main.this.b1t3) {
/* 1589 */                   Main.this.b1t3 = true;
/* 1590 */                   Main.this.gotitems3++;
/* 1591 */                   Main.this.foundItemsT3.add(Main.b1);
/*      */                   
/* 1593 */                   Main.ColorGrayb1t3 = ChatColor.GREEN;
/*      */                   
/* 1595 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b1.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 1601 */               if (p.getInventory().containsAtLeast(Main.b2, 1)) {
/* 1602 */                 if (Main.t1.contains(p)) {
/* 1603 */                   if (!Main.this.b2t1) {
/* 1604 */                     Main.this.b2t1 = true;
/* 1605 */                     Main.this.gotitems1++;
/* 1606 */                     Main.this.foundItemsT1.add(Main.b2);
/*      */                     
/* 1608 */                     Main.ColorGrayb2t1 = ChatColor.GREEN;
/*      */                     
/* 1610 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b2.getType().name()));
/*      */                   }
/*      */                 
/* 1613 */                 } else if (Main.t2.contains(p)) {
/* 1614 */                   if (!Main.this.b2t2) {
/* 1615 */                     Main.this.b2t2 = true;
/* 1616 */                     Main.this.gotitems2++;
/* 1617 */                     Main.this.foundItemsT2.add(Main.b2);
/*      */                     
/* 1619 */                     Main.ColorGrayb2t2 = ChatColor.GREEN;
/*      */                     
/* 1621 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b2.getType().name()));
/*      */                   }
/*      */                 
/*      */                 }
/* 1625 */                 else if (Main.t4.contains(p)) {
/* 1626 */                   if (!Main.this.b2t4) {
/* 1627 */                     Main.this.b2t4 = true;
/* 1628 */                     Main.this.gotitems4++;
/* 1629 */                     Main.this.foundItemsT4.add(Main.b2);
/*      */                     
/* 1631 */                     Main.ColorGrayb2t4 = ChatColor.GREEN;
/*      */                     
/* 1633 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b2.getType().name()));
/*      */                   } 
/* 1635 */                 } else if (Main.t5.contains(p)) {
/* 1636 */                   if (!Main.this.b2t5) {
/* 1637 */                     Main.this.b2t5 = true;
/* 1638 */                     Main.this.gotitems5++;
/* 1639 */                     Main.this.foundItemsT5.add(Main.b2);
/*      */                     
/* 1641 */                     Main.ColorGrayb2t5 = ChatColor.GREEN;
/*      */                     
/* 1643 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b2.getType().name()));
/*      */                   } 
/* 1645 */                 } else if (Main.t6.contains(p)) {
/* 1646 */                   if (!Main.this.b2t6) {
/* 1647 */                     Main.this.b2t6 = true;
/* 1648 */                     Main.this.gotitems6++;
/* 1649 */                     Main.this.foundItemsT6.add(Main.b2);
/*      */                     
/* 1651 */                     Main.ColorGrayb2t6 = ChatColor.GREEN;
/*      */                     
/* 1653 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b2.getType().name()));
/*      */                   } 
/* 1655 */                 } else if (Main.t7.contains(p)) {
/* 1656 */                   if (!Main.this.b2t7) {
/* 1657 */                     Main.this.b2t7 = true;
/* 1658 */                     Main.this.gotitems7++;
/* 1659 */                     Main.this.foundItemsT7.add(Main.b2);
/*      */                     
/* 1661 */                     Main.ColorGrayb2t7 = ChatColor.GREEN;
/*      */                     
/* 1663 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b2.getType().name()));
/*      */                   } 
/* 1665 */                 } else if (Main.t8.contains(p)) {
/* 1666 */                   if (!Main.this.b2t8) {
/* 1667 */                     Main.this.b2t8 = true;
/* 1668 */                     Main.this.gotitems8++;
/* 1669 */                     Main.this.foundItemsT8.add(Main.b2);
/*      */                     
/* 1671 */                     Main.ColorGrayb2t8 = ChatColor.GREEN;
/*      */                     
/* 1673 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b2.getType().name()));
/*      */                   } 
/* 1675 */                 } else if (Main.t9.contains(p)) {
/* 1676 */                   if (!Main.this.b2t9) {
/* 1677 */                     Main.this.b2t9 = true;
/* 1678 */                     Main.this.gotitems9++;
/* 1679 */                     Main.this.foundItemsT9.add(Main.b2);
/*      */                     
/* 1681 */                     Main.ColorGrayb2t9 = ChatColor.GREEN;
/*      */                     
/* 1683 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b2.getType().name()));
/*      */                   } 
/* 1685 */                 } else if (Main.t3.contains(p) && 
/* 1686 */                   !Main.this.b2t3) {
/* 1687 */                   Main.this.b2t3 = true;
/* 1688 */                   Main.this.gotitems3++;
/* 1689 */                   Main.this.foundItemsT3.add(Main.b2);
/*      */                   
/* 1691 */                   Main.ColorGrayb2t3 = ChatColor.GREEN;
/*      */                   
/* 1693 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b2.getType().name()));
/*      */                 } 
/*      */               }
/*      */               
/* 1697 */               if (p.getInventory().containsAtLeast(Main.b3, 1)) {
/* 1698 */                 if (Main.t1.contains(p)) {
/* 1699 */                   if (!Main.this.b3t1) {
/* 1700 */                     Main.this.b3t1 = true;
/* 1701 */                     Main.this.gotitems1++;
/* 1702 */                     Main.this.foundItemsT1.add(Main.b3);
/*      */                     
/* 1704 */                     Main.ColorGrayb3t1 = ChatColor.GREEN;
/*      */                     
/* 1706 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b3.getType().name()));
/*      */                   }
/*      */                 
/* 1709 */                 } else if (Main.t2.contains(p)) {
/* 1710 */                   if (!Main.this.b3t2) {
/* 1711 */                     Main.this.b3t2 = true;
/* 1712 */                     Main.this.gotitems2++;
/* 1713 */                     Main.this.foundItemsT2.add(Main.b3);
/*      */                     
/* 1715 */                     Main.ColorGrayb3t2 = ChatColor.GREEN;
/*      */                     
/* 1717 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b3.getType().name()));
/*      */                   }
/*      */                 
/* 1720 */                 } else if (Main.t4.contains(p)) {
/* 1721 */                   if (!Main.this.b3t4) {
/* 1722 */                     Main.this.b3t4 = true;
/* 1723 */                     Main.this.gotitems4++;
/* 1724 */                     Main.this.foundItemsT4.add(Main.b3);
/*      */                     
/* 1726 */                     Main.ColorGrayb3t4 = ChatColor.GREEN;
/*      */                     
/* 1728 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b3.getType().name()));
/*      */                   } 
/* 1730 */                 } else if (Main.t5.contains(p)) {
/* 1731 */                   if (!Main.this.b3t5) {
/* 1732 */                     Main.this.b3t5 = true;
/* 1733 */                     Main.this.gotitems5++;
/* 1734 */                     Main.this.foundItemsT5.add(Main.b3);
/*      */                     
/* 1736 */                     Main.ColorGrayb3t5 = ChatColor.GREEN;
/*      */                     
/* 1738 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b3.getType().name()));
/*      */                   } 
/* 1740 */                 } else if (Main.t6.contains(p)) {
/* 1741 */                   if (!Main.this.b3t6) {
/* 1742 */                     Main.this.b3t6 = true;
/* 1743 */                     Main.this.gotitems6++;
/* 1744 */                     Main.this.foundItemsT6.add(Main.b3);
/*      */                     
/* 1746 */                     Main.ColorGrayb3t6 = ChatColor.GREEN;
/*      */                     
/* 1748 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b3.getType().name()));
/*      */                   } 
/* 1750 */                 } else if (Main.t7.contains(p)) {
/* 1751 */                   if (!Main.this.b3t7) {
/* 1752 */                     Main.this.b3t7 = true;
/* 1753 */                     Main.this.gotitems7++;
/* 1754 */                     Main.this.foundItemsT7.add(Main.b3);
/*      */                     
/* 1756 */                     Main.ColorGrayb3t7 = ChatColor.GREEN;
/*      */                     
/* 1758 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b3.getType().name()));
/*      */                   } 
/* 1760 */                 } else if (Main.t8.contains(p)) {
/* 1761 */                   if (!Main.this.b3t8) {
/* 1762 */                     Main.this.b3t8 = true;
/* 1763 */                     Main.this.gotitems8++;
/* 1764 */                     Main.this.foundItemsT8.add(Main.b3);
/*      */                     
/* 1766 */                     Main.ColorGrayb3t8 = ChatColor.GREEN;
/*      */                     
/* 1768 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b3.getType().name()));
/*      */                   } 
/* 1770 */                 } else if (Main.t9.contains(p)) {
/* 1771 */                   if (!Main.this.b3t9) {
/* 1772 */                     Main.this.b3t9 = true;
/* 1773 */                     Main.this.gotitems9++;
/* 1774 */                     Main.this.foundItemsT9.add(Main.b3);
/*      */                     
/* 1776 */                     Main.ColorGrayb3t9 = ChatColor.GREEN;
/*      */                     
/* 1778 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b3.getType().name()));
/*      */                   } 
/* 1780 */                 } else if (Main.t3.contains(p) && 
/* 1781 */                   !Main.this.b3t3) {
/* 1782 */                   Main.this.b3t3 = true;
/* 1783 */                   Main.this.gotitems3++;
/* 1784 */                   Main.this.foundItemsT3.add(Main.b3);
/*      */                   
/* 1786 */                   Main.ColorGrayb3t3 = ChatColor.GREEN;
/* 1787 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b3.getType().name()));
/*      */                 } 
/*      */               }
/*      */               
/* 1791 */               if (p.getInventory().containsAtLeast(Main.b4, 1)) {
/* 1792 */                 if (Main.t1.contains(p)) {
/* 1793 */                   if (!Main.this.b4t1) {
/* 1794 */                     Main.this.b4t1 = true;
/* 1795 */                     Main.this.gotitems1++;
/* 1796 */                     Main.this.foundItemsT1.add(Main.b4);
/*      */                     
/* 1798 */                     Main.ColorGrayb4t1 = ChatColor.GREEN;
/*      */                     
/* 1800 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b4.getType().name()));
/*      */                   }
/*      */                 
/* 1803 */                 } else if (Main.t2.contains(p)) {
/* 1804 */                   if (!Main.this.b4t2) {
/* 1805 */                     Main.this.b4t2 = true;
/* 1806 */                     Main.this.gotitems2++;
/* 1807 */                     Main.this.foundItemsT2.add(Main.b4);
/*      */                     
/* 1809 */                     Main.ColorGrayb4t2 = ChatColor.GREEN;
/*      */                     
/* 1811 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b4.getType().name()));
/*      */                   } 
/* 1813 */                 } else if (Main.t4.contains(p)) {
/* 1814 */                   if (!Main.this.b4t4) {
/* 1815 */                     Main.this.b4t4 = true;
/* 1816 */                     Main.this.gotitems4++;
/* 1817 */                     Main.this.foundItemsT4.add(Main.b4);
/*      */                     
/* 1819 */                     Main.ColorGrayb4t4 = ChatColor.GREEN;
/*      */                     
/* 1821 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b4.getType().name()));
/*      */                   } 
/* 1823 */                 } else if (Main.t5.contains(p)) {
/* 1824 */                   if (!Main.this.b4t5) {
/* 1825 */                     Main.this.b4t5 = true;
/* 1826 */                     Main.this.gotitems5++;
/* 1827 */                     Main.this.foundItemsT5.add(Main.b4);
/*      */                     
/* 1829 */                     Main.ColorGrayb4t5 = ChatColor.GREEN;
/*      */                     
/* 1831 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b4.getType().name()));
/*      */                   } 
/* 1833 */                 } else if (Main.t6.contains(p)) {
/* 1834 */                   if (!Main.this.b4t6) {
/* 1835 */                     Main.this.b4t6 = true;
/* 1836 */                     Main.this.gotitems6++;
/* 1837 */                     Main.this.foundItemsT6.add(Main.b4);
/*      */                     
/* 1839 */                     Main.ColorGrayb4t6 = ChatColor.GREEN;
/*      */                     
/* 1841 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b4.getType().name()));
/*      */                   } 
/* 1843 */                 } else if (Main.t7.contains(p)) {
/* 1844 */                   if (!Main.this.b4t7) {
/* 1845 */                     Main.this.b4t7 = true;
/* 1846 */                     Main.this.gotitems7++;
/* 1847 */                     Main.this.foundItemsT7.add(Main.b4);
/*      */                     
/* 1849 */                     Main.ColorGrayb4t7 = ChatColor.GREEN;
/*      */                     
/* 1851 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b4.getType().name()));
/*      */                   } 
/* 1853 */                 } else if (Main.t8.contains(p)) {
/* 1854 */                   if (!Main.this.b4t8) {
/* 1855 */                     Main.this.b4t8 = true;
/* 1856 */                     Main.this.gotitems8++;
/* 1857 */                     Main.this.foundItemsT8.add(Main.b4);
/*      */                     
/* 1859 */                     Main.ColorGrayb4t8 = ChatColor.GREEN;
/*      */                     
/* 1861 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b4.getType().name()));
/*      */                   } 
/* 1863 */                 } else if (Main.t9.contains(p)) {
/* 1864 */                   if (!Main.this.b4t9) {
/* 1865 */                     Main.this.b4t9 = true;
/* 1866 */                     Main.this.gotitems9++;
/* 1867 */                     Main.this.foundItemsT9.add(Main.b4);
/*      */                     
/* 1869 */                     Main.ColorGrayb4t9 = ChatColor.GREEN;
/*      */                     
/* 1871 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b4.getType().name()));
/*      */                   }
/*      */                 
/* 1874 */                 } else if (Main.t3.contains(p) && 
/* 1875 */                   !Main.this.b4t3) {
/* 1876 */                   Main.this.b4t3 = true;
/* 1877 */                   Main.this.gotitems3++;
/* 1878 */                   Main.this.foundItemsT3.add(Main.b4);
/*      */                   
/* 1880 */                   Main.ColorGrayb4t3 = ChatColor.GREEN;
/*      */                   
/* 1882 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b4.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 1888 */               if (p.getInventory().containsAtLeast(Main.b5, 1)) {
/* 1889 */                 if (Main.t1.contains(p)) {
/* 1890 */                   if (!Main.this.b5t1) {
/* 1891 */                     Main.this.b5t1 = true;
/* 1892 */                     Main.this.gotitems1++;
/* 1893 */                     Main.this.foundItemsT1.add(Main.b5);
/*      */                     
/* 1895 */                     Main.ColorGrayb5t1 = ChatColor.GREEN;
/*      */                     
/* 1897 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b5.getType().name()));
/*      */                   }
/*      */                 
/* 1900 */                 } else if (Main.t2.contains(p)) {
/* 1901 */                   if (!Main.this.b5t2) {
/* 1902 */                     Main.this.b5t2 = true;
/* 1903 */                     Main.this.gotitems2++;
/* 1904 */                     Main.this.foundItemsT2.add(Main.b5);
/*      */                     
/* 1906 */                     Main.ColorGrayb5t2 = ChatColor.GREEN;
/*      */                     
/* 1908 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b5.getType().name()));
/*      */                   } 
/* 1910 */                 } else if (Main.t4.contains(p)) {
/* 1911 */                   if (!Main.this.b5t4) {
/* 1912 */                     Main.this.b5t4 = true;
/* 1913 */                     Main.this.gotitems4++;
/* 1914 */                     Main.this.foundItemsT4.add(Main.b5);
/*      */                     
/* 1916 */                     Main.ColorGrayb5t4 = ChatColor.GREEN;
/*      */                     
/* 1918 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b5.getType().name()));
/*      */                   } 
/* 1920 */                 } else if (Main.t5.contains(p)) {
/* 1921 */                   if (!Main.this.b5t5) {
/* 1922 */                     Main.this.b5t5 = true;
/* 1923 */                     Main.this.gotitems5++;
/* 1924 */                     Main.this.foundItemsT5.add(Main.b5);
/*      */                     
/* 1926 */                     Main.ColorGrayb5t5 = ChatColor.GREEN;
/*      */                     
/* 1928 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b5.getType().name()));
/*      */                   } 
/* 1930 */                 } else if (Main.t6.contains(p)) {
/* 1931 */                   if (!Main.this.b5t6) {
/* 1932 */                     Main.this.b5t6 = true;
/* 1933 */                     Main.this.gotitems6++;
/* 1934 */                     Main.this.foundItemsT6.add(Main.b5);
/*      */                     
/* 1936 */                     Main.ColorGrayb5t6 = ChatColor.GREEN;
/*      */                     
/* 1938 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b5.getType().name()));
/*      */                   } 
/* 1940 */                 } else if (Main.t7.contains(p)) {
/* 1941 */                   if (!Main.this.b5t7) {
/* 1942 */                     Main.this.b5t7 = true;
/* 1943 */                     Main.this.gotitems7++;
/* 1944 */                     Main.this.foundItemsT7.add(Main.b5);
/*      */                     
/* 1946 */                     Main.ColorGrayb5t7 = ChatColor.GREEN;
/*      */                     
/* 1948 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b5.getType().name()));
/*      */                   } 
/* 1950 */                 } else if (Main.t8.contains(p)) {
/* 1951 */                   if (!Main.this.b5t8) {
/* 1952 */                     Main.this.b5t8 = true;
/* 1953 */                     Main.this.gotitems8++;
/* 1954 */                     Main.this.foundItemsT8.add(Main.b5);
/*      */                     
/* 1956 */                     Main.ColorGrayb5t8 = ChatColor.GREEN;
/*      */                     
/* 1958 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b5.getType().name()));
/*      */                   } 
/* 1960 */                 } else if (Main.t9.contains(p)) {
/* 1961 */                   if (!Main.this.b5t9) {
/* 1962 */                     Main.this.b5t9 = true;
/* 1963 */                     Main.this.gotitems9++;
/* 1964 */                     Main.this.foundItemsT9.add(Main.b5);
/*      */                     
/* 1966 */                     Main.ColorGrayb5t9 = ChatColor.GREEN;
/*      */                     
/* 1968 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b5.getType().name()));
/*      */                   }
/*      */                 
/* 1971 */                 } else if (Main.t3.contains(p) && 
/* 1972 */                   !Main.this.b5t3) {
/* 1973 */                   Main.this.b5t3 = true;
/* 1974 */                   Main.this.gotitems3++;
/* 1975 */                   Main.this.foundItemsT3.add(Main.b5);
/*      */                   
/* 1977 */                   Main.ColorGrayb5t3 = ChatColor.GREEN;
/*      */                   
/* 1979 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b5.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 1985 */               if (p.getInventory().containsAtLeast(Main.b6, 1)) {
/* 1986 */                 if (Main.t1.contains(p)) {
/* 1987 */                   if (!Main.this.b6t1) {
/* 1988 */                     Main.this.b6t1 = true;
/* 1989 */                     Main.this.gotitems1++;
/* 1990 */                     Main.this.foundItemsT1.add(Main.b6);
/*      */                     
/* 1992 */                     Main.ColorGrayb6t1 = ChatColor.GREEN;
/*      */                     
/* 1994 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b6.getType().name()));
/*      */                   }
/*      */                 
/* 1997 */                 } else if (Main.t2.contains(p)) {
/* 1998 */                   if (!Main.this.b6t2) {
/* 1999 */                     Main.this.b6t2 = true;
/* 2000 */                     Main.this.gotitems2++;
/* 2001 */                     Main.this.foundItemsT2.add(Main.b6);
/*      */                     
/* 2003 */                     Main.ColorGrayb6t2 = ChatColor.GREEN;
/*      */                     
/* 2005 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b6.getType().name()));
/*      */                   } 
/* 2007 */                 } else if (Main.t4.contains(p)) {
/* 2008 */                   if (!Main.this.b6t4) {
/* 2009 */                     Main.this.b6t4 = true;
/* 2010 */                     Main.this.gotitems4++;
/* 2011 */                     Main.this.foundItemsT4.add(Main.b6);
/*      */                     
/* 2013 */                     Main.ColorGrayb6t4 = ChatColor.GREEN;
/*      */                     
/* 2015 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b6.getType().name()));
/*      */                   } 
/* 2017 */                 } else if (Main.t5.contains(p)) {
/* 2018 */                   if (!Main.this.b6t5) {
/* 2019 */                     Main.this.b6t5 = true;
/* 2020 */                     Main.this.gotitems5++;
/* 2021 */                     Main.this.foundItemsT5.add(Main.b6);
/*      */                     
/* 2023 */                     Main.ColorGrayb6t5 = ChatColor.GREEN;
/*      */                     
/* 2025 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b6.getType().name()));
/*      */                   } 
/* 2027 */                 } else if (Main.t6.contains(p)) {
/* 2028 */                   if (!Main.this.b6t6) {
/* 2029 */                     Main.this.b6t6 = true;
/* 2030 */                     Main.this.gotitems6++;
/* 2031 */                     Main.this.foundItemsT6.add(Main.b6);
/*      */                     
/* 2033 */                     Main.ColorGrayb6t6 = ChatColor.GREEN;
/*      */                     
/* 2035 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b6.getType().name()));
/*      */                   } 
/* 2037 */                 } else if (Main.t7.contains(p)) {
/* 2038 */                   if (!Main.this.b6t7) {
/* 2039 */                     Main.this.b6t7 = true;
/* 2040 */                     Main.this.gotitems7++;
/* 2041 */                     Main.this.foundItemsT7.add(Main.b6);
/*      */                     
/* 2043 */                     Main.ColorGrayb6t7 = ChatColor.GREEN;
/*      */                     
/* 2045 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b6.getType().name()));
/*      */                   } 
/* 2047 */                 } else if (Main.t8.contains(p)) {
/* 2048 */                   if (!Main.this.b6t8) {
/* 2049 */                     Main.this.b6t8 = true;
/* 2050 */                     Main.this.gotitems8++;
/* 2051 */                     Main.this.foundItemsT8.add(Main.b6);
/*      */                     
/* 2053 */                     Main.ColorGrayb6t8 = ChatColor.GREEN;
/*      */                     
/* 2055 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b6.getType().name()));
/*      */                   } 
/* 2057 */                 } else if (Main.t9.contains(p)) {
/* 2058 */                   if (!Main.this.b6t9) {
/* 2059 */                     Main.this.b6t9 = true;
/* 2060 */                     Main.this.gotitems9++;
/* 2061 */                     Main.this.foundItemsT9.add(Main.b6);
/*      */                     
/* 2063 */                     Main.ColorGrayb6t9 = ChatColor.GREEN;
/*      */                     
/* 2065 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b6.getType().name()));
/*      */                   }
/*      */                 
/* 2068 */                 } else if (Main.t3.contains(p) && 
/* 2069 */                   !Main.this.b6t3) {
/* 2070 */                   Main.this.b6t3 = true;
/* 2071 */                   Main.this.gotitems3++;
/* 2072 */                   Main.this.foundItemsT3.add(Main.b6);
/*      */                   
/* 2074 */                   Main.ColorGrayb6t3 = ChatColor.GREEN;
/*      */                   
/* 2076 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b6.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 2082 */               if (p.getInventory().containsAtLeast(Main.b7, 1)) {
/* 2083 */                 if (Main.t1.contains(p)) {
/* 2084 */                   if (!Main.this.b7t1) {
/* 2085 */                     Main.this.b7t1 = true;
/* 2086 */                     Main.this.gotitems1++;
/* 2087 */                     Main.this.foundItemsT1.add(Main.b7);
/*      */                     
/* 2089 */                     Main.ColorGrayb7t1 = ChatColor.GREEN;
/*      */                     
/* 2091 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b7.getType().name()));
/*      */                   }
/*      */                 
/* 2094 */                 } else if (Main.t2.contains(p)) {
/* 2095 */                   if (!Main.this.b7t2) {
/* 2096 */                     Main.this.b7t2 = true;
/* 2097 */                     Main.this.gotitems2++;
/* 2098 */                     Main.this.foundItemsT2.add(Main.b7);
/*      */                     
/* 2100 */                     Main.ColorGrayb7t2 = ChatColor.GREEN;
/*      */                     
/* 2102 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b7.getType().name()));
/*      */                   } 
/* 2104 */                 } else if (Main.t4.contains(p)) {
/* 2105 */                   if (!Main.this.b7t4) {
/* 2106 */                     Main.this.b7t4 = true;
/* 2107 */                     Main.this.gotitems4++;
/* 2108 */                     Main.this.foundItemsT4.add(Main.b7);
/*      */                     
/* 2110 */                     Main.ColorGrayb7t4 = ChatColor.GREEN;
/*      */                     
/* 2112 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b7.getType().name()));
/*      */                   } 
/* 2114 */                 } else if (Main.t5.contains(p)) {
/* 2115 */                   if (!Main.this.b7t5) {
/* 2116 */                     Main.this.b7t5 = true;
/* 2117 */                     Main.this.gotitems5++;
/* 2118 */                     Main.this.foundItemsT5.add(Main.b7);
/*      */                     
/* 2120 */                     Main.ColorGrayb7t5 = ChatColor.GREEN;
/*      */                     
/* 2122 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b7.getType().name()));
/*      */                   } 
/* 2124 */                 } else if (Main.t6.contains(p)) {
/* 2125 */                   if (!Main.this.b7t6) {
/* 2126 */                     Main.this.b7t6 = true;
/* 2127 */                     Main.this.gotitems6++;
/* 2128 */                     Main.this.foundItemsT6.add(Main.b7);
/*      */                     
/* 2130 */                     Main.ColorGrayb7t6 = ChatColor.GREEN;
/*      */                     
/* 2132 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b7.getType().name()));
/*      */                   } 
/* 2134 */                 } else if (Main.t7.contains(p)) {
/* 2135 */                   if (!Main.this.b7t7) {
/* 2136 */                     Main.this.b7t7 = true;
/* 2137 */                     Main.this.gotitems7++;
/* 2138 */                     Main.this.foundItemsT7.add(Main.b7);
/*      */                     
/* 2140 */                     Main.ColorGrayb7t7 = ChatColor.GREEN;
/*      */                     
/* 2142 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b7.getType().name()));
/*      */                   } 
/* 2144 */                 } else if (Main.t8.contains(p)) {
/* 2145 */                   if (!Main.this.b7t8) {
/* 2146 */                     Main.this.b7t8 = true;
/* 2147 */                     Main.this.gotitems8++;
/* 2148 */                     Main.this.foundItemsT8.add(Main.b7);
/*      */                     
/* 2150 */                     Main.ColorGrayb7t8 = ChatColor.GREEN;
/*      */                     
/* 2152 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b7.getType().name()));
/*      */                   } 
/* 2154 */                 } else if (Main.t9.contains(p)) {
/* 2155 */                   if (!Main.this.b7t9) {
/* 2156 */                     Main.this.b7t9 = true;
/* 2157 */                     Main.this.gotitems9++;
/* 2158 */                     Main.this.foundItemsT9.add(Main.b7);
/*      */                     
/* 2160 */                     Main.ColorGrayb7t9 = ChatColor.GREEN;
/*      */                     
/* 2162 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b7.getType().name()));
/*      */                   }
/*      */                 
/* 2165 */                 } else if (Main.t3.contains(p) && 
/* 2166 */                   !Main.this.b7t3) {
/* 2167 */                   Main.this.b7t3 = true;
/* 2168 */                   Main.this.gotitems3++;
/* 2169 */                   Main.this.foundItemsT3.add(Main.b7);
/*      */                   
/* 2171 */                   Main.ColorGrayb7t3 = ChatColor.GREEN;
/*      */                   
/* 2173 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b7.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 2179 */               if (p.getInventory().containsAtLeast(Main.b8, 1)) {
/* 2180 */                 if (Main.t1.contains(p)) {
/* 2181 */                   if (!Main.this.b8t1) {
/* 2182 */                     Main.this.b8t1 = true;
/* 2183 */                     Main.this.gotitems1++;
/* 2184 */                     Main.this.foundItemsT1.add(Main.b8);
/*      */                     
/* 2186 */                     Main.ColorGrayb8t1 = ChatColor.GREEN;
/*      */                     
/* 2188 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b8.getType().name()));
/*      */                   }
/*      */                 
/* 2191 */                 } else if (Main.t2.contains(p)) {
/* 2192 */                   if (!Main.this.b8t2) {
/* 2193 */                     Main.this.b8t2 = true;
/* 2194 */                     Main.this.gotitems2++;
/* 2195 */                     Main.this.foundItemsT2.add(Main.b8);
/*      */                     
/* 2197 */                     Main.ColorGrayb8t2 = ChatColor.GREEN;
/*      */                     
/* 2199 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b8.getType().name()));
/*      */                   } 
/* 2201 */                 } else if (Main.t4.contains(p)) {
/* 2202 */                   if (!Main.this.b8t4) {
/* 2203 */                     Main.this.b8t4 = true;
/* 2204 */                     Main.this.gotitems4++;
/* 2205 */                     Main.this.foundItemsT4.add(Main.b8);
/*      */                     
/* 2207 */                     Main.ColorGrayb8t4 = ChatColor.GREEN;
/*      */                     
/* 2209 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b8.getType().name()));
/*      */                   } 
/* 2211 */                 } else if (Main.t5.contains(p)) {
/* 2212 */                   if (!Main.this.b8t5) {
/* 2213 */                     Main.this.b8t5 = true;
/* 2214 */                     Main.this.gotitems5++;
/* 2215 */                     Main.this.foundItemsT5.add(Main.b8);
/*      */                     
/* 2217 */                     Main.ColorGrayb8t5 = ChatColor.GREEN;
/*      */                     
/* 2219 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b8.getType().name()));
/*      */                   } 
/* 2221 */                 } else if (Main.t6.contains(p)) {
/* 2222 */                   if (!Main.this.b8t6) {
/* 2223 */                     Main.this.b8t6 = true;
/* 2224 */                     Main.this.gotitems6++;
/* 2225 */                     Main.this.foundItemsT6.add(Main.b8);
/*      */                     
/* 2227 */                     Main.ColorGrayb8t6 = ChatColor.GREEN;
/*      */                     
/* 2229 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b8.getType().name()));
/*      */                   } 
/* 2231 */                 } else if (Main.t7.contains(p)) {
/* 2232 */                   if (!Main.this.b8t7) {
/* 2233 */                     Main.this.b8t7 = true;
/* 2234 */                     Main.this.gotitems7++;
/* 2235 */                     Main.this.foundItemsT7.add(Main.b8);
/*      */                     
/* 2237 */                     Main.ColorGrayb8t7 = ChatColor.GREEN;
/*      */                     
/* 2239 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b8.getType().name()));
/*      */                   } 
/* 2241 */                 } else if (Main.t8.contains(p)) {
/* 2242 */                   if (!Main.this.b8t8) {
/* 2243 */                     Main.this.b8t8 = true;
/* 2244 */                     Main.this.gotitems8++;
/* 2245 */                     Main.this.foundItemsT8.add(Main.b8);
/*      */                     
/* 2247 */                     Main.ColorGrayb8t8 = ChatColor.GREEN;
/*      */                     
/* 2249 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b8.getType().name()));
/*      */                   } 
/* 2251 */                 } else if (Main.t9.contains(p)) {
/* 2252 */                   if (!Main.this.b8t9) {
/* 2253 */                     Main.this.b8t9 = true;
/* 2254 */                     Main.this.gotitems9++;
/* 2255 */                     Main.this.foundItemsT9.add(Main.b8);
/*      */                     
/* 2257 */                     Main.ColorGrayb8t9 = ChatColor.GREEN;
/*      */                     
/* 2259 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b8.getType().name()));
/*      */                   }
/*      */                 
/* 2262 */                 } else if (Main.t3.contains(p) && 
/* 2263 */                   !Main.this.b8t3) {
/* 2264 */                   Main.this.b8t3 = true;
/* 2265 */                   Main.this.gotitems3++;
/* 2266 */                   Main.this.foundItemsT3.add(Main.b8);
/*      */                   
/* 2268 */                   Main.ColorGrayb8t3 = ChatColor.GREEN;
/*      */                   
/* 2270 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b8.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 2276 */               if (p.getInventory().containsAtLeast(Main.b9, 1)) {
/* 2277 */                 if (Main.t1.contains(p)) {
/* 2278 */                   if (!Main.this.b9t1) {
/* 2279 */                     Main.this.b9t1 = true;
/* 2280 */                     Main.this.gotitems1++;
/* 2281 */                     Main.this.foundItemsT1.add(Main.b9);
/*      */                     
/* 2283 */                     Main.ColorGrayb9t1 = ChatColor.GREEN;
/*      */                     
/* 2285 */                     Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b9.getType().name()));
/*      */                   }
/*      */                 
/* 2288 */                 } else if (Main.t2.contains(p)) {
/* 2289 */                   if (!Main.this.b9t2) {
/* 2290 */                     Main.this.b9t2 = true;
/* 2291 */                     Main.this.gotitems2++;
/* 2292 */                     Main.this.foundItemsT2.add(Main.b9);
/*      */                     
/* 2294 */                     Main.ColorGrayb9t2 = ChatColor.GREEN;
/*      */                     
/* 2296 */                     Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b9.getType().name()));
/*      */                   } 
/* 2298 */                 } else if (Main.t4.contains(p)) {
/* 2299 */                   if (!Main.this.b9t4) {
/* 2300 */                     Main.this.b9t4 = true;
/* 2301 */                     Main.this.gotitems4++;
/* 2302 */                     Main.this.foundItemsT4.add(Main.b9);
/*      */                     
/* 2304 */                     Main.ColorGrayb9t4 = ChatColor.GREEN;
/*      */                     
/* 2306 */                     Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b9.getType().name()));
/*      */                   } 
/* 2308 */                 } else if (Main.t5.contains(p)) {
/* 2309 */                   if (!Main.this.b9t5) {
/* 2310 */                     Main.this.b9t5 = true;
/* 2311 */                     Main.this.gotitems5++;
/* 2312 */                     Main.this.foundItemsT5.add(Main.b9);
/*      */                     
/* 2314 */                     Main.ColorGrayb9t5 = ChatColor.GREEN;
/*      */                     
/* 2316 */                     Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b9.getType().name()));
/*      */                   } 
/* 2318 */                 } else if (Main.t6.contains(p)) {
/* 2319 */                   if (!Main.this.b9t6) {
/* 2320 */                     Main.this.b9t6 = true;
/* 2321 */                     Main.this.gotitems6++;
/* 2322 */                     Main.this.foundItemsT6.add(Main.b9);
/*      */                     
/* 2324 */                     Main.ColorGrayb9t6 = ChatColor.GREEN;
/*      */                     
/* 2326 */                     Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b9.getType().name()));
/*      */                   } 
/* 2328 */                 } else if (Main.t7.contains(p)) {
/* 2329 */                   if (!Main.this.b9t7) {
/* 2330 */                     Main.this.b9t7 = true;
/* 2331 */                     Main.this.gotitems7++;
/* 2332 */                     Main.this.foundItemsT7.add(Main.b9);
/*      */                     
/* 2334 */                     Main.ColorGrayb9t7 = ChatColor.GREEN;
/*      */                     
/* 2336 */                     Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b9.getType().name()));
/*      */                   } 
/* 2338 */                 } else if (Main.t8.contains(p)) {
/* 2339 */                   if (!Main.this.b9t8) {
/* 2340 */                     Main.this.b9t8 = true;
/* 2341 */                     Main.this.gotitems8++;
/* 2342 */                     Main.this.foundItemsT8.add(Main.b9);
/*      */                     
/* 2344 */                     Main.ColorGrayb9t8 = ChatColor.GREEN;
/*      */                     
/* 2346 */                     Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b9.getType().name()));
/*      */                   } 
/* 2348 */                 } else if (Main.t9.contains(p)) {
/* 2349 */                   if (!Main.this.b9t9) {
/* 2350 */                     Main.this.b9t9 = true;
/* 2351 */                     Main.this.gotitems9++;
/* 2352 */                     Main.this.foundItemsT9.add(Main.b9);
/*      */                     
/* 2354 */                     Main.ColorGrayb9t9 = ChatColor.GREEN;
/*      */                     
/* 2356 */                     Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b9.getType().name()));
/*      */                   }
/*      */                 
/* 2359 */                 } else if (Main.t3.contains(p) && 
/* 2360 */                   !Main.this.b9t3) {
/* 2361 */                   Main.this.b9t3 = true;
/* 2362 */                   Main.this.gotitems3++;
/* 2363 */                   Main.this.foundItemsT3.add(Main.b9);
/*      */                   
/* 2365 */                   Main.ColorGrayb9t3 = ChatColor.GREEN;
/*      */                   
/* 2367 */                   Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b9.getType().name()));
/*      */                 } 
/*      */               }
/*      */ 
/*      */ 
/*      */               
/* 2373 */               if (Main.this.gotitems1 == 9) {
/* 2374 */                 if (Main.t1.size() == 1) {
/* 2375 */                   Main.this.winner1 = ((Player)Main.t1.get(0)).getName();
/*      */                 } else {
/* 2377 */                   Main.this.winner1 = ((Player)Main.t1.get(0)).getName();
/* 2378 */                   Main.this.winner2 = ((Player)Main.t1.get(1)).getName();
/*      */                 } 
/* 2380 */                 Main.this.isRestarting = true;
/* 2381 */                 Main.this.RestartCountDown(); 
/* 2453 */					cancel();
/* 2382 */               }  if (Main.this.gotitems2 == 9) {
/* 2383 */                 if (Main.t2.size() == 1) {
/* 2384 */                   Main.this.winner1 = ((Player)Main.t2.get(0)).getName();
/*      */                 } else {
/* 2386 */                   Main.this.winner1 = ((Player)Main.t2.get(0)).getName();
/* 2387 */                   Main.this.winner2 = ((Player)Main.t2.get(1)).getName();
/*      */                 } 
/* 2389 */                 Main.this.isRestarting = true;
/* 2390 */                 Main.this.RestartCountDown();
/* 2453 */					cancel();
/* 2391 */               }  if (Main.this.gotitems3 == 9) {
/* 2392 */                 if (Main.t3.size() == 1) {
/* 2393 */                   Main.this.winner1 = ((Player)Main.t3.get(0)).getName();
/*      */                 } else {
/* 2395 */                   Main.this.winner1 = ((Player)Main.t3.get(0)).getName();
/* 2396 */                   Main.this.winner2 = ((Player)Main.t3.get(1)).getName();
/*      */                 } 
/* 2398 */                 Main.this.isRestarting = true;
/* 2399 */                 Main.this.RestartCountDown();
/* 2453 */					cancel();
/* 2400 */               }  if (Main.this.gotitems4 == 9) {
/* 2401 */                 if (Main.t4.size() == 1) {
/* 2402 */                   Main.this.winner1 = ((Player)Main.t4.get(0)).getName();
/*      */                 } else {
/* 2404 */                   Main.this.winner1 = ((Player)Main.t4.get(0)).getName();
/* 2405 */                   Main.this.winner2 = ((Player)Main.t4.get(1)).getName();
/*      */                 } 
/* 2407 */                 Main.this.isRestarting = true;
/* 2408 */                 Main.this.RestartCountDown(); 
/* 2453 */					cancel();
/* 2409 */               }  if (Main.this.gotitems5 == 9) {
/* 2410 */                 if (Main.t5.size() == 1) {
/* 2411 */                   Main.this.winner1 = ((Player)Main.t5.get(0)).getName();
/*      */                 } else {
/* 2413 */                   Main.this.winner1 = ((Player)Main.t5.get(0)).getName();
/* 2414 */                   Main.this.winner2 = ((Player)Main.t5.get(1)).getName();
/*      */                 } 
/* 2416 */                 Main.this.isRestarting = true;
/* 2417 */                 Main.this.RestartCountDown(); 
/* 2453 */					cancel();
/* 2418 */               }  if (Main.this.gotitems6 == 9) {
/* 2419 */                 if (Main.t6.size() == 1) {
/* 2420 */                   Main.this.winner1 = ((Player)Main.t6.get(0)).getName();
/*      */                 } else {
/* 2422 */                   Main.this.winner1 = ((Player)Main.t6.get(0)).getName();
/* 2423 */                   Main.this.winner2 = ((Player)Main.t6.get(1)).getName();
/*      */                 } 
/* 2425 */                 Main.this.isRestarting = true;
/* 2426 */                 Main.this.RestartCountDown(); 
/* 2453 */					cancel();
/* 2427 */               }  if (Main.this.gotitems7 == 9) {
/* 2428 */                 if (Main.t7.size() == 1) {
/* 2429 */                   Main.this.winner1 = ((Player)Main.t7.get(0)).getName();
/*      */                 } else {
/* 2431 */                   Main.this.winner1 = ((Player)Main.t7.get(0)).getName();
/* 2432 */                   Main.this.winner2 = ((Player)Main.t7.get(1)).getName();
/*      */                 } 
/* 2434 */                 Main.this.isRestarting = true;
/* 2435 */                 Main.this.RestartCountDown(); 
/* 2453 */					cancel();
/* 2436 */               }  if (Main.this.gotitems8 == 9) {
/* 2437 */                 if (Main.t8.size() == 1) {
/* 2438 */                   Main.this.winner1 = ((Player)Main.t8.get(0)).getName();
/*      */                 } else {
/* 2440 */                   Main.this.winner1 = ((Player)Main.t8.get(0)).getName();
/* 2441 */                   Main.this.winner2 = ((Player)Main.t8.get(1)).getName();
/*      */                 } 
/* 2443 */                 Main.this.isRestarting = true;
/* 2444 */                 Main.this.RestartCountDown(); 
/* 2453 */					cancel();
/* 2445 */               }  if (Main.this.gotitems9 == 9) {
/* 2446 */                 if (Main.t9.size() == 1) {
/* 2447 */                   Main.this.winner1 = ((Player)Main.t9.get(0)).getName();
/*      */                 } else {
/* 2449 */                   Main.this.winner1 = ((Player)Main.t9.get(0)).getName();
/* 2450 */                   Main.this.winner2 = ((Player)Main.t9.get(1)).getName();
/*      */                 } 
/* 2452 */                 Main.this.isRestarting = true;
/* 2453 */                 Main.this.RestartCountDown();
/* 2453 */					cancel();
/*      */               }
/*      */             }
/*      */           
/*      */           }
/* 2459 */         }).runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public static int getRandomInt(int min, int max) {
/* 2465 */     Random random = new Random();
/*      */     
/* 2467 */     return random.nextInt(max - min + 1) + min;
/*      */   }
/*      */   
/*      */   public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min, int max) {
/* 2471 */     ArrayList<Integer> numbers = new ArrayList<>();
/*      */     
/* 2473 */     while (numbers.size() < size) {
/* 2474 */       int random = getRandomInt(min, max);
/*      */       
/* 2476 */       if (!numbers.contains(Integer.valueOf(random))) {
/* 2477 */         numbers.add(Integer.valueOf(random));
/*      */       }
/*      */     } 
/*      */     
/* 2481 */     return numbers;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/* 2488 */   Random r = new Random();
/*      */ 
/*      */ 
/*      */   
/*      */   public void getRandomItems() {

			   Items.getItems();
			   items.clear();
			   items.addAll(itemlist);    
			   int size = items.size() - 1;
/* DEBUG	 	   System.out.println("\u001B[32m" + "lenght of the list:"+ " " + "\u001B[33m" + size + " " + "\u001B[32m" + "itemlist items in the list:" + " " + "\u001B[36m" + itemlist); */	   
/* 2851 */     ArrayList<Integer> list = getRandomNonRepeatingIntegers(9, 0, size);   /* Default 9, 0, 43 */
/* 2852 */     Main.b1 = this.items.get(((Integer)list.get(0)).intValue());
/* 2853 */     Main.b2 = this.items.get(((Integer)list.get(1)).intValue());
/* 2854 */     Main.b3 = this.items.get(((Integer)list.get(2)).intValue());
/* 2855 */     Main.b4 = this.items.get(((Integer)list.get(3)).intValue());
/* 2856 */     Main.b5 = this.items.get(((Integer)list.get(4)).intValue());
/* 2857 */     Main.b6 = this.items.get(((Integer)list.get(5)).intValue());
/* 2858 */     Main.b7 = this.items.get(((Integer)list.get(6)).intValue());
/* 2859 */     Main.b8 = this.items.get(((Integer)list.get(7)).intValue());
/* 2860 */     Main.b9 = this.items.get(((Integer)list.get(8)).intValue());
/*      */ 
/*      */     if (RandomEnchantment.Wahrscheinlichkeit > 0) {
					RandomEnchantment.randomEnchantment();
				}
				
/* 2863 */     this.randomized = true;
/*      */   }
/*      */ }


/* Location:              D:\Java Eclipse\Minecraft Test Server 1.16.1\Bingo2.0.3.jar!\de\synex\bingo\main\Main.class
 * Java compiler version: 13 (57.0)
 * JD-Core Version:       1.1.3
 */