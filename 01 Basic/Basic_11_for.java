import java.util.Scanner;
public class Basic_11_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of n = ");
        int n = sc.nextInt();
        int sum = 0; 

        for(int i=1; i<=n; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("sum is = "+ sum);
        sc.close();
    }
    
}
