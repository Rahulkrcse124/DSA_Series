import java.util.Scanner;
public class R_13_LinearSearch {

  public static boolean normalLinearSearch(int arr[], int target) {
    for(int i=0; i<arr.length; i++) {
      if(arr[i]==target) {
        return true;
      }
    }
    return false;
  }

  public static boolean recursiveLinearSearch(int arr[], int target, int index) {
     //base case
    if(index==arr.length){
      return false;
    }
     
    // self work
    if(target==arr[index]) {
      return true;
    }

    // recursively work
    // if(recursiveLinearSearch(arr, target, index+1)){
    //   return true;
    // }
    // else{
    //   return false;
    // }
    return recursiveLinearSearch(arr, target, index+1);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of size:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the array:");
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the target");
    int target = sc.nextInt();
    System.out.println(normalLinearSearch(arr, target));

    System.out.println("recursively ");
    System.out.println(recursiveLinearSearch(arr, target, 0));
    sc.close();
  }
}
