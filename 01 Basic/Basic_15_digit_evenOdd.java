import java.util.Scanner;
public class Basic_15_digit_evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the digit = ");
        int n = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        for(int i=1; i<=n; i++) {
            int t = n%10;
            if(t%2 ==0){
                countEven++;
            }
            if(t%2!=0){
                countOdd++;
            }
            n = n/10;
        }
        System.out.println("count sum is = " +countEven);
        System.out.println("count odd is = "+countOdd);
        sc.close();
        
    }
    
}
