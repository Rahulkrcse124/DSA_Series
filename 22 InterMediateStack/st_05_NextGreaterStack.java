import java.util.Stack;

public class st_05_NextGreaterStack {

    public static void nextGreater(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    st.push(arr[j]);
                    break;
                }
            }
        }

        Stack<Integer> tempSt = new Stack<>();

        while (st.size() > 0) {
            tempSt.push(st.pop());
        }

        while (tempSt.size() > 0) {
            int x = tempSt.peek();
            System.out.print(x + " ");
            st.push(tempSt.pop());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };
        nextGreater(arr);

    }

}
