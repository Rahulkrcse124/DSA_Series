public class selectionSortDecresing_02 {

  public static void selectioSortDecresedOrder(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
      int minIndex = i;
      for(int j=i+1; j<arr.length; j++) {
        if(arr[i] <arr[j]) {
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

  public static void display(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {1,5,3,8,2,7};
    selectioSortDecresedOrder(arr);
    display(arr);
  }
}
