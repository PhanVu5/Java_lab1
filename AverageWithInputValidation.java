import java.util.Scanner;
class AverageWithInputValidation{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter in the number student: ");
            final int NUM_STUDENTS = sc.nextInt();
            
            int sum = 0;
            double average = 0.0;
            boolean check = false;

            for (int student = 1; student <= NUM_STUDENTS; ++student){
                
                do{
                    System.out.print("Enter a number in between 0-100 for student" + student + " ");
                    int numberIn = sc.nextInt();
                    if (0 <= numberIn && numberIn <= 100){
                        sum += numberIn;
                        check = true;      
                    }else {
                        check = false;
                        System.out.println("Invalid input, try again... ");
                    }
                }while (!check);  
                
            }
                average = (double) sum /NUM_STUDENTS;
                System.out.println("The sum is: " + sum);
                System.out.printf("The average is: %.2f\n",average);
                
                sc.close();
    }
}