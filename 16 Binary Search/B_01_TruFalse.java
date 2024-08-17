public class B_01_TruFalse{

    public static boolean binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = ((start + end) /2);

            if(arr[mid]==target) {
                return true;
            }

            if(arr[mid] < target) {
                start = mid +1;
            }

            if(arr[mid] > target) {
                end = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,15,20,24,45,50,77};
        int target = 24;

        System.out.println(binarySearch(arr, target));
    }
}