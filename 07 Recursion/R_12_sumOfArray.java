import java.util.Scanner;
public class R_12_sumOfArray {

  public static int sumOfArray(int arr[]) {
    int sum = 0;
    for(int i=0; i<arr.length; i++) {
      sum = sum+arr[i];
    }
    return sum;
  }

  public static int recursiveSumOfArray(int arr[], int index){
    // base case
    if(index==arr.length) {
      return 0;
    }
     // or 2nd base case may be possible
    // if(index==arr.length-1){
    //   return arr[index];
    // }

    int small = recursiveSumOfArray(arr, index+1);
    return small+arr[index];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("simple array sum is :"+sumOfArray(arr));
    System.out.println("recursive sum is:");
    System.out.println(recursiveSumOfArray(arr, 0));

    sc.close();
  }
}
