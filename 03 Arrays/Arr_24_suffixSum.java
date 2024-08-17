import java.util.Scanner;
public class Arr_24_suffixSum {

    public static int[] suffixSum(int arr[]) {
        int n = arr.length-1;
        for(int i=n; i>=0; i--) {
            arr[i] = arr[n-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of size=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       int ans[] =  suffixSum(arr);
       for(int r:ans) {
        System.out.println(r+" ");
       }
    }
    
}
