public class S_02_allZeroFirst {

  public static void allZeroFirstWithoutChangeSequence(int arr[]) {
    for(int i=0; i<arr.length-1; i++) {
      for(int j=i+1; j<arr.length; j++) {
        if(arr[i]!=0 && arr[j]==0) {
          // swap 
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  static void display(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {9,2,0,5,0,0,6,0,1,0};   

    allZeroFirstWithoutChangeSequence(arr);
    display(arr);
  }
  
}
