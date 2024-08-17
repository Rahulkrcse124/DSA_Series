public class Arr_14_secondMin {

    public static int secondMin(int arr[]) {

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]<firstMin) {
                firstMin = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]== firstMin) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        for(int j=0; j<arr.length; j++) {
            if(arr[j]<secondMin) {
                secondMin = arr[j];
            }
        }
        return secondMin;

    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,9,3,5,12};
        System.out.println("second min: "+secondMin(arr));
    }
    
}
