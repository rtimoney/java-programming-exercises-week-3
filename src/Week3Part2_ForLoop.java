
public class Week3Part2_ForLoop {

	public static void main(String[] args) {

// A simple for loop running from 1 to 10
		for(int numbers=1; numbers<11; numbers+=2) {
		System.out.println("Count is : "+numbers);
		}

	System.out.println("");
		
		for(int i=100; i>=1; i--) {
			// the int i cannot be used outside this for statement - out of scope //       
			System.out.println("Count is : "+i);
		}  // end of for loop
	} // end of main method 

} // end of class
