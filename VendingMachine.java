/**
*  @author Justin Chiang
*  @author Michael Gallagher
*  @author Mark Fastner
*  @author Jason Vo
*  @date 10/7/20
*  CECS 277
*
*  Vending machine holds many different products that 
*  can be vended out for a price. 
*  It does not return change if you put too much.
*/
import java.util.*;

public class VendingMachine {
   // an empty item
   private final Product EMPTY = new Product();
   
   // the list of items inside
   private ArrayList<Product> inventory;
   // the amount currently inside
   private double total;
   // the current transaction
   private double change;
   
   /**
   *  Null constructor for VendingMachine.
   */
   public VendingMachine() {
      inventory = new ArrayList<Product>();
      total = 0;
      change = 0;
   }
   
   /**
   *  Instatiates a VendingMachine with the given
   *  values.
   *
   *  @param vInventory             the inventory of items
   *  @parm vTotal                  the total in machine
   *  @param vChange                the current transaction
   */
   public VendingMachine(ArrayList<Product> vInventory, double vTotal, double vChange) {
      inventory = vInventory;
      total = vTotal;
      change = vChange;
   }
   
   /**
   *  Returns the number of items inside.
   *
   *  @return                       the number of items
   */
   public int getInventorySize() {
      return inventory.size();
   }
   
   /**
   *  Return the total amount inside the machine.
   *  
   *  @return                       the total
   */
   public double getTotal() {
      return total;
   }
   
   /**
   *  Returns the value of the transaction inside.
   *
   *  @return                       the change
   */
   public double getChange() {
      return change;
   }
   
   /**
   *  Sets the inventory to the given list.
   *
   *  @param nInventory             the new inventory
   */
   public void setInventory(ArrayList<Product> nInventory) {
      inventory = nInventory;
   }
   
   /**
   *  Sets the total in the machine to the given total.
   *
   *  @param nTotal                 the new total
   */
   public void setTotal(double nTotal) {
      total = nTotal;
   }
   
   /**
   *  Set the change to the given value.
   *
   *  @param nChange                the new change
   */
   public void setChange(double nChange) {
      change = nChange;
   }
   
   /**
   *  Displays all products in the VendingMachine.
   */
   public void showProducts() {
      for (int i = 0; i < inventory.size(); i++) {
         System.out.println(inventory.get(i));
      }
   }
   
   /**
   *  Inserts money into the VendingMachine.
   *
   *  @param curr                   the money added
   */
   public void insertCoin(Currency curr) {
      change += curr.getValue();
   }
   
   /**
   *  Displays inventory and the selection menu for 
   *  all items in the VendingMachine.
   */
   public void displayInventory() {
      for (int i = 0; i < inventory.size(); i++) {
         System.out.println((i + 1) + ") " + inventory.get(i));
      }
   }
   
   /**
   *  Dispenses the product if there is enough money,
   *  otherwise return the amount in the VendingMachine.
   *
   *  @param itemNum                the item number (index + 1)
   *  @return                       the product if there is enough money,
   *                                otherwise nothing.
   */
   public Product buy(int itemNum) {
      Product item = inventory.get(itemNum - 1);
      if (change >= item.getPrice() && item.getQuantity() > 0) {
         System.out.println("Purchased: " + item); 
         item.decreaseQuantity();
         total += change;
         change = 0;
         return item;
      } else if (item.getQuantity() == 0) {
         System.out.println("There is nothing left of " + item.getName());
      } else {
         System.out.println("Insufficient money");
      }
      System.out.println("Change Returned: $" + change);
      change = 0;
      return EMPTY;
   }
   
   /**
   *  Adds a given Product into the vending machine.
   *
   *  @param description            the name of the item
   *  @param price                  the price
   *  @param quantity               the quantity
   */
   public void addProduct(String description, double price, int quantity) {
      Product item = new Product(description, price, quantity);
      inventory.add(item);
   }
   
   /**
   *  Returns the change currently inside the VendingMachine.
   *
   *  @return                       the total   
   */
   public double removeCoins() {
      double totalTemp = total;
      System.out.println("Removed: $" + totalTemp);
      total = 0;
      return totalTemp;
   }
   
   /**
   *  Returns the String representation of the VendingMachine
   *
   *  @return                    the String representation
   */
   @Override
   public String toString() {
      return "S)how products  I)nsert coin  B)uy  A)dd product  R)emove coins  Q)uit";
   }
}