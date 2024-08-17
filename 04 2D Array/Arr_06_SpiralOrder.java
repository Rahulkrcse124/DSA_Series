// import java.util.Scanner;
// public class Arr_06_SpiralOrder {

//     public static void originalMatrix(int arr[][],int r, int c) {
//         for(int i=0; i<r; i++) {
//             for(int j=0; j<c; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println(" ");
//         }
//     }

//     public static void spiralOrder(int arr[][], int r, int c) {
//         int topRow = 0;
//         int leftCol = 0;
//         int rightCol = r-1;
//         int buttonRow = c-1;

//         /*
//          toprow : leftcol to rightcol
//          rightcol: toprow to buttonrow
//          buttonrow: rightcol to leftcol
//          leftcol: buttonrow to toprow
//          */

//          while() {
//             // toprow : leftcol to rightcol
//             for(int j=leftCol; j<rightCol; j++) {
//                 System.out.print(arr[leftCol][j]+" ");
//             }
//             leftCol++;


//             // rightCol: toprow to buttomrow
//             for(int i=topRow; i<buttonRow; i++) {
//                 System.out.print(arr[i][rightCol]+" ");
//             }
            

//             //buttom row : rightcol to leftcol

//             for(int j=rightCol; j>=leftCol; j--) {
//                 System.out.print(arr[buttonRow][j]+" ");
//             }


//             //leftcol: buttomrow to toprow
//             for(int i=buttonRow; i>=topRow; i--) {
//                 System.out.print(arr[leftCol][i]+" ");
//             }

//          }


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the row:");
//         int r = sc.nextInt();
//         System.out.println("enter the column:");
//         int c = sc.nextInt();
//         int arr[][] = new int[r][c];
//         System.out.println("enter the " + r*c + " element for matrix:");
//         for(int i=0; i<r; i++) {
//             for(int j=0; j<c; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("original matrix is: ");
//         originalMatrix(arr, r,c);
//         sc.close();
//     }
    
// }
