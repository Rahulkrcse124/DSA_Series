public class merge_01 {

  public static void merge(int arr[], int l, int mid, int r) {
    int leftSize = mid - l + 1;
    int rightSize = r - mid;

    int left[] = new int[leftSize];
    int right[] = new int[rightSize];

    // Copying elements to the left and right sub-arrays
    for (int i = 0; i < leftSize; i++) left[i] = arr[l + i];
    for (int j = 0; j < rightSize; j++) right[j] = arr[mid + 1 + j];

    int i = 0, j = 0, k = l;

    // Merging the two sub-arrays
    while (i < leftSize && j < rightSize) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i++];
      } else {
        arr[k++] = right[j++];
      }
    }

    // Copying remaining elements of left array
    while (i < leftSize) {
      arr[k++] = left[i++];
    }

    // Copying remaining elements of right array
    while (j < rightSize) {
      arr[k++] = right[j++];
    }
  }

  public static void mergeSort(int arr[], int l, int r) {
    if (l < r) {
      int mid = (l + r) / 2;
      mergeSort(arr, l, mid);
      mergeSort(arr, mid + 1, r);
      merge(arr, l, mid, r);
    }
  }

  public static void display(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = {4, 1, 3, 5, 2};
    int l = 0;
    int r = arr.length - 1;
    mergeSort(arr, l, r);
    display(arr);
  }
}
