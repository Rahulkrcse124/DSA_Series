public class Arr_08_lastIndex {

    static int lastIndex(int arr[], int target) {
        int indexOflast = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target) {
                indexOflast = i;
            }
        }
        return indexOflast;
    }

    static int firstIndex(int arr[] , int target) {
        int first = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                first = i;
                break;
            }
        }
        return first;


    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,2,5,4,5};
        int target = 5;

        System.out.println("last index of 5: "+lastIndex(arr, target));
        System.out.println("first index of 5: "+firstIndex(arr, target));
        
    }
    
}
