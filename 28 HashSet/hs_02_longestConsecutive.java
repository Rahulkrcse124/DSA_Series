import java.util.HashSet;

public class hs_02_longestConsecutive {

    public static int longestConsecutiveLength(int arr[]) {

        HashSet<Integer> st = new HashSet<>();
        int maxStreak = 0;
        for (int el : arr) {
            st.add(el);
        }

        for (int num : st) {

            // for num is starting point
            if (!st.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                // Update the max streak
                maxStreak = Math.max(maxStreak, currStreak);

            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        int longest = longestConsecutiveLength(arr);
        System.out.println("Longest Consecutive Length: " + longest);

        // 1,2,3,4 : length=4 hence this the longest consecutive length
        // 100 : length=1
        // 200 : length=1
    }

}
