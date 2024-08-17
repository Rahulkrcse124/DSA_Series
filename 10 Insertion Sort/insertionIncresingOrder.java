public class insertionIncresingOrder{

  public static void insertionSort(int arr[]) {
    for(int i=1; i<arr.length; i++) {
      int j = i;

      while( j>0 && arr[j]<arr[j-1]) {
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
    int arr[] = {8,5,7,3,1,4};

    insertionSort(arr);
    display(arr);
  }
}