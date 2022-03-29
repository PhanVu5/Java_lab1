import java.util.Scanner;
class InputValidation{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number in between 0-10 or 90-100: ");
            int number = sc.nextInt();
            boolean check = false;
            
            do{
                if(0 <= number && number <= 10 || 90 <= number && number <= 100  ){
                    check = true;
                }else{
                    System.out.println("In valid input, try again... ");
                    System.out.print("Enter a number in between 0-10 or 90-100: ");
                    number = sc.nextInt();
                }
            }while (!check);
            
            System.out.print("You have ented: " + number);
            sc.close();
    }
}