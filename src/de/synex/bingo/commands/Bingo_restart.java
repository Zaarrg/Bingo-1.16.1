/*    */ package de.synex.bingo.commands;
/*    */ 
/*    */ import de.synex.bingo.main.Main;
		 import de.synex.bingo.util.Config;
import net.md_5.bungee.api.ChatColor;

import java.io.IOException;

/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Bingo_restart
/*    */   implements CommandExecutor {
/*    */   Main main;
/*    */   
/*    */   public Bingo_restart(Main instance) {
/* 14 */     this.main = instance;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 20 */     if (sender instanceof Player) {
/* 21 */       Player p = (Player)sender;
/* 22 */       if (p.hasPermission("bingo.restart")) {
/* 23 */         if (args.length == 0) {
/* 24 */           this.main.isRestarting = true;
/* 25 */           Main.GameStarted = false;
/* 26 */           this.main.LobbyStatus = true;

				Config.getConfig().set("reset.isReset", true);
				try {
				Config.getConfig().save(Config.getFile());
				} catch (IOException e) {
					e.printStackTrace();
				}
/*    */           
/* 28 */           this.main.manuallyRestarting();
/*    */         } else {
/* 30 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagebingorestart);
/*    */         } 
/*    */       } else {
				 p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.restart]");
/* 33 */      
/*    */       } 
/*    */     } else {
/* 36 */       sender.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).noconsole);
/*    */     } 
/*    */     
/* 39 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Bingo_restart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */