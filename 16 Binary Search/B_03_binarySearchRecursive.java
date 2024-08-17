public class B_03_binarySearchRecursive {

    public static boolean binarySearchRecursive(int arr[], int start,int end, int target) {

        if(start <= end) {
            // base case
            if(start > end) return false;

            int mid = (start + end )/2;
            // self work
            if(arr[mid]==target) {
                return true;
            }

            // resursive work
            if(target > arr[mid]) {
               return binarySearchRecursive(arr, mid+1, end, target);
            }

            if(target < arr[mid]) {
              return  binarySearchRecursive(arr, start, mid-1, target);
            }

        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        int target = 24;
        int start = 0;
        int end = arr.length-1;

        System.out.println(binarySearchRecursive(arr, start, end, target));
    }
    
}
