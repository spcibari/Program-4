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
        long itemCount = -1;
        double price = 0.99;
        String menuItem = "HDog in Bun with";
        for (int k = 0; k < 2; k++) {
            for (int m = 0; m < 2; m++) {
                for (int co = 0; co < 2; co++) {
                    for (int tw = 0; tw < 2; tw++) {
                        for (int sr = 0; sr < 2; sr++) {
                            for (int sp = 0; sp < 2; sp++) {
                                for (int s = 0; s < 2; s++) {
                                    price = 0.99;
                                    itemCount++;
                                    if (k == 1){
                                        price += KETCHUP;
                                        menuItem += " Ketchup,";
                                    }
                                    if (m == 1){
                                        price += MUSTARD;
                                        menuItem += " Mustard,";
                                    }
                                    if (co == 1){
                                        price += CHOPPED_ONIONS;
                                        menuItem += " Chopped Onions,";
                                    }
                                    if (tw == 1){
                                        price += TOMATO_WEDGE;
                                        menuItem += " Tomato Wedge,";
                                    }
                                    if (sr == 1){
                                        price += SWEET_RELISH;
                                        menuItem += " Sweet Relish,";
                                    }
                                    if (sp == 1){
                                        price += SPORT_PEPPER;
                                        menuItem += " Sport Pepper,";
                                    }
                                    if (s == 1){
                                        price += SAUERKRAUT;
                                        menuItem += " Sauerkraut,";
                                    }
                                    if (itemCount == 0) {
                                        System.out.println("HDog in Bun" + " " + price);
                                    }
                                    else { 
                                        System.out.println(itemCount + " " + menuItem + " " + price);
                                    }
                                    
                                }
                            }
                        }
                    }
                }
            }
        }

   }
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
