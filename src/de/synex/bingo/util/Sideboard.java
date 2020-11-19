/*    */ package de.synex.bingo.util;
/*    */ 
/*    */ import de.synex.bingo.main.Main;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scoreboard.DisplaySlot;
/*    */ import org.bukkit.scoreboard.Objective;
/*    */ import org.bukkit.scoreboard.Score;
/*    */ import org.bukkit.scoreboard.Scoreboard;
/*    */ import org.bukkit.scoreboard.Team;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Sideboard
/*    */ {
/*    */   Main main;
/*    */   
/*    */   public Sideboard(Main pl) {
/* 21 */     this.main = pl;
/*    */   }
/*    */   
/*    */   public void setLobbyScoreboard(Player p) {
/* 25 */     Scoreboard lobbyboard = Bukkit.getScoreboardManager().getNewScoreboard();
/* 26 */     Objective obj = lobbyboard.registerNewObjective("§2Bingo!", "dummy", "§2Bingo! - Lobby");
/* 27 */     obj.setDisplaySlot(DisplaySlot.SIDEBAR);
/* 28 */     Score yourTeam = obj.getScore("§aDein Team:");
/* 29 */     yourTeam.setScore(2);	     

/* 30 */     Team team = lobbyboard.registerNewTeam("team");
/* 31 */     team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
/* 32 */     team.setPrefix("§cDu bist in keinem Team");
/* 33 */     obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(2);
/* 34 */     p.setScoreboard(lobbyboard);
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bing\\util\Sideboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */