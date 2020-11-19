package Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.bukkit.enchantments.Enchantment;
import de.synex.bingo.main.Main;










public class RandomEnchantment {
	

	
	
	// Store all possible enchantments for the item
	static List<Enchantment> possibleb1 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb2 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb3 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb4 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb5 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb6 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb7 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb8 = new ArrayList<Enchantment>();
	static List<Enchantment> possibleb9 = new ArrayList<Enchantment>();
	
	public static double Wahrscheinlichkeit = 0.00;
	
	public static double Wahrscheinlichkeit() {
		double r = RandomEnchantment.Wahrscheinlichkeit + 0.05;
        double f = Math.round(r * 100.0) / 100.0;
        RandomEnchantment.Wahrscheinlichkeit = f;
        return f;
	}
	
	public static String InProzent() {
		double p = RandomEnchantment.Wahrscheinlichkeit*100;
		int k = (int) p;
		String f = k + "%";
		return f;
	}
	
	
	
	
	
	public static void randomEnchantment() {

	    // Loop through all enchantemnts
	    for (Enchantment ench : Enchantment.values()) {
	        // Check if the enchantment can be applied to the item, save it if it can
	        if (ench.canEnchantItem(Main.b1)) {
	            possibleb1.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b2)) {
	            possibleb2.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b3)) {
	            possibleb3.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b4)) {
	            possibleb4.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b5)) {
	            possibleb5.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b6)) {
	            possibleb6.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b7)) {
	            possibleb7.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b8)) {
	            possibleb8.add(ench);
	        }
	        
	        if (ench.canEnchantItem(Main.b9)) {
	            possibleb9.add(ench);
	        } 
	    }
	 
	    
	    
	    
	    
	    Random rand = new Random();
	    boolean val1 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;  // 5% Probability of being true.
	    boolean val2 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val3 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val4 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val5 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val6 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val7 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val8 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    boolean val9 = rand.nextDouble() <= RandomEnchantment.Wahrscheinlichkeit;
	    
	    //System.out.println(val1);
	    //System.out.println(val2);
	    //System.out.println(val3);
	    //System.out.println(val4);
	    //System.out.println(val5);
	    //System.out.println(val6);
	    //System.out.println(val7);
	    //System.out.println(val8);
	    //System.out.println(val9);

	    
	    // If we have at least one possible enchantment
	    if (possibleb1.size() >= 1 && val1 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb1);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb1.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b1.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb2.size() >= 1 && val2 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb2);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb2.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b2.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb3.size() >= 1 && val3 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb3);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb3.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b3.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb4.size() >= 1 && val4 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb4);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb4.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b4.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb5.size() >= 1 && val5 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb5);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb5.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b5.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb6.size() >= 1 && val6 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb6);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb6.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b6.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb7.size() >= 1 && val7 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb7);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb7.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b7.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb8.size() >= 1 && val8 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb8);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb8.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b8.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }
	    
	    if (possibleb9.size() >= 1 && val9 == true) {
	        // Randomize the enchantments
	        Collections.shuffle(possibleb9);
	        // Get the first enchantment in the shuffled list
	        Enchantment chosen = possibleb9.get(0);
	        // Apply the enchantment with a random level between 1 and the max level
	        Main.b9.addEnchantment(chosen, 1 + (int) (Math.random() * ((chosen.getMaxLevel() - 1) + 1)));
	    }

	 }
	
}
