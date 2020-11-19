package de.synex.bingo.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.synex.bingo.listeners.Listeners;
import de.synex.bingo.main.Main;
import net.md_5.bungee.api.ChatColor;

/*    */ public class settings
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
		   Listeners L;
/* 16 */    ItemStack setings;
			ItemStack Game;
			ItemStack ComingSoon;
/*     */   ItemStack t2is;
/*     */   ItemStack t3is;
/*     */   ItemStack t4is;
/*     */   ItemStack t5is;
/*     */   ItemStack t6is;
/*     */   ItemStack t7is;
/*     */   ItemStack t8is;
/*     */   ItemStack t9is;
/*     */   ItemStack ph;

			public static Inventory settings = Bukkit.createInventory(null, 27, "§2Einstellungen");	

/*    */   public settings(Main pl) {
/* 18 */     this.main = pl;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 24 */     if (sender instanceof Player) {
/* 25 */       Player p = (Player)sender;
 								
				if (p.hasPermission("bingo.settings")) {

/*  73 */       this.setings = new ItemStack(Material.DRAGON_EGG, 1);
/*  74 */       ItemMeta t1im = this.setings.getItemMeta();
/*  75 */       t1im.setDisplayName("§4Difficulties");
				ArrayList<String> lore = new ArrayList<String>();  				
				lore.add("§7- §6Stelle die Schwierigkeit ein!");
				t1im.setLore(lore);
/*  76 */       this.setings.setItemMeta(t1im);
/*     */ 


			
	        		        	/*  73 */       this.Game = new ItemStack(Material.COMMAND_BLOCK, 1);
	        		        	/*  74 */       ItemMeta game = this.Game.getItemMeta();
	        		        	/*  75 */       game.setDisplayName("§aGame Settings");
	        		        					ArrayList<String> lore1 = new ArrayList<String>();  				
	        			       					lore1.add("§7- §2Settings for the Game");
	        		        					lore1.add("§7- §2Reset");
	        		        					lore1.add("§7- §2Timer");
	        		        					lore1.add("§7- §2SpawnArea");
	        		        					game.setLore(lore1);	        					
	        		        	/*  76 */       this.Game.setItemMeta(game);
	        		        	
	        		        	
	        		        	
	        		        	
	        		        	
	        		        	/*  73 */       this.ComingSoon = new ItemStack(Material.RED_BANNER, 1);
	        		        	/*  74 */       ItemMeta team = this.ComingSoon.getItemMeta();
	        		        	/*  75 */       team.setDisplayName("§aTeam Settings");
	        		        					ArrayList<String> lore2 = new ArrayList<String>();    				
	        			       					lore2.add("§7- §2Settings for Teams");
	        			       					lore2.add("§7- §2Teamsize");
	        		        					team.setLore(lore2);	        					
	        		        	/*  76 */       this.ComingSoon.setItemMeta(team);
	        					
	        		        	
	        		        	
	        		        	
	        		        	
	        					/*  89 */       this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
	        					/*  90 */       ItemMeta phim = this.ph.getItemMeta();
	        					/*  91 */       phim.setDisplayName(" ");
	        					/*  92 */       this.ph.setItemMeta(phim);
	        					
	        					

	        		        	
	        					
	        					
	        					
	        		        	
	        					
	        		        	
	        		        	
	        	                for (int i = 0; i < settings.getSize(); i++) {
	        	                    if (settings.getItem(i) == null || settings.getItem(i).getType().equals(Material.AIR)) {
	        	                        settings.setItem(i, this.ph);
	        	                    }
	        	                }
				
								settings.setItem(9, this.Game);
								settings.setItem(13, this.ComingSoon);
				/*  94 */       settings.setItem(17, this.setings);

	
								
				
				p.getPlayer().openInventory(settings);
/*    */ 
/*    */ 
/*    */     
/* 66 */     } else {
				p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.settings]");
				}
/*    */   }
/*    */
return true; }
}


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Start.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */