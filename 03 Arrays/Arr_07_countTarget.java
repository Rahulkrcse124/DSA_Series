import java.util.Scanner;
public class Arr_07_countTarget {

    static int countTarget(int arr[], int targetCount) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==targetCount) {
               count++;
            }
        }
        return count;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target for count = ");
        int targetCount = sc.nextInt();
        int arr[] = {1,3,5,7,5,8,3,5};
        System.out.println(countTarget(arr, targetCount));
        sc.close();

        
    }
    
}
