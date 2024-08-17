import java.util.Scanner;
public class Arr_09_sorted {

    static boolean sorted(int arr[]) {
        boolean check = true;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return check;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array for check sorted or not:");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sorted(arr));

        sc.close();

    }
    
}
