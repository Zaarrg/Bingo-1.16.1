/*     */ package de.synex.bingo.util;
/*     */ 
/*     */ import de.synex.bingo.main.Main;
/*     */ import java.io.File;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConfigLink
/*     */ {
/*     */   Main main;
/*  15 */   FileConfiguration language = (FileConfiguration)YamlConfiguration.loadConfiguration(new File("plugins/Bingo", "language.yml"));
/*     */   
/*  17 */   public String prefix = ChatColor.translateAlternateColorCodes('&', this.language.getString("prefix"));
/*  18 */   public String pluginstarted = ChatColor.translateAlternateColorCodes('&', this.language.getString("pluginstarted"));
/*  19 */   public String pluginstopped = ChatColor.translateAlternateColorCodes('&', this.language.getString("pluginstopped"));
/*  20 */   public String kickmsgwinOnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("kickmsgwinOnePlayer"));
/*  21 */   public String kickmsgwinTwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("kickmsgwinTwoPlayer"));
/*  22 */   public String FollowingTeamTeleported = ChatColor.translateAlternateColorCodes('&', this.language.getString("FollowingTeamTeleported"));
/*  23 */   public String T1OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T1OnePlayer"));
/*  24 */   public String T1TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T1TwoPlayer"));
/*  25 */   public String T2OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T2OnePlayer"));
/*  26 */   public String T2TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T2TwoPlayer"));
/*  27 */   public String T3OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T3OnePlayer"));
/*  28 */   public String T3TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T3TwoPlayer"));
/*  27 */   public String T4OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T4OnePlayer"));
/*  28 */   public String T4TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T4TwoPlayer"));
/*  27 */   public String T5OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T5OnePlayer"));
/*  28 */   public String T5TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T5TwoPlayer"));
/*  27 */   public String T6OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T6OnePlayer"));
/*  28 */   public String T6TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T6TwoPlayer"));
/*  27 */   public String T7OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T7OnePlayer"));
/*  28 */   public String T7TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T7TwoPlayer"));
/*  27 */   public String T8OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T8OnePlayer"));
/*  28 */   public String T8TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T8TwoPlayer"));
/*  27 */   public String T9OnePlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T9OnePlayer"));
/*  28 */   public String T9TwoPlayer = ChatColor.translateAlternateColorCodes('&', this.language.getString("T9TwoPlayer"));
/*  29 */   public String BoatName = ChatColor.translateAlternateColorCodes('&', this.language.getString("BoatName"));
/*  30 */   public String StartMessage = ChatColor.translateAlternateColorCodes('&', this.language.getString("StartMessage"));
/*  31 */   public String ActionBar = ChatColor.translateAlternateColorCodes('&', this.language.getString("ActionBar"));
/*  32 */   public String nopermission = ChatColor.translateAlternateColorCodes('&', this.language.getString("nopermission"));
/*  33 */   public String notavailable = ChatColor.translateAlternateColorCodes('&', this.language.getString("notavailable"));
/*  34 */   public String gamewillstart = ChatColor.translateAlternateColorCodes('&', this.language.getString("gamewillstart"));
/*  35 */   public String gamestartsin = ChatColor.translateAlternateColorCodes('&', this.language.getString("gamestartsin"));			
/*  36 */   public String gamestarts = ChatColor.translateAlternateColorCodes('&', this.language.getString("gamestarts"));
/*  37 */   public String gamealreadystarts = ChatColor.translateAlternateColorCodes('&', this.language.getString("gamealreadystarts"));
/*  38 */   public String usagebingopl = ChatColor.translateAlternateColorCodes('&', this.language.getString("usagebingopl"));
/*  39 */   public String noconsole = ChatColor.translateAlternateColorCodes('&', this.language.getString("noconsole"));
/*  40 */   public String usagebingorestart = ChatColor.translateAlternateColorCodes('&', this.language.getString("usagebingorestart"));
/*  41 */   public String teleportedtop = ChatColor.translateAlternateColorCodes('&', this.language.getString("teleportedtop"));
			public String teleportedworld = ChatColor.translateAlternateColorCodes('&', this.language.getString("teleportedworld"));			
/*  42 */   public String mustbingoworld = ChatColor.translateAlternateColorCodes('&', this.language.getString("mustbingoworld"));
/*  43 */   public String nospectatortop = ChatColor.translateAlternateColorCodes('&', this.language.getString("nospectatortop"));
/*  44 */   public String usagetop = ChatColor.translateAlternateColorCodes('&', this.language.getString("usagetop"));
/*  45 */   public String bingoitemsinround = ChatColor.translateAlternateColorCodes('&', this.language.getString("bingoitemsinround"));
/*  46 */   public String teamfounditemTeam1 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam1"));
/*  47 */   public String teamfounditemTeam2 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam2"));
/*  48 */   public String teamfounditemTeam3 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam3"));
/*  48 */   public String teamfounditemTeam4 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam4"));
/*  48 */   public String teamfounditemTeam5 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam5"));
/*  48 */   public String teamfounditemTeam6 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam6"));
/*  48 */   public String teamfounditemTeam7 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam7"));
/*  48 */   public String teamfounditemTeam8 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam8"));
/*  48 */   public String teamfounditemTeam9 = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamfounditemTeam9"));
/*  49 */   public String yourteamfoundfollowingitemsalready = ChatColor.translateAlternateColorCodes('&', this.language.getString("yourteamfoundfollowingitemsalready"));
/*  50 */   public String onlyingamecommand = ChatColor.translateAlternateColorCodes('&', this.language.getString("onlyingamecommand"));
/*  51 */   public String usagebingo = ChatColor.translateAlternateColorCodes('&', this.language.getString("usagebingo"));
/*  52 */   public String usagebrestart = ChatColor.translateAlternateColorCodes('&', this.language.getString("usagebrestart"));
/*  53 */   public String teamselectorInventoryTitle = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamselectorInventoryTitle"));
/*  54 */   public String teamselection = ChatColor.translateAlternateColorCodes('&', this.language.getString("teamselection"));
/*  55 */   public String tablistheaderingame = ChatColor.translateAlternateColorCodes('&', this.language.getString("tablistheaderingame"));
/*  56 */   public String tablistheaderlobby = ChatColor.translateAlternateColorCodes('&', this.language.getString("tablistheaderlobby"));
/*  57 */   public String tablistfooter = ChatColor.translateAlternateColorCodes('&', this.language.getString("tablistfooter"));
/*  58 */   public String spectatorjoined = ChatColor.translateAlternateColorCodes('&', this.language.getString("spectatorjoined"));
/*  59 */   public String lobbyisfullkick = ChatColor.translateAlternateColorCodes('&', this.language.getString("lobbyisfullkick"));
/*  60 */   public String playerjoined = ChatColor.translateAlternateColorCodes('&', this.language.getString("playerjoined"));
/*  61 */   public String roundisrestartingkick = ChatColor.translateAlternateColorCodes('&', this.language.getString("roundisrestartingkick"));
/*  62 */   public String jointeam1 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam1"));
/*  63 */   public String alreadyteam1 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam1"));
/*  64 */   public String team1full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team1full"));
/*  65 */   public String jointeam2 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam2"));
/*  66 */   public String alreadyteam2 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam2"));
/*  67 */   public String team2full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team2full"));
/*  68 */   public String jointeam3 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam3"));
/*  69 */   public String alreadyteam3 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam3"));
/*  70 */   public String team3full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team3full"));
/*  68 */   public String jointeam4 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam4"));
/*  69 */   public String alreadyteam4 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam4"));
/*  70 */   public String team4full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team4full"));
/*  68 */   public String jointeam5 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam5"));
/*  69 */   public String alreadyteam5 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam5"));
/*  70 */   public String team5full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team5full"));
/*  68 */   public String jointeam6 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam6"));
/*  69 */   public String alreadyteam6 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam6"));
/*  70 */   public String team6full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team6full"));
/*  68 */   public String jointeam7 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam7"));
/*  69 */   public String alreadyteam7 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam7"));
/*  70 */   public String team7full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team7full"));
/*  68 */   public String jointeam8 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam8"));
/*  69 */   public String alreadyteam8 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam8"));
/*  70 */   public String team8full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team8full"));
/*  68 */   public String jointeam9 = ChatColor.translateAlternateColorCodes('&', this.language.getString("jointeam9"));
/*  69 */   public String alreadyteam9 = ChatColor.translateAlternateColorCodes('&', this.language.getString("alreadyteam9"));
/*  70 */   public String team9full = ChatColor.translateAlternateColorCodes('&', this.language.getString("team9full"));
/*  71 */   public String TablistTeam1Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam1Colour"));
/*  72 */   public String TablistTeam2Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam2Colour"));
/*  73 */   public String TablistTeam3Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam3Colour"));
/*  73 */   public String TablistTeam4Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam4Colour"));
/*  73 */   public String TablistTeam5Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam5Colour"));
/*  73 */   public String TablistTeam6Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam6Colour"));
/*  73 */   public String TablistTeam7Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam7Colour"));
/*  73 */   public String TablistTeam8Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam8Colour"));
/*  73 */   public String TablistTeam9Colour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistTeam9Colour"));
/*  74 */   public String TablistDefaultUserColour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TablistDefaultUserColour"));
/*  75 */   public String TablistGamemasterColour = ChatColor.translateAlternateColorCodes('&', this.language.getString("TeablistGamemasterColour"));
/*  80 */   public String deathmessage = ChatColor.translateAlternateColorCodes('&', this.language.getString("deathmessage"));
/*  81 */   public String leftserveringame = ChatColor.translateAlternateColorCodes('&', this.language.getString("leftserveringame"));
/*  82 */   public String leftserveringamespectator = ChatColor.translateAlternateColorCodes('&', this.language.getString("leftserveringamespectator"));
/*  83 */   public String leftserverlobby = ChatColor.translateAlternateColorCodes('&', this.language.getString("leftserverlobby"));
/*  84 */   public String gameisrestarting = ChatColor.translateAlternateColorCodes('&', this.language.getString("gameisrestarting"));
/*  85 */   public String chatformatTeam1 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam1"));
/*  86 */   public String chatformatTeam2 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam2"));
/*  87 */   public String chatformatTeam3 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam3"));
/*  87 */   public String chatformatTeam4 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam4"));
/*  87 */   public String chatformatTeam5 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam5"));
/*  87 */   public String chatformatTeam6 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam6"));
/*  87 */   public String chatformatTeam7 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam7"));
/*  87 */   public String chatformatTeam8 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam8"));
/*  87 */   public String chatformatTeam9 = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatTeam9"));
/*  88 */   public String chatformatwithoutteam = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatformatwithoutteam"));
/*  89 */   public String chatcolourDefaultUser = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatcolourDefaultUser"));
/*  90 */   public String chatcolourGamemaster = ChatColor.translateAlternateColorCodes('&', this.language.getString("chatcolourGamemaster"));
/*  91 */   public String scoreboardTitle = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTitle"));
/*  92 */   public String scoreboardYourTeam = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardYourTeam"));
/*  93 */   public String scoreboardTeam1 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam1"));
/*  94 */   public String scoreboardTeam2 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam2"));
/*  95 */   public String scoreboardTeam3 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam3"));
/*  95 */   public String scoreboardTeam4 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam4"));
/*  95 */   public String scoreboardTeam5 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam5"));
/*  95 */   public String scoreboardTeam6 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam6"));
/*  95 */   public String scoreboardTeam7 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam7"));
/*  95 */   public String scoreboardTeam8 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam8"));
/*  95 */   public String scoreboardTeam9 = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardTeam9"));
/*  96 */   public String scoreboardNoTeam = ChatColor.translateAlternateColorCodes('&', this.language.getString("scoreboardNoTeam"));
/*  97 */   public String usagestart = ChatColor.translateAlternateColorCodes('&', this.language.getString("usagestart"));
/*     */ 
/*     */   
/*     */   public ConfigLink(Main pl) {
/* 101 */     this.main = pl;
/*     */   }
/*     */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bing\\util\ConfigLink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */