// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.listeners;

import Utilities.RandomEnchantment;
import Utilities.Scoreboards;
import de.synex.bingo.commands.settings;
import de.synex.bingo.main.Main;
import de.synex.bingo.util.Sideboard;
import io.netty.util.internal.ThreadLocalRandom;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.*;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.*;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;

public class Listeners implements Listener {
    public static double i;
    public static Inventory gameset;

    static {
        Listeners.i = 0.05;
        Listeners.gameset = Bukkit.createInventory(null, 45, "§2Game Settings");
    }

    Main main;
    Sideboard sboard;
    ItemStack t1is;
    ItemStack t2is;
    ItemStack t3is;
    ItemStack t4is;
    ItemStack t5is;
    ItemStack t6is;
    ItemStack t7is;
    ItemStack t8is;
    ItemStack t9is;
    ItemStack s1;
    ItemStack s2;
    ItemStack s3;
    ItemStack s4;
    ItemStack s5;
    ItemStack s6;
    ItemStack s7;
    ItemStack s8;
    ItemStack s9;
    ItemStack s10;
    ItemStack s11;
    ItemStack s12;
    ItemStack s13;
    ItemStack s14;
    ItemStack s15;
    ItemStack s16;
    ItemStack s17;
    ItemStack s18;
    ItemStack f1;
    ItemStack f2;
    ItemStack g1;
    ItemStack g2;
    ItemStack g3;
    ItemStack g4;
    ItemStack b1;
    ItemStack b2;
    ItemStack ph;
    ItemStack p1;
    ItemStack p2;
    ItemStack p3;
    ItemStack back;
    ArrayList<Player> livingplayer;
    int seconds;

    public Listeners(final Main instance) {
        this.livingplayer = new ArrayList<Player>();
        this.seconds = 10;
        this.main = instance;
    }

    public Listeners(final Sideboard sb) {
        this.livingplayer = new ArrayList<Player>();
        this.seconds = 10;
        this.sboard = sb;
    }

    @EventHandler
    public void onInteract(final PlayerInteractEvent e) {
        if (this.main.LobbyStatus) {
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
            final Inventory teamselector = Bukkit.createInventory(null, 9, Main.getCL().teamselectorInventoryTitle);
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
            if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.NETHER_STAR)) {
                if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains(Main.getCL().teamselection)) {
                    e.getPlayer().openInventory(teamselector);
                } else if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains(Main.getCL().teamselection)) {
                    e.setCancelled(true);
                }
            }
        }
        if (e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
        e.getPlayer().setPlayerListFooter(Main.getCL().tablistfooter);
        if (Main.t1.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam1Colour) + e.getPlayer().getName());
        } else if (Main.t2.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam2Colour) + e.getPlayer().getName());
        } else if (Main.t3.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam3Colour) + e.getPlayer().getName());
        } else if (Main.t4.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam4Colour) + e.getPlayer().getName());
        } else if (Main.t5.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam5Colour) + e.getPlayer().getName());
        } else if (Main.t6.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam6Colour) + e.getPlayer().getName());
        } else if (Main.t7.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam7Colour) + e.getPlayer().getName());
        } else if (Main.t8.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam8Colour) + e.getPlayer().getName());
        } else if (Main.t9.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam9Colour) + e.getPlayer().getName());
        } else if (e.getPlayer().hasPermission("bingo.gamemaster")) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistGamemasterColour) + e.getPlayer().getName());
        } else {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistDefaultUserColour) + e.getPlayer().getName());
        }
        if (!this.main.isRestarting) {
            if (Main.GameStarted) {
                e.getPlayer().setPlayerListHeader(Main.getCL().tablistheaderingame);
                final Location specloc = Bukkit.getWorld("world").getSpawnLocation();
                e.getPlayer().teleport(specloc);
                e.getPlayer().setAllowFlight(false);
                e.getPlayer().setFlying(false);
                e.getPlayer().setInvulnerable(false);
                e.getPlayer().setCollidable(true);
                e.getPlayer().setHealth(20.0);
                e.getPlayer().setFoodLevel(20);
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
                Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
                if (e.getPlayer().getGameMode() == GameMode.SPECTATOR) {
                    e.setJoinMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().spectatorjoined.replace("%player%", e.getPlayer().getName()));
                } else {
                    e.setJoinMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().playerjoined.replace("%player%", e.getPlayer().getName()));
                }
            } else {
                e.getPlayer().getInventory().clear();
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
                e.getPlayer().setHealth(20.0);
                e.getPlayer().setFoodLevel(20);
                e.getPlayer().setPlayerListHeader(Main.getCL().tablistheaderlobby);
                final Location startloc = Bukkit.getWorld("world").getSpawnLocation();
                e.getPlayer().teleport(startloc);
                if (Bukkit.getServer().getOnlinePlayers().size() >= 19) {
                    e.setJoinMessage(null);
                    e.getPlayer().kickPlayer(Main.getCL().lobbyisfullkick);
                } else {
                    Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
                    e.setJoinMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().playerjoined.replace("%player%", e.getPlayer().getName()));
                    if (Bukkit.getServer().getOnlinePlayers().size() == 6) {
                        Bukkit.broadcastMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().gamewillstart);
                        new BukkitRunnable() {
                            public void run() {
                                final boolean gameStarted = Main.GameStarted;
                                if (Listeners.this.seconds != 0) {
                                    Bukkit.broadcastMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().gamestartsin.replace("%seconds%", String.valueOf(Listeners.this.seconds)));
                                    for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                                        soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                                    }
                                    final Listeners this$0 = Listeners.this;
                                    --this$0.seconds;
                                } else {
                                    Bukkit.broadcastMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().gamestarts);
                                    this.cancel();
                                    Listeners.this.seconds = 10;
                                    Listeners.this.main.startGame();
                                }
                            }
                        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
                    }
                }
                final ItemStack is = new ItemStack(Material.NETHER_STAR, 1);
                final ItemMeta im = is.getItemMeta();
                im.setDisplayName(Main.getCL().teamselection);
                is.setItemMeta(im);
                e.getPlayer().getInventory().setItem(4, is);
                e.getPlayer().setAllowFlight(false);
                e.getPlayer().setFlying(false);
                e.getPlayer().setInvulnerable(false);
                e.getPlayer().setCollidable(false);
            }
        } else {
            e.getPlayer().kickPlayer(Main.getCL().roundisrestartingkick);
        }
    }

    @EventHandler
    public void onBlockPlace(final BlockPlaceEvent e) {
        if (this.main.LobbyStatus) {
            e.setCancelled(true);
        } else if (e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockBreak(final BlockBreakEvent e) {
        if (this.main.LobbyStatus) {
            e.setCancelled(true);
        } else if (e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDamage(final EntityDamageEvent e) {
        if (e.getEntity() instanceof Player && (e.getEntity().isInvulnerable() || this.main.LobbyStatus)) {
            e.setCancelled(true);
        }
        if (!Main.damage && e.getEntity() instanceof Player) {
            e.setCancelled(true);
        } else if (Main.damage && e.getEntity() instanceof Player) {
            return;
        }
    }

    @EventHandler
    public void onDamage2(final EntityDamageByEntityEvent e) {
        final Entity p = e.getDamager();
        if (p instanceof Player) {
            if (p.isInvulnerable() || this.main.LobbyStatus) {
                e.setCancelled(true);
            } else {
                if (!Main.t1.isEmpty() && Main.t1.size() == 2) {
                    if (Main.t1.get(0).equals(e.getDamager()) && Main.t1.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t1.get(1).equals(e.getDamager()) && Main.t1.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t2.isEmpty() && Main.t2.size() == 2) {
                    if (Main.t2.get(0).equals(e.getDamager()) && Main.t2.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t2.get(1).equals(e.getDamager()) && Main.t2.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t3.isEmpty() && Main.t3.size() == 2) {
                    if (Main.t3.get(0).equals(e.getDamager()) && Main.t3.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t3.get(1).equals(e.getDamager()) && Main.t3.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t4.isEmpty() && Main.t4.size() == 2) {
                    if (Main.t4.get(0).equals(e.getDamager()) && Main.t4.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t4.get(1).equals(e.getDamager()) && Main.t4.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t5.isEmpty() && Main.t5.size() == 2) {
                    if (Main.t5.get(0).equals(e.getDamager()) && Main.t5.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t5.get(1).equals(e.getDamager()) && Main.t5.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t6.isEmpty() && Main.t6.size() == 2) {
                    if (Main.t6.get(0).equals(e.getDamager()) && Main.t6.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t6.get(1).equals(e.getDamager()) && Main.t6.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t7.isEmpty() && Main.t7.size() == 2) {
                    if (Main.t7.get(0).equals(e.getDamager()) && Main.t7.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t7.get(1).equals(e.getDamager()) && Main.t7.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t8.isEmpty() && Main.t8.size() == 2) {
                    if (Main.t8.get(0).equals(e.getDamager()) && Main.t8.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t8.get(1).equals(e.getDamager()) && Main.t8.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!Main.t9.isEmpty() && Main.t9.size() == 2) {
                    if (Main.t9.get(0).equals(e.getDamager()) && Main.t9.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (Main.t9.get(1).equals(e.getDamager()) && Main.t9.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onClick(final InventoryClickEvent e) {
        if (e.getCurrentItem() == null) {
            return;
        }
        if (e.getView().getTitle() == "§4Difficulties" || e.getView().getTitle() == "§2Einstellungen") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((this.main.LobbyStatus || Main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.GRASS_BLOCK)) {
                Main.s1 = !Main.s1;
            } else if (e.getCurrentItem().getType().equals(Material.GRASS_PATH)) {
                Main.s2 = !Main.s2;
            } else if (e.getCurrentItem().getType().equals(Material.WARPED_NYLIUM)) {
                Main.s3 = !Main.s3;
            } else if (e.getCurrentItem().getType().equals(Material.CRIMSON_NYLIUM)) {
                Main.s4 = !Main.s4;
            } else if (e.getCurrentItem().getType().equals(Material.WITHER_SKELETON_SKULL)) {
                Main.s5 = !Main.s5;
            } else if (e.getCurrentItem().getType().equals(Material.END_STONE)) {
                Main.s6 = !Main.s6;
            } else if (e.getCurrentItem().getType().equals(Material.END_STONE_BRICKS)) {
                Main.s7 = !Main.s7;
            } else if (e.getCurrentItem().getType().equals(Material.ENDER_PEARL)) {
                Main.s8 = !Main.s8;
            } else if (e.getCurrentItem().getType().equals(Material.ENDER_EYE)) {
                Main.s9 = !Main.s9;
            } else if (e.getCurrentItem().getType().equals(Material.WARPED_STEM)) {
                Main.s10 = !Main.s10;
            } else if (e.getCurrentItem().getType().equals(Material.END_PORTAL_FRAME)) {
                Main.s11 = !Main.s11;
            } else if (e.getCurrentItem().getType().equals(Material.OBSIDIAN)) {
                Main.s12 = !Main.s12;
            } else if (e.getCurrentItem().getType().equals(Material.BLACKSTONE)) {
                Main.s13 = !Main.s13;
            } else if (e.getCurrentItem().getType().equals(Material.CRYING_OBSIDIAN)) {
                Main.s14 = !Main.s14;
            } else if (e.getCurrentItem().getType().equals(Material.CRIMSON_HYPHAE)) {
                Main.s15 = !Main.s15;
            } else if (e.getCurrentItem().getType().equals(Material.WARPED_HYPHAE)) {
                Main.s16 = !Main.s16;
            } else if (e.getCurrentItem().getType().equals(Material.NETHER_GOLD_ORE)) {
                Main.s17 = !Main.s17;
            } else if (e.getCurrentItem().getType().equals(Material.GILDED_BLACKSTONE)) {
                Main.s18 = !Main.s18;
            } else if (e.getCurrentItem().getType().equals(Material.NETHERITE_SWORD)) {
                Main.f1 = !Main.f1;
            } else if (e.getCurrentItem().getType().equals(Material.BOOKSHELF)) {
                if (RandomEnchantment.Wahrscheinlichkeit >= 1.0) {
                    RandomEnchantment.Wahrscheinlichkeit = 0.0;
                } else {
                    RandomEnchantment.Wahrscheinlichkeit();
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
                k.getPlayer().openInventory(settings.settings);
            }
            this.s1 = new ItemStack(Material.GRASS_BLOCK, 1);
            final ItemMeta st1im = this.s1.getItemMeta();
            st1im.setDisplayName("§aOVERWORLD");
            final ArrayList<String> lore1 = new ArrayList<String>();
            if (Main.s1) {
                st1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore1.clear();
                lore1.add("§7- §2All Items Findabel");
                lore1.add("§7- §2in the Nature");
                lore1.add("§7- §aTurned On");
            } else {
                lore1.clear();
                lore1.add("§7- §2All Items Findabel");
                lore1.add("§7- §2in the Nature");
                lore1.add("§7- §cTurned Off");
            }
            st1im.setLore(lore1);
            this.s1.setItemMeta(st1im);
            this.s2 = new ItemStack(Material.GRASS_PATH, 1);
            final ItemMeta st2im = this.s2.getItemMeta();
            st2im.setDisplayName("§aOVERWORLD");
            final ArrayList<String> lore2 = new ArrayList<String>();
            if (Main.s2) {
                st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore2.add("§7- §2All Items which are");
                lore2.add("§7- §2processed further");
                lore2.add("§7- §aTurned On");
            } else {
                lore2.add("§7- §2All Items which are");
                lore2.add("§7- §2processed further");
                lore2.add("§7- §cTurned Off");
            }
            st2im.setLore(lore2);
            this.s2.setItemMeta(st2im);
            this.s3 = new ItemStack(Material.WARPED_NYLIUM, 1);
            final ItemMeta st3im = this.s3.getItemMeta();
            st3im.setDisplayName("§aOVERWORLD | NETHER");
            final ArrayList<String> lore3 = new ArrayList<String>();
            if (Main.s3) {
                st3im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st3im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore3.add("§7- §2Items from Overworld and Nether");
                lore3.add("§7- §2Drops of Mobs from the Overworld");
                lore3.add("§7- §aTurned On");
            } else {
                lore3.add("§7- §2Items from Overworld and Nether");
                lore3.add("§7- §2Drops of Mobs from the Overworld");
                lore3.add("§7- §cTurned Off");
            }
            st3im.setLore(lore3);
            this.s3.setItemMeta(st3im);
            this.s4 = new ItemStack(Material.CRIMSON_NYLIUM, 1);
            final ItemMeta st4im = this.s4.getItemMeta();
            st4im.setDisplayName("§2OVERWORLD | NETHER");
            final ArrayList<String> lore4 = new ArrayList<String>();
            if (Main.s4) {
                st4im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st4im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore4.add("§7- §aFindabel Items from the Overworld");
                lore4.add("§7- §aFindeable Items from the Nether");
                lore4.add("§7- §aDrops of Mobs from the Overworld");
                lore4.add("§7- §aTurned On");
            } else {
                lore4.add("§7- §aFindabel Items from the Overworld");
                lore4.add("§7- §aFindeable Items from the Nether");
                lore4.add("§7- §aDrops of Mobs from the Overworld");
                lore4.add("§7- §cTurned Off");
            }
            st4im.setLore(lore4);
            this.s4.setItemMeta(st4im);
            this.s5 = new ItemStack(Material.WITHER_SKELETON_SKULL, 1);
            final ItemMeta st5im = this.s5.getItemMeta();
            st5im.setDisplayName("§2OVERWORLD | NETHER");
            final ArrayList<String> lore5 = new ArrayList<String>();
            if (Main.s5) {
                st5im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st5im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore5.add("§7- §aItems from the Nether");
                lore5.add("§7- §aRare drops of Mobs from the Overworld");
                lore5.add("§7- §aTurned On");
            } else {
                lore5.add("§7- §aItems from the Nether");
                lore5.add("§7- §aRare drops of Mobs from the Overworld");
                lore5.add("§7- §cTurned Off");
            }
            st5im.setLore(lore5);
            this.s5.setItemMeta(st5im);
            this.s6 = new ItemStack(Material.END_STONE, 1);
            final ItemMeta st6im = this.s6.getItemMeta();
            st6im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore6 = new ArrayList<String>();
            if (Main.s6) {
                st6im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st6im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore6.add("§7- Overworld + Items from the End");
                lore6.add("§7- Items which a not processed further");
                lore6.add("§7- §aTurned On");
            } else {
                lore6.add("§7- Overworld + Items from the End");
                lore6.add("§7- Items which a not processed further");
                lore6.add("§7- §cTurned Off");
            }
            st6im.setLore(lore6);
            this.s6.setItemMeta(st6im);
            this.s7 = new ItemStack(Material.END_STONE_BRICKS, 1);
            final ItemMeta st7im = this.s7.getItemMeta();
            st7im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore7 = new ArrayList<String>();
            if (Main.s7) {
                st7im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st7im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore7.add("§7- Overworld + Items from the End");
                lore7.add("§7- §aTurned On");
            } else {
                lore7.add("§7- Overworld + Items from the End");
                lore7.add("§7- §cTurned Off");
            }
            st7im.setLore(lore7);
            this.s7.setItemMeta(st7im);
            this.s8 = new ItemStack(Material.ENDER_PEARL, 1);
            final ItemMeta st8im = this.s8.getItemMeta();
            st8im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore8 = new ArrayList<String>();
            if (Main.s8) {
                st8im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st8im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore8.add("§7- Findable Items from the Overworld");
                lore8.add("§7- Drops of Mobs from the Overworld");
                lore8.add("§7- Items from the End");
                lore8.add("§7- §aTurned On");
            } else {
                lore8.add("§7- Findable Items from the Overworld");
                lore8.add("§7- Drops of Mobs from the Overworld");
                lore8.add("§7- Items from the End");
                lore8.add("§7- §cTurned Off");
            }
            st8im.setLore(lore8);
            this.s8.setItemMeta(st8im);
            this.s9 = new ItemStack(Material.ENDER_EYE, 1);
            final ItemMeta st9im = this.s9.getItemMeta();
            st9im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore9 = new ArrayList<String>();
            if (Main.s9) {
                st9im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st9im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore9.add("§7- Findable Items from the Overworld");
                lore9.add("§7- Drops of Mobs from the Overworld");
                lore9.add("§7- Items from the End");
                lore9.add("§7- Dragonegg");
                lore9.add("§7- §aTurned On");
            } else {
                lore9.add("§7- Findable Items from the Overworld");
                lore9.add("§7- Drops of Mobs from the Overworld");
                lore9.add("§7- Items from the End");
                lore9.add("§7- Dragonegg");
                lore9.add("§7- §cTurned Off");
            }
            st9im.setLore(lore9);
            this.s9.setItemMeta(st9im);
            this.s10 = new ItemStack(Material.WARPED_STEM, 1);
            final ItemMeta st10im = this.s10.getItemMeta();
            st10im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore10 = new ArrayList<String>();
            if (Main.s10) {
                st10im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st10im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore10.add("§7- Rare Item drops of Mobs from the Overworld");
                lore10.add("§7- Items from the End");
                lore10.add("§7- Dragonegg");
                lore10.add("§7- §aTurned On");
            } else {
                lore10.add("§7- Rare Item drops of Mobs from the Overworld");
                lore10.add("§7- Items from the End");
                lore10.add("§7- Dragonegg");
                lore10.add("§7- §cTurned Off");
            }
            st10im.setLore(lore10);
            this.s10.setItemMeta(st10im);
            this.s11 = new ItemStack(Material.END_PORTAL_FRAME, 1);
            final ItemMeta st11im = this.s11.getItemMeta();
            st11im.setDisplayName("§8END");
            final ArrayList<String> lore11 = new ArrayList<String>();
            if (Main.s11) {
                st11im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st11im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore11.add("§7- §fItems from the End");
                lore11.add("§7- §fDragonegg");
                lore11.add("§7- §aTurned On");
            } else {
                lore11.add("§7- §fItems from the End");
                lore11.add("§7- §fDragonegg");
                lore11.add("§7- §cTurned Off");
            }
            st11im.setLore(lore11);
            this.s11.setItemMeta(st11im);
            this.s12 = new ItemStack(Material.OBSIDIAN, 1);
            final ItemMeta st12im = this.s12.getItemMeta();
            st12im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore12 = new ArrayList<String>();
            if (Main.s12) {
                st12im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st12im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore12.add("§7- §cItems from the Nether");
                lore12.add("§7- §cItems from the End");
                lore12.add("§7- §aTurned On");
            } else {
                lore12.add("§7- §cItems from the Nether");
                lore12.add("§7- §cItems from the End");
                lore12.add("§7- §cTurned Off");
            }
            st12im.setLore(lore12);
            this.s12.setItemMeta(st12im);
            this.s13 = new ItemStack(Material.BLACKSTONE, 1);
            final ItemMeta st13im = this.s13.getItemMeta();
            st13im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore13 = new ArrayList<String>();
            if (Main.s13) {
                st13im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st13im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore13.add("§7- §cItems from the Nether");
                lore13.add("§7- §cItems from the End");
                lore13.add("§7- §aTurned On");
            } else {
                lore13.add("§7- §cItems from the Nether");
                lore13.add("§7- §cItems from the End");
                lore13.add("§7- §cTurned Off");
            }
            st13im.setLore(lore13);
            this.s13.setItemMeta(st13im);
            this.s14 = new ItemStack(Material.CRYING_OBSIDIAN, 1);
            final ItemMeta st14im = this.s14.getItemMeta();
            st14im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore14 = new ArrayList<String>();
            if (Main.s14) {
                st14im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st14im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore14.add("§7- §cItems from the Nether");
                lore14.add("§7- §cItems from the End");
                lore14.add("§7- §cDragonegg");
                lore14.add("§7- §aTurned On");
            } else {
                lore14.add("§7- §cItems from the Nether");
                lore14.add("§7- §cItems from the End");
                lore14.add("§7- §cDragonegg");
                lore14.add("§7- §cTurned Off");
            }
            st14im.setLore(lore14);
            this.s14.setItemMeta(st14im);
            this.s15 = new ItemStack(Material.CRIMSON_HYPHAE, 1);
            final ItemMeta st15im = this.s15.getItemMeta();
            st15im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore15 = new ArrayList<String>();
            if (Main.s15) {
                st15im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st15im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore15.add("§7- §cItems from the Nether");
                lore15.add("§7- §cItems from the End");
                lore15.add("§7- §cDragonegg");
                lore15.add("§7- §aTurned On");
            } else {
                lore15.add("§7- §cItems from the Nether");
                lore15.add("§7- §cItems from the End");
                lore15.add("§7- §cDragonegg");
                lore15.add("§7- §cTurned Off");
            }
            st15im.setLore(lore15);
            this.s15.setItemMeta(st15im);
            this.s16 = new ItemStack(Material.WARPED_HYPHAE, 1);
            final ItemMeta st16im = this.s16.getItemMeta();
            st16im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore16 = new ArrayList<String>();
            if (Main.s16) {
                st16im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st16im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore16.add("§7- §cItems from the Nether");
                lore16.add("§7- §cDrops of Mobs from the Nether");
                lore16.add("§7- §cItems from the End");
                lore16.add("§7- §cDragonegg");
                lore16.add("§7- §aTurned On");
            } else {
                lore16.add("§7- §cItems from the Nether");
                lore16.add("§7- §cDrops of Mobs from the Nether");
                lore16.add("§7- §cItems from the End");
                lore16.add("§7- §cDragonegg");
                lore16.add("§7- §cTurned Off");
            }
            st16im.setLore(lore16);
            this.s16.setItemMeta(st16im);
            this.s17 = new ItemStack(Material.NETHER_GOLD_ORE, 1);
            final ItemMeta st17im = this.s17.getItemMeta();
            st17im.setDisplayName("§cNether");
            final ArrayList<String> lore17 = new ArrayList<String>();
            if (Main.s17) {
                st17im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st17im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore17.add("§7- §4Items from the Nether");
                lore17.add("§7- §4Drops of Mobs from the Nether");
                lore17.add("§7- §aTurned On");
            } else {
                lore17.add("§7- §4Items from the Nether");
                lore17.add("§7- §4Drops of Mobs from the Nether");
                lore17.add("§7- §cTurned Off");
            }
            st17im.setLore(lore17);
            this.s17.setItemMeta(st17im);
            this.s18 = new ItemStack(Material.GILDED_BLACKSTONE, 1);
            final ItemMeta st18im = this.s18.getItemMeta();
            st18im.setDisplayName("§5Newest Items");
            final ArrayList<String> lore18 = new ArrayList<String>();
            if (Main.s18) {
                st18im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st18im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore18.add("§7- §dItems from 1.16");
                lore18.add("§7- §aTurned On");
            } else {
                lore18.add("§7- §dItems from 1.16");
                lore18.add("§7- §cTurned Off");
            }
            st18im.setLore(lore18);
            this.s18.setItemMeta(st18im);
            this.f1 = new ItemStack(Material.NETHERITE_SWORD, 1);
            final ItemMeta f1 = this.f1.getItemMeta();
            f1.setDisplayName("§5Netherite Filter");
            final ArrayList<String> loref1 = new ArrayList<String>();
            if (Main.f1) {
                f1.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                f1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                loref1.add("§7- §dTurn Off Netherite Items");
                loref1.add("§7- §aActivated");
            } else {
                loref1.add("§7- §dTurn Off Netherite Items");
                loref1.add("§7- §cDeactivated");
            }
            f1.setLore(loref1);
            this.f1.setItemMeta(f1);
            this.f2 = new ItemStack(Material.BOOKSHELF, 1);
            final ItemMeta f2 = this.f2.getItemMeta();
            f2.setDisplayName("§5Enchantments");
            final ArrayList<String> loref2 = new ArrayList<String>();
            if (RandomEnchantment.Wahrscheinlichkeit > 0.0) {
                f2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                f2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                loref2.add("§7- §dTurn On Enchanted Items");
                loref2.add("§7- §dWahrscheinlichkeit: " + ChatColor.GREEN + RandomEnchantment.InProzent());
                loref2.add("§7- §aActivated");
            } else if (RandomEnchantment.Wahrscheinlichkeit <= 0.0) {
                loref2.add("§7- §dTurn On Enchanted Items");
                loref2.add("§7- §dWahrscheinlichkeit: " + ChatColor.GREEN + RandomEnchantment.InProzent());
                loref2.add("§7- §cDeactivated");
            }
            f2.setLore(loref2);
            this.f2.setItemMeta(f2);
            this.back = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
            final ItemMeta back1 = this.back.getItemMeta();
            back1.setDisplayName(ChatColor.RED + "Back");
            this.back.setItemMeta(back1);
            this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim = this.ph.getItemMeta();
            phim.setDisplayName(" ");
            this.ph.setItemMeta(phim);
            if (e.getCurrentItem().getType().equals(Material.DRAGON_EGG) || e.getCurrentItem().getType().equals(this.f1.getType()) || e.getCurrentItem().getType().equals(this.f2.getType()) || e.getCurrentItem().getType().equals(this.s1.getType()) || e.getCurrentItem().getType().equals(this.s2.getType()) || e.getCurrentItem().getType().equals(this.s3.getType()) || e.getCurrentItem().getType().equals(this.s4.getType()) || e.getCurrentItem().getType().equals(this.s5.getType()) || e.getCurrentItem().getType().equals(this.s6.getType()) || e.getCurrentItem().getType().equals(this.s7.getType()) || e.getCurrentItem().getType().equals(this.s8.getType()) || e.getCurrentItem().getType().equals(this.s9.getType()) || e.getCurrentItem().getType().equals(this.s10.getType()) || e.getCurrentItem().getType().equals(this.s11.getType()) || e.getCurrentItem().getType().equals(this.s12.getType()) || e.getCurrentItem().getType().equals(this.s13.getType()) || e.getCurrentItem().getType().equals(this.s14.getType()) || e.getCurrentItem().getType().equals(this.s15.getType()) || e.getCurrentItem().getType().equals(this.s16.getType()) || e.getCurrentItem().getType().equals(this.s17.getType()) || e.getCurrentItem().getType().equals(this.s18.getType())) {
                final Inventory schwierigkeit = Bukkit.createInventory(null, 54, "§4Difficulties");
                schwierigkeit.setItem(9, this.s1);
                schwierigkeit.setItem(10, this.s2);
                schwierigkeit.setItem(11, this.s3);
                schwierigkeit.setItem(12, this.s4);
                schwierigkeit.setItem(13, this.s5);
                schwierigkeit.setItem(14, this.s6);
                schwierigkeit.setItem(15, this.s7);
                schwierigkeit.setItem(16, this.s8);
                schwierigkeit.setItem(17, this.s9);
                schwierigkeit.setItem(18, this.s10);
                schwierigkeit.setItem(19, this.s11);
                schwierigkeit.setItem(20, this.s12);
                schwierigkeit.setItem(21, this.s13);
                schwierigkeit.setItem(22, this.s14);
                schwierigkeit.setItem(23, this.s15);
                schwierigkeit.setItem(24, this.s16);
                schwierigkeit.setItem(25, this.s17);
                schwierigkeit.setItem(26, this.s18);
                schwierigkeit.setItem(36, this.f1);
                schwierigkeit.setItem(37, this.f2);
                schwierigkeit.setItem(53, this.back);
                for (int i = 0; i < schwierigkeit.getSize(); ++i) {
                    if (schwierigkeit.getItem(i) == null || schwierigkeit.getItem(i).getType().equals(Material.AIR)) {
                        schwierigkeit.setItem(i, this.ph);
                    }
                }
                k.getPlayer().openInventory(schwierigkeit);
            }
        }
        if (e.getView().getTitle() == "§2Game Settings" || e.getView().getTitle() == "§2Einstellungen") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((this.main.LobbyStatus || Main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.CLOCK)) {
                if (Main.timercountdown) {
                    Main.timercountdown = false;
                    Main.hours = 0;
                    Main.minutes = 0;
                    Main.seconds = 0;
                } else if (!Main.timercountdown) {
                    Main.timercountdown = true;
                    Main.hours = 0;
                    Main.minutes = 10;
                    Main.seconds = 0;
                }
            } else if (e.getCurrentItem().getType().equals(Material.TOTEM_OF_UNDYING)) {
                if (e.getClick().isLeftClick()) {
                    Main.SpawnArea += 10;
                } else if (e.getClick().isRightClick()) {
                    if (Main.SpawnArea == 10) {
                        return;
                    }
                    Main.SpawnArea -= 10;
                }
            } else if (e.getCurrentItem().getType().equals(Material.SPRUCE_LOG)) {
                if (!Main.isReset || !Main.ResetonRestart) {
                    Main.isReset = true;
                    Main.ResetonRestart = true;
                } else if (Main.isReset || Main.ResetonRestart) {
                    Main.isReset = false;
                    Main.ResetonRestart = false;
                }
            } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cPlus")) {
                if (Main.minutes == 60) {
                    Main.minutes = 0;
                    ++Main.hours;
                } else if (Main.timercountdown) {
                    Main.minutes += 10;
                } else if (!Main.timercountdown) {
                    return;
                }
            } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cMinus")) {
                if (Main.minutes == 0 && Main.timercountdown) {
                    Main.minutes = 60;
                    --Main.hours;
                } else {
                    if (Main.minutes < 10 || (Main.minutes == 10 && Main.hours == 0)) {
                        return;
                    }
                    if (Main.minutes == 0 && !Main.timercountdown) {
                        return;
                    }
                    Main.minutes -= 10;
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
                k.getPlayer().openInventory(settings.settings);
            }
            this.g1 = new ItemStack(Material.CLOCK, 1);
            final ItemMeta st1im = this.g1.getItemMeta();
            st1im.setDisplayName("§aTimer");
            final ArrayList<String> lore1 = new ArrayList<String>();
            lore1.add(new StringBuilder().append(ChatColor.GOLD).append(Main.hours).append(":").append(ChatColor.GOLD).append(Main.minutes).append(":").append(ChatColor.GOLD).append(Main.seconds).toString());
            if (!Main.timercountdown) {
                lore1.add(ChatColor.DARK_GREEN + "Counting Up");
            } else if (Main.timercountdown) {
                lore1.add(ChatColor.RED + "Counting Down");
            }
            st1im.setLore(lore1);
            this.g1.setItemMeta(st1im);
            this.g2 = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
            final ItemMeta st2im = this.g2.getItemMeta();
            st2im.setDisplayName("§aSpawnArea");
            final ArrayList<String> lore2 = new ArrayList<String>();
            st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            lore2.add("§2Set the Spawnarea in Blocks");
            lore2.add("§c+ 10 Blocks§2 per §6LeftClick");
            lore2.add("§c- 10 Blocks§2 per §6RightClick");
            lore2.add("§2Current Spawnarea: " + ChatColor.GOLD + Main.SpawnArea);
            st2im.setLore(lore2);
            this.g2.setItemMeta(st2im);
            this.g3 = new ItemStack(Material.SPRUCE_LOG, 1);
            final ItemMeta st3im = this.g3.getItemMeta();
            st3im.setDisplayName("§aReset");
            final ArrayList<String> lore3 = new ArrayList<String>();
            lore3.add("§2Turn Reset ON or OFF");
            if (Main.isReset && Main.ResetonRestart) {
                lore3.add("§aTurned On");
            } else if (!Main.isReset && !Main.ResetonRestart) {
                lore3.add("§cTurned Off");
            }
            st3im.setLore(lore3);
            this.g3.setItemMeta(st3im);
            this.g4 = new ItemStack(Material.PLAYER_HEAD, 1);
            final ItemMeta st4im = this.g4.getItemMeta();
            st4im.setDisplayName("§aPlayer Settings");
            final ArrayList<String> lore4 = new ArrayList<String>();
            st4im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            st4im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            lore4.add("§7- §2Player Settings");
            st4im.setLore(lore4);
            this.g4.setItemMeta(st4im);
            this.b1 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b1im = this.b1.getItemMeta();
            b1im.setDisplayName("§cMinus");
            final ArrayList<String> blore = new ArrayList<String>();
            b1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore.add(new StringBuilder().append(ChatColor.GOLD).append(Main.hours).append(":").append(ChatColor.GOLD).append(Main.minutes).append(":").append(ChatColor.GOLD).append(Main.seconds).toString());
            b1im.setLore(blore);
            this.b1.setItemMeta(b1im);
            this.b2 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b2im = this.b2.getItemMeta();
            b2im.setDisplayName("§cPlus");
            final ArrayList<String> blore2 = new ArrayList<String>();
            b2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore2.add(new StringBuilder().append(ChatColor.GOLD).append(Main.hours).append(":").append(ChatColor.GOLD).append(Main.minutes).append(":").append(ChatColor.GOLD).append(Main.seconds).toString());
            b2im.setLore(blore2);
            this.b2.setItemMeta(b2im);
            this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim2 = this.ph.getItemMeta();
            phim2.setDisplayName(" ");
            this.ph.setItemMeta(phim2);
            if (e.getCurrentItem().getType().equals(Material.COMMAND_BLOCK) || e.getCurrentItem().getType().equals(Material.STONE_BUTTON) || e.getCurrentItem().getType().equals(Material.CLOCK) || e.getCurrentItem().getType().equals(Material.TOTEM_OF_UNDYING) || e.getCurrentItem().getType().equals(Material.SPRUCE_LOG)) {
                Listeners.gameset.setItem(19, this.g1);
                Listeners.gameset.setItem(21, this.g2);
                Listeners.gameset.setItem(23, this.g3);
                Listeners.gameset.setItem(25, this.g4);
                Listeners.gameset.setItem(10, this.b2);
                Listeners.gameset.setItem(28, this.b1);
                Listeners.gameset.setItem(44, this.back);
                for (int j = 0; j < Listeners.gameset.getSize(); ++j) {
                    if (Listeners.gameset.getItem(j) == null || Listeners.gameset.getItem(j).getType().equals(Material.AIR)) {
                        Listeners.gameset.setItem(j, this.ph);
                    }
                }
                k.getPlayer().openInventory(Listeners.gameset);
            }
        }
        if (e.getView().getTitle() == "§2Game Settings" || e.getView().getTitle() == "§2Player Settings") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((this.main.LobbyStatus || Main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.TRIDENT)) {
                if (!Main.damage) {
                    Main.damage = true;
                } else if (Main.damage) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        player.setHealth(20.0);
                    }
                    Main.damage = false;
                }
            } else if (e.getCurrentItem().getType().equals(Material.MUSHROOM_STEW)) {
                if (Main.hunger) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        player.setFoodLevel(20);
                    }
                    Main.hunger = false;
                } else if (!Main.hunger) {
                    Main.hunger = true;
                }
            } else if (e.getCurrentItem().getType().equals(Material.CHEST)) {
                if (Main.keepinventory) {
                    Main.keepinventory = false;
                } else if (!Main.keepinventory) {
                    Main.keepinventory = true;
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE) && e.getView().getTitle() == "§2Player Settings") {
                k.getPlayer().openInventory(Listeners.gameset);
            }
            this.p1 = new ItemStack(Material.TRIDENT, 1);
            final ItemMeta p1im = this.p1.getItemMeta();
            p1im.setDisplayName("§aDamage");
            final ArrayList<String> lore1 = new ArrayList<String>();
            lore1.add("§2Turn Damage ON or OFF");
            if (Main.damage) {
                lore1.add("§aTurned On");
            } else if (!Main.damage) {
                lore1.add("§cTurned Off");
            }
            p1im.setLore(lore1);
            this.p1.setItemMeta(p1im);
            this.p2 = new ItemStack(Material.MUSHROOM_STEW, 1);
            final ItemMeta st2im = this.p2.getItemMeta();
            st2im.setDisplayName("§aHunger");
            final ArrayList<String> lore2 = new ArrayList<String>();
            lore2.add("§2Turn Hunger ON or OFF");
            if (Main.hunger) {
                lore2.add("§aTurned On");
            } else if (!Main.hunger) {
                lore2.add("§cTurned Off");
            }
            st2im.setLore(lore2);
            this.p2.setItemMeta(st2im);
            this.p3 = new ItemStack(Material.CHEST, 1);
            final ItemMeta st3im = this.p3.getItemMeta();
            st3im.setDisplayName("§aKeep Inventory");
            final ArrayList<String> lore3 = new ArrayList<String>();
            lore3.add("§2Turn Keepinventory ON or OFF");
            if (Main.keepinventory) {
                lore3.add("§aTurned On");
            } else if (!Main.keepinventory) {
                lore3.add("§cTurned Off");
            }
            st3im.setLore(lore3);
            this.p3.setItemMeta(st3im);
            this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim3 = this.ph.getItemMeta();
            phim3.setDisplayName(" ");
            this.ph.setItemMeta(phim3);
            if (e.getCurrentItem().getType().equals(Material.PLAYER_HEAD) || e.getCurrentItem().getType().equals(Material.TRIDENT) || e.getCurrentItem().getType().equals(Material.MUSHROOM_STEW) || e.getCurrentItem().getType().equals(Material.CHEST)) {
                final Inventory playerset = Bukkit.createInventory(null, 45, "§2Player Settings");
                playerset.setItem(19, this.p1);
                playerset.setItem(21, this.p2);
                playerset.setItem(23, this.p3);
                playerset.setItem(44, this.back);
                for (int l = 0; l < playerset.getSize(); ++l) {
                    if (playerset.getItem(l) == null || playerset.getItem(l).getType().equals(Material.AIR)) {
                        playerset.setItem(l, this.ph);
                    }
                }
                k.getPlayer().openInventory(playerset);
            }
        }
        if (e.getView().getTitle() == "§2Team Settings" || e.getView().getTitle() == "§2Einstellungen") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((this.main.LobbyStatus || Main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.ARMOR_STAND)) {
                return;
            }
            if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cPlus")) {
                if (Main.Teamsize == 1) {
                    ++Main.Teamsize;
                } else if (Main.Teamsize == 2) {
                    return;
                }
            } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cMinus")) {
                if (Main.Teamsize == 2) {
                    --Main.Teamsize;
                } else if (Main.Teamsize == 1) {
                    return;
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
                k.getPlayer().openInventory(settings.settings);
            }
            this.g1 = new ItemStack(Material.ARMOR_STAND, 1);
            final ItemMeta st1im = this.g1.getItemMeta();
            st1im.setDisplayName("§aTeamsize");
            final ArrayList<String> lore1 = new ArrayList<String>();
            lore1.add("§2Current Teamsize:" + ChatColor.GOLD + " " + Main.Teamsize);
            st1im.setLore(lore1);
            this.g1.setItemMeta(st1im);
            this.b1 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b1im2 = this.b1.getItemMeta();
            b1im2.setDisplayName("§cMinus");
            final ArrayList<String> blore3 = new ArrayList<String>();
            b1im2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b1im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore3.add("§2Current Teamsize:" + ChatColor.GOLD + " " + Main.Teamsize);
            b1im2.setLore(blore3);
            this.b1.setItemMeta(b1im2);
            this.b2 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b2im2 = this.b2.getItemMeta();
            b2im2.setDisplayName("§cPlus");
            final ArrayList<String> blore4 = new ArrayList<String>();
            b2im2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b2im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore4.add("§2Current Teamsize:" + ChatColor.GOLD + " " + Main.Teamsize);
            b2im2.setLore(blore4);
            this.b2.setItemMeta(b2im2);
            this.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim3 = this.ph.getItemMeta();
            phim3.setDisplayName(" ");
            this.ph.setItemMeta(phim3);
            if (e.getCurrentItem().getType().equals(Material.RED_BANNER) || e.getCurrentItem().getType().equals(Material.STONE_BUTTON) || e.getCurrentItem().getType().equals(Material.ARMOR_STAND)) {
                final Inventory teamset = Bukkit.createInventory(null, 45, "§2Team Settings");
                teamset.setItem(22, this.g1);
                teamset.setItem(13, this.b2);
                teamset.setItem(31, this.b1);
                teamset.setItem(44, this.back);
                for (int l = 0; l < teamset.getSize(); ++l) {
                    if (teamset.getItem(l) == null || teamset.getItem(l).getType().equals(Material.AIR)) {
                        teamset.setItem(l, this.ph);
                    }
                }
                k.getPlayer().openInventory(teamset);
            }
        }
        if (e.getView().getTitle() == Main.getCL().bingoitemsinround) {
            e.setCancelled(true);
        }
        final Player p = (Player) e.getWhoClicked();
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
        if (this.main.LobbyStatus || Main.GameStarted) {
            if (e.getCurrentItem() == null) {
                e.setCancelled(true);
            } else if (e.getCurrentItem().getType().equals(Material.ORANGE_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t1.size() < Main.Teamsize) {
                    if (!Main.t1.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam1);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t1.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam1);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t1.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam1);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team1full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.RED_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t2.size() < Main.Teamsize) {
                    if (!Main.t2.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam2);
                        Main.t1.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t2.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam2);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t2.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam2);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team2full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.PINK_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t3.size() < Main.Teamsize) {
                    if (!Main.t3.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam3);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t3.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam3);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t3.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam3);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team3full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.WHITE_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t4.size() < Main.Teamsize) {
                    if (!Main.t4.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam4);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t4.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam4);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t4.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam4);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team4full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.LIGHT_BLUE_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t5.size() < Main.Teamsize) {
                    if (!Main.t5.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam5);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t5.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam5);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t5.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam5);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team5full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.YELLOW_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t6.size() < Main.Teamsize) {
                    if (!Main.t6.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam6);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t6.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam6);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t6.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam6);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team6full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.LIME_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t7.size() < Main.Teamsize) {
                    if (!Main.t7.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam7);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t8.remove(p);
                        Main.t9.remove(p);
                        Main.t7.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam7);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t7.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam7);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team7full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.GRAY_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t8.size() < Main.Teamsize) {
                    if (!Main.t8.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam8);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t9.remove(p);
                        Main.t8.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam8);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t8.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam8);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team8full);
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.PURPLE_CONCRETE) && e.getView().getTitle() == Main.getCL().teamselectorInventoryTitle) {
                if (Main.t9.size() < Main.Teamsize) {
                    if (!Main.t9.contains(p)) {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().jointeam9);
                        Main.t1.remove(p);
                        Main.t2.remove(p);
                        Main.t3.remove(p);
                        Main.t4.remove(p);
                        Main.t5.remove(p);
                        Main.t6.remove(p);
                        Main.t7.remove(p);
                        Main.t8.remove(p);
                        Main.t9.add(p);
                    } else {
                        p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam9);
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (Main.t9.contains(p)) {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().alreadyteam9);
                } else {
                    p.sendMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().team9full);
                }
                p.closeInventory();
            } else if (e.getClickedInventory().getType() == InventoryType.PLAYER && e.getCurrentItem().getType().equals(Material.NETHER_STAR) && this.main.LobbyStatus && e.getCurrentItem().getItemMeta().getDisplayName().contains(Main.getCL().teamselection)) {
                e.setCancelled(true);
            } else if (e.getClickedInventory().getType() == InventoryType.PLAYER && e.getCurrentItem().getType().equals(Material.NETHER_STAR) && Main.GameStarted && e.getCurrentItem().getItemMeta().getDisplayName().contains(Main.getCL().teamselection)) {
                e.setCancelled(true);
            }
        } else if (e.getWhoClicked().isInvulnerable() && e.getClickedInventory().getType() != InventoryType.PLAYER) {
            e.setCancelled(true);
        }
        if (Main.t1.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam1Colour) + p.getName());
        } else if (Main.t2.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam2Colour) + p.getName());
        } else if (Main.t3.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam3Colour) + p.getName());
        } else if (Main.t4.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam4Colour) + p.getName());
        } else if (Main.t5.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam5Colour) + p.getName());
        } else if (Main.t6.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam6Colour) + p.getName());
        } else if (Main.t7.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam7Colour) + p.getName());
        } else if (Main.t8.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam8Colour) + p.getName());
        } else if (Main.t9.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', Main.getCL().TablistTeam9Colour) + p.getName());
        }
        if (e.getClick().isLeftClick() && e.getView().getTitle() == Main.getCL().bingoitemsinround) {
            if (Main.GameStarted) {
                final String BingoItem = "r %Item%";
                if (e.getCurrentItem().getType().equals(Main.b1.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b1.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b2.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b2.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b3.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b3.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b4.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b4.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b5.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b5.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b6.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b6.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b7.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b7.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b8.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b8.getType().name()));
                } else if (e.getCurrentItem().getType().equals(Main.b9.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", Main.b9.getType().name()));
                }
            } else {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onTarget(final EntityTargetLivingEntityEvent e) {
        if (e.getTarget() instanceof Player && (e.getTarget().isInvulnerable() || this.main.LobbyStatus)) {
            e.setCancelled(true);
        }
        if (!Main.damage) {
            e.setCancelled(true);
        } else if (Main.damage) {
            return;
        }
    }

    @EventHandler
    public void onFoodChange(final FoodLevelChangeEvent e) {
        final Player p = (Player) e.getEntity();
        if (this.main.LobbyStatus || p.isInvulnerable()) {
            e.setCancelled(true);
        }
        if (!Main.hunger) {
            e.setCancelled(true);
        } else if (Main.hunger) {
            return;
        }
    }

    @EventHandler
    public void onDeath(final PlayerDeathEvent e) {
        if (Main.keepinventory) {
            e.setKeepInventory(true);
        } else if (!Main.keepinventory) {
            e.setKeepInventory(false);
        }
        e.getDrops().clear();
        e.setDeathMessage(null);
    }

    @EventHandler
    public void onRespawn(final PlayerRespawnEvent e) {
        final int l1x = ThreadLocalRandom.current().nextInt(-3000, 3000);
        final int l1z = ThreadLocalRandom.current().nextInt(-3000, 3000);
        final Location l1 = new Location(Bukkit.getWorld("world"), l1x, Bukkit.getWorld("world").getHighestBlockAt(l1x, l1z).getY(), l1z);
        e.setRespawnLocation(l1);
        e.getPlayer().teleport(l1);
        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ITEM_CHORUS_FRUIT_TELEPORT, 0.3f, 1.0f);
        Bukkit.broadcastMessage(Main.getCL().deathmessage.replace("%player%", e.getPlayer().getName()));
        final ItemStack boat = new ItemStack(Material.OAK_BOAT, 1);
        final ItemMeta boatmeta = boat.getItemMeta();
        boatmeta.setDisplayName(Main.getCL().BoatName);
        boat.setItemMeta(boatmeta);
        e.getPlayer().getInventory().setItem(0, boat);
    }

    @EventHandler
    public void onQuit(final PlayerQuitEvent e) {
        if (!Main.GameStarted && !this.main.isRestarting) {
            if (Main.t1.contains(e.getPlayer())) {
                Main.t1.remove(e.getPlayer());
            } else if (Main.t2.contains(e.getPlayer())) {
                Main.t2.remove(e.getPlayer());
            } else if (Main.t3.contains(e.getPlayer())) {
                Main.t3.remove(e.getPlayer());
            } else if (Main.t4.contains(e.getPlayer())) {
                Main.t4.remove(e.getPlayer());
            } else if (Main.t5.contains(e.getPlayer())) {
                Main.t5.remove(e.getPlayer());
            } else if (Main.t6.contains(e.getPlayer())) {
                Main.t6.remove(e.getPlayer());
            } else if (Main.t7.contains(e.getPlayer())) {
                Main.t7.remove(e.getPlayer());
            } else if (Main.t8.contains(e.getPlayer())) {
                Main.t8.remove(e.getPlayer());
            } else Main.t9.remove(e.getPlayer());
            e.setQuitMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().leftserverlobby.replace("%player%", e.getPlayer().getName()));
        }
        if (!this.main.isRestarting && Main.GameStarted) {
            if (e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                if (Main.t1.contains(e.getPlayer())) {
                    Main.t1.remove(e.getPlayer());
                } else if (Main.t2.contains(e.getPlayer())) {
                    Main.t2.remove(e.getPlayer());
                } else if (Main.t3.contains(e.getPlayer())) {
                    Main.t3.remove(e.getPlayer());
                } else if (Main.t4.contains(e.getPlayer())) {
                    Main.t4.remove(e.getPlayer());
                } else if (Main.t5.contains(e.getPlayer())) {
                    Main.t5.remove(e.getPlayer());
                } else if (Main.t6.contains(e.getPlayer())) {
                    Main.t6.remove(e.getPlayer());
                } else if (Main.t7.contains(e.getPlayer())) {
                    Main.t7.remove(e.getPlayer());
                } else if (Main.t8.contains(e.getPlayer())) {
                    Main.t8.remove(e.getPlayer());
                } else Main.t9.remove(e.getPlayer());
                e.setQuitMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().leftserveringame.replace("%player%", e.getPlayer().getName()));
            } else {
                e.setQuitMessage(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().leftserveringamespectator.replace("%player%", e.getPlayer().getName()));
            }
            for (final Player player : Bukkit.getOnlinePlayers()) {
                final Main main = this.main;
                ++main.players;
                if (player.getGameMode() == GameMode.SPECTATOR) {
                    final Main main2 = this.main;
                    ++main2.spectator;
                }
            }
            final Main main3 = this.main;
            --main3.players;
            if (this.main.spectator == this.main.players && !Main.GameStarted) {
                for (final Player player : Bukkit.getOnlinePlayers()) {
                    player.kickPlayer(String.valueOf(Main.getCL().prefix) + " " + Main.getCL().gameisrestarting);
                }
                new BukkitRunnable() {
                    public void run() {
                        Listeners.this.main.noPlayerRestart();
                    }
                }.runTaskLater(Main.getPlugin(), 80L);
            }
            this.main.players = 0;
            this.main.spectator = 0;
        }
    }

    @EventHandler
    public void onAsyncChat(final AsyncPlayerChatEvent e) {
        if (e.getPlayer().hasPermission("bingo.gamemaster")) {
            if (Main.t1.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam1.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t2.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam2.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t3.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam3.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t4.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam4.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t5.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam5.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t6.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam6.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t7.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam7.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t8.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam8.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (Main.t9.contains(e.getPlayer())) {
                e.setFormat(Main.getCL().chatformatTeam9.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else {
                e.setFormat(Main.getCL().chatformatwithoutteam.replace("%player%", String.valueOf(Main.getCL().chatcolourGamemaster) + e.getPlayer().getName()).replace("%message%", e.getMessage()));
            }
        } else if (Main.t1.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam1.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t2.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam2.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t3.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam3.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t4.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam4.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t5.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam5.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t6.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam6.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t7.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam7.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t8.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam8.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (Main.t9.contains(e.getPlayer())) {
            e.setFormat(Main.getCL().chatformatTeam9.replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else {
            e.setFormat(Main.getCL().chatformatwithoutteam.replace("%player%", String.valueOf(Main.getCL().chatcolourDefaultUser) + e.getPlayer().getName()).replace("%message%", e.getMessage()));
        }
    }

    @EventHandler
    public void onBroadcast(final BroadcastMessageEvent e) {
        for (final Player player : Bukkit.getOnlinePlayers()) {
            if (e.getMessage().contains("gefunden")) {
                Scoreboards.setLobbyScoreboardWithTeam(player);
            }
        }
    }

    @EventHandler
    public void onDrop(final PlayerDropItemEvent e) {
        if (this.main.LobbyStatus || e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onTeleport(final PlayerTeleportEvent e) {
        if (Main.GameStarted) {
            if (!this.main.randomized) {
                this.main.getRandomItems();
            }
            Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
        }
    }
}
