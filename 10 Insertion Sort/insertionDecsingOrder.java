public class insertionDecsingOrder {

  public static void insertionDecresingOrder(int arr[]){
    for(int i=1; i<arr.length; i++) {
      int j = i;

      while( j>0 && arr[j]>arr[j-1]) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }
  }

  public static void display(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1,4,3,9,5,8};

    insertionDecresingOrder(arr);
    display(arr);
  }
  
}
