import java.util.Scanner;
public class R_03_alternateNaturalSum {

  public static int alternateNaturalSum(int n) {
    if(n==0) return 0;
    if(n%2==0) {
      return alternateNaturalSum(n-1)-n;
    }
    else{
      return alternateNaturalSum(n-1)+n;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of n = ");
    int n = sc.nextInt();
    System.out.print(alternateNaturalSum(n));
    sc.close();
    
  }
  
}
