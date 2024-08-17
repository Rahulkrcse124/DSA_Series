import java.util.Scanner;
public class Basic_28_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of n = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(j);
            }
            for(int k=1; k<=(i-1); k++) {
                System.out.print(k);
            }
            System.out.println(" ");
        }
        sc.close();
    }
    
}
