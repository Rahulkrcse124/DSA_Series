public class Arr_05_searchIndex {

    public static int searchIndex(int arr[], int target) {
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                index = i;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        int arr[] = {1,7,9,3,5};
        int target = 9;
        System.out.println(searchIndex(arr, target));
    }
    
}
