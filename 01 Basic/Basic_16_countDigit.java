import java.util.Scanner;
public class Basic_16_countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();

        int countDigit = 0;
        int countSum = 0;
       
        while(n>0){
            int t = n%10;
            countSum = countSum + t;
            n = n/10;
            countDigit++;
        }
        System.out.println("count of digit = " +countDigit );
        System.out.println("count of sum is = "+countSum);
        sc.close();
        
    }
    
}
