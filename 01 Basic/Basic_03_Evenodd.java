import java.util.Scanner;
public class Basic_03_Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("number is even:");
        }
        else{
            System.out.println("number is odd:");
        }
        
        sc.close();
    }
    
}
