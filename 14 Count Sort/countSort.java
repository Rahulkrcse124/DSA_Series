public class countSort {

  public static int max(int arr[]) {
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++) {
      if(arr[i]>max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static void countSortAlg(int arr[]) {
   int maxe =  max(arr);
    int count [] = new int[maxe+1];
    for(int i=0; i<arr.length; i++) {
      count[arr[i]]++;
    }
    int k=0; 
    for(int i=0; i<count.length; i++) {
      for(int j=0; j<count[i]; j++) {
        arr[k++] = i;
      }
    }
  }

  public static void display(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String args[]) {
    int arr[] = {4,3,1,5,3,1,3,5};

    countSortAlg(arr);
    display(arr);

  }
}