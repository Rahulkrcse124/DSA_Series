import java.util.Stack;

public class st_13_MaxStack {

    public static int maxStack(int arr[]) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        int max = st.peek();
        helper.push(st.peek());
        st.pop();

        while (st.size() > 0) {

            if (st.peek() > helper.peek()) {
                helper.push(st.peek());
                max = helper.peek();
            }
            st.pop();
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 8, 3, 9, 12, 2, 7 };
        System.out.print("Max Stack is = " + maxStack(arr));

    }

}
