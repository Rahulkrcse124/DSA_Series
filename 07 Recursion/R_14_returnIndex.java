import java.util.Scanner;
public class R_14_returnIndex {

  public static int SimplereturnIndex(int arr[], int target) {
    for(int i=0; i<arr.length; i++) {
      if(arr[i]==target) {
        return i;
      }
    }
    return -1;
  }

  public static int recursivelyReturnIndex(int arr[], int target,int index) {
    // base case
    if(index==arr.length) {
      return 0;
    }
     
    //self work
    if(target==arr[index]) {
      return index;
    }
    
    // recursive work
    return recursivelyReturnIndex(arr, target, index+1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the array:");
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the target");
    int target = sc.nextInt();
    System.out.println("target index is : " + SimplereturnIndex(arr, target));

    System.out.println("recursively");
    System.out.println("target index is " + recursivelyReturnIndex(arr, target, 0));
    sc.close();
  }
}
