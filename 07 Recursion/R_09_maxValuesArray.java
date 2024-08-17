import java.util.Scanner;
public class R_09_maxValuesArray {

  public static int maxValues(int arr[]){
    int max = 0;
    for(int i=0; i<arr.length; i++) {
      if(arr[i]>max) {
        max = arr[i];
      }
    }
    return max;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number of n = ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the value for array:");
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("max values is = " + maxValues(arr));
    sc.close();
  }
  
}
