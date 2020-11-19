/*    */ package de.synex.bingo.commands;
/*    */ 
/*    */ import de.synex.bingo.main.Main;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Bingo
/*    */   implements CommandExecutor
/*    */ {
/*    */   Main main;
/*    */   
/*    */   public Bingo(Main m) {
/* 18 */     this.main = m;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
/* 24 */     Player p = (Player)sender;
/*    */     
/* 26 */     if (sender instanceof Player) {
/* 27 */       if (args.length == 0) {
/* 28 */         if (Main.GameStarted) {
/* 29 */           Inventory bingo = Bukkit.createInventory(null, 9, (Main.getCL()).bingoitemsinround);
/* 30 */           if (!this.main.randomized) {
/* 31 */             this.main.getRandomItems();
/*    */           }
/* 33 */           bingo.setItem(0, Main.b1);
/* 34 */           bingo.setItem(1, Main.b2);
/* 35 */           bingo.setItem(2, Main.b3);
/* 36 */           bingo.setItem(3, Main.b4);
/* 37 */           bingo.setItem(4, Main.b5);
/* 38 */           bingo.setItem(5, Main.b6);
/* 39 */           bingo.setItem(6, Main.b7);
/* 40 */           bingo.setItem(7, Main.b8);
/* 41 */           bingo.setItem(8, Main.b9);
/* 42 */           p.openInventory(bingo);
/*    */           
/* 44 */           if (Main.t1.contains(p)) {
/* 45 */             if (!this.main.foundItemsT1.isEmpty()) {
/* 46 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 47 */               for (ItemStack founditems : this.main.foundItemsT1) {
/* 48 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             } 
/* 51 */           } else if (Main.t2.contains(p)) {
/* 52 */             if (!this.main.foundItemsT2.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT2) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             } 
/* 58 */           } else if (Main.t3.contains(p) && 
/* 59 */             !this.main.foundItemsT3.isEmpty()) {
/* 60 */             p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 61 */             for (ItemStack founditems : this.main.foundItemsT3) {
/* 62 */               p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */             }
/*    */           }
/* 51 */           } else if (Main.t4.contains(p)) {
/* 52 */             if (!this.main.foundItemsT4.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT4) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             }
/* 51 */           } else if (Main.t5.contains(p)) {
/* 52 */             if (!this.main.foundItemsT5.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT5) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             }
/* 51 */           } else if (Main.t6.contains(p)) {
/* 52 */             if (!this.main.foundItemsT6.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT6) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             }
/* 51 */           } else if (Main.t7.contains(p)) {
/* 52 */             if (!this.main.foundItemsT7.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT7) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             }
/* 51 */           } else if (Main.t8.contains(p)) {
/* 52 */             if (!this.main.foundItemsT8.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT8) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             }
/* 51 */           } else if (Main.t9.contains(p)) {
/* 52 */             if (!this.main.foundItemsT9.isEmpty()) {
/* 53 */               p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).yourteamfoundfollowingitemsalready);
/* 54 */               for (ItemStack founditems : this.main.foundItemsT9) {
/* 55 */                 p.sendMessage("§2[Bingo] §e" + founditems.getType());
/*    */               }
/*    */             } 
/*    */         
/*    */         }
/*    */         else {
/*    */           
/* 69 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).onlyingamecommand);
/*    */         }
/*    */       
/* 72 */       } else if (args.length == 1) {
/* 73 */         if (args[0].equalsIgnoreCase("start")) {
/* 74 */           p.performCommand("bingopl start");
/* 75 */         } else if (args[0].equalsIgnoreCase("restart")) {
/* 76 */           p.performCommand("bingoreset");
/*    */         } else {
/* 78 */           p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagebingo);
/*    */         } 
/*    */       } else {
/* 81 */         p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).usagebingo);
/*    */       } 
/*    */     } else {
/*    */       
/* 85 */       p.sendMessage(String.valueOf((Main.getCL()).prefix) + " " + (Main.getCL()).noconsole);
/*    */     } 
/* 87 */     return true;
/*    */   }
/*    */ }


/* Location:              D:\Java Eclipse\jd-gui-decompiler\Plugins\Bingo-0.5.2.jar!\de\synex\bingo\commands\Bingo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */