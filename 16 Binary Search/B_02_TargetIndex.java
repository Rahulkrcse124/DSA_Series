public class B_02_TargetIndex {

    public static int binarySearchtargetIndex (int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while(start <= end) {
            int mid = (start + end) /2;

            if(target == arr[mid]) {
                index = mid;
                return index;
            }

            if(target > arr[mid]) {
                start = mid+1;
            }

            if(target < arr[mid]) {
                end = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        int target = 24;

        System.out.println("target of index is: " + binarySearchtargetIndex(arr, target));
    }
    
}
