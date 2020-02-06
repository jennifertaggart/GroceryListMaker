// From Google style guide: The source file name consists of the case-sensitive name of the 
// top-level class it contains (of which there is exactly one), plus the .java extension.
// Column limit of 100 chars
import java.util.Scanner; // class provides methods for input
public class GroceryListMaker {

	public static void juiceCalculator(int ozJuice) {
       final double ML_PER_FL_OZ = 29.5735; // convention on const var names as so
       double mlJuice = ozJuice * ML_PER_FL_OZ;
       System.out.printf("%.2f ml juice", mlJuice); // keep for string formatting example
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
       juiceCalculator(ozJuice);
   }

}