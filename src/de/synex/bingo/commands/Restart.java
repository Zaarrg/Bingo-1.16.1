// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class Restart implements CommandExecutor
{
    Main main;
    
    public Restart(final Main pl) {
        this.main = pl;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (args.length == 0) {
                if (p.hasPermission("bingo.restart")) {
                    p.performCommand("bingoreset");
                }
                else {
                    p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.restart]");
                }
            }
            else {
                p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().usagebrestart);
            }
        }
        else {
            sender.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().noconsole);
        }
        return true;
    }
}
