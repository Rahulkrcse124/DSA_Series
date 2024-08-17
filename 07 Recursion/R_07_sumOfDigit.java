import java.util.Scanner;
public class R_07_sumOfDigit {

  public static int digitSum(int n) {
    int sum = 0;
    while(n>0) {
      int t = n%10;
      sum = sum + t;
      n = n/10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of n = ");
    int n = sc.nextInt();
    System.out.println(digitSum(n));
    sc.close();
    
  }
}
