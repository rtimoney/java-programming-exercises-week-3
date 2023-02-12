import java.util.Calendar;
import java.util.Locale;

public class PrintfRevisited {

	public static void main(String[] args) {
		long n = 461012;
		System.out.printf("%d%n", n); // --> "461012"
		System.out.printf("%08d%n", n); // --> "00461012"
		System.out.printf("%12d%n", n); // --> " 461012"
		System.out.printf("%12d%8d%n", n, n); // --> " 461012 461012"
		System.out.printf("%-12d%8d%n", n, n); // --> "461012 461012"
		System.out.printf("%+8d%n", n); // --> " +461012"
		System.out.printf("%+-12d%8d%n", n, n); // --> "+461012 461012"
		System.out.printf("%,8d%n", n); // --> " 461,012"
		System.out.printf("%+,8d%n%n", n); // --> "+461,012"

		double pi = Math.PI;

		System.out.printf("%f%n", pi); // --> "3.141593"
		System.out.printf("%.3f%n", pi); // --> "3.142"
		System.out.printf("%10.3f%n", pi); // --> " 3.142"
		System.out.printf("%7.3f%n", 1234567890.12345); // --> "1234567890.123"
		System.out.printf("%-10.3f{%n", pi); // --> "3.142 "
		System.out.printf(Locale.FRANCE, "%-10.4f%n%n", pi);// --> "3,1416 "

		Calendar dateToday = Calendar.getInstance();
		System.out.printf("%tB %te, %tY%n", dateToday, dateToday, dateToday); // --> "October 1, 2020" ---
																				// or whatever today's date is!
		System.out.printf(Locale.GERMANY, "%tB %te, %tY%n", dateToday, dateToday, dateToday); // --> "Oktober 1, 2019"

		System.out.printf("%tl:%tM %tp%n", dateToday, dateToday, dateToday); // --> "11:19 am"

		System.out.printf("%tD%n", dateToday); // --> "10/01/19"

		System.out.printf("ten as a percent is %d%%", 10); // --> "ten as a percent is 10%"
	} // end of main method
} // end of class
