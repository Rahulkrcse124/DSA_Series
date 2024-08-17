public class B_09_rotateSortedArray {

    public static int binaryRotatedSortedArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                return ans;
            }

            if(arr[start] <= arr[mid]) {
                if(arr[start] <= target && arr[mid] >= target) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

            if(arr[mid] <= arr[end]) {
                if(arr[mid] <= target && arr[end] >= target) {
                    start = mid+1;
                } 
                else{
                    end = mid-1;
                }
            }

        }
        return ans; 
    }

    public static void main(String[] args) {
        int arr[] = {9, 10, 11, 12, 1, 2, 3, 4, 5, 6, 8};
        int target = 12;
        System.out.println(binaryRotatedSortedArray(arr, target));
    }
}
