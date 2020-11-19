/*     */ package de.synex.bingo.listeners;
import Utilities.DataManager;
import de.synex.bingo.commands.settings;
/*     */ 
/*     */ import de.synex.bingo.main.Main;
/*     */ import de.synex.bingo.util.Sideboard;
/*     */ import io.netty.util.internal.ThreadLocalRandom;

/*     */ import java.util.ArrayList;

/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
/*     */ import org.bukkit.entity.Entity;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.block.BlockBreakEvent;
/*     */ import org.bukkit.event.block.BlockPlaceEvent;
/*     */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*     */ import org.bukkit.event.entity.EntityDamageEvent;
/*     */ import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
/*     */ import org.bukkit.event.entity.FoodLevelChangeEvent;
/*     */ import org.bukkit.event.entity.PlayerDeathEvent;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
/*     */ import org.bukkit.event.player.AsyncPlayerChatEvent;
/*     */ import org.bukkit.event.player.PlayerDropItemEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerJoinEvent;
/*     */ import org.bukkit.event.player.PlayerQuitEvent;
/*     */ import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.server.BroadcastMessageEvent;
/*     */ import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ import org.bukkit.scheduler.BukkitRunnable;

import Utilities.RandomEnchantment;
import Utilities.Scoreboards;
/*     */ 
/*     */ 
/*     */ public class Listeners
/*     */   implements Listener
/*     */ {
			public DataManager data;
/*     */   Main main;		
/*     */   Sideboard sboard;
/*     */   ItemStack t1is;
/*     */   ItemStack t2is;
/*     */   ItemStack t3is;
/*     */   ItemStack t4is;
/*     */   ItemStack t5is;
/*     */   ItemStack t6is;
/*     */   ItemStack t7is;
/*     */   ItemStack t8is;
/*     */   ItemStack t9is;
			ItemStack s1;
			ItemStack s2;
			ItemStack s3;
			ItemStack s4;
			ItemStack s5;
			ItemStack s6;
			ItemStack s7;
			ItemStack s8;
			ItemStack s9;
			ItemStack s10;
			ItemStack s11;
			ItemStack s12;
			ItemStack s13;
			ItemStack s14;
			ItemStack s15;
			ItemStack s16;
			ItemStack s17;
			ItemStack s18;
			ItemStack f1;
			ItemStack f2;
			ItemStack g1;
			ItemStack g2;
			ItemStack g3;
			ItemStack g4;
			ItemStack b1;
			ItemStack b2;
/*     */   ItemStack ph;
			ItemStack p1;
			ItemStack p2;
			ItemStack p3;
			ItemStack back;
/*  55 */   ArrayList<Player> livingplayer = new ArrayList<>();
/*  56 */   int seconds = 10;
			
			
			public static double i = 0.05;
/*     */ 
			public static Inventory gameset = Bukkit.createInventory(null, 45, "�2Game Settings");
			
			
/*     */   
/*     */   public Listeners(Main instance) {
/*  60 */     this.main = instance;
/*     */   }
/*     */   public Listeners(Sideboard sb) {
/*  63 */     this.sboard = sb;
/*     */   }
/*     */ 
/*     */ 
  		

			


/*     */   
/*     */   @EventHandler
/*     */   public void onInteract(PlayerInteractEvent e) {
/*  71 */     if (this.main.LobbyStatus) {
/*     */       
/*  73 */       this.t1is = new ItemStack(Material.ORANGE_CONCRETE, 1);
/*  74 */       ItemMeta t1im = this.t1is.getItemMeta();
/*  75 */       t1im.setDisplayName("�6Team 1");
/*  76 */       this.t1is.setItemMeta(t1im);
/*     */ 
/*     */       
/*  79 */       this.t2is = new ItemStack(Material.RED_CONCRETE, 1);
/*  80 */       ItemMeta t2im = this.t1is.getItemMeta();
/*  81 */       t2im.setDisplayName("�cTeam 2");
/*  82 */       this.t2is.setItemMeta(t2im);
/*     */       
/*  84 */       this.t3is = new ItemStack(Material.PINK_CONCRETE, 1);
/*  85 */       ItemMeta t3im = this.t1is.getItemMeta();
/*  86 */       t3im.setDisplayName("�dTeam 3");
/*  87 */       this.t3is.setItemMeta(t3im);

/*  84 */       this.t4is = new ItemStack(Material.WHITE_CONCRETE, 1);
/*  85 */       ItemMeta t4im = this.t1is.getItemMeta();
/*  86 */       t4im.setDisplayName("�fTeam 4");
/*  87 */       this.t4is.setItemMeta(t4im);

/*  84 */       this.t5is = new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1);
/*  85 */       ItemMeta t5im = this.t1is.getItemMeta();
/*  86 */       t5im.setDisplayName("�9Team 5");
/*  87 */       this.t5is.setItemMeta(t5im);

/*  84 */       this.t6is = new ItemStack(Material.YELLOW_CONCRETE, 1);
/*  85 */       ItemMeta t6im = this.t1is.getItemMeta();
/*  86 */       t6im.setDisplayName("�eTeam 6");
/*  87 */       this.t6is.setItemMeta(t6im);

/*  84 */       this.t7is = new ItemStack(Material.LIME_CONCRETE, 1);
/*  85 */       ItemMeta t7im = this.t1is.getItemMeta();
/*  86 */       t7im.setDisplayName("�aTeam 7");
/*  87 */       this.t7is.setItemMeta(t7im);

/*  84 */       this.t8is = new ItemStack(Material.GRAY_CONCRETE, 1);
/*  85 */       ItemMeta t8im = this.t1is.getItemMeta();
/*  86 */       t8im.setDisplayName("�7Team 8");
/*  87 */       this.t8is.setItemMeta(t8im);

/*  84 */       this.t9is = new ItemStack(Material.PURPLE_CONCRETE, 1);
/*  85 */       ItemMeta t9im = this.t1is.getItemMeta();
/*  86 */       t9im.setDisplayName("�5Team 9");
/*  87 */       this.t9is.setItemMeta(t9im);


/*  88 */       Inventory teamselector = Bukkit.createInventory(null, 9, (Main.getCL()).teamselectorInventoryTitle);
/*  89 */       this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
/*  90 */       ItemMeta phim = this.ph.getItemMeta();
/*  91 */       phim.setDisplayName(" ");
/*  92 */       this.ph.setItemMeta(phim);
/*     */       
/*  94 */       teamselector.setItem(0, this.t1is);
/*  95 */       teamselector.setItem(1, this.t2is);
/*  96 */       teamselector.setItem(2, this.t3is);
/*  97 */       teamselector.setItem(3, this.t4is);
/*  98 */       teamselector.setItem(4, this.t5is);
/*  99 */       teamselector.setItem(5, this.t6is);
/* 100 */       teamselector.setItem(6, this.t7is);
/* 101 */       teamselector.setItem(7, this.t8is);
/* 102 */       teamselector.setItem(8, this.t9is);
/*     */       
/* 104 */       if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)
/*     */       {
/* 106 */         if (e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.NETHER_STAR)) {
/* 107 */           if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains((Main.getCL()).teamselection)) {
/* 108 */               e.getPlayer().openInventory(teamselector);
/*     */           } else if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains((Main.getCL()).teamselection)){
/* 110 */             e.setCancelled(true);
/*     */           } 
/*     */         }
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 117 */     if (e.getPlayer().isInvulnerable()) {
/* 118 */       e.setCancelled(true);
/*     */     }
/*     */   }


/*     */   
/*     */   @EventHandler
/*     */   public void onJoin(PlayerJoinEvent e) {

/* 124 */     
			  Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer()); //Sehr wichtig damit Spieler die Neu rein joinen auch ein Scoreboard bekommen
/*     */     
/* 126 */     e.getPlayer().setPlayerListFooter((Main.getCL()).tablistfooter);
/* 127 */     if (Main.t1.contains(e.getPlayer())) {
/* 128 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam1Colour)) + e.getPlayer().getName());
/* 129 */     } else if (Main.t2.contains(e.getPlayer())) {
/* 130 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam2Colour)) + e.getPlayer().getName());
/* 131 */     } else if (Main.t3.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam3Colour)) + e.getPlayer().getName());
/*     */     } else if (Main.t4.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam4Colour)) + e.getPlayer().getName());
/*     */     } else if (Main.t5.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam5Colour)) + e.getPlayer().getName());
/*     */     } else if (Main.t6.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam6Colour)) + e.getPlayer().getName());
/*     */     } else if (Main.t7.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam7Colour)) + e.getPlayer().getName());
/*     */     } else if (Main.t8.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam8Colour)) + e.getPlayer().getName());
/*     */     } else if (Main.t9.contains(e.getPlayer())) {
/* 132 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam9Colour)) + e.getPlayer().getName());
/*     */     }
/* 134 */     else if (e.getPlayer().hasPermission("bingo.gamemaster")) {
/* 135 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistGamemasterColour)) + e.getPlayer().getName());
/*     */     } else {
/* 137 */       e.getPlayer().setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistDefaultUserColour)) + e.getPlayer().getName());
/*     */     } 
/*     */ 
/*     */     
/* 141 */     if (!this.main.isRestarting) {
/* 142 */       if (Main.GameStarted) {
/* 143 */         e.getPlayer().setPlayerListHeader((Main.getCL()).tablistheaderingame);
/* 144 */         Location specloc = Bukkit.getWorld("world").getSpawnLocation();
/* 145 */         e.getPlayer().teleport(specloc);
/* 1413 */       e.getPlayer().setAllowFlight(false);
/* 1414 */       e.getPlayer().setFlying(false);
/* 1415 */       e.getPlayer().setInvulnerable(false);
/* 1416 */       e.getPlayer().setCollidable(true);
/* 1417 */       e.getPlayer().setHealth(20.0D);
/* 1418 */       e.getPlayer().setFoodLevel(20);
/* 1419 */       

/*     */         
/* 154 */         e.getPlayer().setGameMode(GameMode.SURVIVAL);
				  Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
				  
				  
				  if (e.getPlayer().getGameMode() == GameMode.SPECTATOR) {
				      e.setJoinMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).spectatorjoined.replace("%player%", e.getPlayer().getName()));
				  } else {
					  e.setJoinMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).playerjoined.replace("%player%", e.getPlayer().getName()));
				  }
/* 155 */         
/*     */       } else {
				  e.getPlayer().getInventory().clear();
/* 157 */         e.getPlayer().setGameMode(GameMode.SURVIVAL);
/* 158 */         e.getPlayer().setHealth(20.0D);
/* 159 */         e.getPlayer().setFoodLevel(20);
/* 160 */         e.getPlayer().setPlayerListHeader((Main.getCL()).tablistheaderlobby);
/* 161 */         Location startloc = Bukkit.getWorld("world").getSpawnLocation();
/* 162 */         e.getPlayer().teleport(startloc);
/* 163 */         if (Bukkit.getServer().getOnlinePlayers().size() >= 19) {
/* 164 */           e.setJoinMessage(null);
/* 165 */           e.getPlayer().kickPlayer((Main.getCL()).lobbyisfullkick);
/*     */         }
/*     */         else {
/*     */           
/* 169 */           Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 192 */           e.setJoinMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).playerjoined.replace("%player%", e.getPlayer().getName()));
/* 193 */           if (Bukkit.getServer().getOnlinePlayers().size() == 6) {
/* 194 */             Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamewillstart);
/* 195 */             (new BukkitRunnable()
/*     */               {
						public void run()
/*     */                 {
							if (de.synex.bingo.main.Main.GameStarted) {
								
								
							}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/* 199 */                   if (Listeners.this.seconds != 0) {
/* 200 */                     Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamestartsin.replace("%seconds%", String.valueOf(Listeners.this.seconds)));
/* 201 */                     for (Player soundplayer : Bukkit.getOnlinePlayers()) {
/* 202 */                       soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3F, 1.0F);
/*     */                     }
/* 204 */                     Listeners.this.seconds--;
/*     */                   } else {
/* 206 */                     Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamestarts);
/* 207 */                     cancel();
/* 208 */                     Listeners.this.seconds = 10;
/* 209 */                     Listeners.this.main.startGame();
/*     */ 
/*     */                   
/*     */                   }
/*     */                 
/*     */                 }
/* 215 */               }).runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
/*     */           } 
/*     */         } 
/* 218 */         ItemStack is = new ItemStack(Material.NETHER_STAR, 1);
/* 219 */         ItemMeta im = is.getItemMeta();
/* 220 */         im.setDisplayName((Main.getCL()).teamselection);
/* 221 */         is.setItemMeta(im);
/* 222 */         e.getPlayer().getInventory().setItem(4, is);
/* 223 */         e.getPlayer().setAllowFlight(false);
/* 224 */         e.getPlayer().setFlying(false);
/* 225 */         e.getPlayer().setInvulnerable(false);
/* 226 */         e.getPlayer().setCollidable(false);



/*     */       } 
/*     */     } else {
/*     */       
/* 230 */       e.getPlayer().kickPlayer((Main.getCL()).roundisrestartingkick);
/*     */     } 
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockPlace(BlockPlaceEvent e) {
/* 236 */     if (this.main.LobbyStatus) {
/* 237 */       e.setCancelled(true);
/*     */     }
/* 239 */     else if (e.getPlayer().isInvulnerable() ) {
/* 240 */       e.setCancelled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockBreak(BlockBreakEvent e) {
/* 247 */     if (this.main.LobbyStatus) {
/* 248 */       e.setCancelled(true);
/*     */     }
/* 250 */     else if (e.getPlayer().isInvulnerable()) {
/* 251 */       e.setCancelled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onDamage(EntityDamageEvent e) {
/* 258 */     if (e.getEntity() instanceof Player && (
/* 259 */       e.getEntity().isInvulnerable() || this.main.LobbyStatus)) {
/* 260 */       e.setCancelled(true);
/*     */     }

			  if (!data.getConfig().getBoolean("Playersettings.damage") && e.getEntity() instanceof Player) {
				  e.setCancelled(true);
			  } else if (data.getConfig().getBoolean("Playersettings.damage") && e.getEntity() instanceof Player) {
				  return;				  
			  }

/*     */   }
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onDamage2(EntityDamageByEntityEvent e) {
/* 267 */     Entity p = e.getDamager();
/* 268 */     if (p instanceof Player) {
/* 269 */       if (p.isInvulnerable() || this.main.LobbyStatus) {
/* 270 */         e.setCancelled(true);
/*     */       } else {
/*     */         
/* 273 */         if (!Main.t1.isEmpty() &&
/* 274 */           Main.t1.size() == 2) {
/* 275 */           if (((Player)Main.t1.get(0)).equals(e.getDamager()) && ((Player)Main.t1.get(1)).equals(e.getEntity())) {
/* 276 */             e.setCancelled(true);
/*     */           }
/* 278 */           if (((Player)Main.t1.get(1)).equals(e.getDamager()) && ((Player)Main.t1.get(0)).equals(e.getEntity())) {
/* 279 */             e.setCancelled(true);
/*     */           }
/*     */         } 
/*     */         
/* 283 */         if (!Main.t2.isEmpty() && 
/* 284 */           Main.t2.size() == 2) {
/* 285 */           if (((Player)Main.t2.get(0)).equals(e.getDamager()) && ((Player)Main.t2.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t2.get(1)).equals(e.getDamager()) && ((Player)Main.t2.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         } 
/*     */         
/* 293 */         if (!Main.t3.isEmpty() && 
/* 294 */           Main.t3.size() == 2) {
/* 295 */           if (((Player)Main.t3.get(0)).equals(e.getDamager()) && ((Player)Main.t3.get(1)).equals(e.getEntity())) {
/* 296 */             e.setCancelled(true);
/*     */           }
/* 298 */           if (((Player)Main.t3.get(1)).equals(e.getDamager()) && ((Player)Main.t3.get(0)).equals(e.getEntity())) {
/* 299 */             e.setCancelled(true);
/*     */           }
/*     */         }
/* 283 */         if (!Main.t4.isEmpty() && 
/* 284 */           Main.t4.size() == 2) {
/* 285 */           if (((Player)Main.t4.get(0)).equals(e.getDamager()) && ((Player)Main.t4.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t4.get(1)).equals(e.getDamager()) && ((Player)Main.t4.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         }
/* 283 */         if (!Main.t5.isEmpty() && 
/* 284 */           Main.t5.size() == 2) {
/* 285 */           if (((Player)Main.t5.get(0)).equals(e.getDamager()) && ((Player)Main.t5.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t5.get(1)).equals(e.getDamager()) && ((Player)Main.t5.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         }
/* 283 */         if (!Main.t6.isEmpty() && 
/* 284 */           Main.t6.size() == 2) {
/* 285 */           if (((Player)Main.t6.get(0)).equals(e.getDamager()) && ((Player)Main.t6.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t6.get(1)).equals(e.getDamager()) && ((Player)Main.t6.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         }
/* 283 */         if (!Main.t7.isEmpty() && 
/* 284 */           Main.t7.size() == 2) {
/* 285 */           if (((Player)Main.t7.get(0)).equals(e.getDamager()) && ((Player)Main.t7.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t7.get(1)).equals(e.getDamager()) && ((Player)Main.t7.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         }
/* 283 */         if (!Main.t8.isEmpty() && 
/* 284 */           Main.t8.size() == 2) {
/* 285 */           if (((Player)Main.t8.get(0)).equals(e.getDamager()) && ((Player)Main.t8.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t8.get(1)).equals(e.getDamager()) && ((Player)Main.t8.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         }
/* 283 */         if (!Main.t9.isEmpty() && 
/* 284 */           Main.t9.size() == 2) {
/* 285 */           if (((Player)Main.t9.get(0)).equals(e.getDamager()) && ((Player)Main.t9.get(1)).equals(e.getEntity())) {
/* 286 */             e.setCancelled(true);
/*     */           }
/* 288 */           if (((Player)Main.t9.get(1)).equals(e.getDamager()) && ((Player)Main.t9.get(0)).equals(e.getEntity())) {
/* 289 */             e.setCancelled(true);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @EventHandler
/*     */   public void onClick(InventoryClickEvent e) {
		
    		if (e.getCurrentItem() == null){
    			return;
    		}
	        
	        	
	        
	      
	        if (e.getView().getTitle() == "�4Difficulties" || e.getView().getTitle() == "�2Einstellungen") {
/* 312 */       e.setCancelled(true);

				Player k = (Player)e.getWhoClicked();
/*     */     
	        if (this.main.LobbyStatus || Main.GameStarted) {
	        	if (e.getCurrentItem() == null) {
	        		e.setCancelled(true); }}
	        
	        if (e.getCurrentItem().getType().equals(Material.GRASS_BLOCK)) {
	        					        	
	        	if (Main.s1 == false) {        		
	        		Main.s1 = true;	    	
	        	} else {
	        		Main.s1 = false;	        		
	        	}
	        					
	        } else if (e.getCurrentItem().getType().equals(Material.GRASS_PATH)) {
	        	
	        	if (Main.s2 == false) {        		
	        		Main.s2 = true;	    	
	        	} else {
	        		Main.s2 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.WARPED_NYLIUM)) {
	        	
	        	if (Main.s3 == false) {        		
	        		Main.s3 = true;	    	
	        	} else {
	        		Main.s3 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.CRIMSON_NYLIUM)) {
	        	
	        	if (Main.s4 == false) {        		
	        		Main.s4 = true;	    	
	        	} else {
	        		Main.s4 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.WITHER_SKELETON_SKULL)) {
	        	
	        	if (Main.s5 == false) {        		
	        		Main.s5 = true;	    	
	        	} else {
	        		Main.s5 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.END_STONE)) {
	        	
	        	if (Main.s6 == false) {        		
	        		Main.s6 = true;	    	
	        	} else {
	        		Main.s6 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.END_STONE_BRICKS)) {
	        	
	        	if (Main.s7 == false) {        		
	        		Main.s7 = true;	    	
	        	} else {
	        		Main.s7 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.ENDER_PEARL)) {
	        	
	        	if (Main.s8 == false) {        		
	        		Main.s8 = true;	    	
	        	} else {
	        		Main.s8 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.ENDER_EYE)) {
	        	
	        	if (Main.s9 == false) {        		
	        		Main.s9 = true;	    	
	        	} else {
	        		Main.s9 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.WARPED_STEM)) {
	        	
	        	if (Main.s10 == false) {        		
	        		Main.s10 = true;	    	
	        	} else {
	        		Main.s10 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.END_PORTAL_FRAME)) {
	        	
	        	if (Main.s11 == false) {        		
	        		Main.s11 = true;	    	
	        	} else {
	        		Main.s11 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.OBSIDIAN)) {
	        	
	        	if (Main.s12 == false) {        		
	        		Main.s12 = true;	    	
	        	} else {
	        		Main.s12 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.BLACKSTONE)) {
	        	
	        	if (Main.s13 == false) {        		
	        		Main.s13 = true;	    	
	        	} else {
	        		Main.s13 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.CRYING_OBSIDIAN)) {
	        	
	        	if (Main.s14 == false) {        		
	        		Main.s14 = true;	    	
	        	} else {
	        		Main.s14 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.CRIMSON_HYPHAE)) {
	        	
	        	if (Main.s15 == false) {        		
	        		Main.s15 = true;	    	
	        	} else {
	        		Main.s15 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.WARPED_HYPHAE)) {
	        	
	        	if (Main.s16 == false) {        		
	        		Main.s16 = true;	    	
	        	} else {
	        		Main.s16 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.NETHER_GOLD_ORE)) {
	        	
	        	if (Main.s17 == false) {        		
	        		Main.s17 = true;	    	
	        	} else {
	        		Main.s17 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.GILDED_BLACKSTONE)) {
	        	
	        	if (Main.s18 == false) {        		
	        		Main.s18 = true;	    	
	        	} else {
	        		Main.s18 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.NETHERITE_SWORD)) {
	        	if (Main.f1 == false) {        		
	        		Main.f1 = true;	    	
	        	} else {
	        		Main.f1 = false;	        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.BOOKSHELF)) {	
	        	if (RandomEnchantment.Wahrscheinlichkeit >= 1 ) {
	        		RandomEnchantment.Wahrscheinlichkeit = 0.00;	        		
	        	} else {
	        		RandomEnchantment.Wahrscheinlichkeit();
	        	}

	        } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
	        	
	        	k.getPlayer().openInventory(settings.settings);
	        	
	        } 
	        
	        
	        
	        
	        
	        
        	/*  73 */       this.s1 = new ItemStack(Material.GRASS_BLOCK, 1);
        	/*  74 */       ItemMeta st1im = this.s1.getItemMeta();
        	/*  75 */       st1im.setDisplayName("�aOVERWORLD");
        					ArrayList<String> lore1 = new ArrayList<String>();
        					
        					if (Main.s1 == true) {
        					st1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
	        				lore1.clear();
	        				lore1.add("�7- �2All Items Findabel");
        					lore1.add("�7- �2in the Nature");
	        				lore1.add("�7- �aTurned On");
        					} else {
        					lore1.clear();
            				lore1.add("�7- �2All Items Findabel");
            				lore1.add("�7- �2in the Nature");
            				lore1.add("�7- �cTurned Off");	
        					}
        					
        					st1im.setLore(lore1);	        					
        	/*  76 */       this.s1.setItemMeta(st1im);
        	
        	/*  73 */       this.s2 = new ItemStack(Material.GRASS_PATH, 1);
        	/*  74 */       ItemMeta st2im = this.s2.getItemMeta();
        	/*  75 */       st2im.setDisplayName("�aOVERWORLD");
        					ArrayList<String> lore2 = new ArrayList<String>();
        					
        					if (Main.s2 == true) {
        					st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
	       					lore2.add("�7- �2All Items which are");
        					lore2.add("�7- �2processed further");
        					lore2.add("�7- �aTurned On");
        					} else {
               				lore2.add("�7- �2All Items which are");
            				lore2.add("�7- �2processed further");
            				lore2.add("�7- �cTurned Off");	
        					}
        					
        					st2im.setLore(lore2);	        					
        	/*  76 */       this.s2.setItemMeta(st2im);
        	
        	/*  73 */       this.s3 = new ItemStack(Material.WARPED_NYLIUM, 1);
        	/*  74 */       ItemMeta st3im = this.s3.getItemMeta();
        	/*  75 */       st3im.setDisplayName("�aOVERWORLD | NETHER");
        					ArrayList<String> lore3 = new ArrayList<String>();
        					
        					if (Main.s3 == true) {
        					st3im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st3im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore3.add("�7- �2Items from Overworld and Nether");
        					lore3.add("�7- �2Drops of Mobs from the Overworld");
        					lore3.add("�7- �aTurned On");
        					} else {
            				lore3.add("�7- �2Items from Overworld and Nether");
            				lore3.add("�7- �2Drops of Mobs from the Overworld");
            				lore3.add("�7- �cTurned Off");	
        					}

        					st3im.setLore(lore3);	        					
        	/*  76 */       this.s3.setItemMeta(st3im);
        	
        	/*  73 */       this.s4 = new ItemStack(Material.CRIMSON_NYLIUM, 1);
        	/*  74 */       ItemMeta st4im = this.s4.getItemMeta();
        	/*  75 */       st4im.setDisplayName("�2OVERWORLD | NETHER");
        					ArrayList<String> lore4 = new ArrayList<String>();
        					
        					if (Main.s4 == true) {
        					st4im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st4im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore4.add("�7- �aFindabel Items from the Overworld");
        					lore4.add("�7- �aFindeable Items from the Nether");
        					lore4.add("�7- �aDrops of Mobs from the Overworld");
        					//lore4.add("�7- �aItems with Enchantments");//
        					lore4.add("�7- �aTurned On");
        					} else {
            				lore4.add("�7- �aFindabel Items from the Overworld");
            				lore4.add("�7- �aFindeable Items from the Nether");
            				lore4.add("�7- �aDrops of Mobs from the Overworld");
            				//lore4.add("�7- �aItems with Enchantments");//
            				lore4.add("�7- �cTurned Off");	
        					}

        					st4im.setLore(lore4);	        					
        	/*  76 */       this.s4.setItemMeta(st4im);
        	
        	/*  73 */       this.s5 = new ItemStack(Material.WITHER_SKELETON_SKULL, 1);
        	/*  74 */       ItemMeta st5im = this.s5.getItemMeta();
        	/*  75 */       st5im.setDisplayName("�2OVERWORLD | NETHER");
        					ArrayList<String> lore5 = new ArrayList<String>();
        					
        					if (Main.s5 == true) {
        					st5im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st5im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore5.add("�7- �aItems from the Nether");
        					lore5.add("�7- �aRare drops of Mobs from the Overworld");
        					//lore5.add("�7- �aItems with Enchantments");//
        					lore5.add("�7- �aTurned On");
        					} else {
            				lore5.add("�7- �aItems from the Nether");
            				lore5.add("�7- �aRare drops of Mobs from the Overworld");
            				//lore5.add("�7- �aItems with Enchantments");//
            				lore5.add("�7- �cTurned Off");	
        					}
        					
        					st5im.setLore(lore5);	        					
        	/*  76 */       this.s5.setItemMeta(st5im);
        	
        	/*  73 */       this.s6 = new ItemStack(Material.END_STONE, 1);
        	/*  74 */       ItemMeta st6im = this.s6.getItemMeta();
        	/*  75 */       st6im.setDisplayName("�8OVERWORLD | END");
        					ArrayList<String> lore6 = new ArrayList<String>();
        					
        					if (Main.s6 == true) {
        					st6im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st6im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore6.add("�7- Overworld + Items from the End");
        					lore6.add("�7- Items which a not processed further");
        					lore6.add("�7- �aTurned On");
        					} else {
            				lore6.add("�7- Overworld + Items from the End");
            				lore6.add("�7- Items which a not processed further");
            				lore6.add("�7- �cTurned Off");	
        					}
        					

        					st6im.setLore(lore6);	        					
        	/*  76 */       this.s6.setItemMeta(st6im);
        	
        	/*  73 */       this.s7 = new ItemStack(Material.END_STONE_BRICKS, 1);
        	/*  74 */       ItemMeta st7im = this.s7.getItemMeta();
        	/*  75 */       st7im.setDisplayName("�8OVERWORLD | END");
        					ArrayList<String> lore7 = new ArrayList<String>();
        					
        					if (Main.s7 == true) {
        					st7im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st7im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore7.add("�7- Overworld + Items from the End");
        					lore7.add("�7- �aTurned On");
        					} else {
            				lore7.add("�7- Overworld + Items from the End");
            				lore7.add("�7- �cTurned Off");	
        					}
        					
        					st7im.setLore(lore7);	        					
        	/*  76 */       this.s7.setItemMeta(st7im);
        	
        	/*  73 */       this.s8 = new ItemStack(Material.ENDER_PEARL, 1);
        	/*  74 */       ItemMeta st8im = this.s8.getItemMeta();
        	/*  75 */       st8im.setDisplayName("�8OVERWORLD | END");
        					ArrayList<String> lore8 = new ArrayList<String>();
        					
        					if (Main.s8 == true) {
        					st8im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st8im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore8.add("�7- Findable Items from the Overworld");
        					lore8.add("�7- Drops of Mobs from the Overworld");
        					lore8.add("�7- Items from the End");
        					//lore8.add("�7- Items with Enchantments");//
        					lore8.add("�7- �aTurned On");
        					} else {
            				lore8.add("�7- Findable Items from the Overworld");
            				lore8.add("�7- Drops of Mobs from the Overworld");
            				lore8.add("�7- Items from the End");
            				//lore8.add("�7- Items with Enchantments");//
            				lore8.add("�7- �cTurned Off");	
        					}
        					

        					st8im.setLore(lore8);	        					
        	/*  76 */       this.s8.setItemMeta(st8im);
        	
        	/*  73 */       this.s9 = new ItemStack(Material.ENDER_EYE, 1);
        	/*  74 */       ItemMeta st9im = this.s9.getItemMeta();
        	/*  75 */       st9im.setDisplayName("�8OVERWORLD | END");
        					ArrayList<String> lore9 = new ArrayList<String>();
        					
        					if (Main.s9 == true) {
        					st9im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st9im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore9.add("�7- Findable Items from the Overworld");
        					lore9.add("�7- Drops of Mobs from the Overworld");
        					lore9.add("�7- Items from the End");
        					lore9.add("�7- Dragonegg");
        					//lore9.add("�7- Items with Enchantments");//
        					lore9.add("�7- �aTurned On");
        					} else {
            				lore9.add("�7- Findable Items from the Overworld");
            				lore9.add("�7- Drops of Mobs from the Overworld");
            				lore9.add("�7- Items from the End");
            				lore9.add("�7- Dragonegg");
            				//lore9.add("�7- Items with Enchantments");//
            				lore9.add("�7- �cTurned Off");	
        					}
        					

        					st9im.setLore(lore9);	        					
        	/*  76 */       this.s9.setItemMeta(st9im);
        	
        	/*  73 */       this.s10 = new ItemStack(Material.WARPED_STEM, 1);
        	/*  74 */       ItemMeta st10im = this.s10.getItemMeta();
        	/*  75 */       st10im.setDisplayName("�8OVERWORLD | END");
        					ArrayList<String> lore10 = new ArrayList<String>();
        					
        					if (Main.s10 == true) {
        					st10im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st10im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore10.add("�7- Rare Item drops of Mobs from the Overworld");
        					lore10.add("�7- Items from the End");
        					lore10.add("�7- Dragonegg");
        					//lore10.add("�7- Items with Enchantments");//
        					lore10.add("�7- �aTurned On");
        					} else {
            				lore10.add("�7- Rare Item drops of Mobs from the Overworld");
            				lore10.add("�7- Items from the End");
            				lore10.add("�7- Dragonegg");
            				//lore10.add("�7- Items with Enchantments");//
            				lore10.add("�7- �cTurned Off");	
        					}

        					st10im.setLore(lore10);	        					
        	/*  76 */       this.s10.setItemMeta(st10im);
        	
        	/*  73 */       this.s11 = new ItemStack(Material.END_PORTAL_FRAME, 1);
        	/*  74 */       ItemMeta st11im = this.s11.getItemMeta();
        	/*  75 */       st11im.setDisplayName("�8END");
        					ArrayList<String> lore11 = new ArrayList<String>();
        					
        					if (Main.s11 == true) {
        					st11im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st11im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore11.add("�7- �fItems from the End");
        					lore11.add("�7- �fDragonegg");
        					lore11.add("�7- �aTurned On");
        					} else {
            				lore11.add("�7- �fItems from the End");
            				lore11.add("�7- �fDragonegg");
            				lore11.add("�7- �cTurned Off");	
        					}
        					

        					st11im.setLore(lore11);	        					
        	/*  76 */       this.s11.setItemMeta(st11im);
        	
        	/*  73 */       this.s12 = new ItemStack(Material.OBSIDIAN, 1);
        	/*  74 */       ItemMeta st12im = this.s12.getItemMeta();
        	/*  75 */       st12im.setDisplayName("�4NETHER | END");
        					ArrayList<String> lore12 = new ArrayList<String>();
        					
        					if (Main.s12 == true) {
        					st12im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st12im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore12.add("�7- �cItems from the Nether");
        					lore12.add("�7- �cItems from the End");
        					lore12.add("�7- �aTurned On");
        					} else {
            				lore12.add("�7- �cItems from the Nether");
            				lore12.add("�7- �cItems from the End");
            				lore12.add("�7- �cTurned Off");	
        					}
        					

        					st12im.setLore(lore12);	        					
        	/*  76 */       this.s12.setItemMeta(st12im);
        	
        	/*  73 */       this.s13 = new ItemStack(Material.BLACKSTONE, 1);
        	/*  74 */       ItemMeta st13im = this.s13.getItemMeta();
        	/*  75 */       st13im.setDisplayName("�4NETHER | END");
        					ArrayList<String> lore13 = new ArrayList<String>();
        					
        					if (Main.s13 == true) {
        					st13im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st13im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore13.add("�7- �cItems from the Nether");
        					lore13.add("�7- �cItems from the End");
        					//lore13.add("�7- �cItems with Enchantments");//
        					lore13.add("�7- �aTurned On");
        					} else {
            				lore13.add("�7- �cItems from the Nether");
            				lore13.add("�7- �cItems from the End");
            				//lore13.add("�7- �cItems with Enchantments");//
            				lore13.add("�7- �cTurned Off");	
        					}
        					

        					st13im.setLore(lore13);	        					
        	/*  76 */       this.s13.setItemMeta(st13im);
        	
        	/*  73 */       this.s14 = new ItemStack(Material.CRYING_OBSIDIAN, 1);
        	/*  74 */       ItemMeta st14im = this.s14.getItemMeta();
        	/*  75 */       st14im.setDisplayName("�4NETHER | END");
        					ArrayList<String> lore14 = new ArrayList<String>();
        					
        					if (Main.s14 == true) {
        					st14im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st14im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore14.add("�7- �cItems from the Nether");
        					lore14.add("�7- �cItems from the End");
        					lore14.add("�7- �cDragonegg");
        					//lore14.add("�7- �cItems with Enchantments");//
        					lore14.add("�7- �aTurned On");
        					} else {
            				lore14.add("�7- �cItems from the Nether");
            				lore14.add("�7- �cItems from the End");
            				lore14.add("�7- �cDragonegg");
            				//lore14.add("�7- �cItems with Enchantments");//
            				lore14.add("�7- �cTurned Off");	
        					}
        					
        					st14im.setLore(lore14);	        					
        	/*  76 */       this.s14.setItemMeta(st14im);
        	
        	/*  73 */       this.s15 = new ItemStack(Material.CRIMSON_HYPHAE, 1);
        	/*  74 */       ItemMeta st15im = this.s15.getItemMeta();
        	/*  75 */       st15im.setDisplayName("�4NETHER | END");
        					ArrayList<String> lore15 = new ArrayList<String>();
        					
        					if (Main.s15 == true) {
        					st15im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st15im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore15.add("�7- �cItems from the Nether");
        					lore15.add("�7- �cItems from the End");
          					lore15.add("�7- �cDragonegg");
          					//lore15.add("�7- �cItems with Enchantments");//
          					lore15.add("�7- �aTurned On");
        					} else {
            				lore15.add("�7- �cItems from the Nether");
            				lore15.add("�7- �cItems from the End");
              				lore15.add("�7- �cDragonegg");
              				//lore15.add("�7- �cItems with Enchantments");//
              				lore15.add("�7- �cTurned Off");	
        					}
        					

        					st15im.setLore(lore15);	        					
        	/*  76 */       this.s15.setItemMeta(st15im);
        	
        	/*  73 */       this.s16 = new ItemStack(Material.WARPED_HYPHAE, 1);
        	/*  74 */       ItemMeta st16im = this.s16.getItemMeta();
        	/*  75 */       st16im.setDisplayName("�4NETHER | END");
        					ArrayList<String> lore16 = new ArrayList<String>();
        					
        					if (Main.s16 == true) {
        					st16im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st16im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore16.add("�7- �cItems from the Nether");
        					lore16.add("�7- �cDrops of Mobs from the Nether");
        					lore16.add("�7- �cItems from the End");
        					lore16.add("�7- �cDragonegg");
        					//lore16.add("�7- �cItems with Enchantments");//
        					lore16.add("�7- �aTurned On");
        					} else {
            				lore16.add("�7- �cItems from the Nether");
            				lore16.add("�7- �cDrops of Mobs from the Nether");
            				lore16.add("�7- �cItems from the End");
            				lore16.add("�7- �cDragonegg");
            				//lore16.add("�7- �cItems with Enchantments");//
            				lore16.add("�7- �cTurned Off");	
        					}
        					

        					st16im.setLore(lore16);	        					
        	/*  76 */       this.s16.setItemMeta(st16im);
        	
        	/*  73 */       this.s17 = new ItemStack(Material.NETHER_GOLD_ORE, 1);
        	/*  74 */       ItemMeta st17im = this.s17.getItemMeta();
        	/*  75 */       st17im.setDisplayName("�cNether");
        					ArrayList<String> lore17 = new ArrayList<String>();
        					
        					if (Main.s17 == true) {
        					st17im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st17im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore17.add("�7- �4Items from the Nether");
        					lore17.add("�7- �4Drops of Mobs from the Nether");
        					//lore17.add("�7- �4Items with Enchantments");//
        					lore17.add("�7- �aTurned On");
        					} else {
            				lore17.add("�7- �4Items from the Nether");
            				lore17.add("�7- �4Drops of Mobs from the Nether");
            				//lore17.add("�7- �4Items with Enchantments");//
            				lore17.add("�7- �cTurned Off");	
        					}
        					

        					st17im.setLore(lore17);	        					
        	/*  76 */       this.s17.setItemMeta(st17im);
        	
        	/*  73 */       this.s18 = new ItemStack(Material.GILDED_BLACKSTONE, 1);
        	/*  74 */       ItemMeta st18im = this.s18.getItemMeta();
        	/*  75 */       st18im.setDisplayName("�5Newest Items");
        					ArrayList<String> lore18 = new ArrayList<String>();
        					
        					if (Main.s18 == true) {
        					st18im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st18im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        					lore18.add("�7- �dItems from 1.16");
        					//lore18.add("�7- �dItems with Enchantments");//
        					lore18.add("�7- �aTurned On");
        					} else {
            				lore18.add("�7- �dItems from 1.16");
            				//lore18.add("�7- �dItems with Enchantments");//
            				lore18.add("�7- �cTurned Off");	
        					}
        					
        					st18im.setLore(lore18);	        					
        	/*  76 */       this.s18.setItemMeta(st18im);
        	
        	
          	/*  73 */       this.f1 = new ItemStack(Material.NETHERITE_SWORD, 1);
        	/*  74 */       ItemMeta f1 = this.f1.getItemMeta();
        	/*  75 */       f1.setDisplayName("�5Netherite Filter");
        					ArrayList<String> loref1 = new ArrayList<String>();
        					
        					if (Main.f1 == true) {
        						f1.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        						f1.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
	        				loref1.add("�7- �dTurn Off Netherite Items");
	        				loref1.add("�7- �aActivated");
        					} else {
        						loref1.add("�7- �dTurn Off Netherite Items");
        						loref1.add("�7- �cDeactivated");	
        					}
        					
        					f1.setLore(loref1);	        					
        	/*  76 */       this.f1.setItemMeta(f1);
        	
        	
        	
          	/*  73 */       this.f2 = new ItemStack(Material.BOOKSHELF, 1);
        	/*  74 */       ItemMeta f2 = this.f2.getItemMeta();
        	/*  75 */       f2.setDisplayName("�5Enchantments");
        					ArrayList<String> loref2 = new ArrayList<String>();
        					
        					if (RandomEnchantment.Wahrscheinlichkeit > 0) {
        						f2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        						f2.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
	        				loref2.add("�7- �dTurn On Enchanted Items");
	        				loref2.add("�7- �dWahrscheinlichkeit: " + ChatColor.GREEN + RandomEnchantment.InProzent());
	        				loref2.add("�7- �aActivated");
        					} else if (RandomEnchantment.Wahrscheinlichkeit  <= 0){
        						loref2.add("�7- �dTurn On Enchanted Items");
        						loref2.add("�7- �dWahrscheinlichkeit: " + ChatColor.GREEN + RandomEnchantment.InProzent());
        						loref2.add("�7- �cDeactivated");	
        					}
        					
        					f2.setLore(loref2);	        					
        	/*  76 */       this.f2.setItemMeta(f2);
 
	        
	        
							this.back = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
							ItemMeta back1 = this.back.getItemMeta();
							back1.setDisplayName(ChatColor.RED + "Back");
							this.back.setItemMeta(back1);
        	
			
        	
			/*  89 */       this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
			/*  90 */       ItemMeta phim = this.ph.getItemMeta();
			/*  91 */       phim.setDisplayName(" ");
			/*  92 */       this.ph.setItemMeta(phim);
	        
	        	        
	        if (e.getCurrentItem().getType().equals(Material.DRAGON_EGG) || e.getCurrentItem().getType().equals(this.f1.getType()) || e.getCurrentItem().getType().equals(this.f2.getType()) || e.getCurrentItem().getType().equals(this.s1.getType()) || e.getCurrentItem().getType().equals(this.s2.getType()) || e.getCurrentItem().getType().equals(this.s3.getType()) || e.getCurrentItem().getType().equals(this.s4.getType()) || e.getCurrentItem().getType().equals(this.s5.getType()) || e.getCurrentItem().getType().equals(this.s6.getType()) || e.getCurrentItem().getType().equals(this.s7.getType()) || e.getCurrentItem().getType().equals(this.s8.getType()) || e.getCurrentItem().getType().equals(this.s9.getType()) || e.getCurrentItem().getType().equals(this.s10.getType()) || e.getCurrentItem().getType().equals(this.s11.getType()) || e.getCurrentItem().getType().equals(this.s12.getType()) || e.getCurrentItem().getType().equals(this.s13.getType()) || e.getCurrentItem().getType().equals(this.s14.getType()) || e.getCurrentItem().getType().equals(this.s15.getType()) || e.getCurrentItem().getType().equals(this.s16.getType()) || e.getCurrentItem().getType().equals(this.s17.getType()) || e.getCurrentItem().getType().equals(this.s18.getType()) ) {
	        	
	
	        					/*  88 */       Inventory schwierigkeit = Bukkit.createInventory(null, 54, "�4Difficulties");
    
	        					/*  94 */       schwierigkeit.setItem(9, this.s1);
	        					/*  94 */       schwierigkeit.setItem(10, this.s2);
	        					/*  94 */       schwierigkeit.setItem(11, this.s3);
	        					/*  94 */       schwierigkeit.setItem(12, this.s4);
	        					/*  94 */       schwierigkeit.setItem(13, this.s5);
	        					/*  94 */       schwierigkeit.setItem(14, this.s6);
	        					/*  94 */       schwierigkeit.setItem(15, this.s7);
	        					/*  94 */       schwierigkeit.setItem(16, this.s8);
	        					/*  94 */       schwierigkeit.setItem(17, this.s9);
	        					/*  94 */       schwierigkeit.setItem(18, this.s10);
	        					/*  94 */       schwierigkeit.setItem(19, this.s11);
	        					/*  94 */       schwierigkeit.setItem(20, this.s12);
	        					/*  94 */       schwierigkeit.setItem(21, this.s13);
	        					/*  94 */       schwierigkeit.setItem(22, this.s14);
	        					/*  94 */       schwierigkeit.setItem(23, this.s15);
	        					/*  94 */       schwierigkeit.setItem(24, this.s16);
	        					/*  94 */       schwierigkeit.setItem(25, this.s17);
	        					/*  94 */       schwierigkeit.setItem(26, this.s18);
	        									schwierigkeit.setItem(36, this.f1);
	        									schwierigkeit.setItem(37, this.f2);
	        									schwierigkeit.setItem(53, this.back);
	        					
	        					
	        					
	        	                for (int i = 0; i < schwierigkeit.getSize(); i++) {
	        	                    if (schwierigkeit.getItem(i) == null || schwierigkeit.getItem(i).getType().equals(Material.AIR)) {
	        	                    	schwierigkeit.setItem(i, this.ph);
	        	                    }
	        	                }
     									
	        					
	        					k.getPlayer().openInventory(schwierigkeit);
	        }
	    }
	
	        
	        
	        
	        
	        
	        
	        
	        if (e.getView().getTitle() == "�2Game Settings" || e.getView().getTitle() == "�2Einstellungen") {
/* 312 */       e.setCancelled(true);
	        


				Player k = (Player)e.getWhoClicked();
				
	        
	        if (this.main.LobbyStatus || Main.GameStarted) {
	        	if (e.getCurrentItem() == null) {
	        		e.setCancelled(true); }}
	        
	        
	        
	        
	        
	        
	        
	        if (e.getCurrentItem().getType().equals(Material.CLOCK)) {
	        					        	
	        	if (data.getConfig().getBoolean("Gamesettings.timercountdown")) {
					data.getConfig().set("Gamesettings.timercountdown", false);
	        		Main.hours = 0;
	        		Main.minutes = 0;
	        		Main.seconds = 0;
	        	} else if (data.getConfig().getBoolean("Gamesettings.timercountdown") == false){
	        		data.getConfig().set("Gamesettings.timercountdown", true);
	        		Main.hours = 0;
	        		Main.minutes = 10;
	        		Main.seconds = 0;
	        	}
	        					
	        } else if (e.getCurrentItem().getType().equals(Material.TOTEM_OF_UNDYING)) {
	        	
	        	
	        	
	        	
	        	if (e.getClick().isLeftClick() == true) {
	        		
	        		Main.SpawnArea = Main.SpawnArea + 10;	    	
	        		
	        	} else if (e.getClick().isRightClick() == true){
	        		
	        		
	        		if (Main.SpawnArea == 10) {
	        			
	        			return;
	        		} else {
	        			Main.SpawnArea = Main.SpawnArea - 10;
	        		}
	        		
	        		
	        			        		
	        	}
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.SPRUCE_LOG)) {
	        	
	        	
	        	if (!data.getConfig().getBoolean("Gamesettings.reset")) {
					data.getConfig().set("Gamesettings.reset", true);
	        		
	        	} else if (data.getConfig().getBoolean("Gamesettings.reset")) {
					data.getConfig().set("Gamesettings.reset", false);
	        	}
	        	
	        	
	        	
	        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("�cPlus") ) {	
	        	
	        	
	        	
	        	if (Main.minutes == 60) {
	        		
	        		Main.minutes = 0;
	        		
	        		Main.hours++;
	        		
	        	} else if (data.getConfig().getBoolean("Gamesettings.timercountdown")){
	        		
	        		Main.minutes = Main.minutes + 10;
	        	} else if (!data.getConfig().getBoolean("Gamesettings.timercountdown")) {
	        		return;
	        	}
	        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("�cMinus") ) {
	        	
	        	if (Main.minutes == 0 && data.getConfig().getBoolean("Gamesettings.timercountdown")) {
	        		
	        		Main.minutes = 60;
	        		
	        		Main.hours--;
	        		
	        	} else if (Main.minutes < 10 || Main.minutes == 10 && Main.hours == 0 ){
	        		
	        		return;
	        		
	        	} else if (Main.minutes == 0 && !data.getConfig().getBoolean("Gamesettings.timercountdown")) {
	        		return;
	        		
	        	} else {
	        		Main.minutes = Main.minutes - 10;
	        	}
	        	
	        	
	        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
	        	
	        	k.getPlayer().openInventory(settings.settings);
	        	
	        }

	        
	        
	 
	        
	        
        	/*  73 */       this.g1 = new ItemStack(Material.CLOCK, 1);
        	/*  74 */       ItemMeta st1im = this.g1.getItemMeta();
        	/*  75 */       st1im.setDisplayName("�aTimer");
        					ArrayList<String> lore1 = new ArrayList<String>();
        					lore1.add( "" + ChatColor.GOLD + Main.hours + ":" + ChatColor.GOLD + Main.minutes + ":" +  ChatColor.GOLD + Main.seconds);
        					
        					if (!data.getConfig().getBoolean("Gamesettings.timercountdown")) {
        						lore1.add( "" + ChatColor.DARK_GREEN + "Counting Up");
        					} else if (data.getConfig().getBoolean("Gamesettings.timercountdown")) {
        						lore1.add( "" + ChatColor.RED + "Counting Down" );        						
        					}
        				    
        					
        					st1im.setLore(lore1);	        					
        	/*  76 */       this.g1.setItemMeta(st1im);
        	
        	/*  73 */       this.g2 = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
        	/*  74 */       ItemMeta st2im = this.g2.getItemMeta();
        	/*  75 */       st2im.setDisplayName("�aSpawnArea");
        					ArrayList<String> lore2 = new ArrayList<String>();
        					st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
	        				st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
	       					lore2.add("�2Set the Spawnarea in Blocks");
        					lore2.add("�c+ 10 Blocks�2 per �6LeftClick");
        					lore2.add("�c- 10 Blocks�2 per �6RightClick");
        					lore2.add("�2Current Spawnarea: " + ChatColor.GOLD + Main.SpawnArea);
        					st2im.setLore(lore2);	        					
        	/*  76 */       this.g2.setItemMeta(st2im);
        	
        	/*  73 */       this.g3 = new ItemStack(Material.SPRUCE_LOG, 1);
        	/*  74 */       ItemMeta st3im = this.g3.getItemMeta();
        	/*  75 */       st3im.setDisplayName("�aReset");
        					ArrayList<String> lore3 = new ArrayList<String>();   				
        					lore3.add("�2Turn Reset ON or OFF");
        					
        					
        					if (data.getConfig().getBoolean("Gamesettings.reset")) {
        						lore3.add("�aTurned On");
        					} else if (!data.getConfig().getBoolean("Gamesettings.reset")) {
        						lore3.add("&cTurned Off");
        					}
        					
        					
        					
        					
        					
        					st3im.setLore(lore3);	        					
        		        	this.g3.setItemMeta(st3im);
        		        	
        		        	this.g4 = new ItemStack(Material.PLAYER_HEAD, 1);
        		        	ItemMeta st4im = this.g4.getItemMeta();
        		        	st4im.setDisplayName("�aPlayer Settings");
        		        	ArrayList<String> lore4 = new ArrayList<String>();
        		        	st4im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        			        st4im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        			       	lore4.add("�7- �2Player Settings");
        		        	st4im.setLore(lore4);	        					
        		        	this.g4.setItemMeta(st4im);
        		        	
        		        	
        		        	
        		        	this.b1 = new ItemStack(Material.STONE_BUTTON, 1);
        		        	ItemMeta b1im = this.b1.getItemMeta();
        		        	b1im.setDisplayName("�cMinus");
        		        	ArrayList<String> blore = new ArrayList<String>();
        		        	b1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        			        b1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        		        	blore.add( "" + ChatColor.GOLD + Main.hours + ":" + ChatColor.GOLD + Main.minutes + ":" +  ChatColor.GOLD + Main.seconds);
        		        	b1im.setLore(blore);	        					
        		        	this.b1.setItemMeta(b1im);
        		        	
        		        	
        		        	this.b2 = new ItemStack(Material.STONE_BUTTON, 1);
        		        	ItemMeta b2im = this.b2.getItemMeta();
        		        	b2im.setDisplayName("�cPlus");
        		        	ArrayList<String> blore1 = new ArrayList<String>();
        		        	b2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        			        b2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        		        	blore1.add( "" + ChatColor.GOLD + Main.hours + ":" + ChatColor.GOLD + Main.minutes + ":" +  ChatColor.GOLD + Main.seconds);
        		        	b2im.setLore(blore1);	        					
        		        	this.b2.setItemMeta(b2im);
        		        	
        		        	
        					
        					
        					


 
	        
        					/*  89 */       this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        					/*  90 */       ItemMeta phim = this.ph.getItemMeta();
        					/*  91 */       phim.setDisplayName(" ");
        					/*  92 */       this.ph.setItemMeta(phim);
        					
        			

	        
	        	        
	        if (e.getCurrentItem().getType().equals(Material.COMMAND_BLOCK) || e.getCurrentItem().getType().equals(Material.STONE_BUTTON) || e.getCurrentItem().getType().equals(Material.CLOCK) || e.getCurrentItem().getType().equals(Material.TOTEM_OF_UNDYING) || e.getCurrentItem().getType().equals(Material.SPRUCE_LOG))  {
	        	
	
	        					/*  88 */       
    
	        					/*  94 */       gameset.setItem(19, this.g1);
	        					/*  94 */       gameset.setItem(21, this.g2);
	        					/*  94 */       gameset.setItem(23, this.g3);
	        									gameset.setItem(25, this.g4);
	        									gameset.setItem(10, this.b2);
	        									gameset.setItem(28, this.b1);
	        									gameset.setItem(44, this.back);

	        		        	                for (int i = 0; i < gameset.getSize(); i++) {
	        		        	                    if (gameset.getItem(i) == null || gameset.getItem(i).getType().equals(Material.AIR)) {
	        		        	                    	gameset.setItem(i, this.ph);
	        		        	                    }
	        		        	                }
     									
	        					
	        					k.getPlayer().openInventory(gameset);
	        }
	    
	        
	       }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        if (e.getView().getTitle() == "�2Game Settings" || e.getView().getTitle() == "�2Player Settings") {
/* 312 */       e.setCancelled(true);
	        






			Player k = (Player)e.getWhoClicked();
	        
	        if (this.main.LobbyStatus || Main.GameStarted) {
	        	if (e.getCurrentItem() == null) {
	        		e.setCancelled(true); }}
	        
	        
	        if (e.getCurrentItem().getType().equals(Material.TRIDENT)  ) {
	        	
	        	if (!data.getConfig().getBoolean("Playersettings.damage")) {

					data.getConfig().getBoolean("Playersettings.damage", true);
	        			        		
	        	} else if (data.getConfig().getBoolean("Playersettings.damage")) {
	        		/* 496 */       for (Player player : Bukkit.getOnlinePlayers()) {
	        			/* 497 */         player.setHealth(20);}

					data.getConfig().set("Playersettings.damage", false);
	        		
	        	}
	        	
	        	
	        	
	        	
	        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.MUSHROOM_STEW)  ) {
	        	
	        	
	        	if (Main.hunger == true) {
	        		/* 496 */       for (Player player : Bukkit.getOnlinePlayers()) {
	        			/* 497 */         player.setFoodLevel(20);}
	        		Main.hunger = false;
	        	} else if (Main.hunger == false) {
	        		Main.hunger = true;
	        	}
	        	
	        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.CHEST)  ) {
	        	
	        	if (Main.keepinventory == true) {
	        		Main.keepinventory = false;
	        	} else if (Main.keepinventory == false) {
	        		Main.keepinventory = true;
	        	}
	        	
	        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE) && e.getView().getTitle() == "�2Player Settings") {
	        	
	        	k.getPlayer().openInventory(gameset);
	        	
	        }
	        
	        
	        
        	/*  73 */       this.p1 = new ItemStack(Material.TRIDENT, 1);
        	/*  74 */       ItemMeta p1im = this.p1.getItemMeta();
        	/*  75 */       p1im.setDisplayName("�aDamage");
        					ArrayList<String> lore1 = new ArrayList<String>();   				
        					lore1.add("�2Turn Damage ON or OFF");
        					
        					
        					if (data.getConfig().getBoolean("Playersettings.damage")) {
        						lore1.add("�aTurned On");
        					} else if (!data.getConfig().getBoolean("Playersettings.damage")) {
        						lore1.add("�cTurned Off");
        					}
        										
        					p1im.setLore(lore1);	        					
        		        	this.p1.setItemMeta(p1im);
        	
        	
            /*  73 */       this.p2 = new ItemStack(Material.MUSHROOM_STEW, 1);
            /*  74 */       ItemMeta st2im = this.p2.getItemMeta();
            /*  75 */       st2im.setDisplayName("�aHunger");
        		        	ArrayList<String> lore2 = new ArrayList<String>();   				
        		            lore2.add("�2Turn Hunger ON or OFF");
        		        					
        		        					
        		        	if (Main.hunger == true ) {
        		        		lore2.add("�aTurned On");
        		        	} else if (Main.hunger == false ) {		
        		        		lore2.add("�cTurned Off");
        		        	}
	
        		        	st2im.setLore(lore2);	        					
        		            this.p2.setItemMeta(st2im);
        	
        		        		        	
        		        		        	
        		        		        	
        		        		        	
            /*  73 */       this.p3 = new ItemStack(Material.CHEST, 1);
        	/*  74 */       ItemMeta st3im = this.p3.getItemMeta();
        	/*  75 */       st3im.setDisplayName("�aKeep Inventory");
        		        	ArrayList<String> lore3 = new ArrayList<String>();   				
        		        		lore3.add("�2Turn Keepinventory ON or OFF");
        		        		        					
        		        		        					
        		        	if (Main.keepinventory == true ) {
        		        		lore3.add("�aTurned On");
        		            } else if (Main.keepinventory == false ) {		
        		        		lore3.add("�cTurned Off");
        		        		   }
     		        		        		        		        					
        		        	st3im.setLore(lore3);	        					
        		            this.p3.setItemMeta(st3im);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
			/*  89 */       this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
			/*  90 */       ItemMeta phim = this.ph.getItemMeta();
			/*  91 */       phim.setDisplayName(" ");
			/*  92 */       this.ph.setItemMeta(phim);
        	
        	
			if (e.getCurrentItem().getType().equals(Material.PLAYER_HEAD) || e.getCurrentItem().getType().equals(Material.TRIDENT) || e.getCurrentItem().getType().equals(Material.MUSHROOM_STEW) || e.getCurrentItem().getType().equals(Material.CHEST)  ) {
			
				/*  88 */       Inventory playerset = Bukkit.createInventory(null, 45, "�2Player Settings");
			    
				/*  94 */       playerset.setItem(19, this.p1);
				/*  94 */       playerset.setItem(21, this.p2);
				/*  94 */       playerset.setItem(23, this.p3);
								playerset.setItem(44, this.back);


	        	                for (int i = 0; i < playerset.getSize(); i++) {
	        	                    if (playerset.getItem(i) == null || playerset.getItem(i).getType().equals(Material.AIR)) {
	        	                    	playerset.setItem(i, this.ph);
	        	                    }
	        	                }
							
				
				k.getPlayer().openInventory(playerset);
        	
        	
			}
	        
	        
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        if (e.getView().getTitle() == "�2Team Settings" || e.getView().getTitle() == "�2Einstellungen") {
/* 312 */       e.setCancelled(true);
	        


				Player k = (Player)e.getWhoClicked();
				
	        
	        if (this.main.LobbyStatus || Main.GameStarted) {
	        	if (e.getCurrentItem() == null) {
	        		e.setCancelled(true); }}
	        
	        
	        
	        
	        
	        
	        
	        if (e.getCurrentItem().getType().equals(Material.ARMOR_STAND)) {
	        					        	
	    
	        			return;		
	      
	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("�cPlus") ) {	
	        	
	        	
	        	
	        	if (Main.Teamsize == 1) {
       		
	        		Main.Teamsize++;
	        		
	        	} else if (Main.Teamsize == 2){
	        		
	        		return;
	        	}
        	
	        	
	        } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("�cMinus") ) {
	        	
	        	if (Main.Teamsize == 2) {
	        		
	        		
	        		
	        		Main.Teamsize--;
	        		
	        	} else if (Main.Teamsize == 1){
	        		
	        		return;
 	
	        }
	        } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
	        	
	        	k.getPlayer().openInventory(settings.settings);
	        	
	        }
	        
	        
	        
	        
	        
	        
	        
        	/*  73 */       this.g1 = new ItemStack(Material.ARMOR_STAND, 1);
        	/*  74 */       ItemMeta st1im = this.g1.getItemMeta();
        	/*  75 */       st1im.setDisplayName("�aTeamsize");
        					ArrayList<String> lore1 = new ArrayList<String>();
        					lore1.add( "�2Current Teamsize:" + ChatColor.GOLD + " " + Main.Teamsize );
        								
        					st1im.setLore(lore1);	        					
        	/*  76 */       this.g1.setItemMeta(st1im);
        	

        	
        		        	
        		        	this.b1 = new ItemStack(Material.STONE_BUTTON, 1);
        		        	ItemMeta b1im = this.b1.getItemMeta();
        		        	b1im.setDisplayName("�cMinus");
        		        	ArrayList<String> blore = new ArrayList<String>();
        		        	b1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        			        b1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        		        	blore.add( "�2Current Teamsize:" + ChatColor.GOLD + " " + Main.Teamsize );
        		        	b1im.setLore(blore);	        					
        		        	this.b1.setItemMeta(b1im);
        		        	
        		        	
        		        	this.b2 = new ItemStack(Material.STONE_BUTTON, 1);
        		        	ItemMeta b2im = this.b2.getItemMeta();
        		        	b2im.setDisplayName("�cPlus");
        		        	ArrayList<String> blore1 = new ArrayList<String>();
        		        	b2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
        			        b2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);    				
        		        	blore1.add( "�2Current Teamsize:" + ChatColor.GOLD + " " + Main.Teamsize );
        		        	b2im.setLore(blore1);	        					
        		        	this.b2.setItemMeta(b2im);
        		        	
        		        	
        					
        					
        					


 
	        
        					/*  89 */       this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        					/*  90 */       ItemMeta phim = this.ph.getItemMeta();
        					/*  91 */       phim.setDisplayName(" ");
        					/*  92 */       this.ph.setItemMeta(phim);

	        
	        	        
	        if (e.getCurrentItem().getType().equals(Material.RED_BANNER) || e.getCurrentItem().getType().equals(Material.STONE_BUTTON) || e.getCurrentItem().getType().equals(Material.ARMOR_STAND))  {
	        	
	
	        					/*  88 */       Inventory teamset = Bukkit.createInventory(null, 45, "�2Team Settings");
    
	        					/*  94 */       teamset.setItem(22, this.g1);
	        					/*  94 */       teamset.setItem(13, this.b2);
	        					/*  94 */       teamset.setItem(31, this.b1);
	        									teamset.setItem(44, this.back);


	        		        	                for (int i = 0; i < teamset.getSize(); i++) {
	        		        	                    if (teamset.getItem(i) == null || teamset.getItem(i).getType().equals(Material.AIR)) {
	        		        	                    	teamset.setItem(i, this.ph);
	        		        	                    }
	        		        	                }
     									
	        					
	        					k.getPlayer().openInventory(teamset);
	        }
	    
	        
	       }
	        
	         
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

	
/* 311 */     if (e.getView().getTitle() == (Main.getCL()).bingoitemsinround) {
/* 312 */       e.setCancelled(true);
/*     */     }
/* 314 */       Player p = (Player)e.getWhoClicked();
/*     */     
/*  73 */       this.t1is = new ItemStack(Material.ORANGE_CONCRETE, 1);
/*  74 */       ItemMeta t1im = this.t1is.getItemMeta();
/*  75 */       t1im.setDisplayName("�6Team 1");
/*  76 */       this.t1is.setItemMeta(t1im);
/*     */ 
/*     */       
/*  79 */       this.t2is = new ItemStack(Material.RED_CONCRETE, 1);
/*  80 */       ItemMeta t2im = this.t1is.getItemMeta();
/*  81 */       t2im.setDisplayName("�cTeam 2");
/*  82 */       this.t2is.setItemMeta(t2im);
/*     */       
/*  84 */       this.t3is = new ItemStack(Material.PINK_CONCRETE, 1);
/*  85 */       ItemMeta t3im = this.t1is.getItemMeta();
/*  86 */       t3im.setDisplayName("�dTeam 3");
/*  87 */       this.t3is.setItemMeta(t3im);

/*  84 */       this.t4is = new ItemStack(Material.WHITE_CONCRETE, 1);
/*  85 */       ItemMeta t4im = this.t1is.getItemMeta();
/*  86 */       t4im.setDisplayName("�fTeam 4");
/*  87 */       this.t4is.setItemMeta(t4im);

/*  84 */       this.t5is = new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1);
/*  85 */       ItemMeta t5im = this.t1is.getItemMeta();
/*  86 */       t5im.setDisplayName("�9Team 5");
/*  87 */       this.t5is.setItemMeta(t5im);

/*  84 */       this.t6is = new ItemStack(Material.YELLOW_CONCRETE, 1);
/*  85 */       ItemMeta t6im = this.t1is.getItemMeta();
/*  86 */       t6im.setDisplayName("�eTeam 6");
/*  87 */       this.t6is.setItemMeta(t6im);

/*  84 */       this.t7is = new ItemStack(Material.LIME_CONCRETE, 1);
/*  85 */       ItemMeta t7im = this.t1is.getItemMeta();
/*  86 */       t7im.setDisplayName("�aTeam 7");
/*  87 */       this.t7is.setItemMeta(t7im);

/*  84 */       this.t8is = new ItemStack(Material.GRAY_CONCRETE, 1);
/*  85 */       ItemMeta t8im = this.t1is.getItemMeta();
/*  86 */       t8im.setDisplayName("�7Team 8");
/*  87 */       this.t8is.setItemMeta(t8im);

/*  84 */       this.t9is = new ItemStack(Material.PURPLE_CONCRETE, 1);
/*  85 */       ItemMeta t9im = this.t1is.getItemMeta();
/*  86 */       t9im.setDisplayName("�5Team 9");
/*  87 */       this.t9is.setItemMeta(t9im);
/*     */     
/* 332 */     if (this.main.LobbyStatus || Main.GameStarted) {
/*     */       
/* 334 */       if (e.getCurrentItem() == null) {
/* 335 */         e.setCancelled(true);
/*     */       }
/* 337 */       else if (e.getCurrentItem().getType().equals(Material.ORANGE_CONCRETE) && e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 338 */         if (Main.t1.size() < Main.Teamsize) {
/*     */           
/* 340 */           if (!Main.t1.contains(p)) {
/* 341 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam1);
/* 342 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 344 */             Main.t1.add(p);
/*     */           } else {
/*     */             
/* 347 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam1);
/*     */           } 
/*     */           
/* 350 */           Scoreboards.setLobbyScoreboardWithTeam(p); //Wenn der Spieler auf Orange_Concrete Clicked, Team Auswahl (OnClick Event)&8Team Auswahl
/*     */         }
/* 352 */         else if (Main.t1.contains(p)) {
/* 353 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam1);
/*     */         } else {
/* 355 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team1full);
/*     */         } 
/*     */         
/* 358 */         p.closeInventory();
/* 359 */       } else if (e.getCurrentItem().getType().equals(Material.RED_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 360 */         if (Main.t2.size() < Main.Teamsize) {
/*     */ 
/*     */           
/* 363 */           if (!Main.t2.contains(p)) {
/* 364 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam2);
/* 365 */             Main.t1.remove(p);
/* 366 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 367 */             Main.t2.add(p);
/*     */           } else {
/*     */             
/* 370 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam2);
/*     */           } 
/*     */           
/* 373 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 375 */         else if (Main.t2.contains(p)) {
/* 376 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam2);
/*     */         } else {
/* 378 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team2full);
/*     */         } 
/*     */         
/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.PINK_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t3.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t3.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam3);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 391 */             Main.t3.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam3);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t3.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam3);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team3full);
/*     */         } 

/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.WHITE_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t4.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t4.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam4);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 391 */             Main.t4.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam4);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t4.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam4);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team4full);
/*     */         }

/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.LIGHT_BLUE_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t5.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t5.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam5);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 391 */             Main.t5.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam5);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t5.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam5);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team5full);
/*     */         } 

/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.YELLOW_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t6.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t6.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam6);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 391 */             Main.t6.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam6);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t6.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam6);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team6full);
/*     */         } 
/*     */         
/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.LIME_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t7.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t7.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam7);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t8.remove(p);
/* 343 */             Main.t9.remove(p);
/* 391 */             Main.t7.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam7);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t7.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam7);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team7full);
/*     */         }

/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.GRAY_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t8.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t8.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam8);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t9.remove(p);
/* 391 */             Main.t8.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam8);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t8.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam8);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team8full);
/*     */         } 

/* 381 */         p.closeInventory();
/* 382 */       } else if (e.getCurrentItem().getType().equals(Material.PURPLE_CONCRETE)&& e.getView().getTitle() == (Main.getCL()).teamselectorInventoryTitle) {
/* 383 */         if (Main.t9.size() < Main.Teamsize) {
/*     */ 
/*     */ 
/*     */           
/* 387 */           if (!Main.t9.contains(p)) {
/* 388 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).jointeam9);
/* 389 */             Main.t1.remove(p);
/* 390 */             Main.t2.remove(p);
/* 343 */             Main.t3.remove(p);
/* 343 */             Main.t4.remove(p);
/* 343 */             Main.t5.remove(p);
/* 343 */             Main.t6.remove(p);
/* 343 */             Main.t7.remove(p);
/* 343 */             Main.t8.remove(p);
/* 391 */             Main.t9.add(p);
/*     */           } else {
/*     */             
/* 394 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam9);
/*     */           } 
/*     */           
/* 397 */           Scoreboards.setLobbyScoreboardWithTeam(p);
/*     */         }
/* 399 */         else if (Main.t9.contains(p)) {
/* 400 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).alreadyteam9);
/*     */         } else {
/* 402 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).team9full);
/*     */         } 

/* 405 */         p.closeInventory();
/*     */       } else if (e.getClickedInventory().getType() == InventoryType.PLAYER && e.getCurrentItem().getType().equals(Material.NETHER_STAR) && this.main.LobbyStatus == true && e.getCurrentItem().getItemMeta().getDisplayName().contains((Main.getCL()).teamselection)){
/* 407 */         e.setCancelled(true);
/*     */       } else if (e.getClickedInventory().getType() == InventoryType.PLAYER && e.getCurrentItem().getType().equals(Material.NETHER_STAR) && Main.GameStarted == true && e.getCurrentItem().getItemMeta().getDisplayName().contains((Main.getCL()).teamselection)){
				  e.setCancelled(true);
				}

/*     */     
/* 410 */     } else if (e.getWhoClicked().isInvulnerable() && e.getClickedInventory().getType() != InventoryType.PLAYER) {
/* 411 */       e.setCancelled(true);
/*     */     } 
/* 413 */     if (Main.t1.contains(p)) {
/* 414 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam1Colour)) + p.getName());
/* 415 */     } else if (Main.t2.contains(p)) {
/* 416 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam2Colour)) + p.getName());
/* 417 */     } else if (Main.t3.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam3Colour)) + p.getName());
/*     */     } else if (Main.t4.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam4Colour)) + p.getName());
/*     */     } else if (Main.t5.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam5Colour)) + p.getName());
/*     */     } else if (Main.t6.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam6Colour)) + p.getName());
/*     */     } else if (Main.t7.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam7Colour)) + p.getName());
/*     */     } else if (Main.t8.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam8Colour)) + p.getName());
/*     */     } else if (Main.t9.contains(p)) {
/* 418 */       p.setPlayerListName(String.valueOf(ChatColor.translateAlternateColorCodes('&', (Main.getCL()).TablistTeam9Colour)) + p.getName());
/*     */     }


			  if (e.getClick().isLeftClick() == true && e.getView().getTitle() == Main.getCL().bingoitemsinround) { 
				  
				  if (Main.GameStarted) {
					  
					  String BingoItem = "r %Item%";
					  
					  if (e.getCurrentItem().getType().equals(Main.b1.getType())) {
						  					  			  
						  p.performCommand(BingoItem.replace("%Item%", Main.b1.getType().name()));
						  					  		  
					  } else if (e.getCurrentItem().getType().equals(Main.b2.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b2.getType().name()));
						  					  
					  } else if (e.getCurrentItem().getType().equals(Main.b3.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b3.getType().name()));
						  
					  } else if (e.getCurrentItem().getType().equals(Main.b4.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b4.getType().name()));
						  
					  } else if (e.getCurrentItem().getType().equals(Main.b5.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b5.getType().name()));
						  
					  } else if (e.getCurrentItem().getType().equals(Main.b6.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b6.getType().name()));
						  
					  } else if (e.getCurrentItem().getType().equals(Main.b7.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b7.getType().name()));
						  
					  } else if (e.getCurrentItem().getType().equals(Main.b8.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b8.getType().name()));
						  
					  } else if (e.getCurrentItem().getType().equals(Main.b9.getType())) {
						  
						  p.performCommand(BingoItem.replace("%Item%", Main.b9.getType().name()));
						  
					  }
					  
					  				  
				  } else {
					  
					  e.setCancelled(true);
					  
				  }
				  
			  }



/*     */   }






/*     */   
/*     */   @EventHandler
/*     */   public void onTarget(EntityTargetLivingEntityEvent e) {
/* 424 */     if (e.getTarget() instanceof Player && (
/* 425 */       e.getTarget().isInvulnerable() || this.main.LobbyStatus)) {
/* 426 */       e.setCancelled(true);
/*     */     }

			if (!data.getConfig().getBoolean("Playersettings.damage")) {
				e.setCancelled(true);
			} else if (data.getConfig().getBoolean("Playersettings.damage")) {
				return;
			}
/*     */   }
/*     */ 
/*     */   

/*     */   

/*     */   
/*     */   @EventHandler
/*     */   public void onFoodChange(FoodLevelChangeEvent e) {
/* 449 */     Player p = (Player)e.getEntity();
/* 450 */     if (this.main.LobbyStatus || p.isInvulnerable()) {
/* 451 */       e.setCancelled(true);
/*     */     }

				if (Main.hunger == false) {
					e.setCancelled(true);
				} else if (Main.hunger == true) {
					return;
				}
				
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onDeath(PlayerDeathEvent e) {
	
			if (Main.keepinventory == true) {
				e.setKeepInventory(true);
			} else if (Main.keepinventory == false) {
				e.setKeepInventory(false);
			} 
	
			e.getDrops().clear();
/* 458 */   e.setDeathMessage(null);
/* 457 */     
				

/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onRespawn(PlayerRespawnEvent e) {
/* 463 */     int l1x = ThreadLocalRandom.current().nextInt(-3000, 3000);
/* 464 */     int l1z = ThreadLocalRandom.current().nextInt(-3000, 3000);
/* 465 */     Location l1 = new Location(Bukkit.getWorld("world"), l1x, Bukkit.getWorld("world").getHighestBlockAt(l1x, l1z).getY(), l1z);
/* 466 */     e.setRespawnLocation(l1);
/* 467 */     e.getPlayer().teleport(l1);
/* 468 */     e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ITEM_CHORUS_FRUIT_TELEPORT, 0.3F, 1.0F);
/* 469 */     Bukkit.broadcastMessage((Main.getCL()).deathmessage.replace("%player%", e.getPlayer().getName()));
/* 470 */     ItemStack boat = new ItemStack(Material.OAK_BOAT, 1);
/* 471 */     ItemMeta boatmeta = boat.getItemMeta();
/* 472 */     boatmeta.setDisplayName((Main.getCL()).BoatName);
/* 473 */     boat.setItemMeta(boatmeta);
/* 474 */     e.getPlayer().getInventory().setItem(0, boat);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onQuit(PlayerQuitEvent e) {
/* 479 */     if (!Main.GameStarted && !this.main.isRestarting) {
/* 480 */       if (Main.t1.contains(e.getPlayer())) {
/* 481 */         Main.t1.remove(e.getPlayer());
/* 482 */       } else if (Main.t2.contains(e.getPlayer())) {
/* 483 */         Main.t2.remove(e.getPlayer());
/* 484 */       } else if (Main.t3.contains(e.getPlayer())) {
/* 485 */         Main.t3.remove(e.getPlayer());
/*     */       } else if (Main.t4.contains(e.getPlayer())) {
/* 483 */         Main.t4.remove(e.getPlayer());
/* 484 */       } else if (Main.t5.contains(e.getPlayer())) {
/* 483 */         Main.t5.remove(e.getPlayer());
/* 484 */       } else if (Main.t6.contains(e.getPlayer())) {
/* 483 */         Main.t6.remove(e.getPlayer());
/* 484 */       } else if (Main.t7.contains(e.getPlayer())) {
/* 483 */         Main.t7.remove(e.getPlayer());
/* 484 */       } else if (Main.t8.contains(e.getPlayer())) {
/* 483 */         Main.t8.remove(e.getPlayer());
/* 484 */       } else if (Main.t9.contains(e.getPlayer())) {
/* 483 */         Main.t9.remove(e.getPlayer());
/* 484 */       }
/* 487 */       e.setQuitMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).leftserverlobby.replace("%player%", e.getPlayer().getName()));
/*     */     } 
/* 489 */     if (!this.main.isRestarting && Main.GameStarted) {
/* 490 */       if (e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
	/* 480 */       if (Main.t1.contains(e.getPlayer())) {
		/* 481 */         Main.t1.remove(e.getPlayer());
		/* 482 */       } else if (Main.t2.contains(e.getPlayer())) {
		/* 483 */         Main.t2.remove(e.getPlayer());
		/* 484 */       } else if (Main.t3.contains(e.getPlayer())) {
		/* 485 */         Main.t3.remove(e.getPlayer());
		/*     */       } else if (Main.t4.contains(e.getPlayer())) {
		/* 483 */         Main.t4.remove(e.getPlayer());
		/* 484 */       } else if (Main.t5.contains(e.getPlayer())) {
		/* 483 */         Main.t5.remove(e.getPlayer());
		/* 484 */       } else if (Main.t6.contains(e.getPlayer())) {
		/* 483 */         Main.t6.remove(e.getPlayer());
		/* 484 */       } else if (Main.t7.contains(e.getPlayer())) {
		/* 483 */         Main.t7.remove(e.getPlayer());
		/* 484 */       } else if (Main.t8.contains(e.getPlayer())) {
		/* 483 */         Main.t8.remove(e.getPlayer());
		/* 484 */       } else if (Main.t9.contains(e.getPlayer())) {
		/* 483 */         Main.t9.remove(e.getPlayer());
		/* 484 */       }
/* 491 */         e.setQuitMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).leftserveringame.replace("%player%", e.getPlayer().getName()));
/*     */       } else {
/* 493 */         e.setQuitMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).leftserveringamespectator.replace("%player%", e.getPlayer().getName()));
/*     */       } 
/*     */       
/* 496 */       for (Player player : Bukkit.getOnlinePlayers()) {
/* 497 */         this.main.players++;
/* 498 */         if (player.getGameMode() == GameMode.SPECTATOR) {
/* 499 */           this.main.spectator++;
/*     */         }
/*     */       } 
/* 502 */       this.main.players--;
/* 503 */       if (this.main.spectator == this.main.players && Main.GameStarted == false) {
/* 504 */         for (Player player : Bukkit.getOnlinePlayers()) {         
/* 512 */           player.kickPlayer(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gameisrestarting);
/*     */         } 
/*     */         
/* 515 */         (new BukkitRunnable()
/*     */           {
/*     */             public void run()
/*     */             {
					
/* 519 */               Listeners.this.main.noPlayerRestart();
/*     */             }
/* 522 */           }).runTaskLater((Plugin)Main.getPlugin(), 80L);
/*     */       } 
/* 524 */       this.main.players = 0;
/* 525 */       this.main.spectator = 0;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 






/*     */ 
/*     */ 
/*     */   
@EventHandler
public void onAsyncChat(AsyncPlayerChatEvent e) {
	

    if (e.getPlayer().hasPermission("bingo.gamemaster")) {
      if (Main.t1.contains(e.getPlayer())) {
        e.setFormat((Main.getCL()).chatformatTeam1.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
      } else if (Main.t2.contains(e.getPlayer())) {
        e.setFormat((Main.getCL()).chatformatTeam2.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
      } else if (Main.t3.contains(e.getPlayer())) {
        e.setFormat((Main.getCL()).chatformatTeam3.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
      } else if (Main.t4.contains(e.getPlayer())) {
          e.setFormat((Main.getCL()).chatformatTeam4.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
      } else if (Main.t5.contains(e.getPlayer())) {
            e.setFormat((Main.getCL()).chatformatTeam5.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
          } else if (Main.t6.contains(e.getPlayer())) {
              e.setFormat((Main.getCL()).chatformatTeam6.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
          } else if (Main.t7.contains(e.getPlayer())) {
              e.setFormat((Main.getCL()).chatformatTeam7.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
          } else if (Main.t8.contains(e.getPlayer())) {
              e.setFormat((Main.getCL()).chatformatTeam8.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
          } else if (Main.t9.contains(e.getPlayer())) {
              e.setFormat((Main.getCL()).chatformatTeam9.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
          } else {
        e.setFormat((Main.getCL()).chatformatwithoutteam.replace("%player%", String.valueOf((Main.getCL()).chatcolourGamemaster) + e.getPlayer().getName()).replace("%message%", e.getMessage()));
      } 
    } else if (Main.t1.contains(e.getPlayer())) {
      e.setFormat((Main.getCL()).chatformatTeam1.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
    } else if (Main.t2.contains(e.getPlayer())) {
      e.setFormat((Main.getCL()).chatformatTeam2.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
    } else if (Main.t3.contains(e.getPlayer())) {
      e.setFormat((Main.getCL()).chatformatTeam3.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
    } else if (Main.t4.contains(e.getPlayer())) {
        e.setFormat((Main.getCL()).chatformatTeam4.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
      } else if (Main.t5.contains(e.getPlayer())) {
          e.setFormat((Main.getCL()).chatformatTeam5.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t6.contains(e.getPlayer())) {
            e.setFormat((Main.getCL()).chatformatTeam6.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t7.contains(e.getPlayer())) {
            e.setFormat((Main.getCL()).chatformatTeam7.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t8.contains(e.getPlayer())) {
            e.setFormat((Main.getCL()).chatformatTeam8.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t9.contains(e.getPlayer())) {
            e.setFormat((Main.getCL()).chatformatTeam9.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else {
      e.setFormat((Main.getCL()).chatformatwithoutteam.replace("%player%", String.valueOf((Main.getCL()).chatcolourDefaultUser) + e.getPlayer().getName()).replace("%message%", e.getMessage()));
    }

 
  }
/*     */ 



					@EventHandler
	public void onBroadcast(BroadcastMessageEvent e) {
		for (Player player : Bukkit.getOnlinePlayers()) {
							
		if (e.getMessage().contains("gefunden")) {
								
		
		Scoreboards.setLobbyScoreboardWithTeam(player); //bei der Nachricht gefunden wird f�r bei jedem das Scoreboard aktualiesiert
				
				} 
												
		}
								
}
					
					
 
/*     */   @EventHandler
/*     */   public void onDrop(PlayerDropItemEvent e) {
/* 560 */     if (this.main.LobbyStatus || e.getPlayer().isInvulnerable()) {
/* 561 */       e.setCancelled(true);
/*     */     }
/*     */   }
/*     */ 



/*     */ 	@EventHandler
/*     */ 	public void onTeleport (PlayerTeleportEvent e ) {
				if (Main.GameStarted == true ) {
					
									
				 	if (!this.main.randomized) {				 		
						 this.main.getRandomItems();
						 }
					
					
				Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer()); //Beim Teleport, am Anfang des Games, wird das Scoreboard Aktualiesert
						
					}
			
	}
}


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\listeners\Listeners.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */