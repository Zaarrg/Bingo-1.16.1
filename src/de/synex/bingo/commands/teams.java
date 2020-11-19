// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.commands;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import de.synex.bingo.listeners.Listeners;
import de.synex.bingo.main.Main;
import org.bukkit.command.CommandExecutor;

public class teams implements CommandExecutor
{
    Main main;
    Listeners L;
    ItemStack t1is;
    ItemStack t2is;
    ItemStack t3is;
    ItemStack t4is;
    ItemStack t5is;
    ItemStack t6is;
    ItemStack t7is;
    ItemStack t8is;
    ItemStack t9is;
    ItemStack ph;
    
    public teams(final Main pl) {
        this.main = pl;
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            this.t1is = new ItemStack(Material.ORANGE_CONCRETE, 1);
            final ItemMeta t1im = this.t1is.getItemMeta();
            t1im.setDisplayName("§6Team 1");
            this.t1is.setItemMeta(t1im);
            this.t2is = new ItemStack(Material.RED_CONCRETE, 1);
            final ItemMeta t2im = this.t1is.getItemMeta();
            t2im.setDisplayName("§cTeam 2");
            this.t2is.setItemMeta(t2im);
            this.t3is = new ItemStack(Material.PINK_CONCRETE, 1);
            final ItemMeta t3im = this.t1is.getItemMeta();
            t3im.setDisplayName("§dTeam 3");
            this.t3is.setItemMeta(t3im);
            this.t4is = new ItemStack(Material.WHITE_CONCRETE, 1);
            final ItemMeta t4im = this.t1is.getItemMeta();
            t4im.setDisplayName("§fTeam 4");
            this.t4is.setItemMeta(t4im);
            this.t5is = new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1);
            final ItemMeta t5im = this.t1is.getItemMeta();
            t5im.setDisplayName("§9Team 5");
            this.t5is.setItemMeta(t5im);
            this.t6is = new ItemStack(Material.YELLOW_CONCRETE, 1);
            final ItemMeta t6im = this.t1is.getItemMeta();
            t6im.setDisplayName("§eTeam 6");
            this.t6is.setItemMeta(t6im);
            this.t7is = new ItemStack(Material.LIME_CONCRETE, 1);
            final ItemMeta t7im = this.t1is.getItemMeta();
            t7im.setDisplayName("§aTeam 7");
            this.t7is.setItemMeta(t7im);
            this.t8is = new ItemStack(Material.GRAY_CONCRETE, 1);
            final ItemMeta t8im = this.t1is.getItemMeta();
            t8im.setDisplayName("§7Team 8");
            this.t8is.setItemMeta(t8im);
            this.t9is = new ItemStack(Material.PURPLE_CONCRETE, 1);
            final ItemMeta t9im = this.t1is.getItemMeta();
            t9im.setDisplayName("§5Team 9");
            this.t9is.setItemMeta(t9im);
            final Inventory teamselector = Bukkit.createInventory((InventoryHolder)null, 9, Main.getCL().teamselectorInventoryTitle);
            this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim = this.ph.getItemMeta();
            phim.setDisplayName(" ");
            this.ph.setItemMeta(phim);
            teamselector.setItem(0, this.t1is);
            teamselector.setItem(1, this.t2is);
            teamselector.setItem(2, this.t3is);
            teamselector.setItem(3, this.t4is);
            teamselector.setItem(4, this.t5is);
            teamselector.setItem(5, this.t6is);
            teamselector.setItem(6, this.t7is);
            teamselector.setItem(7, this.t8is);
            teamselector.setItem(8, this.t9is);
            p.getPlayer().openInventory(teamselector);
        }
        return true;
    }
}
