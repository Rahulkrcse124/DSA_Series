public class Arr_22_squareIncresed {

    public static void incresingOrder(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = arr[i]*arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j= i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int temp =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int ans : arr) {
            System.out.print(ans+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {-10,-3,1, 2, 8,7};
        incresingOrder(arr);
    }   
}

/*
1 4 9 49 64 100 
 */
