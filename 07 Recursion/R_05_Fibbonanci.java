import java.util.Scanner;
public class R_05_Fibbonanci {

  public static int fiboSeries(int n) {
    if(n==0) {
      return 0;
    }
    if(n==1) {
      return 1;
    }
    return fiboSeries(n-1)+fiboSeries(n-2);
  }

  public static int fiboSeries2(int n) {
    if(n==0 || n==1) {
      return n;
    }
    int prev = fiboSeries2(n-1);
    int prevprev = fiboSeries2(n-2);
    int ans = prev+prevprev;
    return ans;
  }

  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of n = ");
    int n = sc.nextInt();
    System.out.println(fiboSeries(n));

    System.out.println("2nd method");
    System.out.println(fiboSeries2(n));
    sc.close();
  }
  
}
