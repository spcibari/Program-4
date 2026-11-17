public class HotDog {
   // returns the number of combinations
   public long printMenu() {
      double hotDogWithBun = 0.99;
      double ketchuo = 0.15;
      double mustard = 0.17;
      double choppedOnions = 0.20;
      double tomatoWedge = 0.25;
      double sweetRelish = 0.30;
      double sportPepper = 0.35;
      double sauerkraut = 0.45;
      double price = 0.99;
   }
   
   public static void main( String [ ] args ) {
      HotDog obj = new HotDog( );
      long count = obj.printMenu( );
      assert count == 128;
   }
} 
