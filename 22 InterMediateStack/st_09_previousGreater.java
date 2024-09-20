import java.util.Stack;

public class st_09_previousGreater {

    public static int[] previousGreater(int arr[]) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        int n = arr.length;
        int ans[] = new int[n];
        ans[0] = -1;

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() > 0 && arr[i] < st.peek()) {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        int ans[] = previousGreater(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
