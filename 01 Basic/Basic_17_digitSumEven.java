import java.util.Scanner;
public class Basic_17_digitSumEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit = ");
        int n = sc.nextInt();
        int digitSumEven = 0;
        int digitOddSum = 0;
        int countDigit = 0;
        while(n>0){
            int t = n%10;
            if(t%2==0){
                System.out.println("even digit is = "+t);
                digitSumEven = digitSumEven + t;
            }
            else{
                System.out.println("odd digit is = "+t);
                digitOddSum = digitOddSum + t;
            }
            n = n/10;
            countDigit++;
        }
        System.out.println("digit count = "+countDigit);
        System.out.println("digit sum of even = "+ digitSumEven);
        System.out.println("digit sum of odd = "+digitOddSum);
        
        sc.close();
        
    }
    
}
