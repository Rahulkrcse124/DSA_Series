import java.util.Scanner;
public class Basic_21_prime{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number = ");
        int n = sc.nextInt();
        int i=2;
        while(i<=n){
            if(n%i==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.out.println("prime");
                break;
            }
        }

        sc.close();

    }
}