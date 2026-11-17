/**
 * Prints a menu of possible Hot Dog and topping conbinations
 * @author Sandor Cibaric
 * Class: CS1121
 * @version 1.0
 */

public class HotDog {
    // sets up final variables for the price of toppings.
    public static final double HOT_DOG_WITH_BUN = 0.99;
    public static final double KETCHUP = 0.15;
    public static final double MUSTARD = 0.17;
    public static final double CHOPPED_ONIONS = 0.20;
    public static final double TOMATO_WEDGE = 0.25;
    public static final double SWEET_RELISH = 0.30;
    public static final double SPORT_PEPPER = 0.35;
    public static final double SAUERKRAUT = 0.45;
   /** 
    * Returns the number of combinations
    * @param price price of a hot dog with or without toppings
    * @return price of hot dog combinations
    * 
    */ 
   public long printMenu() {
      double price = 0.99;

   }
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
