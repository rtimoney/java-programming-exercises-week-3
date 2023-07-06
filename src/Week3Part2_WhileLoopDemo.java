/**  
 * @author Ronan J Timoney 
 * Friday 5th February 20201 - Part 1
 * Demonstrating the use of While Loops
 */ 
public class Week3Part2_WhileLoopDemo {
public static void main(String[] args) {

int outerCounter = 0;
int innerCounter = 0;

while (outerCounter <= 10) {
	System.out.println("Outer : "+outerCounter);
	outerCounter++;
	
	innerCounter = 0;
	while (innerCounter <= 5) {
		System.out.println("Inner : "+innerCounter);
		innerCounter++;
	} // end of while loop 2
	System.out.println();
} // end of while loop 1 
System.out.println("This is tbe end.");
} // end of main method

} // end of class 
