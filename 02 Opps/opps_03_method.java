import java.util.Scanner;
class student{
    public int sum(int a, int b) {
        int ans = a+b;
         return ans;
    }
}


public class opps_03_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();
        System.out.println("enter rthe second number : ");
        int b = sc.nextInt();
        
        student obj = new student();
        System.out.println("sum is : " + obj.sum(a, b));
        sc.close();
        
    }
    
}
