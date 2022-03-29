package Week_1;
public class ComputePI{
    public static void main(String[] args){
        final int MAX_DENOMINATOR = 1000;
        double Pi = 0;
        double vain = -1;
        double sum = 0;
        for (double denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2){
            vain *= -1; 
            Pi +=  vain * 4 / denominator;     
            
            if (denominator % 4 == 1){
                ++sum;
            }else if (denominator % 4 == 3){
                --sum;
            }else{
                System.out.println( " Impossible!!! " );
            }    
        }
        System.out.println("Pi = " + Pi);
        System.out.println("Sum = " + sum);
    }
}