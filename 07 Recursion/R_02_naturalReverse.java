import java.util.Scanner;
public class R_02_naturalReverse {

  public static void naturalReverseRecursive(int n) {
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    naturalReverseRecursive(n-1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number for natural = ");
    int n = sc.nextInt();
    naturalReverseRecursive(n);
    sc.close();
  }
  
}
