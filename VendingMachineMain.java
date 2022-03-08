/**
*  @author Justin Chiang
*  @author Michael Gallagher
*  @author Mark Fastner
*  @author Jason Vo
*  @date 10/7/20
*  CECS 277
*
*  Acts as a vending machine and allows the user to buy 
*  products from within the vending machine and get change
*  back.
*/
import java.io.*;
import java.util.*;

public class VendingMachineMain {
   // nickel with value $0.05
   private static final Currency NICKEL = new Currency("nickel", 0.05);
   // dime with value $0.10
   private static final Currency DIME = new Currency("dime", 0.1);
   // quarter with value $0.25
   private static final Currency QUARTER = new Currency("quarter", 0.25);
   // dollar with value $1.00
   private static final Currency DOLLAR = new Currency("dollar", 1.0);

   public static void main(String[] args) {
      VendingMachine vm = new VendingMachine();
      String choice = "";
      while (!choice.equals("q")) {
         System.out.println(vm);
         choice = CheckInput.getString().toLowerCase();
         switch (choice) {
            case "s": 
               vm.showProducts();
               break;
            case "i":
               determineCoin(vm);
               break;
            case "b":
               determineItem(vm);
               break;
            case "a":
               getInfo(vm);
               break;
            case "r":
               vm.removeCoins();
               break;
         }
      }
   }
   
   /**
   *  Determines the coin to be inserted into the machine.
   *
   *  @param vm                     the vending machine
   */
   public static void determineCoin(VendingMachine vm) {
      System.out.println("1) " + NICKEL);
      System.out.println("2) " + DIME);
      System.out.println("3) " + QUARTER);
      System.out.println("4) " + DOLLAR);
      int choice = CheckInput.getIntRange(1, 4);
      switch (choice) {
         case 1:
            vm.insertCoin(NICKEL);
            break;
         case 2:
            vm.insertCoin(DIME);
            break;
         case 3:
            vm.insertCoin(QUARTER);
            break;
         case 4:
            vm.insertCoin(DOLLAR);
            break;
      }
   }
   
   /**
   *  Determines the item the user wants to buy.
   *
   *  @param vm                     the vending machine
   */
   public static void determineItem(VendingMachine vm) {
      vm.displayInventory();
      int choice = CheckInput.getIntRange(1, vm.getInventorySize());
      vm.buy(choice);
   }
   
   /**
   *  Gets the information of the product to add.
   *
   *  @param vm                     the vending machine
   */
   public static void getInfo(VendingMachine vm) {
      System.out.print("Description: ");
      String name = CheckInput.getString();
      System.out.print("Price: ");
      double price = CheckInput.getDouble();
      System.out.print("Quantity: ");
      int quantity = CheckInput.getInt();
      vm.addProduct(name, price, quantity);
   }
}