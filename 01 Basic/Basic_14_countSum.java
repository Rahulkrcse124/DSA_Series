import java.util.Scanner;
public class Basic_14_countSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit = ");
        int n = sc.nextInt();

        int digitSum = 0;
        for(int i=1; i<=n; i++) {
            int t = n%10;
            digitSum = digitSum + t;
            n = n/10;
        }
        System.out.print("digit sum is = "+ digitSum);
        sc.close();
        
    }
    
}
