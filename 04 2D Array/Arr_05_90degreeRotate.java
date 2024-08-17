import java.util.Scanner;
public class Arr_05_90degreeRotate {

    public static void originalMatrix(int arr[][],int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }


    public static void rotate90Degree(int arr[][], int n) {
        /* transpose */
         for(int i=0; i<n; i++) {
             for(int j=0; j<n; j++) {
                 arr[i][j] = arr[j][i];
            }
        }
       
        /*reverse row wise */

        for(int i=0; i<n; i++) {
            int left =0;
            int right = arr.length-1;
            while(left<right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--; 
            } 
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }





    public static void reverse(int arr[]) {
        int i=0; 
        int j= arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate90d2ndMethod(int arr[][],int n) {
        /* transpose*/
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = arr[j][i];
            }
        }

        /* reverse row wise */
        for(int i=0; i<n; i++) {
            reverse(arr[i]);
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row for square matrix:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        System.out.println("enter the matrix:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("original matrix:");
        originalMatrix(arr, n);

        System.out.println("after rotating 90 degree");
        rotate90Degree(arr, n);

        // System.out.println("2nd method rotate matrix:");
        // rotate90d2ndMethod(arr, n);
        sc.close();
    }
}


