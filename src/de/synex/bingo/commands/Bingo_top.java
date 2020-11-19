// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import org.bukkit.block.Block;
import org.bukkit.Location;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class Bingo_top implements CommandExecutor
{
    Main main;
    
    public Bingo_top(final Main instance) {
        this.main = instance;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (args.length == 0) {
                if (p.getGameMode() == GameMode.SURVIVAL) {
                    if (p.getWorld() == Bukkit.getWorld("world")) {
                        final Location temploc = p.getLocation();
                        final Block b = p.getWorld().getHighestBlockAt(temploc.getBlockX(), temploc.getBlockZ());
                        final Location temploc2 = new Location(b.getLocation().getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY() + 1), (double)b.getLocation().getBlockZ());
                        p.teleport(temploc2);
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().teleportedtop);
                    }
                    else if (p.getWorld() == Bukkit.getWorld("world_nether") || p.getWorld() == Bukkit.getWorld("world_the_end")) {
                        final Location topdim = Bukkit.getWorld("world").getSpawnLocation();
                        p.teleport(topdim);
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().teleportedworld);
                    }
                    else {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().mustbingoworld);
                    }
                }
                else {
                    p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().nospectatortop);
                }
            }
            else {
                p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().usagetop);
            }
        }
        else {
            sender.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().noconsole);
        }
        return true;
    }
}
