# GroceryListMaker

NOTE: I ran into a lot of unexpected problems working with arrays, reading files, and trying to implement unit testing. In perticular, you can't change the size of an array in Java so I'm working with these weird ArrayList things, and also printing arrays in Java is complicated. Current version actually just asks for recipe ingredients, quizzes you about frequently purchased items that are hard-coded in to the program, and dumps your list out to the terminal without grouping things in any sort of order.

Here is what it's supposed to do: Walks you through creating your next grocery list and prints the list nicely in an aisle by aisle format. Asks you about recipe ingredients, then asks about a pre-selected list of frequently purchased items. Finally, asks you for additional items from different categories. Prints the list as a nicely formatted txt file.

## Getting Started

### Prerequisites
You will need java version "13.0.2"


### Installing
To compile: 
javac GroceryListMaker.java
To run:
java GroceryListMaker


## Running the tests

No tests yet because I haven't got a good understanding of JUnit yet - I gave up for now after about 2 hours of googling. Setting my CLASSPATH in my .bash_profile wasn't working - all of the sample tests were failing. So then I tried installing junit and hamcrest in my GroceryListMaker directory and running as so on the command line, which is supposed to work, but it seemed to break the program if the test was in the script and it couldn't find the method (which actually I think is because I forgot to import the class) if it was in a separate file. 

Type of thing that didn't work:

javac -cp <junit-jar-file>;. TestClass1.java TestClass2.java

java -cp <junit-jar>;<hamcrest-jar>;. org.junit.runner.JUnitCore  TestClass1 TestClass2

The unit test methods like assertEquals are similar to Jest (for React/js) and unittest (for Python), but every example test that I googled imported something different at the top, like "import.junit.framework.TestCase" vs "import org.junit.Test" and "import static org.junit.Assert" and other combinations. It also looks like you can create your own custom test runner files, but I am not clear on whether a test runner file needs to be referenced when running the tests. :(


