import java.util.Scanner;
public class B_11_2dArrayTarget240Leetcode {

    public static void display(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean searchTargerBinray(int arr[][], int target) {
        int n1 = arr.length;
        int i= 0;
        int j = arr[i].length-1;
        
        while(n1>=0 && j>=0) {
            if(arr[i][j]==target) {
                return true;
            }

            if(arr[i][j] > target) {
                j--;
            }
            if(arr[i][j] < target) {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for row and column:");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int target = 4;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" matrix is: ");
        display(arr);
        System.out.println(" ");
        System.out.println(searchTargerBinray(arr, target));
        sc.close();
    }
}
