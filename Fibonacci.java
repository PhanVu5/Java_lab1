package Week_1;
import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Length = scanner.nextInt();
        int[] F = new int[Length];
        double Average = 2;
        double count = 2;
        F[0] = 1;
        F[1] = 1;
        System.out.print(1 + " ");
        System.out.print(1 + " ");
        for (int i = 2; i < 20; ++i){
            F[i] = F[i-1] + F[i-2]; //F(n) = F(n–1) + F(n–2)
            System.out.print(F[i] + " ");
            
            count ++;
            Average += F[i];
        }
        System.out.println();
        Average /= count;
        System.out.println("Average = " + Average);

    }
}