package de.synex.bingo.commands;

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

/*    */ public class teams
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
		   Listeners L;
/* 16 */    ItemStack t1is;
/*     */   ItemStack t2is;
/*     */   ItemStack t3is;
/*     */   ItemStack t4is;
/*     */   ItemStack t5is;
/*     */   ItemStack t6is;
/*     */   ItemStack t7is;
/*     */   ItemStack t8is;
/*     */   ItemStack t9is;
/*     */   ItemStack ph;
/*    */   public teams(Main pl) {
/* 18 */     this.main = pl;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 24 */     if (sender instanceof Player) {
/* 25 */       Player p = (Player)sender;
 								
/*  73 */       this.t1is = new ItemStack(Material.ORANGE_CONCRETE, 1);
/*  74 */       ItemMeta t1im = this.t1is.getItemMeta();
/*  75 */       t1im.setDisplayName("§6Team 1");
/*  76 */       this.t1is.setItemMeta(t1im);
/*     */ 
/*     */       
/*  79 */       this.t2is = new ItemStack(Material.RED_CONCRETE, 1);
/*  80 */       ItemMeta t2im = this.t1is.getItemMeta();
/*  81 */       t2im.setDisplayName("§cTeam 2");
/*  82 */       this.t2is.setItemMeta(t2im);
/*     */       
/*  84 */       this.t3is = new ItemStack(Material.PINK_CONCRETE, 1);
/*  85 */       ItemMeta t3im = this.t1is.getItemMeta();
/*  86 */       t3im.setDisplayName("§dTeam 3");
/*  87 */       this.t3is.setItemMeta(t3im);

/*  84 */       this.t4is = new ItemStack(Material.WHITE_CONCRETE, 1);
/*  85 */       ItemMeta t4im = this.t1is.getItemMeta();
/*  86 */       t4im.setDisplayName("§fTeam 4");
/*  87 */       this.t4is.setItemMeta(t4im);

/*  84 */       this.t5is = new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1);
/*  85 */       ItemMeta t5im = this.t1is.getItemMeta();
/*  86 */       t5im.setDisplayName("§9Team 5");
/*  87 */       this.t5is.setItemMeta(t5im);

/*  84 */       this.t6is = new ItemStack(Material.YELLOW_CONCRETE, 1);
/*  85 */       ItemMeta t6im = this.t1is.getItemMeta();
/*  86 */       t6im.setDisplayName("§eTeam 6");
/*  87 */       this.t6is.setItemMeta(t6im);

/*  84 */       this.t7is = new ItemStack(Material.LIME_CONCRETE, 1);
/*  85 */       ItemMeta t7im = this.t1is.getItemMeta();
/*  86 */       t7im.setDisplayName("§aTeam 7");
/*  87 */       this.t7is.setItemMeta(t7im);

/*  84 */       this.t8is = new ItemStack(Material.GRAY_CONCRETE, 1);
/*  85 */       ItemMeta t8im = this.t1is.getItemMeta();
/*  86 */       t8im.setDisplayName("§7Team 8");
/*  87 */       this.t8is.setItemMeta(t8im);

/*  84 */       this.t9is = new ItemStack(Material.PURPLE_CONCRETE, 1);
/*  85 */       ItemMeta t9im = this.t1is.getItemMeta();
/*  86 */       t9im.setDisplayName("§5Team 9");
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
				
								
				
				p.getPlayer().openInventory(teamselector);
/*    */ 
/*    */ 
/*    */     
/* 66 */     
/*    */   }
/*    */
return true; }
}


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Start.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */