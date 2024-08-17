public class B_04_indexRecursive {

    public static int binarySearchIndexRecursive(int arr[],int start, int end, int target) {

        int index = -1;
        if(start <= end) {
            // base case;
            if(start > end) {
                return -1;
            }

            int mid = (start+end)/2;

            // self case
            if(target==arr[mid]) {
                index = mid;
                return index;
            }

            // recursive work
            if(target > arr[mid]) {
               return binarySearchIndexRecursive(arr, mid+1, end, target);
            }

            if(target < arr[mid]) {
               return binarySearchIndexRecursive(arr, start, mid-1, target);
            }
        }
        return index;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        int target = 24;
        int start = 0;
        int end = arr.length-1;

        System.out.println("index of target is: ");
        System.out.println(binarySearchIndexRecursive(arr, start, end, target));
    }
    
}
