import java.util.Scanner;
public class Arr_02_sumMatrix {

    public static void prinntSumMantrix(int arr1[][], int arr2[][], int r1, int c1, int r2, int c2) {
        if(r1!=r2 || c1!=c2) {
            System.out.println("addition is not possible:");
            return;
        }

        int sum[][] = new int[r1][c1];
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first row");
        int r1 = sc.nextInt();
        System.out.println("enter the first column: ");
        int c1 = sc.nextInt();
        System.out.println("enter the 2nd row ");
        int r2 = sc.nextInt();
        System.out.println("enter the 2nd column ");
        int c2 = sc.nextInt();

        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];

        System.out.println("enter the first matrix:");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the 2nd matrix:");
        for(int m=0; m<r2; m++) {
            for(int n=0; n<c2; n++) {
                arr2[m][n] = sc.nextInt();
            }
        }
        System.out.println("sum matrix is: ");
        prinntSumMantrix(arr1, arr2, r1, c1, r2, c2);
        sc.close();
    }
    
}
