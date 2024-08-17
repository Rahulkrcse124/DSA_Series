public class Arr_13_secondMax {

    public static int secondMax(int arr[]) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>firstMax) {
                firstMax = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==firstMax) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        for(int j=0; j<arr.length; j++) {
            if(arr[j]>secondMax) {
                secondMax = arr[j];
            }
        }
        return secondMax;

    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,9,3,5,12};
        System.out.println("second max : "+secondMax(arr));
    }
    
}
