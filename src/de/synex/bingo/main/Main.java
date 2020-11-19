// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.main;

import Utilities.Items;
import Utilities.RandomEnchantment;
import de.synex.bingo.commands.*;
import de.synex.bingo.listeners.Listeners;
import de.synex.bingo.util.Config;
import de.synex.bingo.util.ConfigLink;
import io.netty.util.internal.ThreadLocalRandom;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main extends JavaPlugin {
    public static boolean GameStarted;
    public static ArrayList<Player> t1;
    public static ArrayList<Player> t2;
    public static ArrayList<Player> t3;
    public static ArrayList<Player> t4;
    public static ArrayList<Player> t5;
    public static ArrayList<Player> t6;
    public static ArrayList<Player> t7;
    public static ArrayList<Player> t8;
    public static ArrayList<Player> t9;
    public static HashSet<ItemStack> itemlist;
    public static ItemStack b1;
    public static ItemStack b2;
    public static ItemStack b3;
    public static ItemStack b4;
    public static ItemStack b5;
    public static ItemStack b6;
    public static ItemStack b7;
    public static ItemStack b8;
    public static ItemStack b9;
    public static ChatColor ColorGrayb1t1;
    public static ChatColor ColorGrayb2t1;
    public static ChatColor ColorGrayb3t1;
    public static ChatColor ColorGrayb4t1;
    public static ChatColor ColorGrayb5t1;
    public static ChatColor ColorGrayb6t1;
    public static ChatColor ColorGrayb7t1;
    public static ChatColor ColorGrayb8t1;
    public static ChatColor ColorGrayb9t1;
    public static ChatColor ColorGrayb1t2;
    public static ChatColor ColorGrayb2t2;
    public static ChatColor ColorGrayb3t2;
    public static ChatColor ColorGrayb4t2;
    public static ChatColor ColorGrayb5t2;
    public static ChatColor ColorGrayb6t2;
    public static ChatColor ColorGrayb7t2;
    public static ChatColor ColorGrayb8t2;
    public static ChatColor ColorGrayb9t2;
    public static ChatColor ColorGrayb1t3;
    public static ChatColor ColorGrayb2t3;
    public static ChatColor ColorGrayb3t3;
    public static ChatColor ColorGrayb4t3;
    public static ChatColor ColorGrayb5t3;
    public static ChatColor ColorGrayb6t3;
    public static ChatColor ColorGrayb7t3;
    public static ChatColor ColorGrayb8t3;
    public static ChatColor ColorGrayb9t3;
    public static ChatColor ColorGrayb1t4;
    public static ChatColor ColorGrayb2t4;
    public static ChatColor ColorGrayb3t4;
    public static ChatColor ColorGrayb4t4;
    public static ChatColor ColorGrayb5t4;
    public static ChatColor ColorGrayb6t4;
    public static ChatColor ColorGrayb7t4;
    public static ChatColor ColorGrayb8t4;
    public static ChatColor ColorGrayb9t4;
    public static ChatColor ColorGrayb1t5;
    public static ChatColor ColorGrayb2t5;
    public static ChatColor ColorGrayb3t5;
    public static ChatColor ColorGrayb4t5;
    public static ChatColor ColorGrayb5t5;
    public static ChatColor ColorGrayb6t5;
    public static ChatColor ColorGrayb7t5;
    public static ChatColor ColorGrayb8t5;
    public static ChatColor ColorGrayb9t5;
    public static ChatColor ColorGrayb1t6;
    public static ChatColor ColorGrayb2t6;
    public static ChatColor ColorGrayb3t6;
    public static ChatColor ColorGrayb4t6;
    public static ChatColor ColorGrayb5t6;
    public static ChatColor ColorGrayb6t6;
    public static ChatColor ColorGrayb7t6;
    public static ChatColor ColorGrayb8t6;
    public static ChatColor ColorGrayb9t6;
    public static ChatColor ColorGrayb1t7;
    public static ChatColor ColorGrayb2t7;
    public static ChatColor ColorGrayb3t7;
    public static ChatColor ColorGrayb4t7;
    public static ChatColor ColorGrayb5t7;
    public static ChatColor ColorGrayb6t7;
    public static ChatColor ColorGrayb7t7;
    public static ChatColor ColorGrayb8t7;
    public static ChatColor ColorGrayb9t7;
    public static ChatColor ColorGrayb1t8;
    public static ChatColor ColorGrayb2t8;
    public static ChatColor ColorGrayb3t8;
    public static ChatColor ColorGrayb4t8;
    public static ChatColor ColorGrayb5t8;
    public static ChatColor ColorGrayb6t8;
    public static ChatColor ColorGrayb7t8;
    public static ChatColor ColorGrayb8t8;
    public static ChatColor ColorGrayb9t8;
    public static ChatColor ColorGrayb1t9;
    public static ChatColor ColorGrayb2t9;
    public static ChatColor ColorGrayb3t9;
    public static ChatColor ColorGrayb4t9;
    public static ChatColor ColorGrayb5t9;
    public static ChatColor ColorGrayb6t9;
    public static ChatColor ColorGrayb7t9;
    public static ChatColor ColorGrayb8t9;
    public static ChatColor ColorGrayb9t9;
    public static boolean s1;
    public static boolean s2;
    public static boolean s3;
    public static boolean s4;
    public static boolean s5;
    public static boolean s6;
    public static boolean s7;
    public static boolean s8;
    public static boolean s9;
    public static boolean s10;
    public static boolean s11;
    public static boolean s12;
    public static boolean s13;
    public static boolean s14;
    public static boolean s15;
    public static boolean s16;
    public static boolean s17;
    public static boolean s18;
    public static boolean f1;
    public static boolean isReset;
    public static boolean ResetonRestart;
    public static boolean noPlayerReset;
    public static boolean timercountdown;
    public static boolean Countupreset;
    public static boolean damage;
    public static boolean hunger;
    public static boolean keepinventory;
    public static int Teamsize;
    public static int SpawnArea;
    public static int hours;
    public static int minutes;
    public static int seconds;
    public static int Restartseconds;
    static String MM;
    static String SS;
    static String HH;
    static ConfigLink cl;
    private static Main instance;

    static {
        Main.GameStarted = false;
        Main.t1 = new ArrayList<Player>();
        Main.t2 = new ArrayList<Player>();
        Main.t3 = new ArrayList<Player>();
        Main.t4 = new ArrayList<Player>();
        Main.t5 = new ArrayList<Player>();
        Main.t6 = new ArrayList<Player>();
        Main.t7 = new ArrayList<Player>();
        Main.t8 = new ArrayList<Player>();
        Main.t9 = new ArrayList<Player>();
        Main.itemlist = new HashSet<ItemStack>();
        Main.ColorGrayb1t1 = ChatColor.GRAY;
        Main.ColorGrayb2t1 = ChatColor.GRAY;
        Main.ColorGrayb3t1 = ChatColor.GRAY;
        Main.ColorGrayb4t1 = ChatColor.GRAY;
        Main.ColorGrayb5t1 = ChatColor.GRAY;
        Main.ColorGrayb6t1 = ChatColor.GRAY;
        Main.ColorGrayb7t1 = ChatColor.GRAY;
        Main.ColorGrayb8t1 = ChatColor.GRAY;
        Main.ColorGrayb9t1 = ChatColor.GRAY;
        Main.ColorGrayb1t2 = ChatColor.GRAY;
        Main.ColorGrayb2t2 = ChatColor.GRAY;
        Main.ColorGrayb3t2 = ChatColor.GRAY;
        Main.ColorGrayb4t2 = ChatColor.GRAY;
        Main.ColorGrayb5t2 = ChatColor.GRAY;
        Main.ColorGrayb6t2 = ChatColor.GRAY;
        Main.ColorGrayb7t2 = ChatColor.GRAY;
        Main.ColorGrayb8t2 = ChatColor.GRAY;
        Main.ColorGrayb9t2 = ChatColor.GRAY;
        Main.ColorGrayb1t3 = ChatColor.GRAY;
        Main.ColorGrayb2t3 = ChatColor.GRAY;
        Main.ColorGrayb3t3 = ChatColor.GRAY;
        Main.ColorGrayb4t3 = ChatColor.GRAY;
        Main.ColorGrayb5t3 = ChatColor.GRAY;
        Main.ColorGrayb6t3 = ChatColor.GRAY;
        Main.ColorGrayb7t3 = ChatColor.GRAY;
        Main.ColorGrayb8t3 = ChatColor.GRAY;
        Main.ColorGrayb9t3 = ChatColor.GRAY;
        Main.ColorGrayb1t4 = ChatColor.GRAY;
        Main.ColorGrayb2t4 = ChatColor.GRAY;
        Main.ColorGrayb3t4 = ChatColor.GRAY;
        Main.ColorGrayb4t4 = ChatColor.GRAY;
        Main.ColorGrayb5t4 = ChatColor.GRAY;
        Main.ColorGrayb6t4 = ChatColor.GRAY;
        Main.ColorGrayb7t4 = ChatColor.GRAY;
        Main.ColorGrayb8t4 = ChatColor.GRAY;
        Main.ColorGrayb9t4 = ChatColor.GRAY;
        Main.ColorGrayb1t5 = ChatColor.GRAY;
        Main.ColorGrayb2t5 = ChatColor.GRAY;
        Main.ColorGrayb3t5 = ChatColor.GRAY;
        Main.ColorGrayb4t5 = ChatColor.GRAY;
        Main.ColorGrayb5t5 = ChatColor.GRAY;
        Main.ColorGrayb6t5 = ChatColor.GRAY;
        Main.ColorGrayb7t5 = ChatColor.GRAY;
        Main.ColorGrayb8t5 = ChatColor.GRAY;
        Main.ColorGrayb9t5 = ChatColor.GRAY;
        Main.ColorGrayb1t6 = ChatColor.GRAY;
        Main.ColorGrayb2t6 = ChatColor.GRAY;
        Main.ColorGrayb3t6 = ChatColor.GRAY;
        Main.ColorGrayb4t6 = ChatColor.GRAY;
        Main.ColorGrayb5t6 = ChatColor.GRAY;
        Main.ColorGrayb6t6 = ChatColor.GRAY;
        Main.ColorGrayb7t6 = ChatColor.GRAY;
        Main.ColorGrayb8t6 = ChatColor.GRAY;
        Main.ColorGrayb9t6 = ChatColor.GRAY;
        Main.ColorGrayb1t7 = ChatColor.GRAY;
        Main.ColorGrayb2t7 = ChatColor.GRAY;
        Main.ColorGrayb3t7 = ChatColor.GRAY;
        Main.ColorGrayb4t7 = ChatColor.GRAY;
        Main.ColorGrayb5t7 = ChatColor.GRAY;
        Main.ColorGrayb6t7 = ChatColor.GRAY;
        Main.ColorGrayb7t7 = ChatColor.GRAY;
        Main.ColorGrayb8t7 = ChatColor.GRAY;
        Main.ColorGrayb9t7 = ChatColor.GRAY;
        Main.ColorGrayb1t8 = ChatColor.GRAY;
        Main.ColorGrayb2t8 = ChatColor.GRAY;
        Main.ColorGrayb3t8 = ChatColor.GRAY;
        Main.ColorGrayb4t8 = ChatColor.GRAY;
        Main.ColorGrayb5t8 = ChatColor.GRAY;
        Main.ColorGrayb6t8 = ChatColor.GRAY;
        Main.ColorGrayb7t8 = ChatColor.GRAY;
        Main.ColorGrayb8t8 = ChatColor.GRAY;
        Main.ColorGrayb9t8 = ChatColor.GRAY;
        Main.ColorGrayb1t9 = ChatColor.GRAY;
        Main.ColorGrayb2t9 = ChatColor.GRAY;
        Main.ColorGrayb3t9 = ChatColor.GRAY;
        Main.ColorGrayb4t9 = ChatColor.GRAY;
        Main.ColorGrayb5t9 = ChatColor.GRAY;
        Main.ColorGrayb6t9 = ChatColor.GRAY;
        Main.ColorGrayb7t9 = ChatColor.GRAY;
        Main.ColorGrayb8t9 = ChatColor.GRAY;
        Main.ColorGrayb9t9 = ChatColor.GRAY;
        Main.s1 = false;
        Main.s2 = false;
        Main.s3 = false;
        Main.s4 = false;
        Main.s5 = false;
        Main.s6 = false;
        Main.s7 = false;
        Main.s8 = false;
        Main.s9 = false;
        Main.s10 = false;
        Main.s11 = false;
        Main.s12 = false;
        Main.s13 = false;
        Main.s14 = false;
        Main.s15 = false;
        Main.s16 = false;
        Main.s17 = false;
        Main.s18 = false;
        Main.f1 = false;
        Main.isReset = false;
        Main.ResetonRestart = false;
        Main.noPlayerReset = false;
        Main.timercountdown = false;
        Main.Countupreset = false;
        Main.damage = true;
        Main.hunger = true;
        Main.keepinventory = false;
        Main.Teamsize = 2;
        Main.SpawnArea = 100;
        Main.hours = 0;
        Main.minutes = 10;
        Main.seconds = 0;
        Main.Restartseconds = 20;
        Main.MM = "Minuten";
        Main.SS = "Sekunden";
        Main.HH = "Stunden";
    }

    public boolean LobbyStatus;
    public boolean isRestarting;
    public String winner1;
    public String winner2;
    public int players;
    public int spectator;
    public ArrayList<ItemStack> items;
    public boolean b1t1;
    public boolean b2t1;
    public boolean b3t1;
    public boolean b4t1;
    public boolean b5t1;
    public boolean b6t1;
    public boolean b7t1;
    public boolean b8t1;
    public boolean b9t1;
    public boolean b1t2;
    public boolean b2t2;
    public boolean b3t2;
    public boolean b4t2;
    public boolean b5t2;
    public boolean b6t2;
    public boolean b7t2;
    public boolean b8t2;
    public boolean b9t2;
    public boolean b1t3;
    public boolean b2t3;
    public boolean b3t3;
    public boolean b4t3;
    public boolean b5t3;
    public boolean b6t3;
    public boolean b7t3;
    public boolean b8t3;
    public boolean b9t3;
    public boolean b1t4;
    public boolean b2t4;
    public boolean b3t4;
    public boolean b4t4;
    public boolean b5t4;
    public boolean b6t4;
    public boolean b7t4;
    public boolean b8t4;
    public boolean b9t4;
    public boolean b1t5;
    public boolean b2t5;
    public boolean b3t5;
    public boolean b4t5;
    public boolean b5t5;
    public boolean b6t5;
    public boolean b7t5;
    public boolean b8t5;
    public boolean b9t5;
    public boolean b1t6;
    public boolean b2t6;
    public boolean b3t6;
    public boolean b4t6;
    public boolean b5t6;
    public boolean b6t6;
    public boolean b7t6;
    public boolean b8t6;
    public boolean b9t6;
    public boolean b1t7;
    public boolean b2t7;
    public boolean b3t7;
    public boolean b4t7;
    public boolean b5t7;
    public boolean b6t7;
    public boolean b7t7;
    public boolean b8t7;
    public boolean b9t7;
    public boolean b1t8;
    public boolean b2t8;
    public boolean b3t8;
    public boolean b4t8;
    public boolean b5t8;
    public boolean b6t8;
    public boolean b7t8;
    public boolean b8t8;
    public boolean b9t8;
    public boolean b1t9;
    public boolean b2t9;
    public boolean b3t9;
    public boolean b4t9;
    public boolean b5t9;
    public boolean b6t9;
    public boolean b7t9;
    public boolean b8t9;
    public boolean b9t9;
    public int gotitems1;
    public int gotitems2;
    public int gotitems3;
    public int gotitems4;
    public int gotitems5;
    public int gotitems6;
    public int gotitems7;
    public int gotitems8;
    public int gotitems9;
    public ArrayList<ItemStack> foundItemsT1;
    public ArrayList<ItemStack> foundItemsT2;
    public ArrayList<ItemStack> foundItemsT3;
    public ArrayList<ItemStack> foundItemsT4;
    public ArrayList<ItemStack> foundItemsT5;
    public ArrayList<ItemStack> foundItemsT6;
    public ArrayList<ItemStack> foundItemsT7;
    public ArrayList<ItemStack> foundItemsT8;
    public ArrayList<ItemStack> foundItemsT9;
    public boolean randomized;
    public FileConfiguration LangConfig;
    public File LangConfigFile;
    Random r;

    public Main() {
        this.LobbyStatus = true;
        this.isRestarting = false;
        this.players = 0;
        this.spectator = 0;
        this.items = new ArrayList<ItemStack>();
        this.b1t1 = false;
        this.b2t1 = false;
        this.b3t1 = false;
        this.b4t1 = false;
        this.b5t1 = false;
        this.b6t1 = false;
        this.b7t1 = false;
        this.b8t1 = false;
        this.b9t1 = false;
        this.b1t2 = false;
        this.b2t2 = false;
        this.b3t2 = false;
        this.b4t2 = false;
        this.b5t2 = false;
        this.b6t2 = false;
        this.b7t2 = false;
        this.b8t2 = false;
        this.b9t2 = false;
        this.b1t3 = false;
        this.b2t3 = false;
        this.b3t3 = false;
        this.b4t3 = false;
        this.b5t3 = false;
        this.b6t3 = false;
        this.b7t3 = false;
        this.b8t3 = false;
        this.b9t3 = false;
        this.b1t4 = false;
        this.b2t4 = false;
        this.b3t4 = false;
        this.b4t4 = false;
        this.b5t4 = false;
        this.b6t4 = false;
        this.b7t4 = false;
        this.b8t4 = false;
        this.b9t4 = false;
        this.b1t5 = false;
        this.b2t5 = false;
        this.b3t5 = false;
        this.b4t5 = false;
        this.b5t5 = false;
        this.b6t5 = false;
        this.b7t5 = false;
        this.b8t5 = false;
        this.b9t5 = false;
        this.b1t6 = false;
        this.b2t6 = false;
        this.b3t6 = false;
        this.b4t6 = false;
        this.b5t6 = false;
        this.b6t6 = false;
        this.b7t6 = false;
        this.b8t6 = false;
        this.b9t6 = false;
        this.b1t7 = false;
        this.b2t7 = false;
        this.b3t7 = false;
        this.b4t7 = false;
        this.b5t7 = false;
        this.b6t7 = false;
        this.b7t7 = false;
        this.b8t7 = false;
        this.b9t7 = false;
        this.b1t8 = false;
        this.b2t8 = false;
        this.b3t8 = false;
        this.b4t8 = false;
        this.b5t8 = false;
        this.b6t8 = false;
        this.b7t8 = false;
        this.b8t8 = false;
        this.b9t8 = false;
        this.b1t9 = false;
        this.b2t9 = false;
        this.b3t9 = false;
        this.b4t9 = false;
        this.b5t9 = false;
        this.b6t9 = false;
        this.b7t9 = false;
        this.b8t9 = false;
        this.b9t9 = false;
        this.foundItemsT1 = new ArrayList<ItemStack>();
        this.foundItemsT2 = new ArrayList<ItemStack>();
        this.foundItemsT3 = new ArrayList<ItemStack>();
        this.foundItemsT4 = new ArrayList<ItemStack>();
        this.foundItemsT5 = new ArrayList<ItemStack>();
        this.foundItemsT6 = new ArrayList<ItemStack>();
        this.foundItemsT7 = new ArrayList<ItemStack>();
        this.foundItemsT8 = new ArrayList<ItemStack>();
        this.foundItemsT9 = new ArrayList<ItemStack>();
        this.r = new Random();
    }

    public static ConfigLink getCL() {
        return Main.cl;
    }

    public static Main getPlugin() {
        return Main.instance;
    }

    public static int getRandomInt(final int min, final int max) {
        final Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static ArrayList<Integer> getRandomNonRepeatingIntegers(final int size, final int min, final int max) {
        final ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (numbers.size() < size) {
            final int random = getRandomInt(min, max);
            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }
        return numbers;
    }

    public void deleteWorld() {
        final File file = new File("world");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            for (final Player players : Bukkit.getOnlinePlayers()) {
                players.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().gameisrestarting);
            }
            FileUtils.deleteDirectory(file);
        } catch (IOException ex) {
        }
    }

    public void deleteNether() {
        final File file = new File("world_nether");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            for (final Player players : Bukkit.getOnlinePlayers()) {
                players.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().gameisrestarting);
            }
            FileUtils.deleteDirectory(file);
        } catch (IOException ex) {
        }
    }

    public void deleteEnd() {
        final File file = new File("world_the_end");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            for (final Player players : Bukkit.getOnlinePlayers()) {
                players.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().gameisrestarting);
            }
            FileUtils.deleteDirectory(file);
        } catch (IOException ex) {
        }
    }

    public void onLoad() {
        Config.loadConfiguration();
        if (Config.getConfig().contains("reset.isReset") && Config.getConfig().getBoolean("reset.isReset")) {
            this.deleteWorld();
            this.deleteNether();
            this.deleteEnd();
            Main.GameStarted = false;
            this.LobbyStatus = true;
            Config.getConfig().set("reset.isReset", false);
            Config.getConfig().set("reset.ResetonRestart", false);
            try {
                Config.getConfig().save(Config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.randomized = false;
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "World is Reseting!");
        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "World is not Reseting!");
        }
    }

    public void onEnable() {
        this.createCustomConfig();
        Main.instance = this;
        Main.t1.clear();
        Main.t2.clear();
        Main.t3.clear();
        Main.t4.clear();
        Main.t5.clear();
        Main.t6.clear();
        Main.t7.clear();
        Main.t8.clear();
        Main.t9.clear();
        this.getCommand("bingopl").setExecutor(new Bingo_guide(this));
        this.getCommand("bingorestart").setExecutor(new Bingo_restart(this));
        this.getCommand("top").setExecutor(new Bingo_top(this));
        this.getCommand("bingo").setExecutor(new Bingo(this));
        this.getCommand("start").setExecutor(new Start(this));
        this.getCommand("teams").setExecutor(new teams(this));
        this.getCommand("brestart").setExecutor(new Restart(this));
        this.getCommand("settings").setExecutor(new settings(this));
        this.getServer().getPluginManager().registerEvents(new Listeners(this), this);
        final WorldBorder wb = Bukkit.getWorld("world").getWorldBorder();
        wb.setCenter(0.0, 0.0);
        wb.setSize(8000.0, 8000L);
        wb.setWarningTime(5);
        wb.setDamageAmount(0.5);
        Main.cl = new ConfigLink(this);
        Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().pluginstarted);
        if (!Main.timercountdown) {
            Main.hours = 0;
            Main.minutes = 0;
            Main.seconds = 0;
        } else if (Main.timercountdown) {
            Main.hours = 0;
            Main.minutes = 10;
            Main.seconds = 0;
        }
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().pluginstopped);
        Config.saveConfiguration();
        Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + ChatColor.GREEN + "Config Saved");
    }

    public FileConfiguration getLangConfig() {
        return this.LangConfig;
    }

    private void createCustomConfig() {
        this.LangConfigFile = new File(this.getDataFolder(), "language.yml");
        if (!this.LangConfigFile.exists()) {
            this.LangConfigFile.getParentFile().mkdirs();
            this.saveResource("language.yml", false);
        }
        this.LangConfig = new YamlConfiguration();
        try {
            this.LangConfig.load(this.LangConfigFile);
        } catch (IOException | org.bukkit.configuration.InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void deleteWorldWithoutChunk() {
        final World world = Bukkit.getWorld("world");
        final File file = new File("world");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            for (final Player players : Bukkit.getOnlinePlayers()) {
                players.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().gameisrestarting);
            }
            Bukkit.unloadWorld(world.getName(), false);
            FileUtils.deleteDirectory(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void RestartCountDown() {
        if (this.winner1 != null && this.winner2 != null) {
            for (final Player player : Bukkit.getOnlinePlayers()) {
                player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Die Gewinner sind", ChatColor.GOLD + this.winner1 + " " + ChatColor.GREEN + "und" + " " + ChatColor.GOLD + this.winner2, 20, 100, 40);
            }
        } else if (this.winner1 != null) {
            for (final Player player : Bukkit.getOnlinePlayers()) {
                player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Der Gewinner ist", ChatColor.GOLD + this.winner1, 20, 100, 40);
            }
        } else if (this.winner1 == null && this.winner2 == null) {
            for (final Player player : Bukkit.getOnlinePlayers()) {
                player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Kein Gewinner", ChatColor.RED + "Gleichstand!", 20, 100, 40);
            }
        }
        new BukkitRunnable() {
            public void run() {
                if (Main.Restartseconds > 0) {
                    Bukkit.broadcastMessage(String.valueOf(Main.getCL().prefix) + " " + ChatColor.GREEN + "Spiel Restartet in:" + " " + ChatColor.RED + Main.Restartseconds);
                    --Main.Restartseconds;
                    if (Main.Restartseconds < 10) {
                        for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                            soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                        }
                    }
                } else {
                    Main.this.restartGame();
                    this.cancel();
                }
            }
        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
    }

    public void restartGame() {
        for (final Player player : Bukkit.getOnlinePlayers()) {
            if (Main.t1.contains(player)) {
                Main.t1.remove(player);
            } else if (Main.t2.contains(player)) {
                Main.t2.remove(player);
            } else if (Main.t3.contains(player)) {
                Main.t3.remove(player);
            } else if (Main.t4.contains(player)) {
                Main.t4.remove(player);
            } else if (Main.t5.contains(player)) {
                Main.t5.remove(player);
            } else if (Main.t6.contains(player)) {
                Main.t6.remove(player);
            } else if (Main.t7.contains(player)) {
                Main.t7.remove(player);
            } else if (Main.t8.contains(player)) {
                Main.t8.remove(player);
            } else Main.t9.remove(player);
            if (this.winner2 == null && this.winner1 != null) {
                player.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().kickmsgwinOnePlayer.replace("%player%", this.winner1));
            } else if (this.winner1 == null && this.winner2 == null) {
                player.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + ChatColor.GREEN + "Kein Gewinner" + " " + ChatColor.RED + "Gleichstand!");
            } else {
                if (this.winner1 == null || this.winner2 == null) {
                    continue;
                }
                player.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().kickmsgwinTwoPlayer.replace("%player1%", this.winner1).replace("%player2%", this.winner2));
            }
        }
        Config.loadConfiguration();
        if (Config.getConfig().contains("reset.ResetonRestart") && Config.getConfig().getBoolean("reset.ResetonRestart")) {
            Main.GameStarted = false;
            this.LobbyStatus = true;
            Config.getConfig().set("reset.isReset", true);
            try {
                Config.getConfig().save(Config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.randomized = false;
            this.gotitems1 = 0;
            this.gotitems2 = 0;
            this.gotitems3 = 0;
            this.gotitems4 = 0;
            this.gotitems5 = 0;
            this.gotitems6 = 0;
            this.gotitems7 = 0;
            this.gotitems8 = 0;
            this.gotitems9 = 0;
            this.b1t1 = false;
            this.b2t1 = false;
            this.b3t1 = false;
            this.b4t1 = false;
            this.b5t1 = false;
            this.b6t1 = false;
            this.b7t1 = false;
            this.b8t1 = false;
            this.b9t1 = false;
            this.b1t2 = false;
            this.b2t2 = false;
            this.b3t2 = false;
            this.b4t2 = false;
            this.b5t2 = false;
            this.b6t2 = false;
            this.b7t2 = false;
            this.b8t2 = false;
            this.b9t2 = false;
            this.b1t3 = false;
            this.b2t3 = false;
            this.b3t3 = false;
            this.b4t3 = false;
            this.b5t3 = false;
            this.b6t3 = false;
            this.b7t3 = false;
            this.b8t3 = false;
            this.b9t3 = false;
            this.b1t4 = false;
            this.b2t4 = false;
            this.b3t4 = false;
            this.b4t4 = false;
            this.b5t4 = false;
            this.b6t4 = false;
            this.b7t4 = false;
            this.b8t4 = false;
            this.b9t4 = false;
            this.b1t5 = false;
            this.b2t5 = false;
            this.b3t5 = false;
            this.b4t5 = false;
            this.b5t5 = false;
            this.b6t5 = false;
            this.b7t5 = false;
            this.b8t5 = false;
            this.b9t5 = false;
            this.b1t6 = false;
            this.b2t6 = false;
            this.b3t6 = false;
            this.b4t6 = false;
            this.b5t6 = false;
            this.b6t6 = false;
            this.b7t6 = false;
            this.b8t6 = false;
            this.b9t6 = false;
            this.b1t7 = false;
            this.b2t7 = false;
            this.b3t7 = false;
            this.b4t7 = false;
            this.b5t7 = false;
            this.b6t7 = false;
            this.b7t7 = false;
            this.b8t7 = false;
            this.b9t7 = false;
            this.b1t8 = false;
            this.b2t8 = false;
            this.b3t8 = false;
            this.b4t8 = false;
            this.b5t8 = false;
            this.b6t8 = false;
            this.b7t8 = false;
            this.b8t8 = false;
            this.b9t8 = false;
            this.b1t9 = false;
            this.b2t9 = false;
            this.b3t9 = false;
            this.b4t9 = false;
            this.b5t9 = false;
            this.b6t9 = false;
            this.b7t9 = false;
            this.b8t9 = false;
            this.b9t9 = false;
            this.winner1 = null;
            this.winner2 = null;
            Main.t1.clear();
            Main.t2.clear();
            Main.t3.clear();
            Main.t4.clear();
            Main.t5.clear();
            Main.t6.clear();
            Main.t7.clear();
            Main.t8.clear();
            Main.t9.clear();
            this.foundItemsT1.clear();
            this.foundItemsT2.clear();
            this.foundItemsT3.clear();
            this.foundItemsT4.clear();
            this.foundItemsT5.clear();
            this.foundItemsT6.clear();
            this.foundItemsT7.clear();
            this.foundItemsT8.clear();
            this.foundItemsT9.clear();
        }
        Bukkit.spigot().restart();
    }

    public void manuallyRestarting() {
        this.isRestarting = true;
        for (final Player player : Bukkit.getOnlinePlayers()) {
            if (Main.t1.contains(player)) {
                Main.t1.remove(player);
            } else if (Main.t2.contains(player)) {
                Main.t2.remove(player);
            } else if (Main.t3.contains(player)) {
                Main.t3.remove(player);
            } else if (Main.t4.contains(player)) {
                Main.t4.remove(player);
            } else if (Main.t5.contains(player)) {
                Main.t5.remove(player);
            } else if (Main.t6.contains(player)) {
                Main.t6.remove(player);
            } else if (Main.t7.contains(player)) {
                Main.t7.remove(player);
            } else if (Main.t8.contains(player)) {
                Main.t8.remove(player);
            } else Main.t9.remove(player);
            player.kickPlayer(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().gameisrestarting);
        }
        Config.loadConfiguration();
        if (Config.getConfig().contains("reset.ResetonRestart") && Config.getConfig().getBoolean("reset.ResetonRestart")) {
            Main.GameStarted = false;
            this.LobbyStatus = true;
            Config.getConfig().set("reset.isReset", true);
            try {
                Config.getConfig().save(Config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.randomized = false;
            this.gotitems1 = 0;
            this.gotitems2 = 0;
            this.gotitems3 = 0;
            this.gotitems4 = 0;
            this.gotitems5 = 0;
            this.gotitems6 = 0;
            this.gotitems7 = 0;
            this.gotitems8 = 0;
            this.gotitems9 = 0;
            this.b1t1 = false;
            this.b2t1 = false;
            this.b3t1 = false;
            this.b4t1 = false;
            this.b5t1 = false;
            this.b6t1 = false;
            this.b7t1 = false;
            this.b8t1 = false;
            this.b9t1 = false;
            this.b1t2 = false;
            this.b2t2 = false;
            this.b3t2 = false;
            this.b4t2 = false;
            this.b5t2 = false;
            this.b6t2 = false;
            this.b7t2 = false;
            this.b8t2 = false;
            this.b9t2 = false;
            this.b1t3 = false;
            this.b2t3 = false;
            this.b3t3 = false;
            this.b4t3 = false;
            this.b5t3 = false;
            this.b6t3 = false;
            this.b7t3 = false;
            this.b8t3 = false;
            this.b9t3 = false;
            this.b1t4 = false;
            this.b2t4 = false;
            this.b3t4 = false;
            this.b4t4 = false;
            this.b5t4 = false;
            this.b6t4 = false;
            this.b7t4 = false;
            this.b8t4 = false;
            this.b9t4 = false;
            this.b1t5 = false;
            this.b2t5 = false;
            this.b3t5 = false;
            this.b4t5 = false;
            this.b5t5 = false;
            this.b6t5 = false;
            this.b7t5 = false;
            this.b8t5 = false;
            this.b9t5 = false;
            this.b1t6 = false;
            this.b2t6 = false;
            this.b3t6 = false;
            this.b4t6 = false;
            this.b5t6 = false;
            this.b6t6 = false;
            this.b7t6 = false;
            this.b8t6 = false;
            this.b9t6 = false;
            this.b1t7 = false;
            this.b2t7 = false;
            this.b3t7 = false;
            this.b4t7 = false;
            this.b5t7 = false;
            this.b6t7 = false;
            this.b7t7 = false;
            this.b8t7 = false;
            this.b9t7 = false;
            this.b1t8 = false;
            this.b2t8 = false;
            this.b3t8 = false;
            this.b4t8 = false;
            this.b5t8 = false;
            this.b6t8 = false;
            this.b7t8 = false;
            this.b8t8 = false;
            this.b9t8 = false;
            this.b1t9 = false;
            this.b2t9 = false;
            this.b3t9 = false;
            this.b4t9 = false;
            this.b5t9 = false;
            this.b6t9 = false;
            this.b7t9 = false;
            this.b8t9 = false;
            this.b9t9 = false;
            Main.t1.clear();
            Main.t2.clear();
            Main.t3.clear();
            Main.t4.clear();
            Main.t5.clear();
            Main.t6.clear();
            Main.t7.clear();
            Main.t8.clear();
            Main.t9.clear();
            this.winner1 = null;
            this.winner2 = null;
            this.foundItemsT1.clear();
            this.foundItemsT2.clear();
            this.foundItemsT3.clear();
            this.foundItemsT4.clear();
            this.foundItemsT5.clear();
            this.foundItemsT6.clear();
            this.foundItemsT7.clear();
            this.foundItemsT8.clear();
            this.foundItemsT9.clear();
        }
        Bukkit.spigot().restart();
    }

    public void noPlayerRestart() {
        Config.loadConfiguration();
        if (Config.getConfig().contains("reset.noPlayerReset") && Config.getConfig().getBoolean("reset.noPlayerReset")) {
            Main.GameStarted = false;
            this.LobbyStatus = true;
            Config.getConfig().set("reset.noPlayerReset", false);
            try {
                Config.getConfig().save(Config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.randomized = false;
            this.gotitems1 = 0;
            this.gotitems2 = 0;
            this.gotitems3 = 0;
            this.gotitems4 = 0;
            this.gotitems5 = 0;
            this.gotitems6 = 0;
            this.gotitems7 = 0;
            this.gotitems8 = 0;
            this.gotitems9 = 0;
            this.b1t1 = false;
            this.b2t1 = false;
            this.b3t1 = false;
            this.b4t1 = false;
            this.b5t1 = false;
            this.b6t1 = false;
            this.b7t1 = false;
            this.b8t1 = false;
            this.b9t1 = false;
            this.b1t2 = false;
            this.b2t2 = false;
            this.b3t2 = false;
            this.b4t2 = false;
            this.b5t2 = false;
            this.b6t2 = false;
            this.b7t2 = false;
            this.b8t2 = false;
            this.b9t2 = false;
            this.b1t3 = false;
            this.b2t3 = false;
            this.b3t3 = false;
            this.b4t3 = false;
            this.b5t3 = false;
            this.b6t3 = false;
            this.b7t3 = false;
            this.b8t3 = false;
            this.b9t3 = false;
            this.b1t4 = false;
            this.b2t4 = false;
            this.b3t4 = false;
            this.b4t4 = false;
            this.b5t4 = false;
            this.b6t4 = false;
            this.b7t4 = false;
            this.b8t4 = false;
            this.b9t4 = false;
            this.b1t5 = false;
            this.b2t5 = false;
            this.b3t5 = false;
            this.b4t5 = false;
            this.b5t5 = false;
            this.b6t5 = false;
            this.b7t5 = false;
            this.b8t5 = false;
            this.b9t5 = false;
            this.b1t6 = false;
            this.b2t6 = false;
            this.b3t6 = false;
            this.b4t6 = false;
            this.b5t6 = false;
            this.b6t6 = false;
            this.b7t6 = false;
            this.b8t6 = false;
            this.b9t6 = false;
            this.b1t7 = false;
            this.b2t7 = false;
            this.b3t7 = false;
            this.b4t7 = false;
            this.b5t7 = false;
            this.b6t7 = false;
            this.b7t7 = false;
            this.b8t7 = false;
            this.b9t7 = false;
            this.b1t8 = false;
            this.b2t8 = false;
            this.b3t8 = false;
            this.b4t8 = false;
            this.b5t8 = false;
            this.b6t8 = false;
            this.b7t8 = false;
            this.b8t8 = false;
            this.b9t8 = false;
            this.b1t9 = false;
            this.b2t9 = false;
            this.b3t9 = false;
            this.b4t9 = false;
            this.b5t9 = false;
            this.b6t9 = false;
            this.b7t9 = false;
            this.b8t9 = false;
            this.b9t9 = false;
            Main.t1.clear();
            Main.t2.clear();
            Main.t3.clear();
            Main.t4.clear();
            Main.t5.clear();
            Main.t6.clear();
            Main.t7.clear();
            Main.t8.clear();
            Main.t9.clear();
            this.winner1 = null;
            this.winner2 = null;
            this.foundItemsT1.clear();
            this.foundItemsT2.clear();
            this.foundItemsT3.clear();
            this.foundItemsT4.clear();
            this.foundItemsT5.clear();
            this.foundItemsT6.clear();
            this.foundItemsT7.clear();
            this.foundItemsT8.clear();
            this.foundItemsT9.clear();
            Bukkit.spigot().restart();
        }
    }

    public void CountDown() {
        new BukkitRunnable() {
            public void run() {
                if (Main.GameStarted) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        final String Zeit = " " + ChatColor.GRAY + "||" + " " + ChatColor.GOLD + Main.hours + " " + ChatColor.GREEN + Main.HH + " " + ChatColor.GOLD + Main.minutes + " " + ChatColor.GREEN + Main.MM + " " + ChatColor.GOLD + Main.seconds + " " + ChatColor.GREEN + Main.SS;
                        if (Main.t1.contains(player)) {
                            final String actionbar1 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems1));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar1 + Zeit));
                        } else if (Main.t2.contains(player)) {
                            final String actionbar2 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems2));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar2 + Zeit));
                        } else if (Main.t3.contains(player)) {
                            final String actionbar3 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems3));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar3 + Zeit));
                        } else if (Main.t4.contains(player)) {
                            final String actionbar4 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems4));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar4 + Zeit));
                        } else if (Main.t5.contains(player)) {
                            final String actionbar5 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems5));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar5 + Zeit));
                        } else if (Main.t6.contains(player)) {
                            final String actionbar6 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems6));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar6 + Zeit));
                        } else if (Main.t7.contains(player)) {
                            final String actionbar7 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems7));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar7 + Zeit));
                        } else if (Main.t8.contains(player)) {
                            final String actionbar8 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems8));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar8 + Zeit));
                        } else {
                            if (!Main.t9.contains(player)) {
                                continue;
                            }
                            final String actionbar9 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems9));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar9 + Zeit));
                        }
                    }
                }
                if (Main.seconds == 1) {
                    Main.SS = "Sekunde";
                } else if (Main.seconds == 0) {
                    Main.SS = "Sekunden";
                } else if (Main.seconds > 1) {
                    Main.SS = "Sekunden";
                }
                if (Main.minutes == 1) {
                    Main.MM = "Minute";
                } else if (Main.minutes == 0) {
                    Main.MM = "Minuten";
                } else if (Main.minutes > 1) {
                    Main.MM = "Minuten";
                }
                if (Main.hours == 1) {
                    Main.HH = "Stunde";
                } else if (Main.hours > 1) {
                    Main.HH = "Stunden";
                } else if (Main.hours == 0) {
                    Main.HH = "Stunden";
                }
                if (Main.timercountdown) {
                    if (Main.seconds > 0) {
                        --Main.seconds;
                    } else if (Main.seconds == 0 && Main.minutes > 0) {
                        --Main.minutes;
                        Main.seconds = 60;
                    } else if (Main.minutes == 0 && Main.hours > 0) {
                        --Main.hours;
                        Main.minutes = 60;
                    } else if (Main.minutes == 0 && Main.seconds == 0 && Main.hours == 0 && Main.timercountdown) {
                        Bukkit.broadcastMessage(String.valueOf(Main.getCL().prefix) + " " + ChatColor.RED + "Die Zeit ist abgelaufen!");
                        if (Main.this.gotitems1 > Main.this.gotitems2 && Main.this.gotitems1 > Main.this.gotitems3 && Main.this.gotitems1 > Main.this.gotitems4 && Main.this.gotitems1 > Main.this.gotitems5 && Main.this.gotitems1 > Main.this.gotitems6 && Main.this.gotitems1 > Main.this.gotitems7 && Main.this.gotitems1 > Main.this.gotitems8 && Main.this.gotitems1 > Main.this.gotitems9) {
                            if (Main.t1.size() == 1) {
                                Main.this.winner1 = Main.t1.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t1.get(0).getName();
                                Main.this.winner2 = Main.t1.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems2 > Main.this.gotitems1 && Main.this.gotitems2 > Main.this.gotitems3 && Main.this.gotitems2 > Main.this.gotitems4 && Main.this.gotitems2 > Main.this.gotitems5 && Main.this.gotitems2 > Main.this.gotitems6 && Main.this.gotitems2 > Main.this.gotitems7 && Main.this.gotitems2 > Main.this.gotitems8 && Main.this.gotitems2 > Main.this.gotitems9) {
                            if (Main.t2.size() == 1) {
                                Main.this.winner1 = Main.t2.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t2.get(0).getName();
                                Main.this.winner2 = Main.t2.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems3 > Main.this.gotitems2 && Main.this.gotitems3 > Main.this.gotitems1 && Main.this.gotitems3 > Main.this.gotitems4 && Main.this.gotitems3 > Main.this.gotitems5 && Main.this.gotitems3 > Main.this.gotitems6 && Main.this.gotitems3 > Main.this.gotitems7 && Main.this.gotitems3 > Main.this.gotitems8 && Main.this.gotitems3 > Main.this.gotitems9) {
                            if (Main.t3.size() == 1) {
                                Main.this.winner1 = Main.t3.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t3.get(0).getName();
                                Main.this.winner2 = Main.t3.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems4 > Main.this.gotitems2 && Main.this.gotitems4 > Main.this.gotitems3 && Main.this.gotitems4 > Main.this.gotitems1 && Main.this.gotitems4 > Main.this.gotitems5 && Main.this.gotitems4 > Main.this.gotitems6 && Main.this.gotitems4 > Main.this.gotitems7 && Main.this.gotitems4 > Main.this.gotitems8 && Main.this.gotitems4 > Main.this.gotitems9) {
                            if (Main.t4.size() == 1) {
                                Main.this.winner1 = Main.t4.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t4.get(0).getName();
                                Main.this.winner2 = Main.t4.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems5 > Main.this.gotitems2 && Main.this.gotitems5 > Main.this.gotitems3 && Main.this.gotitems5 > Main.this.gotitems4 && Main.this.gotitems5 > Main.this.gotitems1 && Main.this.gotitems5 > Main.this.gotitems6 && Main.this.gotitems5 > Main.this.gotitems7 && Main.this.gotitems5 > Main.this.gotitems8 && Main.this.gotitems5 > Main.this.gotitems9) {
                            if (Main.t5.size() == 1) {
                                Main.this.winner1 = Main.t5.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t5.get(0).getName();
                                Main.this.winner2 = Main.t5.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems6 > Main.this.gotitems2 && Main.this.gotitems6 > Main.this.gotitems3 && Main.this.gotitems6 > Main.this.gotitems4 && Main.this.gotitems6 > Main.this.gotitems5 && Main.this.gotitems6 > Main.this.gotitems1 && Main.this.gotitems6 > Main.this.gotitems7 && Main.this.gotitems6 > Main.this.gotitems8 && Main.this.gotitems6 > Main.this.gotitems9) {
                            if (Main.t6.size() == 1) {
                                Main.this.winner1 = Main.t6.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t6.get(0).getName();
                                Main.this.winner2 = Main.t6.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems7 > Main.this.gotitems2 && Main.this.gotitems7 > Main.this.gotitems3 && Main.this.gotitems7 > Main.this.gotitems4 && Main.this.gotitems7 > Main.this.gotitems5 && Main.this.gotitems7 > Main.this.gotitems6 && Main.this.gotitems7 > Main.this.gotitems1 && Main.this.gotitems7 > Main.this.gotitems8 && Main.this.gotitems7 > Main.this.gotitems9) {
                            if (Main.t7.size() == 1) {
                                Main.this.winner1 = Main.t7.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t7.get(0).getName();
                                Main.this.winner2 = Main.t7.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems8 > Main.this.gotitems2 && Main.this.gotitems8 > Main.this.gotitems3 && Main.this.gotitems8 > Main.this.gotitems4 && Main.this.gotitems8 > Main.this.gotitems5 && Main.this.gotitems8 > Main.this.gotitems6 && Main.this.gotitems8 > Main.this.gotitems7 && Main.this.gotitems8 > Main.this.gotitems1 && Main.this.gotitems8 > Main.this.gotitems9) {
                            if (Main.t8.size() == 1) {
                                Main.this.winner1 = Main.t8.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t8.get(0).getName();
                                Main.this.winner2 = Main.t8.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems9 > Main.this.gotitems2 && Main.this.gotitems9 > Main.this.gotitems3 && Main.this.gotitems9 > Main.this.gotitems4 && Main.this.gotitems9 > Main.this.gotitems5 && Main.this.gotitems9 > Main.this.gotitems6 && Main.this.gotitems9 > Main.this.gotitems7 && Main.this.gotitems9 > Main.this.gotitems8 && Main.this.gotitems9 > Main.this.gotitems1) {
                            if (Main.t9.size() == 1) {
                                Main.this.winner1 = Main.t9.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t9.get(0).getName();
                                Main.this.winner2 = Main.t9.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems9 == Main.this.gotitems2 && Main.this.gotitems9 == Main.this.gotitems3 && Main.this.gotitems9 == Main.this.gotitems4 && Main.this.gotitems9 == Main.this.gotitems5 && Main.this.gotitems9 == Main.this.gotitems6 && Main.this.gotitems9 == Main.this.gotitems7 && Main.this.gotitems9 == Main.this.gotitems8 && Main.this.gotitems9 == Main.this.gotitems1) {
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                    }
                }
                if (!Main.timercountdown) {
                    if (Main.hours == 0 && Main.minutes == 0 && Main.seconds == 0 && !Main.timercountdown) {
                        Main.seconds = 5;
                        Main.seconds = 0;
                    }
                    if (Main.seconds == 0 || (Main.seconds > 0 && !Main.timercountdown)) {
                        ++Main.seconds;
                    }
                    if (Main.seconds == 59 && !Main.timercountdown) {
                        ++Main.minutes;
                        Main.seconds = 0;
                    }
                    if (Main.minutes == 59 && !Main.timercountdown) {
                        ++Main.hours;
                        Main.minutes = 0;
                    }
                }
            }
        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
    }

    public void startGame() {
        this.CountDown();
        for (final Player aplayer : Bukkit.getOnlinePlayers()) {
            if (!Main.t1.contains(aplayer) && !Main.t2.contains(aplayer) && !Main.t3.contains(aplayer) && !Main.t4.contains(aplayer) && !Main.t5.contains(aplayer) && !Main.t6.contains(aplayer) && !Main.t7.contains(aplayer) && !Main.t8.contains(aplayer) && !Main.t9.contains(aplayer)) {
                if (Main.t1.size() < Main.Teamsize) {
                    Main.t1.add(aplayer);
                } else if (Main.t2.size() < Main.Teamsize) {
                    Main.t2.add(aplayer);
                } else if (Main.t3.size() < Main.Teamsize) {
                    Main.t3.add(aplayer);
                } else if (Main.t4.size() < Main.Teamsize) {
                    Main.t4.add(aplayer);
                } else if (Main.t5.size() < Main.Teamsize) {
                    Main.t5.add(aplayer);
                } else if (Main.t6.size() < Main.Teamsize) {
                    Main.t6.add(aplayer);
                } else if (Main.t7.size() < Main.Teamsize) {
                    Main.t7.add(aplayer);
                } else if (Main.t8.size() < Main.Teamsize) {
                    Main.t8.add(aplayer);
                } else if (Main.t9.size() < Main.Teamsize) {
                    Main.t9.add(aplayer);
                }
            }
            if (Main.t1.contains(aplayer)) {
                aplayer.setPlayerListName("§6" + aplayer.getName());
            } else if (Main.t2.contains(aplayer)) {
                aplayer.setPlayerListName("§c" + aplayer.getName());
            } else if (Main.t3.contains(aplayer)) {
                aplayer.setPlayerListName("§d" + aplayer.getName());
            } else if (Main.t4.contains(aplayer)) {
                aplayer.setPlayerListName("§f" + aplayer.getName());
            } else if (Main.t5.contains(aplayer)) {
                aplayer.setPlayerListName("§1" + aplayer.getName());
            } else if (Main.t6.contains(aplayer)) {
                aplayer.setPlayerListName("§e" + aplayer.getName());
            } else if (Main.t7.contains(aplayer)) {
                aplayer.setPlayerListName("§a" + aplayer.getName());
            } else if (Main.t8.contains(aplayer)) {
                aplayer.setPlayerListName("§7" + aplayer.getName());
            } else {
                if (!Main.t9.contains(aplayer)) {
                    continue;
                }
                aplayer.setPlayerListName("§5" + aplayer.getName());
            }
        }
        Main.GameStarted = true;
        this.LobbyStatus = false;
        Config.loadConfiguration();
        final int l1x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l1z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l2x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l2z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l3x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l3z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l4x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l4z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l5x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l5z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l6x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l6z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l7x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l7z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l8x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l8z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l9x = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final int l9z = ThreadLocalRandom.current().nextInt(-Main.SpawnArea, Main.SpawnArea);
        final Location l1 = new Location(Bukkit.getWorld("world"), l1x, Bukkit.getWorld("world").getHighestBlockAt(l1x, l1z).getY(), l1z);
        final Location l2 = new Location(Bukkit.getWorld("world"), l2x, Bukkit.getWorld("world").getHighestBlockAt(l2x, l2z).getY(), l2z);
        final Location l3 = new Location(Bukkit.getWorld("world"), l3x, Bukkit.getWorld("world").getHighestBlockAt(l3x, l3z).getY(), l3z);
        final Location l4 = new Location(Bukkit.getWorld("world"), l4x, Bukkit.getWorld("world").getHighestBlockAt(l4x, l4z).getY(), l4z);
        final Location l5 = new Location(Bukkit.getWorld("world"), l5x, Bukkit.getWorld("world").getHighestBlockAt(l5x, l5z).getY(), l5z);
        final Location l6 = new Location(Bukkit.getWorld("world"), l6x, Bukkit.getWorld("world").getHighestBlockAt(l6x, l6z).getY(), l6z);
        final Location l7 = new Location(Bukkit.getWorld("world"), l7x, Bukkit.getWorld("world").getHighestBlockAt(l7x, l7z).getY(), l7z);
        final Location l8 = new Location(Bukkit.getWorld("world"), l8x, Bukkit.getWorld("world").getHighestBlockAt(l8x, l8z).getY(), l8z);
        final Location l9 = new Location(Bukkit.getWorld("world"), l9x, Bukkit.getWorld("world").getHighestBlockAt(l9x, l9z).getY(), l9z);
        Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().FollowingTeamTeleported);
        if (!Main.t1.isEmpty()) {
            if (Main.t1.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T1OnePlayer.replace("%player%", Main.t1.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T1TwoPlayer.replace("%player1%", Main.t1.get(0).getName()).replace("%player2%", Main.t1.get(1).getName()));
            }
        }
        if (!Main.t2.isEmpty()) {
            if (Main.t2.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T2OnePlayer.replace("%player%", Main.t2.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T2TwoPlayer.replace("%player1%", Main.t2.get(0).getName()).replace("%player2%", Main.t2.get(1).getName()));
            }
        }
        if (!Main.t3.isEmpty()) {
            if (Main.t3.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T3OnePlayer.replace("%player%", Main.t3.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T3TwoPlayer.replace("%player1%", Main.t3.get(0).getName()).replace("%player2%", Main.t3.get(1).getName()));
            }
        }
        if (!Main.t4.isEmpty()) {
            if (Main.t4.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T4OnePlayer.replace("%player%", Main.t4.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T4TwoPlayer.replace("%player1%", Main.t4.get(0).getName()).replace("%player2%", Main.t4.get(1).getName()));
            }
        }
        if (!Main.t5.isEmpty()) {
            if (Main.t5.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T5OnePlayer.replace("%player%", Main.t5.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T5TwoPlayer.replace("%player1%", Main.t5.get(0).getName()).replace("%player2%", Main.t5.get(1).getName()));
            }
        }
        if (!Main.t6.isEmpty()) {
            if (Main.t6.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T6OnePlayer.replace("%player%", Main.t6.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T6TwoPlayer.replace("%player1%", Main.t6.get(0).getName()).replace("%player2%", Main.t6.get(1).getName()));
            }
        }
        if (!Main.t7.isEmpty()) {
            if (Main.t7.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T7OnePlayer.replace("%player%", Main.t7.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T7TwoPlayer.replace("%player1%", Main.t7.get(0).getName()).replace("%player2%", Main.t7.get(1).getName()));
            }
        }
        if (!Main.t8.isEmpty()) {
            if (Main.t8.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T8OnePlayer.replace("%player%", Main.t8.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T8TwoPlayer.replace("%player1%", Main.t8.get(0).getName()).replace("%player2%", Main.t8.get(1).getName()));
            }
        }
        if (!Main.t9.isEmpty()) {
            if (Main.t9.size() == 1) {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T9OnePlayer.replace("%player%", Main.t9.get(0).getName()));
            } else {
                Bukkit.broadcastMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().T9TwoPlayer.replace("%player1%", Main.t9.get(0).getName()).replace("%player2%", Main.t9.get(1).getName()));
            }
        }
        for (final Player tplayer : Main.t1) {
            tplayer.teleport(l1);
        }
        for (final Player tplayer : Main.t2) {
            tplayer.teleport(l2);
        }
        for (final Player tplayer : Main.t3) {
            tplayer.teleport(l3);
        }
        for (final Player tplayer : Main.t4) {
            tplayer.teleport(l4);
        }
        for (final Player tplayer : Main.t5) {
            tplayer.teleport(l5);
        }
        for (final Player tplayer : Main.t6) {
            tplayer.teleport(l6);
        }
        for (final Player tplayer : Main.t7) {
            tplayer.teleport(l7);
        }
        for (final Player tplayer : Main.t8) {
            tplayer.teleport(l8);
        }
        for (final Player tplayer : Main.t9) {
            tplayer.teleport(l9);
        }
        for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
            soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 0.3f, 1.0f);
        }
        for (final Player player : Bukkit.getOnlinePlayers()) {
            player.setAllowFlight(false);
            player.getPlayer().setFlying(false);
            player.getPlayer().setCollidable(true);
            player.setHealth(20.0);
            player.setFoodLevel(20);
            player.getPlayer().getInventory().clear();
            final ItemStack boat = new ItemStack(Material.OAK_BOAT, 1);
            final ItemMeta boatmeta = boat.getItemMeta();
            boatmeta.setDisplayName(getCL().BoatName);
            boat.setItemMeta(boatmeta);
            player.getInventory().setItem(0, boat);
            player.sendMessage(String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().StartMessage);
            player.setPlayerListHeader(getCL().tablistheaderingame);
            final String foundt1 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam1;
            final String foundt2 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam2;
            final String foundt3 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam3;
            final String foundt4 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam4;
            final String foundt5 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam5;
            final String foundt6 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam6;
            final String foundt7 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam7;
            final String foundt8 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam8;
            final String foundt9 = String.valueOf(String.valueOf(getCL().prefix)) + " " + getCL().teamfounditemTeam9;
            new BukkitRunnable() {
                public void run() {
                    if (Main.t1.contains(player)) {
                        player.setPlayerListName("\u00ef¿½6" + player.getName());
                    }
                    if (Main.t2.contains(player)) {
                        player.setPlayerListName("\u00ef¿½c" + player.getName());
                    }
                    if (Main.t3.contains(player)) {
                        player.setPlayerListName("\u00ef¿½d" + player.getName());
                    }
                    if (Main.t4.contains(player)) {
                        player.setPlayerListName("\u00ef¿½f" + player.getName());
                    }
                    if (Main.t5.contains(player)) {
                        player.setPlayerListName("\u00ef¿½1" + player.getName());
                    }
                    if (Main.t6.contains(player)) {
                        player.setPlayerListName("\u00ef¿½e" + player.getName());
                    }
                    if (Main.t7.contains(player)) {
                        player.setPlayerListName("\u00ef¿½a" + player.getName());
                    }
                    if (Main.t8.contains(player)) {
                        player.setPlayerListName("\u00ef¿½7" + player.getName());
                    }
                    if (Main.t9.contains(player)) {
                        player.setPlayerListName("\u00ef¿½5" + player.getName());
                    }
                    final String Zeit = " " + ChatColor.GRAY + "||" + " " + ChatColor.GOLD + Main.hours + " " + ChatColor.GREEN + Main.HH + " " + ChatColor.GOLD + Main.minutes + " " + ChatColor.GREEN + Main.MM + " " + ChatColor.GOLD + Main.seconds + " " + ChatColor.GREEN + Main.SS;
                    if (Main.t1.contains(player)) {
                        final String actionbar1 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems1));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar1 + Zeit));
                    } else if (Main.t2.contains(player)) {
                        final String actionbar2 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems2));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar2 + Zeit));
                    } else if (Main.t3.contains(player)) {
                        final String actionbar3 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems3));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar3 + Zeit));
                    } else if (Main.t4.contains(player)) {
                        final String actionbar4 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems4));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar4 + Zeit));
                    } else if (Main.t5.contains(player)) {
                        final String actionbar5 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems5));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar5 + Zeit));
                    } else if (Main.t6.contains(player)) {
                        final String actionbar6 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems6));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar6 + Zeit));
                    } else if (Main.t7.contains(player)) {
                        final String actionbar7 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems7));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar7 + Zeit));
                    } else if (Main.t8.contains(player)) {
                        final String actionbar8 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems8));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar8 + Zeit));
                    } else if (Main.t9.contains(player)) {
                        final String actionbar9 = Main.cl.ActionBar.replace("%gotitems%", String.valueOf(Main.this.gotitems9));
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar9 + Zeit));
                    }
                    for (final Player p : Bukkit.getOnlinePlayers()) {
                        if (p.getInventory().containsAtLeast(Main.b1, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b1t1) {
                                    Main.this.b1t1 = true;
                                    final Main this$0 = Main.this;
                                    ++this$0.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b1);
                                    Main.ColorGrayb1t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b1t2) {
                                    Main.this.b1t2 = true;
                                    final Main this$2 = Main.this;
                                    ++this$2.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b1);
                                    Main.ColorGrayb1t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b1t4) {
                                    Main.this.b1t4 = true;
                                    final Main this$3 = Main.this;
                                    ++this$3.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b1);
                                    Main.ColorGrayb1t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b1t5) {
                                    Main.this.b1t5 = true;
                                    final Main this$4 = Main.this;
                                    ++this$4.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b1);
                                    Main.ColorGrayb1t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b1t6) {
                                    Main.this.b1t6 = true;
                                    final Main this$5 = Main.this;
                                    ++this$5.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b1);
                                    Main.ColorGrayb1t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b1t7) {
                                    Main.this.b1t7 = true;
                                    final Main this$6 = Main.this;
                                    ++this$6.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b1);
                                    Main.ColorGrayb1t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b1t8) {
                                    Main.this.b1t8 = true;
                                    final Main this$7 = Main.this;
                                    ++this$7.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b1);
                                    Main.ColorGrayb1t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b1t9) {
                                    Main.this.b1t9 = true;
                                    final Main this$8 = Main.this;
                                    ++this$8.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b1);
                                    Main.ColorGrayb1t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b1.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b1t3) {
                                Main.this.b1t3 = true;
                                final Main this$9 = Main.this;
                                ++this$9.gotitems3;
                                Main.this.foundItemsT3.add(Main.b1);
                                Main.ColorGrayb1t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b1.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b2, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b2t1) {
                                    Main.this.b2t1 = true;
                                    final Main this$10 = Main.this;
                                    ++this$10.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b2);
                                    Main.ColorGrayb2t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b2t2) {
                                    Main.this.b2t2 = true;
                                    final Main this$11 = Main.this;
                                    ++this$11.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b2);
                                    Main.ColorGrayb2t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b2t4) {
                                    Main.this.b2t4 = true;
                                    final Main this$12 = Main.this;
                                    ++this$12.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b2);
                                    Main.ColorGrayb2t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b2t5) {
                                    Main.this.b2t5 = true;
                                    final Main this$13 = Main.this;
                                    ++this$13.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b2);
                                    Main.ColorGrayb2t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b2t6) {
                                    Main.this.b2t6 = true;
                                    final Main this$14 = Main.this;
                                    ++this$14.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b2);
                                    Main.ColorGrayb2t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b2t7) {
                                    Main.this.b2t7 = true;
                                    final Main this$15 = Main.this;
                                    ++this$15.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b2);
                                    Main.ColorGrayb2t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b2t8) {
                                    Main.this.b2t8 = true;
                                    final Main this$16 = Main.this;
                                    ++this$16.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b2);
                                    Main.ColorGrayb2t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b2t9) {
                                    Main.this.b2t9 = true;
                                    final Main this$17 = Main.this;
                                    ++this$17.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b2);
                                    Main.ColorGrayb2t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b2.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b2t3) {
                                Main.this.b2t3 = true;
                                final Main this$18 = Main.this;
                                ++this$18.gotitems3;
                                Main.this.foundItemsT3.add(Main.b2);
                                Main.ColorGrayb2t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b2.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b3, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b3t1) {
                                    Main.this.b3t1 = true;
                                    final Main this$19 = Main.this;
                                    ++this$19.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b3);
                                    Main.ColorGrayb3t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b3t2) {
                                    Main.this.b3t2 = true;
                                    final Main this$20 = Main.this;
                                    ++this$20.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b3);
                                    Main.ColorGrayb3t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b3t4) {
                                    Main.this.b3t4 = true;
                                    final Main this$21 = Main.this;
                                    ++this$21.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b3);
                                    Main.ColorGrayb3t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b3t5) {
                                    Main.this.b3t5 = true;
                                    final Main this$22 = Main.this;
                                    ++this$22.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b3);
                                    Main.ColorGrayb3t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b3t6) {
                                    Main.this.b3t6 = true;
                                    final Main this$23 = Main.this;
                                    ++this$23.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b3);
                                    Main.ColorGrayb3t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b3t7) {
                                    Main.this.b3t7 = true;
                                    final Main this$24 = Main.this;
                                    ++this$24.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b3);
                                    Main.ColorGrayb3t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b3t8) {
                                    Main.this.b3t8 = true;
                                    final Main this$25 = Main.this;
                                    ++this$25.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b3);
                                    Main.ColorGrayb3t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b3t9) {
                                    Main.this.b3t9 = true;
                                    final Main this$26 = Main.this;
                                    ++this$26.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b3);
                                    Main.ColorGrayb3t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b3.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b3t3) {
                                Main.this.b3t3 = true;
                                final Main this$27 = Main.this;
                                ++this$27.gotitems3;
                                Main.this.foundItemsT3.add(Main.b3);
                                Main.ColorGrayb3t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b3.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b4, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b4t1) {
                                    Main.this.b4t1 = true;
                                    final Main this$28 = Main.this;
                                    ++this$28.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b4);
                                    Main.ColorGrayb4t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b4t2) {
                                    Main.this.b4t2 = true;
                                    final Main this$29 = Main.this;
                                    ++this$29.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b4);
                                    Main.ColorGrayb4t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b4t4) {
                                    Main.this.b4t4 = true;
                                    final Main this$30 = Main.this;
                                    ++this$30.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b4);
                                    Main.ColorGrayb4t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b4t5) {
                                    Main.this.b4t5 = true;
                                    final Main this$31 = Main.this;
                                    ++this$31.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b4);
                                    Main.ColorGrayb4t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b4t6) {
                                    Main.this.b4t6 = true;
                                    final Main this$32 = Main.this;
                                    ++this$32.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b4);
                                    Main.ColorGrayb4t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b4t7) {
                                    Main.this.b4t7 = true;
                                    final Main this$33 = Main.this;
                                    ++this$33.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b4);
                                    Main.ColorGrayb4t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b4t8) {
                                    Main.this.b4t8 = true;
                                    final Main this$34 = Main.this;
                                    ++this$34.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b4);
                                    Main.ColorGrayb4t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b4t9) {
                                    Main.this.b4t9 = true;
                                    final Main this$35 = Main.this;
                                    ++this$35.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b4);
                                    Main.ColorGrayb4t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b4.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b4t3) {
                                Main.this.b4t3 = true;
                                final Main this$36 = Main.this;
                                ++this$36.gotitems3;
                                Main.this.foundItemsT3.add(Main.b4);
                                Main.ColorGrayb4t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b4.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b5, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b5t1) {
                                    Main.this.b5t1 = true;
                                    final Main this$37 = Main.this;
                                    ++this$37.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b5);
                                    Main.ColorGrayb5t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b5t2) {
                                    Main.this.b5t2 = true;
                                    final Main this$38 = Main.this;
                                    ++this$38.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b5);
                                    Main.ColorGrayb5t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b5t4) {
                                    Main.this.b5t4 = true;
                                    final Main this$39 = Main.this;
                                    ++this$39.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b5);
                                    Main.ColorGrayb5t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b5t5) {
                                    Main.this.b5t5 = true;
                                    final Main this$40 = Main.this;
                                    ++this$40.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b5);
                                    Main.ColorGrayb5t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b5t6) {
                                    Main.this.b5t6 = true;
                                    final Main this$41 = Main.this;
                                    ++this$41.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b5);
                                    Main.ColorGrayb5t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b5t7) {
                                    Main.this.b5t7 = true;
                                    final Main this$42 = Main.this;
                                    ++this$42.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b5);
                                    Main.ColorGrayb5t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b5t8) {
                                    Main.this.b5t8 = true;
                                    final Main this$43 = Main.this;
                                    ++this$43.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b5);
                                    Main.ColorGrayb5t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b5t9) {
                                    Main.this.b5t9 = true;
                                    final Main this$44 = Main.this;
                                    ++this$44.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b5);
                                    Main.ColorGrayb5t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b5.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b5t3) {
                                Main.this.b5t3 = true;
                                final Main this$45 = Main.this;
                                ++this$45.gotitems3;
                                Main.this.foundItemsT3.add(Main.b5);
                                Main.ColorGrayb5t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b5.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b6, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b6t1) {
                                    Main.this.b6t1 = true;
                                    final Main this$46 = Main.this;
                                    ++this$46.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b6);
                                    Main.ColorGrayb6t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b6t2) {
                                    Main.this.b6t2 = true;
                                    final Main this$47 = Main.this;
                                    ++this$47.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b6);
                                    Main.ColorGrayb6t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b6t4) {
                                    Main.this.b6t4 = true;
                                    final Main this$48 = Main.this;
                                    ++this$48.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b6);
                                    Main.ColorGrayb6t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b6t5) {
                                    Main.this.b6t5 = true;
                                    final Main this$49 = Main.this;
                                    ++this$49.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b6);
                                    Main.ColorGrayb6t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b6t6) {
                                    Main.this.b6t6 = true;
                                    final Main this$50 = Main.this;
                                    ++this$50.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b6);
                                    Main.ColorGrayb6t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b6t7) {
                                    Main.this.b6t7 = true;
                                    final Main this$51 = Main.this;
                                    ++this$51.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b6);
                                    Main.ColorGrayb6t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b6t8) {
                                    Main.this.b6t8 = true;
                                    final Main this$52 = Main.this;
                                    ++this$52.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b6);
                                    Main.ColorGrayb6t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b6t9) {
                                    Main.this.b6t9 = true;
                                    final Main this$53 = Main.this;
                                    ++this$53.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b6);
                                    Main.ColorGrayb6t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b6.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b6t3) {
                                Main.this.b6t3 = true;
                                final Main this$54 = Main.this;
                                ++this$54.gotitems3;
                                Main.this.foundItemsT3.add(Main.b6);
                                Main.ColorGrayb6t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b6.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b7, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b7t1) {
                                    Main.this.b7t1 = true;
                                    final Main this$55 = Main.this;
                                    ++this$55.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b7);
                                    Main.ColorGrayb7t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b7t2) {
                                    Main.this.b7t2 = true;
                                    final Main this$56 = Main.this;
                                    ++this$56.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b7);
                                    Main.ColorGrayb7t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b7t4) {
                                    Main.this.b7t4 = true;
                                    final Main this$57 = Main.this;
                                    ++this$57.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b7);
                                    Main.ColorGrayb7t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b7t5) {
                                    Main.this.b7t5 = true;
                                    final Main this$58 = Main.this;
                                    ++this$58.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b7);
                                    Main.ColorGrayb7t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b7t6) {
                                    Main.this.b7t6 = true;
                                    final Main this$59 = Main.this;
                                    ++this$59.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b7);
                                    Main.ColorGrayb7t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b7t7) {
                                    Main.this.b7t7 = true;
                                    final Main this$60 = Main.this;
                                    ++this$60.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b7);
                                    Main.ColorGrayb7t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b7t8) {
                                    Main.this.b7t8 = true;
                                    final Main this$61 = Main.this;
                                    ++this$61.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b7);
                                    Main.ColorGrayb7t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b7t9) {
                                    Main.this.b7t9 = true;
                                    final Main this$62 = Main.this;
                                    ++this$62.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b7);
                                    Main.ColorGrayb7t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b7.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b7t3) {
                                Main.this.b7t3 = true;
                                final Main this$63 = Main.this;
                                ++this$63.gotitems3;
                                Main.this.foundItemsT3.add(Main.b7);
                                Main.ColorGrayb7t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b7.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b8, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b8t1) {
                                    Main.this.b8t1 = true;
                                    final Main this$64 = Main.this;
                                    ++this$64.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b8);
                                    Main.ColorGrayb8t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b8t2) {
                                    Main.this.b8t2 = true;
                                    final Main this$65 = Main.this;
                                    ++this$65.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b8);
                                    Main.ColorGrayb8t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b8t4) {
                                    Main.this.b8t4 = true;
                                    final Main this$66 = Main.this;
                                    ++this$66.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b8);
                                    Main.ColorGrayb8t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b8t5) {
                                    Main.this.b8t5 = true;
                                    final Main this$67 = Main.this;
                                    ++this$67.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b8);
                                    Main.ColorGrayb8t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b8t6) {
                                    Main.this.b8t6 = true;
                                    final Main this$68 = Main.this;
                                    ++this$68.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b8);
                                    Main.ColorGrayb8t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b8t7) {
                                    Main.this.b8t7 = true;
                                    final Main this$69 = Main.this;
                                    ++this$69.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b8);
                                    Main.ColorGrayb8t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b8t8) {
                                    Main.this.b8t8 = true;
                                    final Main this$70 = Main.this;
                                    ++this$70.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b8);
                                    Main.ColorGrayb8t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b8t9) {
                                    Main.this.b8t9 = true;
                                    final Main this$71 = Main.this;
                                    ++this$71.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b8);
                                    Main.ColorGrayb8t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b8.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b8t3) {
                                Main.this.b8t3 = true;
                                final Main this$72 = Main.this;
                                ++this$72.gotitems3;
                                Main.this.foundItemsT3.add(Main.b8);
                                Main.ColorGrayb8t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b8.getType().name()));
                            }
                        }
                        if (p.getInventory().containsAtLeast(Main.b9, 1)) {
                            if (Main.t1.contains(p)) {
                                if (!Main.this.b9t1) {
                                    Main.this.b9t1 = true;
                                    final Main this$73 = Main.this;
                                    ++this$73.gotitems1;
                                    Main.this.foundItemsT1.add(Main.b9);
                                    Main.ColorGrayb9t1 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt1.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t2.contains(p)) {
                                if (!Main.this.b9t2) {
                                    Main.this.b9t2 = true;
                                    final Main this$74 = Main.this;
                                    ++this$74.gotitems2;
                                    Main.this.foundItemsT2.add(Main.b9);
                                    Main.ColorGrayb9t2 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt2.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t4.contains(p)) {
                                if (!Main.this.b9t4) {
                                    Main.this.b9t4 = true;
                                    final Main this$75 = Main.this;
                                    ++this$75.gotitems4;
                                    Main.this.foundItemsT4.add(Main.b9);
                                    Main.ColorGrayb9t4 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt4.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t5.contains(p)) {
                                if (!Main.this.b9t5) {
                                    Main.this.b9t5 = true;
                                    final Main this$76 = Main.this;
                                    ++this$76.gotitems5;
                                    Main.this.foundItemsT5.add(Main.b9);
                                    Main.ColorGrayb9t5 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt5.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t6.contains(p)) {
                                if (!Main.this.b9t6) {
                                    Main.this.b9t6 = true;
                                    final Main this$77 = Main.this;
                                    ++this$77.gotitems6;
                                    Main.this.foundItemsT6.add(Main.b9);
                                    Main.ColorGrayb9t6 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt6.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t7.contains(p)) {
                                if (!Main.this.b9t7) {
                                    Main.this.b9t7 = true;
                                    final Main this$78 = Main.this;
                                    ++this$78.gotitems7;
                                    Main.this.foundItemsT7.add(Main.b9);
                                    Main.ColorGrayb9t7 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt7.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t8.contains(p)) {
                                if (!Main.this.b9t8) {
                                    Main.this.b9t8 = true;
                                    final Main this$79 = Main.this;
                                    ++this$79.gotitems8;
                                    Main.this.foundItemsT8.add(Main.b9);
                                    Main.ColorGrayb9t8 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt8.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t9.contains(p)) {
                                if (!Main.this.b9t9) {
                                    Main.this.b9t9 = true;
                                    final Main this$80 = Main.this;
                                    ++this$80.gotitems9;
                                    Main.this.foundItemsT9.add(Main.b9);
                                    Main.ColorGrayb9t9 = ChatColor.GREEN;
                                    Bukkit.broadcastMessage(foundt9.replace("%item%", Main.b9.getType().name()));
                                }
                            } else if (Main.t3.contains(p) && !Main.this.b9t3) {
                                Main.this.b9t3 = true;
                                final Main this$81 = Main.this;
                                ++this$81.gotitems3;
                                Main.this.foundItemsT3.add(Main.b9);
                                Main.ColorGrayb9t3 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt3.replace("%item%", Main.b9.getType().name()));
                            }
                        }
                        if (Main.this.gotitems1 == 9) {
                            if (Main.t1.size() == 1) {
                                Main.this.winner1 = Main.t1.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t1.get(0).getName();
                                Main.this.winner2 = Main.t1.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems2 == 9) {
                            if (Main.t2.size() == 1) {
                                Main.this.winner1 = Main.t2.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t2.get(0).getName();
                                Main.this.winner2 = Main.t2.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems3 == 9) {
                            if (Main.t3.size() == 1) {
                                Main.this.winner1 = Main.t3.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t3.get(0).getName();
                                Main.this.winner2 = Main.t3.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems4 == 9) {
                            if (Main.t4.size() == 1) {
                                Main.this.winner1 = Main.t4.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t4.get(0).getName();
                                Main.this.winner2 = Main.t4.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems5 == 9) {
                            if (Main.t5.size() == 1) {
                                Main.this.winner1 = Main.t5.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t5.get(0).getName();
                                Main.this.winner2 = Main.t5.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems6 == 9) {
                            if (Main.t6.size() == 1) {
                                Main.this.winner1 = Main.t6.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t6.get(0).getName();
                                Main.this.winner2 = Main.t6.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems7 == 9) {
                            if (Main.t7.size() == 1) {
                                Main.this.winner1 = Main.t7.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t7.get(0).getName();
                                Main.this.winner2 = Main.t7.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems8 == 9) {
                            if (Main.t8.size() == 1) {
                                Main.this.winner1 = Main.t8.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t8.get(0).getName();
                                Main.this.winner2 = Main.t8.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                        if (Main.this.gotitems9 == 9) {
                            if (Main.t9.size() == 1) {
                                Main.this.winner1 = Main.t9.get(0).getName();
                            } else {
                                Main.this.winner1 = Main.t9.get(0).getName();
                                Main.this.winner2 = Main.t9.get(1).getName();
                            }
                            Main.this.isRestarting = true;
                            Main.this.RestartCountDown();
                            this.cancel();
                        }
                    }
                }
            }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
        }
    }

    public void getRandomItems() {
        Items.getItems();
        this.items.clear();
        this.items.addAll(Main.itemlist);
        final int size = this.items.size() - 1;
        final ArrayList<Integer> list = getRandomNonRepeatingIntegers(9, 0, size);
        Main.b1 = this.items.get(list.get(0));
        Main.b2 = this.items.get(list.get(1));
        Main.b3 = this.items.get(list.get(2));
        Main.b4 = this.items.get(list.get(3));
        Main.b5 = this.items.get(list.get(4));
        Main.b6 = this.items.get(list.get(5));
        Main.b7 = this.items.get(list.get(6));
        Main.b8 = this.items.get(list.get(7));
        Main.b9 = this.items.get(list.get(8));
        if (RandomEnchantment.Wahrscheinlichkeit > 0.0) {
            RandomEnchantment.randomEnchantment();
        }
        this.randomized = true;
    }
}
