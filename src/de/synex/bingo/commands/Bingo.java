// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import java.util.Iterator;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class Bingo implements CommandExecutor
{
    Main main;
    
    public Bingo(final Main m) {
        this.main = m;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (sender instanceof Player) {
            if (args.length == 0) {
                if (Main.GameStarted) {
                    final Inventory bingo = Bukkit.createInventory((InventoryHolder)null, 9, Main.getCL().bingoitemsinround);
                    if (!this.main.randomized) {
                        this.main.getRandomItems();
                    }
                    bingo.setItem(0, Main.b1);
                    bingo.setItem(1, Main.b2);
                    bingo.setItem(2, Main.b3);
                    bingo.setItem(3, Main.b4);
                    bingo.setItem(4, Main.b5);
                    bingo.setItem(5, Main.b6);
                    bingo.setItem(6, Main.b7);
                    bingo.setItem(7, Main.b8);
                    bingo.setItem(8, Main.b9);
                    p.openInventory(bingo);
                    if (Main.t1.contains(p)) {
                        if (!this.main.foundItemsT1.isEmpty()) {
                            p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                            for (final ItemStack founditems : this.main.foundItemsT1) {
                                p.sendMessage("§2[Bingo] §e" + founditems.getType());
                            }
                        }
                    }
                    else if (Main.t2.contains(p)) {
                        if (!this.main.foundItemsT2.isEmpty()) {
                            p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                            for (final ItemStack founditems : this.main.foundItemsT2) {
                                p.sendMessage("§2[Bingo] §e" + founditems.getType());
                            }
                        }
                    }
                    else if (Main.t3.contains(p) && !this.main.foundItemsT3.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems : this.main.foundItemsT3) {
                            p.sendMessage("§2[Bingo] §e" + founditems.getType());
                        }
                    }
                }
                else if (Main.t4.contains(p)) {
                    if (!this.main.foundItemsT4.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems2 : this.main.foundItemsT4) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (Main.t5.contains(p)) {
                    if (!this.main.foundItemsT5.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems2 : this.main.foundItemsT5) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (Main.t6.contains(p)) {
                    if (!this.main.foundItemsT6.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems2 : this.main.foundItemsT6) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (Main.t7.contains(p)) {
                    if (!this.main.foundItemsT7.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems2 : this.main.foundItemsT7) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (Main.t8.contains(p)) {
                    if (!this.main.foundItemsT8.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems2 : this.main.foundItemsT8) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (Main.t9.contains(p)) {
                    if (!this.main.foundItemsT9.isEmpty()) {
                        p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().yourteamfoundfollowingitemsalready);
                        for (final ItemStack founditems2 : this.main.foundItemsT9) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else {
                    p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().onlyingamecommand);
                }
            }
            else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("start")) {
                    p.performCommand("bingopl start");
                }
                else if (args[0].equalsIgnoreCase("restart")) {
                    p.performCommand("bingoreset");
                }
                else {
                    p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().usagebingo);
                }
            }
            else {
                p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().usagebingo);
            }
        }
        else {
            p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().noconsole);
        }
        return true;
    }
}
