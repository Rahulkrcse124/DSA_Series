import java.util.Scanner;
public class Arr_04_Transpose {

    public static void originalMatrix(int arr[][], int r, int c) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void transposeMatrix(int arr[][], int r, int c) {
        int transpose[][] = new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                transpose[i][j] = arr[j][i]; 
            }
        }

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void transposeInplace(int arr[][], int r, int c) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row:");
        int r = sc.nextInt();
        System.out.println("enter the column:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        System.out.println("enter the matrix:");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }   

        System.out.println("original matrix:");
        originalMatrix(arr, r, c);

        System.out.println(" ");
        System.out.println("after transpose matrix:");
        transposeMatrix(arr, r, c);

        System.out.println("");
        System.out.println("after transpose inplace");
        transposeInplace(arr, r, c);

        sc.close();
    }
}
