import java.util.Scanner;
public class R_15_targetAllIndex {

  public static void printTargetAllIndex(int arr[], int target) {
    for(int i=0; i<arr.length; i++) {
      if(arr[i] == target) {
        System.out.println(i);
      }
    }
  }


  public static void recursivelyPrintAllIndix(int arr[], int index, int target) {
    // base case
    if(index==arr.length) {
      return;
    }
    
    // self work
    if(arr[index]==target){
      System.out.println(index);
    }
     
    // recursive work
    recursivelyPrintAllIndix(arr, index+1, target);

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the array element:");
    for(int i=0; i<arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the target:");
    int target = sc.nextInt();
    System.out.println("all index of target is : ");
    printTargetAllIndex(arr, target);

    System.out.println("recursively print the all indices is : ");
    recursivelyPrintAllIndix(arr, 0, target);
    sc.close();
    
  }
  
}
