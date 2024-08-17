import java.util.Scanner;
public class Arr_17_firstLastSwap {

    public static void swapFirstLast(int arr[]) {
        int i=0; 
        int j= arr.length;
        while(i<j) {
            int temp = arr[j-1];
            arr[j-1] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }



        for(int k=0; k<arr.length; k++) {
            System.out.println(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("after swap first last:");
        swapFirstLast(arr);
        sc.close();
    }
    
}
