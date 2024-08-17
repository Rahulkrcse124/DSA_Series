public class B_06_lastAccuranceIndex {

    public static int targetLastIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;

        int lastIndex = -1;
        while(start <= end) {
            int mid = (start + end) /2;

            if(target==arr[mid]) {
                lastIndex = mid;
                start = mid + 1;
            }

            if(target > arr[mid]) {
                start = mid +1;
            }

            if(target < arr[mid]) {
                end = mid -1;
            }
        }
        return lastIndex;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,5,5,5,5,6,6,7,7};
        int target = 5;

        System.out.println("last index of target is : " + targetLastIndex(arr, target));
    }
    
}
