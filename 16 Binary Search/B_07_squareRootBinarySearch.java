public class B_07_squareRootBinarySearch {

    public static int squareRootSearch(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        int rootSquare = 0;
        while(start <= end) {
            int mid = (start+end)/2;
            int value = mid*mid;

            if(target==value) {
                rootSquare = mid;
                return rootSquare;
            }

            if(target > value) {
                start = mid + 1;
                rootSquare = mid;
            }

            if(target < value) {
                end = mid-1;
            }
        }
        return rootSquare;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,12,15,16,21,24};
        int target = 24;
        System.out.println(squareRootSearch(arr, target));
    }
    
}
