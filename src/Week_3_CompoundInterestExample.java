
public class Week_3_CompoundInterestExample {

	public static final double RATE = 0.5;
	public static void main(String[] args) {
		
// allocate space to hold the money
		double bankAccount = 1000;
		
		// store the interest rate  
double interestRate = 0.05;

;
// for loops are best when we know it is a set number of years 
// for (int year =1; year<=10; year++) {
// 	System.out.printf("%-3d |                  %-10.2f%n",year, bankAccount);
	
//	// calculate interest for one year - we need somewhere to store this 
//	double interestMade = bankAccount * interestRate;
//	// add interest to the original balance 
//	bankAccount = bankAccount + interestMade;
//	}

// System.out.println();
System.out.println("With headings and additional columns:");
System.out.println();

System.out.printf("%-7s | %-10s | %-10s | %-10s\n", "YEAR", "StartingValue", "Interest", "End Balance" );
System.out.printf("---------------------------------------------------\n");


for (int year =1; year<=10; year++) {
	System.out.printf("%-7d | %-13.2f | ",year, bankAccount);
	
	// calculate interest for one year - we need somewhere to store this 
	double interestMade = bankAccount * interestRate;
	System.out.printf("%-10.2f | ", interestMade);
	// add interest to the original balance 
	bankAccount = bankAccount + interestMade;
	System.out.printf("%-10.2f | %n", bankAccount);
	// Create an interest made column
	
	}

}
	}


//for (int i = 0; i<= 5; i++ ) {
//	System.out.println("Counter: "+i);




//System.out.println("The rate is: " +RATE);
//	System.out.println("This is the end");


	
	
	