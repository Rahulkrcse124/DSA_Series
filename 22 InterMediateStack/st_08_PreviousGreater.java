import java.util.Stack;

public class st_08_PreviousGreater {

    public static void previousGreaterStack(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[arr.length];

        ans[0] = -1;
        st.push(arr[0]);

        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.size() == 0) {
                ans[i] = -1;

            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 100, 80, 60, 70, 60, 75, 85 };
        previousGreaterStack(arr);
    }
}
