
// if the same value will be two or more then remove it
import java.util.Stack;

public class st_03_RemoveConsecutiveSubSequenceStackReturn {

    public static void consecutiveStack(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (st.size() == 0 || arr[i] != st.peek()) {
                st.push(arr[i]);
            }

            else if (i == n - 1 || arr[i] == st.peek()) {
                if (arr[i] != arr[i + 1]) {
                    st.pop();
                }
                // if (arr[i] == arr[i + 1]) {
                // i++;
                // }
            }
        }

        while (st.size() > 0) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 7, 7, 7, 8, 2, 5 };
        System.out.println("consecutive stack: ");
        consecutiveStack(arr);

    }
}