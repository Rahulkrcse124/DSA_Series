public class suffixSum {

  public static void suffixSumAns(int arr[]) {
    System.out.print(arr[arr.length-1] + " ");

    for(int i=arr.length-2; i>=0; i-- ) {
      arr[i] = arr[i] + arr[i+1];
      System.out.print(arr[i] +" ");
    }

  }
  public static void main(String[] args) {
    int arr[] = {1,4,7,2,5};  // 5 7 14 18 19 
    suffixSumAns(arr);
  }
  
}
