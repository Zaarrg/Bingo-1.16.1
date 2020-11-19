// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.util;

import org.bukkit.scoreboard.Team;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import de.synex.bingo.main.Main;

public class Sideboard {
    Main main;

    public Sideboard(final Main pl) {
        this.main = pl;
    }

    public void setLobbyScoreboard(final Player p) {
        final Scoreboard lobbyboard = Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective obj = lobbyboard.registerNewObjective("§2Bingo!", "dummy", "§2Bingo! - Lobby");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        final Score yourTeam = obj.getScore("§aDein Team:");
        yourTeam.setScore(2);
        final Team team = lobbyboard.registerNewTeam("team");
        team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
        team.setPrefix("§cDu bist in keinem Team");
        obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(2);
        p.setScoreboard(lobbyboard);
    }
}
