import java.util.Scanner;
public class Arr_25_query {

    public static int querySum(int arr[], int l , int r) {
        int sum = 0;
        for(int i=l; i<r; i++) {
            
             sum = arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the query l ");
        int l = sc.nextInt();
        System.out.println("enter the query r: ");
        int r = sc.nextInt();
        System.out.println("sum = "+querySum(arr, l, r));
        sc.close();
    }
    
}
