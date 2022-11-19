import java.util.Scanner;
public class Week3Part2_WhileLoopMenu {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		int option;
		
	// scanner gets its input from the console
		Scanner sc = new Scanner (System.in);
		
		
		do {
			System.out.println("-----   MENU   ----");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. delete");
			System.out.println("4. Exit");
			System.out.println("Enter option ");
			
			option = sc.nextInt();
			
			System.out.println("You chose: "+option);
			
		}while (option != 4); // does not equal 4
		
		
		
		
	sc.close();	
		
		
		
		
		System.out.println("This is the end.");
	}

}
