import java.util.Stack;

public class st_08_nextGreater {

    public static int[] nextGreater(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n - 1];
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                st.push(arr[i]);
                ans[i] = -1;
            }

            if (st.size() > 0 && arr[i] < st.peek()) {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int ans[] = nextGreater(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
