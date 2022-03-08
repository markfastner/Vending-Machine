/**
*  @author Justin Chiang
*  @author Michael Gallagher
*  @author Mark Fastner
*  @author Jason Vo
*  @date 10/7/20
*  CECS 277
*
*  Product is an item that can be bought in the 
*  vending machine.
*/
public class Product {
   // name of the product
   private String name;
   // price of the product
   private double price;
   // quantity of the product
   private int quantity;
   
   /**
   *  Null constructor of Product.
   */
   public Product() {
      name = "";
      price = 0;
      quantity = 0;
   }
   
   /**
   *  Initializes a Product with the given values.
   *
   *  @param pName            the name
   *  @param pPrice           the price
   *  @param pQuantity        the quantity
   */
   public Product(String pName, double pPrice, int pQuantity) {
      name = pName;
      price = pPrice;
      quantity = pQuantity;
   }
   
   /**
   *  Return the name of the Product.
   *
   *  @return                 the name
   */
   public String getName() {
      return name;
   }
   
   /**
   *  Return the price of the Product.
   *
   *  @return                 the price
   */
   public double getPrice() {
      return price;
   }
   
   /**
   *  Return the quantity of the Product.
   *
   *  @return                 the quantity
   */
   public int getQuantity() {
      return quantity;
   }
   
   /**
   *  Sets the name to the given value.
   *
   *  @param nName            the new name
   */
   public void setName(String nName) {
      name = nName;
   }
   
   /**
   *  Sets the price to the given value.
   *
   *  @param nPrice           the new price
   */
   public void setPrice(double nPrice) {
      price = nPrice;
   }
   
   /**
   *  Sets the quantity to the given value.
   *
   *  @param nQuantity        the new quantity
   */
   public void setQuantity(int nQuantity) {
      quantity = nQuantity;
   }
   
   /**
   *  Decrements the quantity of the Product by 1.
   */
   public void decreaseQuantity() {
      quantity--;
   }
   
   /**
   *  Returns a String representation of the Product.
   *
   *  @return                 the String representation
   */
   @Override
   public String toString() {
      return name + " @ $" + price;   
   }
}