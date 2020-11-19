// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import net.md_5.bungee.api.ChatColor;
import java.util.Iterator;
import org.bukkit.Sound;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class Start implements CommandExecutor
{
    Main main;
    int seconds;
    
    public Start(final Main pl) {
        this.seconds = 10;
        this.main = pl;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (args.length == 0) {
                if (p.hasPermission("bingo.start")) {
                    if (!Main.GameStarted) {
                        Bukkit.broadcastMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().gamewillstart);
                        new BukkitRunnable() {
                            public void run() {
                                if (Start.this.seconds != 0) {
                                    Bukkit.broadcastMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().gamestartsin.replace("%seconds%", String.valueOf(Start.this.seconds)));
                                    for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                                        soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                                    }
                                    final Start this$0 = Start.this;
                                    --this$0.seconds;
                                }
                                else {
                                    Bukkit.broadcastMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().gamestarts);
                                    this.cancel();
                                    Start.this.seconds = 10;
                                    Start.this.main.startGame();
                                }
                            }
                        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
                    }
                    else {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().gamealreadystarts);
                    }
                }
                else {
                    p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.start]");
                }
            }
            else {
                p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().usagestart);
            }
        }
        else {
            sender.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().noconsole);
        }
        return true;
    }
}
