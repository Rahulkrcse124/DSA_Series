import java.util.Stack;

public class st_16_reverseStack {

    public static void originalStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 0) {
            System.out.print(st.peek() + " ");
            int x = st.pop();
            temp.push(x);
        }
        // Restore the original stack
        while (temp.size() > 0) {
            int y = temp.pop();
            st.push(y);
        }
    }

    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();

        while (st.size() > 0) { // st remove and add in temp1
            int x = st.pop();
            temp1.push(x);

        }

        while (temp1.size() > 0) { // temp1 remove and add in temp2
            int y = temp1.pop();
            temp2.push(y);
        }

        while (temp2.size() > 0) { // finally temp2 remove and add in st
            int z = temp2.pop();
            st.push(z);
        }

        // display
        while (st.size() > 0) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("Original stack:");
        originalStack(st);

        System.out.println();
        System.out.println("Reversed stack:");
        reverseStack(st);
    }
}
