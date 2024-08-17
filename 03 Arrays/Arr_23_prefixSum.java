import java.util.Scanner;

public class Arr_23_prefixSum {

    public static int[] prefixSum(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = prefixSum(arr);
        System.out.println("Prefix Sum Array:");
        for(int ans : result) {
            System.out.print(ans + " ");
        }
        sc.close();
    }
}
