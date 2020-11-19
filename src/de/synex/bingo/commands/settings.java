// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import org.bukkit.inventory.meta.ItemMeta;
import net.md_5.bungee.api.ChatColor;
import java.util.List;
import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import de.synex.bingo.listeners.Listeners;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class settings implements CommandExecutor
{
    Main main;
    Listeners L;
    ItemStack setings;
    ItemStack Game;
    ItemStack ComingSoon;
    ItemStack t2is;
    ItemStack t3is;
    ItemStack t4is;
    ItemStack t5is;
    ItemStack t6is;
    ItemStack t7is;
    ItemStack t8is;
    ItemStack t9is;
    ItemStack ph;
    public static Inventory settings;
    
    static {
        de.synex.bingo.commands.settings.settings = Bukkit.createInventory((InventoryHolder)null, 27, "§2Einstellungen");
    }
    
    public settings(final Main pl) {
        this.main = pl;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (p.hasPermission("bingo.settings")) {
                this.setings = new ItemStack(Material.DRAGON_EGG, 1);
                final ItemMeta t1im = this.setings.getItemMeta();
                t1im.setDisplayName("§4Difficulties");
                final ArrayList<String> lore = new ArrayList<String>();
                lore.add("§7- §6Stelle die Schwierigkeit ein!");
                t1im.setLore((List)lore);
                this.setings.setItemMeta(t1im);
                this.Game = new ItemStack(Material.COMMAND_BLOCK, 1);
                final ItemMeta game = this.Game.getItemMeta();
                game.setDisplayName("§aGame Settings");
                final ArrayList<String> lore2 = new ArrayList<String>();
                lore2.add("§7- §2Settings for the Game");
                lore2.add("§7- §2Reset");
                lore2.add("§7- §2Timer");
                lore2.add("§7- §2SpawnArea");
                game.setLore((List)lore2);
                this.Game.setItemMeta(game);
                this.ComingSoon = new ItemStack(Material.RED_BANNER, 1);
                final ItemMeta team = this.ComingSoon.getItemMeta();
                team.setDisplayName("§aTeam Settings");
                final ArrayList<String> lore3 = new ArrayList<String>();
                lore3.add("§7- §2Settings for Teams");
                lore3.add("§7- §2Teamsize");
                team.setLore((List)lore3);
                this.ComingSoon.setItemMeta(team);
                this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
                final ItemMeta phim = this.ph.getItemMeta();
                phim.setDisplayName(" ");
                this.ph.setItemMeta(phim);
                for (int i = 0; i < de.synex.bingo.commands.settings.settings.getSize(); ++i) {
                    if (de.synex.bingo.commands.settings.settings.getItem(i) == null || de.synex.bingo.commands.settings.settings.getItem(i).getType().equals((Object)Material.AIR)) {
                        de.synex.bingo.commands.settings.settings.setItem(i, this.ph);
                    }
                }
                de.synex.bingo.commands.settings.settings.setItem(9, this.Game);
                de.synex.bingo.commands.settings.settings.setItem(13, this.ComingSoon);
                de.synex.bingo.commands.settings.settings.setItem(17, this.setings);
                p.getPlayer().openInventory(de.synex.bingo.commands.settings.settings);
            }
            else {
                p.sendMessage(String.valueOf(String.valueOf(Main.getCL().prefix)) + " " + Main.getCL().nopermission + " " + ChatColor.DARK_PURPLE + "[bingo.settings]");
            }
        }
        return true;
    }
}
