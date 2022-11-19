/**
 * 
 */

/**
 * @author Ronan J Timoney
 *
 */
public class week3Part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int markA, markB, markC, markTotal;
	
	markA= 50;
	markB = 15;
	markC = 21;
	
	char grade;
	grade = 'X';
	
	markTotal= markA + markB + markC;
	System.out.println("Total marks : " + markTotal);
	
	if (markTotal >= 90) {
		grade = 'A';
	} else if (markTotal >= 80) {
		grade = 'B';
	} else if (markTotal >= 70) {
		grade = 'C';
	} else {grade = 'F';
	}
	
	if (grade=='B') {
		System.out.println("Getting there :) ");
	}
	
	System.out.println(grade);
	
	grade = 79;
	
	
	int mark1;
	mark1 = 50;
	System.out.println(mark1 >= 50 ? "FLY" : "FAILTOFLY");
	
	String myString= grade >=75 ? "Great Job!!" : "Well done.";
	System.out.println(myString);
	
	
	
	int a, b, max;
	
a = 9;
b = 500;

max = (a>b) ? a : b;
System.out.println("Max is " + max);
System.out.println("Max is " + ((a>b) ? a : b));

// minimum value 
 int min;
 min = (a<b) ? a : b;
 System.out.println("Min is "+ min);
 
	
 // nested ternaries
 b=1;
 String answer1;
 answer1 = (b>10) ? "Number is greater than 10" : 
	     ((b>4) ? "Number is greater than 4" : 
	     ((b>2) ? "number is greater than 2" : 
	     ((b==1) ? "number is 1" : "number is less than 1"  )));
 System.out.println(answer1);
	
 // Switch statements 
	int number = 5;
    switch (number) {
    case 1 : System.out.println("Value is One");
   // if above is correct, the code will jump back out of the switch process after the *break*
    break;
    case 2 : System.out.println("Value is Two");
    break;
    case 3 : System.out.println("Value is Three");
    break;
    case 4 : System.out.println("Value is Four");
    break;
    default : System.out.println("Invalid number");
    }
    
   // Switch Fall through 
    int month;
    String Season;
    

    
    month = 2;
    		switch (month) {
    		case 1:
    		case 2:
    		case 3:
    	Season = "Winter";
    	break;
    		case 4:
    		case 5:
    		case 6:
    		Season = "Spring";
    		break; 
    		case 7:
    		case 8:
    		case 9:
    			Season = "Summer";
    			break;
    		case 10:
    		case 11:
    		case 12:
    			Season = "Autumn";
    		break;
    		default :    Season = "Not established";
    		}


System.out.println(Season);

// Compound Assignments 
int x;
x = 0;
x = x + 104;
System.out.println("x = "+ x);

// x becomes equal to itself + 10
x+=10;
System.out.println("x = "+ x);

// x becomes the remainder (%) when x is divided by... 5
x%=5;
System.out.println("x = "+ x);

//  x++ = x plus 1
x++;
System.out.println("x = "+ x);
x--;
System.out.println("x = "+ x);




	
	
	
	
	}

}
