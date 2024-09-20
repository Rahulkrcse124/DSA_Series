import java.util.Stack;

public class st_14_GetMinSecondApproach {

    public static int getMinStack(int arr[]) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();
        st.push(arr[0]);
        helper.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {

            st.push(arr[i]);

            if (arr[i] < helper.peek()) {
                helper.push(arr[i]);
            }
            if (arr[i] > helper.peek()) {
                helper.push(helper.peek());
            }
        }
        return helper.peek();
    }

    public static void main(String[] args) {

        int arr[] = { 10, 4, 8, 3, 9, 12, 2, 7 };
        System.out.println("Min Stack is : " + getMinStack(arr));

    }
}