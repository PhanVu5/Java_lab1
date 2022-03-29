package Week_1;
import java.util.Scanner;

class SumProductMinMax3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        final int frist = scanner.nextInt();
        System.out.println("Enter 1st integer: ");
        final int second = scanner.nextInt();
        System.out.println("Enter 1st integer: ");
        final int third = scanner.nextInt();
        int sum;
        int product;
        
            sum = frist + second + third;
            System.out.println("The sum is: " + sum);
            
            product = frist * second * third;
            System.out.println("The product is: " + product);
            
            System.out.println("The max is: " + Math.max(frist, Math.max(second, third)));
            System.out.println("The min is: " + Math.min(frist, Math.min(second, third)));
    }
}