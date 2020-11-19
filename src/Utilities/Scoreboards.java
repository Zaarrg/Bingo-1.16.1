package Utilities;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import de.synex.bingo.main.Main;

public class Scoreboards {

	Main main;
	
	/*     */   public static void setLobbyScoreboardWithTeam(Player p) {
		/* 814 */     Scoreboard lobbyboard = Bukkit.getScoreboardManager().getNewScoreboard();  //Neues Scoreboard erstellen
		/* 815 */     Objective obj = lobbyboard.registerNewObjective("bingo", "dummy", (Main.getCL()).scoreboardTitle); // Titel des Scoreboards Setzten (Objective)
		/* 816 */     obj.setDisplaySlot(DisplaySlot.SIDEBAR); //Position des Scoreboards setzen (Sidebard)
		/*     */     
		/* 818 */     Score placeholder2 = obj.getScore(ChatColor.GREEN + " " + ChatColor.WHITE); // Eine Leere Zeile nach dem Titel
		/* 819 */     placeholder2.setScore(45); // Leere Zeile setzen and der Position 45 (Sind diese Roten Nummern)
		/* 820 */     
		/*     */     
		/* 822 */     Score yourTeam = obj.getScore((Main.getCL()).scoreboardYourTeam); // Zeile "Dein Team:" Setzen
		/* 823 */     yourTeam.setScore(44);

		/* 818 */     Score placeholder3 = obj.getScore(ChatColor.GRAY + " " + ChatColor.WHITE); // Leere Zeile
		/* 819 */     placeholder3.setScore(43);
					 

		/* 47 */       






					 

		/*     */     
		/* 829 */     if (Main.t1.contains(p)) { // Wenn team1 Spieler hat, Main.t1 ist eine Arraylist von Spielern des Teams, sobald eine Spieler Team1 auswählt wird er dieser Liste hinzugefügt

						
		/* 830 */       Team team = lobbyboard.registerNewTeam("team"); //Ein Team registrieren sodass dieses Scoreboard individuell ist für dieses Team, das Team kann auch 1 Spieler sein, alles davor vom Scoreboard ist für alle Sichtbar
		/* 831 */       team.addEntry(ChatColor.AQUA + " " + ChatColor.WHITE); //Mit addEntry Fügst du Spiler dem Team hinzu z.b addEntry(Player)
		/* 832 */       team.setPrefix((Main.getCL()).scoreboardTeam1); // Team Namen setzen ("Dein Team: Team 1")
		/* 833 */       obj.getScore(ChatColor.AQUA + " " + ChatColor.WHITE).setScore(44); //Das ganze bei Position 44 Setzen, bei position 44 ist auch "Dein Team:"


						if (Main.GameStarted == true) { //Überprüfen ob das Game Gestartet ist, wichtige für das Updaten den solange Main.Gamestared False ist wird dieser Teil nicht zum Scoreboard geadded
											
											String ItemOne = Main.b1.getType().name(); //Namen der Items welche bei Bingo ausgelost worden sind
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();				

							//Im Scoreboard die Ganzen Item Namen Hinzufügen von Position 42 runter bis 34
							//Main.ColorGrayb1t1 ist die Farbe Grau welches ne public static ist.
							//Sobald Team1 Item1 findet wird die Farbe Main.ColorGrayb1t1 = Grau auf Main.ColorGrayb1t1 = Grün gesetzt
							//Wenn dann das Scoreboard geupdated wird ist diese Zeile dann Grün, bzw als gefunden markiert
						obj.getScore(Main.ColorGrayb1t1 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t1 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t1 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t1 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t1 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t1 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t1 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t1 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t1 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
						
						}
						
						
		/* 834 */     } else if (Main.t2.contains(p)) { //Das gleiche fürs Team 2 usw.
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" +ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam2);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t2 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t2 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t2 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t2 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t2 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t2 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t2 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t2 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t2 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/* 839 */     } else if (Main.t3.contains(p)) {
		/* 840 */       Team team = lobbyboard.registerNewTeam("team");
		/* 841 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 842 */       team.setPrefix((Main.getCL()).scoreboardTeam3);
		/* 843 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t3 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t3 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t3 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t3 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t3 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t3 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t3 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t3 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t3 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/*     */     } else if (Main.t4.contains(p)) {
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam4);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t4 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t4 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t4 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t4 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t4 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t4 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t4 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t4 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t4 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/* 839 */     } else if (Main.t5.contains(p)) {
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam5);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t5 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t5 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t5 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t5 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t5 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t5 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t5 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t5 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t5 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/* 839 */     } else if (Main.t6.contains(p)) {
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam6);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t6 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t6 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t6 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t6 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t6 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t6 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t6 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t6 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t6 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/* 839 */     } else if (Main.t7.contains(p)) {
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam7);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t7 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t7 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t7 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t7 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t7 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t7 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t7 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t7 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t7 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/* 839 */     } else if (Main.t8.contains(p)) {
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam8);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t8 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t8 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t8 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t8 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t8 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t8 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t8 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t8 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t8 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}


		/* 839 */     } else if (Main.t9.contains(p)) {
		/* 835 */       Team team = lobbyboard.registerNewTeam("team");
		/* 836 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 837 */       team.setPrefix((Main.getCL()).scoreboardTeam9);
		/* 838 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);

						if (Main.GameStarted == true) {
							
							String ItemOne = Main.b1.getType().name();
							/* 48 */        String ItemTwo = Main.b2.getType().name();
							/* 48 */        String ItemThree = Main.b3.getType().name();
							/* 48 */        String ItemFour = Main.b4.getType().name();
							/* 48 */        String ItemFive = Main.b5.getType().name();
							/* 48 */        String ItemSix = Main.b6.getType().name();
							/* 48 */        String ItemSeven = Main.b7.getType().name();
							/* 48 */        String ItemEight = Main.b8.getType().name();
							/* 48 */        String ItemNight = Main.b9.getType().name();

						obj.getScore(Main.ColorGrayb1t9 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
						obj.getScore(Main.ColorGrayb2t9 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
						obj.getScore(Main.ColorGrayb3t9 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
						obj.getScore(Main.ColorGrayb4t9 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
						obj.getScore(Main.ColorGrayb5t9 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
						obj.getScore(Main.ColorGrayb6t9 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
						obj.getScore(Main.ColorGrayb7t9 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
						obj.getScore(Main.ColorGrayb8t9 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
						obj.getScore(Main.ColorGrayb9t9 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);

						}

		/* 839 */     } else {
		/* 845 */       Team team = lobbyboard.registerNewTeam("team");
		/* 846 */       team.addEntry(ChatColor.AQUA + "" + ChatColor.WHITE);
		/* 847 */       team.setPrefix((Main.getCL()).scoreboardNoTeam);
		/* 848 */       obj.getScore(ChatColor.AQUA + "" + ChatColor.WHITE).setScore(44);


		/*     */     } 
		/*     */     
		/* 909 */     p.setScoreboard(lobbyboard);
		/*     */   }
	
}
