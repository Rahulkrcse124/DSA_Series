import java.util.Scanner;

public class R_06_FiboSeriesPrint {

  public static int fibonacci(int i) {
    if (i == 0) {
      return 0;
    } else if (i == 1) {
      return 1;
    } else {
      return fibonacci(i - 1) + fibonacci(i - 2);
    }
  }

  public static void printSeries(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of terms in the Fibonacci series: ");
    int n = sc.nextInt();
    if (n <= 0) {
      System.out.println("The number must be positive.");
    } else {
      printSeries(n);
    }
    sc.close();
  }
}
