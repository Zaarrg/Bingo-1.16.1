/*    */ package de.synex.bingo.commands;
/*    */ 
/*    */ import de.synex.bingo.main.Main;

/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class Bingo_top
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
/*    */   
/*    */   public Bingo_top(Main instance) {
/* 20 */     this.main = instance;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 27 */     if (sender instanceof Player) {
/* 28 */       Player p = (Player)sender;
/* 30 */         if (args.length == 0) {
/* 31 */           if (p.getGameMode() == GameMode.SURVIVAL) {
/* 32 */             if (p.getWorld() == Bukkit.getWorld("world")) {
/* 33 */               Location temploc = p.getLocation();
/* 34 */               Block b = p.getWorld().getHighestBlockAt(temploc.getBlockX(), temploc.getBlockZ());
/* 35 */               Location temploc2 = new Location(b.getLocation().getWorld(), b.getLocation().getBlockX(), (b.getLocation().getBlockY() + 1), b.getLocation().getBlockZ());
/* 36 */               p.teleport(temploc2);
/* 37 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).teleportedtop);
/*    */             } else if (p.getWorld() == Bukkit.getWorld("world_nether") || p.getWorld() == Bukkit.getWorld("world_the_end")) {
					   Location topdim = Bukkit.getWorld("world").getSpawnLocation(); 
					   p.teleport(topdim);
					   p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).teleportedworld);
						}
						else {
/* 39 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).mustbingoworld);
/*    */             } 
/*    */           } else {
/* 42 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).nospectatortop);
/*    */           } 
/*    */         } else {
/* 45 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagetop);
/*    */         } 
/*    */     } else {
/* 51 */       sender.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).noconsole);
/*    */     } 
/*    */     
/* 54 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Bingo_top.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */