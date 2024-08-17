public class selectionSort_01{

  static void selectionSort(int arr[]) {

    for(int i=0; i<arr.length-1; i++) {
      int minIndex = i;
      for(int j=i+1; j<arr.length; j++) {
        if(arr[j]<arr[minIndex]) {
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }

  static void display(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String args[]) {
    int arr[] = {7,5,3,4,1};

    selectionSort(arr);
    display(arr);
  }
}