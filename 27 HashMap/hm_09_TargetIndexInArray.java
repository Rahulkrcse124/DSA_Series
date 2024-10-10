public class hm_09_TargetIndexInArray {

    public static int[] TargetIndex(int arr[], int target) {

        int ans[] = { -1 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans = new int[] { i, j };
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 6 };
        int target = 11;
        int ans[] = TargetIndex(arr, target);
        for (int index : ans) {
            System.out.print(index + " ");
        }
    }

}
