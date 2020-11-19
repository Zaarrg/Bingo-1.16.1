/*    */ package de.synex.bingo.commands;
/*    */ 
/*    */ import de.synex.bingo.main.Main;
import net.md_5.bungee.api.ChatColor;

/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Restart
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
/*    */   
/*    */   public Restart(Main pl) {
/* 15 */     this.main = pl;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 21 */     if (sender instanceof Player) {
/* 22 */       Player p = (Player)sender;
/* 23 */       if (args.length == 0) {
/* 24 */         if (p.hasPermission("bingo.restart")) {
/* 25 */           p.performCommand("bingoreset");
/*    */         } else {
/* 27 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.restart]");
/*    */         } 
/*    */       } else {
/* 30 */         p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagebrestart);
/*    */       } 
/*    */     } else {
/* 33 */       sender.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).noconsole);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 38 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Restart.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */