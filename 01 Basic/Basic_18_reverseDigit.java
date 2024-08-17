import java.util.Scanner;
public class Basic_18_reverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit = ");
        int n = sc.nextInt();
        int ans = 0;

        while(n>0) {
            int t = n % 10;
            ans = ans*10 + t;
            n = n/10;
        }
        System.out.println("reversed digit = "+ans);
        sc.close();
       
        
    }
    
}
