import java.util.Stack;

public class st_07_NextGreaterOneTraverse {
    public static int[] nextGreater(int arr[]) {
        Stack<Integer> st = new Stack<>();

        int ans[] = new int[arr.length];

        int n = arr.length;
        st.push(arr[n - 1]);
        ans[n - 1] = -1;

        for (int i = n - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                st.push(arr[i]);
                ans[i] = -1;
            } else {
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
