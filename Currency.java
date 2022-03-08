/**
*  @author Justin Chiang
*  @author Michael Gallagher
*  @author Mark Fastner
*  @author Jason Vo
*  @date 10/7/20
*  CECS 277
*
*  Currency is a monetary value with a given name
*  and value.
*/
public class Currency {
   // name of the currency
   private String name;
   // value of the currency
   private double value;
   
   /**
   *  Null constructor of Currency.
   */
   public Currency() {
      name = "";
      value = 0;
   }
   
   /**
   *  Initializes a Currency with the given values.
   *
   *  @param cName            the name 
   *  @param cValue           the value
   */
   public Currency(String cName, double cValue) {
      name = cName;
      value = cValue;
   }
   
   /**
   *  Returns the name of the Currency.
   *
   *  @return                 the name
   */
   public String getName() {
      return name;
   }
   
   /**
   *  Returns the value of the Currency.
   *
   *  @return                 the value
   */
   public double getValue() {
      return value;
   }
   
   /**
   *  Set the name to the given value.
   *
   *  @param nName            the new name
   */
   public void setName(String nName) {
      name = nName;
   }
   
   /**
   *  Set the value to the given value.
   *
   *  @param nValue           the new value
   */
   public void setValue(double nValue) {
      value = nValue;
   }
   
   /**
   *  Returns a String representation of the Currency.
   *
   *  @return                 the String representation
   */
   @Override
   public String toString() {
      return name + " @ $" + value; 
   }
}