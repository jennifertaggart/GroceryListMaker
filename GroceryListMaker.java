// From Google style guide: The source file name consists of the case-sensitive name of the 
// top-level class it contains (of which there is exactly one), plus the .java extension.
// Column limit of 100 chars
//
// Compile mw with javac GroceryListMaker.jave
// Run me with java GroceryListMaker

import java.util.Scanner; // class provides methods for input
public class GroceryListMaker {

	/**
  * I am a Javadoc comment. Every method should have me.
	* Converts oz to ml and prints string about juice.
	*
	* @param ozJuice, the integer ounces of juice 
	* @return milliliters of juice as floating point
	*/
	// Need to give types of parameters and return values as part of method definition
	public static double juiceCalculator(int ozJuice) {
       final double ML_PER_FL_OZ = 29.5735; // convention on const var names as so
       double mlJuice = ozJuice * ML_PER_FL_OZ;
       System.out.printf("%.2f ml juice", mlJuice); // keep for string formatting example
       return mlJuice;
   }

// Java also has do while loop to be run at least once
   public static int listPrinter(String[] list) {
   	   int n = list.length - 1;
       while (n >= 0){
           System.out.println(list[n]);
           n=n-1;
       }
       return 0;
   }

   public static int aislePrinter(String[] aisles) {
       for (int i = aisles.length-1; i>=0;i=i-1) {
        System.out.println(aisles[i]);
       }
       return 0;
   }

   public static void main(String[] args) {
       int x;
       x=7;
       String message1;
       message1 = "I'm the grocery list! I have ";
       String message2;
       message2 = " items";
       double turnipPounds;
       turnipPounds = 2.83;
       // Apparently printing stuff out over multiple lines like this is actually a thing in Java
       System.out.print(message1);
       System.out.print(x);
       System.out.println(message2);
       System.out.print("We need ");
       System.out.print(turnipPounds);
       System.out.println(" of turnips");
       // But we can also do it this way
       String fruits = "apples, banannas, and grapes";
       System.out.println("And we also need " + fruits);
       System.out.println("Input your dairy needs");
       // declares new scanner var in and creates new scanner that takes input
       // why can't this be called inputDairy?
       Scanner in = new Scanner(System.in); 
       String myDairyList = in.nextLine();
       System.out.println("Here is the dairy list:" + myDairyList);
       int ozJuice = 6;
       double mlJuice = juiceCalculator(ozJuice);
       String[] aisleList = {"jalepenos", "apples", "potatoes", "carrots", "grapes"};
       listPrinter(aisleList);
       String[] aisleNames = {"produce", "international", "baking, coffee, and spices", "cookies and crackers", "juice and water", "canned foods", "breakfast things", "dairy", "frozen", "baked goods", "meat", "deli"};
       aislePrinter(aisleNames);
   }

}