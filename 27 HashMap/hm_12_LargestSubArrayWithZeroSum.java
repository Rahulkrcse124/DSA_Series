import java.util.*;

public class hm_12_LargestSubArrayWithZeroSum {

    public static int zeroSumLargestSubarray(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int preSum = 0;
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];

            if (map.containsKey(preSum)) {
                maxLen = Math.max(maxLen, i - map.get(preSum));
            } else {
                map.put(preSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int ans = zeroSumLargestSubarray(arr, 8);
        System.out.println("largets subarray is :" + ans);
    }
}
