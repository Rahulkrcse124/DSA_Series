import java.util.Stack;

public class st_10_MinStack {

    public static int minStack(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < st.peek()) {
                min = arr[i];
                st.push(arr[i]);
            }

            if (arr[i] > st.peek()) {
                st.push(arr[i]);
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 4, 8, 3, 9, 10, 2, 7 };
        System.out.print("min Stack is: =  " + minStack(arr));

    }
}