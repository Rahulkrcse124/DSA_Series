public class hm_10_TargetIndexArray2ndApproach {

    public static boolean targetIndex(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int searchValue = target - currentValue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == searchValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] targetIndexReturn(int arr[], int target) {
        int ans[] = { -1 };

        for (int i = 0; i < arr.length; i++) {

            int cureentValue = arr[i];
            int searchValue = target - cureentValue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == searchValue) {
                    ans = new int[] { i, j };
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 7, -1 };
        int target = 12;
        System.out.println(targetIndex(arr, target));

        System.out.println();
        System.out.println("2nd Approach ");
        int[] targetIndex = targetIndexReturn(arr, target);
        for (int ans : targetIndex) {
            System.out.print(ans + " ");
        }
    }
}
