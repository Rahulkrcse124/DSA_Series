import java.util.*;

public class hm_04_MaximumFrequency {

    public static void maximumFriquencyElement(int arr[]) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int el : arr) {
            if (!freq.containsKey(el)) {
                freq.put(el, 1);
            } else {
                freq.put(el, freq.get(el) + 1);
            }
        }

        int maxFreq = -1;
        int ansKey = -1;

        for (var e : freq.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.print("max frequency key = " + ansKey);
        System.out.println();
        System.out.print("max Frequency = " + maxFreq);

        // print to 2nd method
        System.out.println();
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);
    }

    public static void maxFrequency2NdMethod(int arr[]) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int e : arr) {
            if (!freq.containsKey(e)) {
                freq.put(e, 1);
            } else {
                freq.put(e, freq.get(e) + 1);
            }
        }

        // traverse through the key
        int maxFreq = -1;
        int ansKey = -1;
        for (var key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey, maxFreq);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4 };
        maximumFriquencyElement(arr);
        System.out.println();
        System.out.println("2nd method");
        maxFrequency2NdMethod(arr);
    }
}
