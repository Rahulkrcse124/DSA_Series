import java.util.Stack;

public class st_12_MinStack {

    public static int minStack(int arr[]) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        int min = st.peek();
        helper.push(st.peek());
        st.pop();

        while (st.size() > 0) {

            if (st.peek() < helper.peek()) {
                helper.push(st.peek());
                min = helper.peek();
            }
            st.pop();
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 8, 3, 22, 9, 20, 2, 10, 7 };
        System.out.print("Min Stack = " + minStack(arr));
    }

}
