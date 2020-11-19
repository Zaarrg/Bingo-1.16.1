// 
// Decompiled by Procyon v0.5.36
// 

package de.synex.bingo.util;

import java.util.Iterator;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.Bukkit;
import de.synex.bingo.main.Main;
import org.bukkit.configuration.file.YamlConfiguration;
import java.io.File;

public class Config
{
    private static File file;
    private static YamlConfiguration yml;
    public static boolean setup;
    public static boolean configCreated;
    
    static {
        Config.file = new File("plugins/Bingo/", "config.yml");
        Config.yml = YamlConfiguration.loadConfiguration(Config.file);
        Config.setup = false;
        Config.configCreated = false;
    }
    
    public static boolean loadConfiguration() {
        if (!Config.file.exists()) {
            resetConfiguration();
        }
        try {
            Main.isReset = Config.yml.getBoolean("reset.isReset");
            Main.ResetonRestart = Config.yml.getBoolean("reset.ResetonRestart");
            Main.noPlayerReset = Config.yml.getBoolean("reset.noPlayerReset");
        }
        catch (Exception e) {
            resetConfiguration();
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public static boolean resetConfiguration() {
        try {
            new File("plugins/Bingo/").mkdirs();
            Config.file.createNewFile();
            for (final World world : Bukkit.getWorlds()) {
                world.setDifficulty(Difficulty.NORMAL);
            }
            Config.yml.set("reset.isReset", (Object)false);
            Config.yml.set("reset.ResetonRestart", (Object)false);
            Config.yml.set("reset.noPlayerReset", (Object)false);
            Config.yml.set("Reset.Sekunden", (Object)20);
            Config.yml.save(Config.file);
            Config.configCreated = true;
            Bukkit.getConsoleSender().sendMessage("Die Config wurde erstellt!");
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            Bukkit.getConsoleSender().sendMessage("Die Config konnte nicht erstellt werden. => Server Restart!!");
            Bukkit.spigot().restart();
            return false;
        }
    }
    
    public static boolean saveConfiguration() {
        try {
            Config.yml.set("reset.isReset", (Object)Main.isReset);
            Config.yml.set("reset.ResetonRestart", (Object)Main.ResetonRestart);
            Config.yml.set("reset.noPlayerReset", (Object)Main.noPlayerReset);
            Config.yml.set("spawn.SpawnArea", (Object)Main.SpawnArea);
            Config.yml.set("Timer.Stunde", (Object)Main.hours);
            Config.yml.set("Timer.Minute", (Object)Main.minutes);
            Config.yml.set("Timer.Sekunde", (Object)Main.seconds);
            Config.yml.save(Config.file);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static File getFile() {
        return Config.file;
    }
    
    public static YamlConfiguration getConfig() {
        return Config.yml;
    }
}
