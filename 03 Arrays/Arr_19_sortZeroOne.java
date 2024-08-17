public class Arr_19_sortZeroOne {

    public static void zeroOneSort(int arr[]) {
        int zeroCount = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==0) {
                zeroCount++;
            }
        }
        for(int i=0; i<arr.length; i++) {
            if(i<zeroCount) {
                System.out.print(0+" ");
            }
            else{
                System.out.print(1+" ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,1,1,0,0,0,1,1};
        zeroOneSort(arr);
    }
}
