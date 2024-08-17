public class B_08_rotatedSortedArray {

    public static int returnTargetIndexBinarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end) {
            int mid = (start + end)/2;

            if(arr[mid]==target) {
                ans = mid;
                return ans;
            }

            if(arr[mid] < target ) {
                start = mid+1;
            }
            if(arr[mid] > target) {
                end = mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int target = 4;
        System.out.println(returnTargetIndexBinarySearch(arr, target));
    }
    
}
