public class B_01_bubbleSort{

  public static void bubbleSort(int arr[]){
    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length; j++) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  }

  public static void display(int arr[]){
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {7,5,4,3,1};
    bubbleSort(arr);
    display(arr);
  }
}