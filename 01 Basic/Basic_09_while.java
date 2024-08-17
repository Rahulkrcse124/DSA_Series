import java.util.Scanner;
public class Basic_09_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("enter the number of n = ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            System.out.println(i);
            sum = sum +i;
            i = i+1;
        }
        System.out.println("sum is = "+ sum);
        sc.close();
        
    }
    
}
