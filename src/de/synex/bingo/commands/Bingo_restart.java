// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import net.md_5.bungee.api.ChatColor;
import java.io.IOException;
import de.synex.bingo.util.Config;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class Bingo_restart implements CommandExecutor
{
    Main main;
    
    public Bingo_restart(final Main instance) {
        this.main = instance;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (p.hasPermission("bingo.restart")) {
                if (args.length == 0) {
                    this.main.isRestarting = true;
                    Main.GameStarted = false;
                    this.main.LobbyStatus = true;
                    Config.getConfig().set("reset.isReset", (Object)true);
                    try {
                        Config.getConfig().save(Config.getFile());
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    this.main.manuallyRestarting();
                }
                else {
                    p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().usagebingorestart);
                }
            }
            else {
                p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.restart]");
            }
        }
        else {
            sender.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().noconsole);
        }
        return true;
    }
}
