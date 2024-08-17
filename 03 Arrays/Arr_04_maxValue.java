public class Arr_04_maxValue {

    public static int maxValues(int arr[]) { 
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static void main(String args[]) {
        int arr[] = {1,5,3,7,4};
        System.out.println(maxValues(arr));
    }
}
