public class B_05_firstAccuranceIndex {

    public static int returnFirstAccurance(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while(start <= end) {
            int mid = (start + end) /2;

            if(target==arr[mid]) {
                index = mid;
                end = mid-1;
            }

            if(target > arr[mid]) {
                start = mid + 1;
            }
            if(target < arr[mid]) {
                end = mid-1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,5,5,5,5,5,6,6,7,7}; 
        int target = 5; 
        
        System.out.println("first index of target is: " + returnFirstAccurance(arr, target));
    } 
}
