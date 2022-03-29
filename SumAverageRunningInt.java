package Week_1;
/**
 * Compute the sum and average of running integers from a lowerbound to an
 * upperbound using loop.
 */
public class SumAverageRunningInt {
		public static void main(String[] args) {
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;

		int sum = 0;
		double Average;
		System.out.println("Method: ");
		System.out.print("The sum of 1 to 100 is: ");
		sum = (UPPERBOUND - LOWERBOUND + 1) * (UPPERBOUND + LOWERBOUND) / 2; // SUM
		System.out.println(sum);
		double S = sum; // Change Datatypes.
		sum = 0;
		Average = S / (UPPERBOUND - LOWERBOUND + 1); // Average
		System.out.print("The average is: ");
		System.out.println(Average);
		Average = 0;

		// Use a for−loop to sum from lowerbound to upperbound
		for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			// The loop index variable number = 1 , 2 , 3 , . . . , 99 , 100
			sum += number; // same as ”sum = sum + number”
		}

		// Compute average in double . Beware that int / int produces int!
		S = sum;
		Average = S / UPPERBOUND;

		// Print sum and average
		System.out.print("The sum of 1 to 100 is: ");
		System.out.println(sum);

		System.out.print("The average is: ");
		System.out.println(Average);
		sum = 0;
		Average = 0;
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			sum += number;
			number++;
		}
		Average = S / UPPERBOUND;
		// Print sum and average
		System.out.print("The sum of 1 to 100 is: ");
		System.out.println(sum);

		System.out.print("The average is: ");
		System.out.println(Average);
		sum = 0;
		Average = 0;
		number = LOWERBOUND;
		do {
			sum += number;
			number++;
		} while (number <= UPPERBOUND);
		S = sum;
		Average = S / UPPERBOUND;
		// Print sum and average
		System.out.print("The sum of 1 to 100 is: ");
		System.out.println(sum);

		System.out.print("The average is: ");
		System.out.println(Average);
		Sum();
		Sum3();
	}
	public static void Sum(){
		int count = 0; // Count the number with in the range , in it to 0
		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		int sum = 0;
		int Average;
		for (int i = LOWERBOUND; i <= UPPERBOUND; i++) {
			sum += i;
			count++;
		}
		Average = sum / count;
		// Print sum and average
		System.out.print("The sum of 1 to 100 is: ");
		System.out.println(sum);

		System.out.print("The average is: ");
		System.out.println(Average);
	}
	public static void Sum3() {
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int sum = 0;
		int Average;
		
		for(int i = LOWERBOUND; i<= UPPERBOUND; i++) {
			sum+=i*i;
		}
		System.out.print("The sum of the squares for 1 to 100 is: ");
		System.out.println(sum);
		
		int SumEvenNumber = 0;
		int SumOddNumber = 0;
		for(int i = LOWERBOUND; i<= UPPERBOUND; i++) {
			if(i % 2 == 0) {
				SumEvenNumber += i;
			}else{
				SumOddNumber += i;
			}
		}
			System.out.println("Do lech tieu chuan cua Odd Number and Even Nuber: ");
			System.out.println(Math.abs(SumEvenNumber-SumOddNumber));
	}
}
