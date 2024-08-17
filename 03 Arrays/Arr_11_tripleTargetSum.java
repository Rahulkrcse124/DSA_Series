public class Arr_11_tripleTargetSum {

    public static int sumTargetTriple(int arr[], int target) {
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,6,3};
        int target = 12;
        System.out.println("sum triple target count : "+sumTargetTriple(arr, target));
    }
    
}
