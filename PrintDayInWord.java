package Week_1;

/*
* Trying nested − if and switch−case statement
**/
import java.util.Scanner;

public class PrintDayInWord { // Save as "CheckOddEven" java.
	public static void main(String[] args) {
		System.out.println("Imput Daynumber");
		Scanner I = new Scanner(System.in);
		int Daynumber = I.nextInt(); // Set the value of "number" here!
		// Using nested - if
		if (Daynumber == 0) {
			System.out.println("SUNDAY");
		} else if (Daynumber == 1) {
			System.out.println("MONDAY");
		} else if (Daynumber == 2) {
			System.out.println("TUESDAY");
		} else if (Daynumber == 3) {
			System.out.println("WEDNESAY");
		} else if (Daynumber == 4) {
			System.out.println("THURSDAY");
		} else if (Daynumber == 5) {
			System.out.println("FRIDAY");
		} else if (Daynumber == 6) {
			System.out.println("STATUDAY");
		} else {
			System.out.println("NOT");
		}
		// Using switch - case - default;
		switch (Daynumber) {
		case 0:
			System.out.println("SUNDAY");
			break;
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDAY");
			break;
		case 3:
			System.out.println("WEDNESAY");
			break;
		case 4:
			System.out.println("THURSDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("STATUDAY");
			break;
		default:
			System.out.println("NOT");
		}
	}

}
