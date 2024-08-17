import java.util.Scanner;
public class Basic_06_evenDivided {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number = ");
        int num = sc.nextInt();

        if(num%2==0 && num%3==0){
            System.out.println("number is even with divisible by 3 ");
            System.out.println("number is " + num);
        }
        else{
            System.out.println(-1);
        }
       sc.close();
        
    }
    
}
