public class B_12_peakElementPrint {

    public static void displayPeakElement(int arr[]) {
        for(int i=1;i<arr.length; i++ ) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                System.out.println(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};
        displayPeakElement(arr);
    }
    
}
