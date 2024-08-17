import java.util.Scanner;
public class Arr_06_userInput { 

    public static void printInfo(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println(" enter the number for array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printInfo(arr);
        sc.close();
    }
    
}
