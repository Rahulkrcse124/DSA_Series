import java.util.Scanner;
public class Basic_02_userInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your lucky number = ");
        int num = sc.nextInt();
        System.out.println("your lucky number is = "+num);
    

        sc.close();

    }
    
}
