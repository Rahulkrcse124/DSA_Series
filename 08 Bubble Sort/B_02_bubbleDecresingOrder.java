public class B_02_bubbleDecresingOrder {

  public static void bubbleSortDecresingOrder(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length; j++) {
        if(arr[i]<arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void bubble2ndMethod(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length-i-1; j++) {
        if(arr[i]<arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void bubble3rdMethod(int arr[]) {
    int n = arr.length;
    for(int i=0; i<n-1; i++) {
      for(int j=0; j<n-i-1; j++) {
        if(arr[j]<arr[j+1]) {
          int temp = arr[j+1];
          arr[j+1]= arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void display(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {5,7,4,1,3};
    bubbleSortDecresingOrder(arr);
    display(arr);

    System.out.println();
    bubble2ndMethod(arr);
    display(arr);

    System.out.println();
    bubble3rdMethod(arr);
    display(arr);
  }
}
