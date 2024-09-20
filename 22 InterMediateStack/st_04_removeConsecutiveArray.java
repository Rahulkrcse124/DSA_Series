import java.util.Stack;

public class st_04_removeConsecutiveArray {

    public static int[] consecutiveArray(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || arr[i] != st.peek()) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if (i == n - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }

        int ans[] = new int[st.size()];
        int n2 = ans.length;

        for (int i = n2 - 1; i >= 0; i--) {
            int x = st.pop();
            ans[i] = x;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 7, 7, 7, 2, 8, 5 };

        int ansArr[] = consecutiveArray(arr);
        for (int i = 0; i < ansArr.length; i++) {
            System.out.print(ansArr[i] + " ");
        }
    }
}
