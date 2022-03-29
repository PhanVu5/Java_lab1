package Week_1;
import java.util.Scanner;

/**
 * Trying if −else statement
 */

public class CheckPassFail {// Save as ” CheckPassFail . java ”
	public static void main(String[] args) {// Program entry point
		System.out.println("Imput mark");
		Scanner I = new Scanner(System.in);
		int mark = I.nextInt(); // Set the value of "mark" here!
		if (mark >= 50) {//Comparison with >= greater than or equal.
			System.out.println("Pass");//Pass
		} else {
			System.out.println("Fail");//Fail
		}
		System.out.println("DONE");

	}

}
