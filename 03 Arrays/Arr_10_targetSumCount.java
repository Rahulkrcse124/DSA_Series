import java.util.Scanner;
public class Arr_10_targetSumCount {
    public static int targetSum(int arr[], int target) {
        int targetSumCount = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==target) {
                    targetSumCount++;
                }
            }
        }
        return targetSumCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the target : ");
        int targetn = sc.nextInt();
        System.out.println("enter the array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("target sum = "+targetSum(arr, targetn));
        sc.close();
    }
    
}

/*
arr = {4,6,3,5,8,2}
target = 7;
output = 2
4+3 = 7, 5+2 = 7,
so answer = 2
 */
