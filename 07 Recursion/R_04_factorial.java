import java.util.Scanner;

public class R_04_factorial {
  public static int factorial(int n) {
    if(n==0) {
      return 1;
    }
    int small = factorial(n-1);
    int ans = small*n;
    return ans;
  }
  

  public static int factorial2ndMethod (int n) {
    if(n==0) {
      return 1;
    }
    return n*factorial2ndMethod(n-1);
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of n = ");
    int n = sc.nextInt();
    System.out.println(factorial(n));
    System.out.println("2nd method");
    System.out.println(factorial2ndMethod(n));
    sc.close();
  }
}
