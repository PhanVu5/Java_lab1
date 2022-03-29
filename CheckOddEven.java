package Week_1;
/*
 * Trying if − else statement and modulus (%) operator.
 */
import java.util.Scanner;

public class CheckOddEven { // Save as "CheckOddEven" java.
	public static void main(String[] args) {
		System.out.println("Imput number");
		Scanner I = new Scanner(System.in);
		int number = I.nextInt(); // Set the value of "number" here!
		if (number % 2 == 0) {
			System.out.println("Even Number");// Even Number
		} else {
			System.out.println("Odd Number");// Odd Number
		}
		System.out.println("Bye!");

	}

}
