public class S_01_allZeroLast{

  public static void allZeroLastWithoutChangeSequence(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length; j++) {
        if(arr[i]==0 && arr[j]!=0) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  static void display(int arr[]){
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }

  }
  public static void main(String[] args) {
    int arr[] = {0,5,0,4,2,3};
    allZeroLastWithoutChangeSequence(arr);
    display(arr);
  }
}