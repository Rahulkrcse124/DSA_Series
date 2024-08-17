import java.util.Scanner;
public class R_01_natural{

  public static void naturalRecursive(int num) {
    if(num==1) {
      System.out.println(num);
      return ;
    }
    naturalRecursive(num-1);
    System.out.println(num);
  }

  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number for natural number = ");
    int num = sc.nextInt();
    naturalRecursive(num);
    sc.close();

  }
}