import java.util.Scanner;
public class Basic_05_ternury {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        String ans;
        ans = (num%2==0)? "even": "odd";
        System.out.println(ans);
        sc.close();
        
    }
    
}
