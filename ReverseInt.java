package Week_1;
import java.util.Scanner;
class ReverseInt{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();
            System.out.println();

            System.out.print("The reverse is: ");
            while (number >= 1){
                System.out.print(number % 10);
                number /= 10;
            }
    }
}