import java.util.Scanner;
public class B_10_2dArray {

    public static void display(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<=arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int row = sc.nextInt();
        System.out.println("enter the column");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        System.out.println("enter the number for matrix");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

         display(arr);
        sc.close();

       

    } 
}
