package Utilities;

import de.synex.bingo.main.Main;

public class DefaultData {
	
	
	public static DataManager data;
	
	public static void setDefaultData() {
		data.getConfig().set("Gamesettings.reset", Boolean.valueOf(false));
		data.getConfig().set("Gamesettings.timercountdown", Boolean.valueOf(false));
		
		
		data.getConfig().set("Playersettings.damage", Boolean.valueOf(true));
		data.getConfig().set("Playersettings.hunger", Boolean.valueOf(true));
		data.getConfig().set("Playersettings.keepinventory", Boolean.valueOf(true));
		
		data.getConfig().set("Timer.hours", 10);
		data.getConfig().set("Timer.minutes", 10);
		data.getConfig().set("Timer.hours", 10);
	}

}
