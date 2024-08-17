import java.util.Scanner;
public class Basic_32_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of n = ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            for(int k=i-1; k>=1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
