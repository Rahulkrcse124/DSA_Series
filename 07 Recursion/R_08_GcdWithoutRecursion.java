import java.util.Scanner;
public class R_08_GcdWithoutRecursion {

  public static int gcd(int x, int y) {
    int min = 0;
    int ans = 0;
    if(x>y) {
      min = y;
    }
    if(y>x){
      min = x;
    }
    while(min>0) {
      if(x%min==0 && y%min==0) {
        ans = min;
        return ans;
      }
      min--;
    }
    return ans;
  }


  static int recursiveGcd(int x, int y){
    if(y==0) {
      return x;
    }
    return recursiveGcd(y, x%y);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of x = ");
    int x = sc.nextInt();
    System.out.print("enter the number of y = ");
    int y = sc.nextInt();
    System.out.println(gcd(x, y));
    System.out.println("2nd method recursive method:");
    System.out.println(recursiveGcd(x, y));
    sc.close();
  }
  
}
