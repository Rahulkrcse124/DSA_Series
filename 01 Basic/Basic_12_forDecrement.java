import java.util.Scanner;
public class Basic_12_forDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of n = ");
        int n  = sc.nextInt();
        for(int i= n; i>=1; i--){
            System.out.println(i);
        }
      sc.close();
        
    }
    
}
