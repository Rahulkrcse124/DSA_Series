import java.util.Stack;

public class st_11_MaxStack {

    public static int maxStack(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int max = arr[0];
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < st.peek()) {
                st.push(arr[i]);
            }

            if (arr[i] > st.peek()) {
                if (arr[i] > max) {
                    max = arr[i];
                    st.push(arr[i]);
                } else {
                    st.push(arr[i]);
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 8, 3, 9, 12, 2, 7 };
        System.out.println("Max Stack is = " + maxStack(arr));
    }
}
