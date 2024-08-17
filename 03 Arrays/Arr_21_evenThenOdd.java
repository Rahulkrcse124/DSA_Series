public class Arr_21_evenThenOdd {

    public static void evenFirstThenOdd(int arr[]) {
        int left = 0;
        int right = arr.length-1;
        while(left<right) {
            if(arr[left]%2==0) {
                left++;
            }
            if(arr[right]%2!=0) {
                right--;
            }
            if(arr[left]%2!=0 && arr[right]%2==0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9,11};
        evenFirstThenOdd(arr);
    }
}
