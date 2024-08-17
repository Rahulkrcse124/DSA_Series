import java.util.Scanner;
public class Basic_10_decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of n = ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(n>=i) {
            System.out.println(n);
            sum = sum + n;
            n = n-1;
        }
        System.out.println("sum is = "+ sum);
        sc.close();
        
    }
}
