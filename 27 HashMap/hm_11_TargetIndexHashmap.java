import java.util.*;

public class hm_11_TargetIndexHashmap {

    public static int[] targetIndex(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = { -1 };

        for (int i = 0; i < arr.length; i++) {
            int partner = target - arr[i];

            if (map.containsKey(partner)) {
                ans = new int[] { i, map.get(partner) };
            }
            map.put(arr[i], i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 14, 7, 10, 4, 5, 9, 1, 2 };
        int target = 13;
        int ans[] = targetIndex(arr, target);
        for (int k : ans) {
            System.out.print(k + " ");
        }
    }

}
