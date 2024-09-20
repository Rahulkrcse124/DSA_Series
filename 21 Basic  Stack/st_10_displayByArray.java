import java.util.Stack;

public class st_10_displayByArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        int n = st.size();
        int arr[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int x = st.peek();
            arr[i] = x;
            st.pop();

        }
        for (int i = 0; i < n; i++) {
            int y = arr[i];
            System.out.print(y + " ");
            st.push(y);
        }
    }
}
