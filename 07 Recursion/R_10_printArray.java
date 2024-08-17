public class R_10_printArray {

  public static void printArrayRecursively(int arr[], int indx) {
    if(indx==arr.length) {
      return ;
    }
    System.out.print(arr[indx]+" ");
    printArrayRecursively(arr, indx+1);

  }
  public static void main(String[] args) {
    int arr[] = {1,5,3,7,8};
    printArrayRecursively(arr, 0);
  }
}
