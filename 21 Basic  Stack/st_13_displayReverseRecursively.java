import java.util.Stack;

public class st_13_displayReverseRecursively {

    public static void displayReverse(Stack<Integer> st) {
        if (st.size() == 0)
            return;

        int top = st.pop();
        displayReverse(st);

        st.push(top);
        System.out.print(st.peek() + " ");
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        displayReverse(st);
    }
}
