import java.util.Scanner;
class CircleComputation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

            System.out.println(" The diameter is: ");
            System.out.printf("%.2f%n",  (2 * radius));
            System.out.println("The area is: ");
            System.out.printf("%.2f%n", (Math.PI * radius * radius));
            System.out.println("The circumference is: " );
            System.out.printf("%.2f%n", (2 * Math.PI * radius));
        
    }
}