
public class Week_3_NestedForLoopsExample {

	public static void main(String[] args) {
		
		for (int outer=1; outer<=3; outer++) {
			for (int inner=1; inner<=5; inner++) {
				System.out.printf("outer [%d] inner [%d] \n", outer, inner);
			} // end of nested for loop
		}// end of for loop
		
		for (int i=0; i<=5; i++) {
			System.out.println("Outer Counter "+i);
			
			for (int j=0; j<=10; j++) {
				System.out.println("      Inner Counter: "+j);
			}
			System.out.println();
		}

	} // end of main method
} // end of class
