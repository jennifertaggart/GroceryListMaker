import java.io.File; 
import java.util.Scanner; // class provides methods for input
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays; 

// This is all stuff for testing, but none of it works!
//import junit.framework.*;
//import org.junit.Test;
//import static org.junit.Assert.*;
//public class GroceryListMakerTest {
 // public void testjuiceCalculator(int ozJuice) {
 //   assertEquals(29.5735, juiceCalculator(1));
 //  }
//}
//This is supposed to compile the junit test code but it doesn't
// javac -cp junit-4.12.jar;. GroceryListMaker.java 

public class GroceryListMaker {

  
  // From Google style guide: The source file name consists of the case-sensitive name of the 
// top-level class it contains (of which there is exactly one), plus the .java extension.
// Column limit of 100 chars
//
// Compile mw with javac GroceryListMaker.jave
// Run me with java GroceryListMaker

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

   public static int ingredientsPrinter(String[] ingredients) {
       for (String ingredient : ingredients) {
           System.out.println(ingredient);
       }
       return 0;
   }

   public static ArrayList askAboutUsualPurchases() {
    // So apparently Java can't alter the size of its arrays, so we have to store this 
    // in an arraylist
    ArrayList<String> addToList = new ArrayList<String>();
    System.out.println("Enter items and aisle numbers needed for recipes (up to 100) and then enter done:");
    Scanner in = new Scanner(System.in);
    for (int i = 100; i>=0;i=i-1) {
        String myIngredient = in.nextLine();
        if (myIngredient.equals("done")){
            break;
        }
        else {
            addToList.add(myIngredient);
        }
    }
    // This basic way of reading a file with Java is not working on my mac. 
    // Tried checking that file exists, isn't a directory, is readable.
    // Tried just "usualGroceries.txt" because the file is in the same directory
    // Tried using the full path
    // Tried enclosing in try/catch but this generated a new cannot find symbol error
    // File f = new File("Users/jennifertaggart/Desktop/GroceryListMaker/usualGroceries.txt");
    // System.out.println(f.exists());
    // System.out.println(f.isDirectory());
    // System.out.println(f.canRead());
    // Scanner sc = new Scanner(f);
    // while (sc.hasNextLine()) {
    //    String line = sc.nextLine();
    //    System.out.println(line); 
    //}  
    // So instead, this is going to be an array. Arrays can only have one type, so everything will be a string.
    String[][] usualGroceries = { {"applesauce tubes", "5" }, {"milk", "7" }, {"eggs", "7" }, {"bananas", "0" }, {"hummus", "11"}, {"coffee", "2" }, {"spaghetti", "1"}};  
    for (int i = usualGroceries.length-1; i>=0;i=i-1) {
        System.out.println("Do you need " + usualGroceries[i][0] + "? (y/n)");
        //Scanner in = new Scanner(System.in);
        String doYouNeed = in.nextLine();
        if (doYouNeed.equals("y") || doYouNeed.equals("Y") || doYouNeed.equals("yes") || doYouNeed.equals("Yes") || doYouNeed.equals("YES")){
            addToList.add(usualGroceries[i][0]);
        }
       }
    // THis does not work.
    //String addToList[]  = new String[addToList.size()];
    //addToList = addToList.toArray(addToList);
    System.out.println("Don't forget:");

/*ArrayList to Array Conversion */
    String grocs[]=addToList.toArray(new String[addToList.size()]);

    /*Displaying Array elements*/
    for(String k: grocs)
    {
      System.out.println(k);
    }
    return(addToList);
   }



   public static void main(String[] args) {
       // Apparently this was an unsafe or unchecked uperation: ArrayList<String> usualPurchases = askAboutUsualPurchases();
       //ArrayList<String> usualPurchases = askAboutUsualPurchases();
       askAboutUsualPurchases();
       //System.out.println("Input your dairy needs");
       // declares new scanner var in and creates new scanner that takes input
       // why can't this be called inputDairy?
       //Scanner in = new Scanner(System.in); 
       //String myDairyList = in.nextLine();
       //System.out.println("Here is the dairy list:" + myDairyList);
       //
       //int ozJuice = 6;
       //double mlJuice = juiceCalculator(ozJuice);
       //
       //String[] aisleList = {"jalepenos", "apples", "potatoes", "carrots", "grapes"};
       //listPrinter(aisleList);
       //
       // So this is an array with type string
       //String[] aisleNames = {"produce", "international", "baking, coffee, and spices", "cookies and crackers", "juice and water", "canned foods", "breakfast things", "dairy", "frozen", "baked goods", "meat", "deli"};
       //aislePrinter(aisleNames);
       //
       //String[] recipe = {"cabbage", "kielbasa", "stewed tomatoes", "kidney beans"};
       //ingredientsPrinter(recipe);
       //
   }

}