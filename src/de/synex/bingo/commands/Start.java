/*    */ package de.synex.bingo.commands;
/*    */ 
/*    */ import de.synex.bingo.main.Main;
import net.md_5.bungee.api.ChatColor;

/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ 
/*    */ public class Start
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
/* 16 */   int seconds = 10;
/*    */   public Start(Main pl) {
/* 18 */     this.main = pl;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 24 */     if (sender instanceof Player) {
/* 25 */       Player p = (Player)sender;
/* 26 */       if (args.length == 0) {
/* 27 */         if (p.hasPermission("bingo.start")) {
/* 28 */           if (!Main.GameStarted) {
/* 29 */             Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamewillstart);
/* 30 */             (new BukkitRunnable()
/*    */               {
/*    */                 public void run()
/*    */                 {
/* 34 */                   if (Start.this.seconds != 0) {
/* 35 */                     Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamestartsin.replace("%seconds%", String.valueOf(Start.this.seconds)));
/* 36 */                     for (Player soundplayer : Bukkit.getOnlinePlayers()) {
/* 37 */                       soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3F, 1.0F);
/*    */                     }
/* 39 */                     Start.this.seconds--;
/*    */                   } else {
/* 41 */                     Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamestarts);
/* 42 */                     cancel();
/* 43 */                     Start.this.seconds = 10;
/* 44 */                     Start.this.main.startGame();
/*    */ 
/*    */                   
/*    */                   }
/*    */                 
/*    */                 }
/* 50 */               }).runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
/*    */           } else {
/* 52 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamealreadystarts);
/*    */           } 
/*    */         } else {
/* 55 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.start]");
/*    */         } 
/*    */       } else {
/* 58 */         p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagestart);
/*    */       } 
/*    */     } else {
/* 61 */       sender.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).noconsole);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 66 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Start.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */