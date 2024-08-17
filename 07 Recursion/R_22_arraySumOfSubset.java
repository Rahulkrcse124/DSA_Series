public class R_22_arraySumOfSubset {

  public static void subSetSum(int arr[],int n, int idx,int sum ){
    // base case
    if(idx>=n){
      System.out.print(sum+" ");
      return;
    }
    
    // recursive work
    subSetSum(arr, n, idx+1, sum+arr[idx]); // include
    
    // self work 
    subSetSum(arr, n, idx+1, sum); // exclude
    

  }
  public static void main(String[] args) {
    int arr[] = {2,4,5};
    subSetSum(arr, arr.length, 0, 0);
    // output : 0,2,4,5,6,7,9,11 
    
  }
  
}
