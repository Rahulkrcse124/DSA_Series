import java.util.Scanner;
public class Arr_07_prefixSum {

    public static void originalMatrix(int arr[][], int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static int prefixSumGivenValue(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        for(int i=r1; i<=r2; i++) {
            for(int j=c1; j<=c2; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for matrix:");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        System.out.println("enter the " + n*n + "number for matrix: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter 1st number:");
        int r1 = sc.nextInt();
        System.out.println("enter the 1st column:");
        int c1 = sc.nextInt();
        System.out.println("enter the 2nd row:");
        int r2 = sc.nextInt();
        System.out.println("enter the 2nd column:");
        int c2 = sc.nextInt();
         
        System.out.println("original matrix: ");
        originalMatrix(arr, n);
        System.out.println(" ");
      System.out.println("sum is : "+prefixSumGivenValue(arr, r1, c1, r2, c2));
        sc.close();
    }
}
