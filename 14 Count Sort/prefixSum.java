public class prefixSum {

  public static void preSum(int arr[]) {
    
    System.out.print(arr[0]+" ");
    for(int i=1; i<arr.length; i++) {
      if(arr.length>=1) {
         arr[i] = arr[i]+arr[i-1];
         System.out.print(arr[i]+" ");
      }
    }
  } 
  public static void main(String[] args) {
    int arr[] = {1,4,2,7,5};
    preSum(arr);
  }
}
