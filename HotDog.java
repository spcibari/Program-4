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
    * @param itemCount the number of combinations in the menu
    * @param price price of a hot dog with or without toppings
    * @return price of hot dog combinations, the number of combinations, and what's in the combiation
    * 
    */ 
   public long printMenu() {
        long itemCount = -1;
        double price = 0.99;
        String menuItem = "HDog in Bun with"; //sets the first statement of the menu item
        for (int k = 0; k < 2; k++) { // checks for ketchup on hotdog
            for (int m = 0; m < 2; m++) { // checks for mustard on hotdog
                for (int co = 0; co < 2; co++) { // checks for chopped onions on hotdog
                    for (int tw = 0; tw < 2; tw++) { // checks for tomato wedges on hotdog
                        for (int sr = 0; sr < 2; sr++) { // checks for sweet relish on hotdog
                            for (int sp = 0; sp < 2; sp++) { // checks for sport peppers on hotdog
                                for (int s = 0; s < 2; s++) { // checks for sauerkraut on hotdog
                                    price = 0.99; // sets base price to $0.99 until adding toppings
                                    itemCount++; // increases the item count
                                    menuItem = "HDog in Bun with";
                                    if (k == 1){
                                        price += KETCHUP; //sets price with ketchup
                                        menuItem = menuItem + " Ketchup,";
                                    }
                                    if (m == 1){
                                        price += MUSTARD; //sets price with mustard
                                        menuItem = menuItem + " Mustard,";
                                    }
                                    if (co == 1){
                                        price += CHOPPED_ONIONS; //sets price with chopped onions
                                        menuItem = menuItem + " Chopped Onions,";
                                    }
                                    if (tw == 1){
                                        price += TOMATO_WEDGE; //sets price with tomato wedges
                                        menuItem = menuItem + " Tomato Wedge,";
                                    }
                                    if (sr == 1){
                                        price += SWEET_RELISH; //sets price with sweet relish
                                        menuItem = menuItem + " Sweet Relish,";
                                    }
                                    if (sp == 1){
                                        price += SPORT_PEPPER; //sets price with sport pepper
                                        menuItem = menuItem + " Sport Pepper,";
                                    }
                                    if (s == 1){
                                        price += SAUERKRAUT; ////sets price with sauerkraut
                                        menuItem = menuItem + " Sauerkraut,";
                                    }
                                    if (itemCount == 0) {
                                        System.out.printf("0 HDog in Bun $%.2f \n", price); //formatting for the first menu item
                                    }
                                    else { 
                                        System.out.printf("%d %s $%.2f \n", itemCount, menuItem, price); //formating for all the rest of the menu items
                                    }
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
        return itemCount; //returns long value to complete the method
   }
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
