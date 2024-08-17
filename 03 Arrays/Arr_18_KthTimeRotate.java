public class Arr_18_KthTimeRotate {

    public static void kthTimeRotate(int arr[],int k) {
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j = 0;
        for(int i=n-k; i<n; i++) {
            ans[j++] = arr[i];
        }
        for(int l=0; l<n-k; l++) {
            ans[j++] = arr[l];
        }

        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        kthTimeRotate(arr, 3);
    }

}
