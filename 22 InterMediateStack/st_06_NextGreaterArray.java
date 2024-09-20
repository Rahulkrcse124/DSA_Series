import java.util.Stack;

public class st_06_NextGreaterArray {

    public static int[] nextGreater(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nGreater = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    nGreater = arr[j];
                    st.push(nGreater);
                    break;
                }
            }
        }

        int ans[] = new int[st.size()];
        int length = ans.length;
        for (int i = length - 1; i >= 0; i--) {
            int x = st.pop();
            ans[i] = x;
        }
        return ans;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 8, 6, 3, 4 };

        System.out.println("Next Greater element is: ");
        int ans[] = nextGreater(arr);
        display(ans);
    }
}
