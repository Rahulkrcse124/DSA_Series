import java.util.Scanner;
public class Arr_03_multiplication {

    public static void firstMatrix( int arr1[][], int r1, int c1) {
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void secondMatrix(int arr2[][], int r2, int c2) {
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void multplication(int arr1[][], int r1, int c1, int arr2[][], int r2, int c2) {
        if(c1!=r2) {
            System.out.println("multiplication not possible - wrong input");
            return;
        }
        int mult[][] = new int[r1][c2];
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                for(int k=0; k<c1; k++) {
                    mult[i][j] = mult[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c2; j++) {
                System.out.print(mult[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st row for 1st matrix:");
        int r1 = sc.nextInt();
        System.out.println("enter the 1st column for 1st matrix:");
        int c1 = sc.nextInt();
        System.out.println("enter the 2nd row for 2nd matrix:");
        int r2 = sc.nextInt();
        System.out.println("enter the 2nd column for 2nd matrix:");
        int c2 = sc.nextInt();

        int arr1[][] = new int[r1][c1];
        int arr2[][] = new int[r2][c2];

        System.out.println("enter the element for 1st matrix:");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the element for 2nd matrix:");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("first matrix is:");
        firstMatrix(arr1, r1, c1);
        System.out.println();
        System.out.println("2nd matrix is:");
        secondMatrix(arr2, r2, c2);
        
        System.out.println(" ");
        System.out.println("after multiplication matrix:");
        multplication(arr1, r1, c1, arr2, r2, c2);

        sc.close();
    }
    
}
