package Week_1;

class ExtractDigits{
    public static void main(String[] args) {
        int number = 14523;
        int revers = 0;
        while (number >= 1){
            System.out.print(number%10 + " ");
            number /= 10;
        }
        
    }
}