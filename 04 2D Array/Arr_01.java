import java.util.Scanner;
public class Arr_01{

    public static void printArray(int  arr[][],int r, int c) {
        for(int i=0; i<r; i++ ) {
            for(int j=0; j<c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row: ");
        int r = sc.nextInt();

        System.out.println("enter the column:");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter the array");
        for(int i=0; i<r; i++ ) {
            for(int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        printArray(arr, r, c);
        sc.close();
    }
}