import java.util.Scanner;
public class Basic_13_countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digits = ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++) {
            int t = n%10;
            count++;
            n = n/10;
        }
        System.out.println(count);

      
        sc.close();
    }
    
}
