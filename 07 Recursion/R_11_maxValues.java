import java.util.Scanner;
public class R_11_maxValues {

  public static int recursiveMaxValue(int arr[], int index) {
    // base case
    if(index==arr.length-1) {
      return arr[index];
    }

    // recursive work
    int small = recursiveMaxValue(arr, index+1);

    // self work
    return Math.max(small, arr[index]);


  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the length of array ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the array");
    for(int i=0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("max values is:"+recursiveMaxValue(arr, 0));
    sc.close();
  }
  
}
