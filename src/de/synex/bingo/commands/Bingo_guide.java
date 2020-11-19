/*    */ package de.synex.bingo.commands;
/*    */ 
/*    */ import de.synex.bingo.main.Main;
/*    */ import de.synex.bingo.util.ConfigLink;
import net.md_5.bungee.api.ChatColor;

/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ 
/*    */ 
/*    */ public class Bingo_guide
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
/*    */   ConfigLink cl;
/* 19 */   int seconds = 10;
/*    */   
/*    */   public Bingo_guide(Main instance) {
/* 22 */     this.main = instance;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 27 */     if (sender instanceof Player) {
/* 28 */       Player p = (Player)sender;
/* 29 */       if (p.hasPermission("bingo.defaultcmd")) {
/* 30 */         if (args.length == 0) {
/* 31 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).notavailable);
/* 32 */         } else if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
/* 33 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).notavailable);
/* 34 */         } else if (args.length == 1 && args[0].equalsIgnoreCase("prefixdebug")) {
/*    */           
/* 36 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).notavailable);
/* 37 */         } else if (args.length == 1 && args[0].equalsIgnoreCase("status")) {
/* 38 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).notavailable);
/* 39 */         } else if (args.length == 1 && args[0].equalsIgnoreCase("start")) {
/* 40 */           if (p.hasPermission("bingo.start")) {
/* 41 */             if (!Main.GameStarted) {
/* 42 */               Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamewillstart);
/* 43 */               (new BukkitRunnable()
/*    */                 {
/*    */                   public void run()
/*    */                   {
/* 47 */                     if (Bingo_guide.this.seconds != 0) {
/* 48 */                       Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamestartsin.replace("%seconds%", String.valueOf(Bingo_guide.this.seconds)));
/* 49 */                       for (Player soundplayer : Bukkit.getOnlinePlayers()) {
/* 50 */                         soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3F, 1.0F);
/*    */                       }
/* 52 */                       Bingo_guide.this.seconds--;
/*    */                     } else {
/* 54 */                       Bukkit.broadcastMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamestarts);
/* 55 */                       cancel();
/* 56 */                       Bingo_guide.this.seconds = 10;
/* 57 */                       Bingo_guide.this.main.startGame();
/*    */ 
/*    */                     
/*    */                     }
/*    */                   
/*    */                   }
/* 63 */                 }).runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
/*    */             } else {
/* 65 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).gamealreadystarts);
/*    */             } 
/*    */           } else {
/* 68 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.start]");
/*    */           } 
/*    */         } else {
/* 71 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagebingopl);
/*    */         } 
/*    */       } else {
/* 74 */         p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.defautlcmd]");
/*    */       } 
/*    */     } else {
/* 77 */       sender.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).noconsole);
/*    */     } 
/*    */     
/* 80 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Bingo_guide.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */