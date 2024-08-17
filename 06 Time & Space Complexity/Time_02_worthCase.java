public class Time_02_worthCase {

  public static int worthCase(int arr[], int x) {
    int n = arr.length;
    int temp = -1;
    for(int i=0; i<n; i++) {
      if(arr[i]==x) {
        temp = i;
      }
    }
    return temp;

  }
  public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};
    int x = 500;
    System.out.println(worthCase(arr, x));
  }
  
}
