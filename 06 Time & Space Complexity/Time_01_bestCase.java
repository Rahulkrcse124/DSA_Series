public class Time_01_bestCase{

  public static int bestCase(int arr[], int x) {
    int n = arr.length;
    int temp = -1;
    for(int i=0; i<n; i++) {
      if(arr[i]==x){
         temp = i;
      }
    }
    return temp;
  }
  public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};
    int x = 10;
    System.out.println(bestCase(arr, x));
  }
}